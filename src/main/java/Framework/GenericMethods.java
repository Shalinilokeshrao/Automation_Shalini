package Framework;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static java.lang.Thread.sleep;

public class GenericMethods {
    WebDriver driver;

    public GenericMethods(WebDriver driver)
    {
        this.driver = driver;
    }

    public static void selectByText(WebElement element, String text ) throws InterruptedException
    {
        WebElement dropDown = element;
        dropDown.click();
        List<WebElement> allOptions = dropDown.findElements(By.xpath(".//option"));
        for ( WebElement we: allOptions)
        {
            dropDown.sendKeys( Keys.DOWN ); //simulate visual movement
            sleep(250);
            if ( we.getText().contains( text ) )
            {
                Select select = null;
                select.selectByVisibleText(text);
            }
        }
    }

    public void SwitchToFrame(WebDriver driver, String element) {
        try {
            By object = LocatorUtils.getLocator(element);
            driver.switchTo().frame(driver.findElement(object));
        } catch (Exception var4) {
            System.out.println("Unable to catch object see error " + var4.getMessage());
        }
    }

        public void SwitchTo2FramesAtOnce(WebDriver driver, String element1, String element2) {
        try {
            By object = LocatorUtils.getLocator(element1);
            driver.switchTo().frame(driver.findElement(object));
            if (!element2.isEmpty()){
                By object2 = LocatorUtils.getLocator(element2);
                driver.switchTo().frame(driver.findElement(object2));
            }
        } catch (Exception var4) {
            System.out.println("Unable to catch object see error " + var4.getMessage());
        }
    }


    public void ClickAndTypeOnElement(WebElement element, String value)
    {
        element.click();
        element.sendKeys(value);
    }

    public WebElement DetectElement(String element)
    {
        WebElement Element = null;
        try {
            By object = LocatorUtils.getLocator(element);
            Element = driver.findElement(object);

        } catch (Exception e) {
            LOG.info("Unable to catch object see error" + e.getMessage());
        }

        return Element;
    }

    public WebElement SearchInElement(WebElement element, String SearchLocator)
    {
        WebElement Element = null;
        try
        {
            By object = LocatorUtils.getLocator(SearchLocator);
            Element = element.findElement(object);
        }
        catch (Exception e)
        {
            LOG.info("Unable to detect the object due to error" + e.getMessage());
        }

        return Element;
    }

    public void  selectBTNfromList(String TBLElement,String ListBTN, String value)
    {
        try
        {
            By TBLobject = LocatorUtils.getLocator(TBLElement);
            WebElement tableElement =  driver.findElement(TBLobject);

            By BTNList = LocatorUtils.getLocator(ListBTN);
            List<WebElement> BTNListElement = driver.findElements(BTNList);

            boolean dayFound=false;
            for(WebElement button : BTNListElement){
                if(button.getText().trim().equals(value)){
                    button.click();
                    dayFound=true;
                    break;
                }
            }
            if(!dayFound)
            {
                System.out.println("Invalid date selected");
            }
        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());

        }
    }

    static Logger LOG = org.apache.log4j.Logger.getLogger(LocatorUtils.class);


}

package Framework;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.IOException;

import static org.apache.commons.io.FilenameUtils.getExtension;

public class CommonUtil {
    static Logger LOG=Logger.getLogger(CommonUtil.class);
    //static Logger LOG = Logger.getLogger();
    public WebDriver driver;
    public static final String SCREENSHOTSPATH_PROPERTY_NAME = ".Reports/screenshots";
    public static final String SCREENSHOTSPATH_PROPERTY_DEFAULT_VALUE = "screenshots";

    public CommonUtil(WebDriver driver) {
        this.driver = driver;
    }
    public void clickOnElement(String element) {
        try {
            By object = LocatorUtils.getLocator(element);
            this.driver.findElement(object).click();
        } catch (Exception var3) {
            LOG.info("Unable to catch object see error" + var3.getMessage());
        }

    }

    public void clickOnElementByText(String element, String value) {
        try {
            if (element.contains("{value}")) {
                element = element.replace("{value}", value);
            }

            By object = LocatorUtils.getLocator(element);
            this.driver.findElement(object).click();
        } catch (Exception var4) {
            LOG.info("Unable to catch object see error" + var4.getMessage());
        }

    }

    public void typeOnElement(String element, String value) {
        try {
            By object = LocatorUtils.getLocator(element);
            this.driver.findElement(object).sendKeys(new CharSequence[]{value});
        } catch (Exception var4) {
            LOG.info("Unable to find object: " + element.toString());
        }

    }

    public boolean isPresent(String element) {
        try {
            By object = LocatorUtils.getLocator(element);
            return true;
        } catch (Exception var3) {
            LOG.info("Unable to find object: " + element.toString());
            return false;
        }
    }

    public String getText(String element) {
        try {
            By object = LocatorUtils.getLocator(element);
            return this.driver.findElement(object).getText();
        } catch (Exception var3) {
            LOG.info("Unable to find object: " + element.toString());
            return "Unable to find text";
        }
    }

    public boolean isEnabled(String element) {
        try {
            By object = LocatorUtils.getLocator(element);
            return this.driver.findElement(object).isEnabled();
        } catch (Exception var3) {
            LOG.info("Unable to find object: " + element.toString());
            return false;
        }
    }

    public boolean isTextVisible(String element, String value) {
        try {
            String text = this.getText(element);
            return text.toUpperCase().contains(value);
        } catch (Exception var4) {
            return false;
        }
    }

    public void clear(String element) {
        try {
            By object = LocatorUtils.getLocator(element);
            this.driver.findElement(object).clear();
        } catch (Exception var3) {
            LOG.info("Unable to find object: " + element.toString());
        }

    }

    public void selectFromList(String list, String value) {
        try {
            By listObject = LocatorUtils.getLocator(list);
            (new Select(this.driver.findElement(listObject))).selectByVisibleText(value);
        } catch (Exception var4) {
            LOG.info("Unable to find object: " + list.toString());
        }

    }


    public String captureScreenshot(String fileName) throws IOException {
        File src = (File)((TakesScreenshot)this.driver).getScreenshotAs(OutputType.FILE);
        String filePath = getScreenshotsPath();
        if ((new File(filePath + File.separator + fileName)).exists() || (new File(filePath + File.separator + fileName + ".png")).exists()) {
            fileName = fileName + "_" + System.currentTimeMillis();
        }

        fileName = FilenameUtils.getExtension(fileName).isEmpty() ? fileName + ".png" : fileName;
        filePath = getScreenshotsPath() + File.separator + fileName;

        try {
            FileUtils.copyFile(src, new File(filePath));
            return filePath;
        } catch (IOException var5) {
            throw new IOException("Failed to save screenshot to " + filePath, var5);
        }
    }

    private static String getScreenshotsPath() {
        String workingDirectory = System.getProperty("user.dir");
        String screenshotPath = System.getProperty("webdriver.screenshotspath");
        if (screenshotPath == null) {
            screenshotPath = "screenshots";
        }

        return workingDirectory + File.separator + screenshotPath;
    }
    public  String ScreenShot(String screenShotName) throws IOException
    {
        TakesScreenshot ts = (TakesScreenshot)this.driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        String dest = System.getProperty("user.dir")+"/Reports/"+"screenshots/"+screenShotName+System.currentTimeMillis()+".png";
        File destination = new File(dest);
        FileUtils.copyFile(source, destination);

        return dest;
    }
}

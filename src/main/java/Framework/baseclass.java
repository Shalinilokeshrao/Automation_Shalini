package Framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class baseclass {
    public static WebDriver driver;
    public static Properties prop;

    public baseclass(){
        try {
            File filepath = new File("C:\\Users\\Vithun\\IdeaProjects\\Functional\\src\\main\\java\\Config\\config.properties");
            FileInputStream fis = new FileInputStream(filepath);
            prop=new Properties();
            prop.load(fis);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public static void LaunchBrowser(String AplicationURL){
        String browsername=prop.getProperty("browser");
        if(browsername.equals("chrome")){
            System.setProperty("webdriver.chrome.driver","C:\\Users\\Vithun\\IdeaProjects\\CIES_Framework\\Driver\\chromedriver.exe");
            driver=new ChromeDriver();
        }else if(browsername.equals("FF")){
            System.setProperty("webdriver.gecko.driver","C:\\Users\\Vithun\\IdeaProjects\\Functional\\src\\main\\resources\\drivers\\chromedriver.exe");
            driver=new FirefoxDriver();
        }else if(browsername.equals("IE")){
            System.setProperty("webdriver.internetexplorer.driver","C:\\Users\\Vithun\\IdeaProjects\\Functional\\src\\main\\resources\\drivers\\chromedriver.exe");
            driver=new InternetExplorerDriver();
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.get(AplicationURL);
    }
}

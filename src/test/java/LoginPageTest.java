import Framework.CommonUtil;
import Framework.ExtentReportManager;
import Framework.GenericMethods;
import Framework.baseclass;
import Pages.LoginPage;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class LoginPageTest extends baseclass {
    CommonUtil commonUtil;
    GenericMethods GenMethodObj;
    LoginPage LoginObj;
    private String[][] data;
    private String fileName;
    ExtentReports extent= ExtentReportManager.getInstance();
    public static ExtentTest test;
   public static final String TAKE_SCREEN_SHOT="./screenshots/";
    String[] stringShotName;
    String Attachpath;
    @BeforeClass
    public void setup() {
        LaunchBrowser("http://admin-demo.nopcommerce.com/login");
        driver.switchTo().defaultContent();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        fileName = "src/test/resources/testdata.xlsx";
        commonUtil = new CommonUtil(driver);
        GenMethodObj = new GenericMethods(driver);
        LoginObj=new LoginPage();

    }

    @Test
    public void CreateIndividual_Test() throws Exception {
     test=extent.startTest("Login");
        commonUtil.typeOnElement(LoginObj.username,"admin@yourstore.com");
        commonUtil.typeOnElement(LoginObj.password,"admin");
        commonUtil.clickOnElement(LoginObj.LoginBtn);
        String Imagepath=commonUtil.captureScreenshot("Login Check");
        System.out.println(Imagepath);
       // File ScreenPath=new File(Imagepath);
        stringShotName=Imagepath.split("\\\\");
        String file = System.getProperty("user.dir")+"/screenshots/"+stringShotName[4];

        System.out.println(file);

        test.log(LogStatus.INFO, "Login Screenshot test" + test.addScreenCapture(file));
        System.out.println("*********");
        System.out.println(TAKE_SCREEN_SHOT+stringShotName[4]);
        test.log(LogStatus.INFO, "Login Screenshot test" + test.addScreenCapture(TAKE_SCREEN_SHOT+stringShotName[4]));
        extent.flush();
    }
}
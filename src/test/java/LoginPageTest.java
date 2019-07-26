import Framework.CommonUtil;
import Framework.ExtentReportManager;
import Framework.GenericMethods;
import Framework.baseclass;
import Pages.LoginPage;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.annotations.*;

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
    @BeforeTest
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
    @Parameters({"username","password"})
    public void CreateIndividual_Test(String user,String pass) throws Exception {
     test=extent.startTest("Login");
        //commonUtil.typeOnElement(LoginObj.username,prop.getProperty("username"));
        //commonUtil.typeOnElement(LoginObj.password,prop.getProperty("password"));
        commonUtil.typeOnElement(LoginObj.username,user);
        commonUtil.typeOnElement(LoginObj.password,pass);
        commonUtil.clickOnElement(LoginObj.LoginBtn);
        String Imagepath=commonUtil.ScreenShot("Login Check");
        System.out.println(Imagepath);
        stringShotName=Imagepath.split("/");
        System.out.println(TAKE_SCREEN_SHOT+stringShotName[3]);
        test.log(LogStatus.INFO, "Login Screenshot test" + test.addScreenCapture(TAKE_SCREEN_SHOT+stringShotName[3]));

    }
    @AfterTest
    public void teardown(){
        extent.flush();
        driver.quit();
    }
}
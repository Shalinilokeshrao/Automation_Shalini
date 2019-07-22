package Framework;

//import com.aventstack.extentreports.ExtentReports;
//import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.relevantcodes.extentreports.ExtentReports;

import java.util.Date;

public class ExtentReportManager {
    private static ExtentReports extent;

    //public static ExtentHtmlReporter reporter;

    public static ExtentReports getInstance() {


        if (extent == null) {
            Date d = new Date();
            String fileName = d.toString().replace(":", "_").replace(" ", "_") + ".html";
            //reporter = new ExtentHtmlReporter((System.getProperty("user.dir") + "/Reports/MyExtentReport" + fileName));

            extent = new ExtentReports((System.getProperty("user.dir") + "/Reports/MyExtentReport" + fileName));

           // extent.attachReporter(reporter);

            extent.addSystemInfo("API Testing For UAT Env ", "API Testing For UAT Env");

        }
        return extent;
    }
}

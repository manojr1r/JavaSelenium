package extentReports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class configReports {
    public static void main(String[] args) {
        // ExtentReports    ExtentSparkReporter
        String path =System.getProperty("user.dir")+"\\reports\\index.html";
//  ExtentSparkReporter
        System.out.println(path);
        ExtentReports extent = new ExtentReports();
        ExtentSparkReporter reporter =new ExtentSparkReporter(path);
        reporter.config().setReportName("Sundry Globe");
        reporter.config().setDocumentTitle("Document Title");

//  ExtentReports


        
    }
}

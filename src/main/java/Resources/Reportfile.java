package Resources;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Reportfile {
	
	public static ExtentReports Report;
	
	public static ExtentReports report()
	
	{
		String path=System.getProperty("user.dir")+"\\reports\\report.html";
		ExtentSparkReporter Reporter=new ExtentSparkReporter(path);
		Reporter.config().setDocumentTitle("Testcase");
		Reporter.config().setReportName("Automation");
		Report=new ExtentReports();
		Report.attachReporter(Reporter);
		Report.setSystemInfo("Tester", "Mukul");
		return Report;
	}

}

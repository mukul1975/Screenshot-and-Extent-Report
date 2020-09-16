package Resources;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

public class listener extends browserdetails implements ITestListener{
	
	public ExtentTest test;
	
	ExtentReports Report=Reportfile.report();

	public void onTestStart(ITestResult result) {
		
		test=Report.createTest(result.getMethod().getMethodName());
	
		
	}

	public void onTestSuccess(ITestResult result) {
		
		screenshot(result.getMethod().getMethodName());
		test=Report.createTest(result.getMethod().getMethodName());
		test.pass("Testcase pass");
		
	}

	public void onTestFailure(ITestResult result) {
		
		screenshot(result.getMethod().getMethodName());	
		test=Report.createTest(result.getMethod().getMethodName());
		test=Report.createTest(result.getMethod().getMethodName());
		test.pass(" Testcase failed");
		
	}

	public void onTestSkipped(ITestResult result) {
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	public void onStart(ITestContext context) {
		
	}

	public void onFinish(ITestContext context) {
		
		Report.flush();
		
	}

}

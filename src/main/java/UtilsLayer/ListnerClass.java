package UtilsLayer;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ListnerClass implements ITestListener {
	protected static ExtentReports extentreport;
	protected static ExtentTest extenttest;
	String erp="C:\\Users\\Itsme\\eclipse-workspace\\RedBus_TestNG\\Reports\\BusesResult.html";
	//use erp as private and access bt this.erp
	
	public void onStart(ITestContext context) {
		ExtentSparkReporter extentsprkreport=new ExtentSparkReporter(erp);
		extentreport=new ExtentReports();
		extentreport.attachReporter(extentsprkreport);
	}
	
	
	public void onTestStart(ITestResult result) {
		extenttest=extentreport.createTest(result.getMethod().getMethodName());
	}

	public void onTestSuccess(ITestResult result) {
		extenttest.log(Status.PASS,"Test cases passed name is "+result.getMethod().getMethodName());
		extenttest.addScreenCaptureFromPath(TakeScreenshot.takeScreenshot(result.getMethod().getMethodName()));
		
	}

	public void onTestFailure(ITestResult result) {
		extenttest.log(Status.FAIL,"Test cases failed name is "+result.getMethod().getMethodName());
		extenttest.addScreenCaptureFromPath(TakeScreenshot.takeScreenshot(result.getMethod().getMethodName()));
	}

	public void onTestSkipped(ITestResult result) {
		extenttest.log(Status.SKIP,"Test cases skipped name is "+result.getMethod().getMethodName());
		extenttest.addScreenCaptureFromPath(TakeScreenshot.takeScreenshot(result.getMethod().getMethodName()));
	}
	public void onFinish(ITestContext context) {
		extentreport.flush();
	}

}

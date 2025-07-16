package Utils;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import stepDefinitions.BaseTest;

public class ExtentReport1 extends BaseTest implements ITestListener, ISuiteListener {

	public ExtentSparkReporter sparkReporter;
	public ExtentReports extent;
	public static ExtentTest test;

	
	public void onStart(ISuite suite) {
		// sparkReporter = new ExtentSparkReporter(System.getProperty("user.dir") +
		// "/reports/myReport123.html");

		String timestamp = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss").format(new Date());
		String reportPath = System.getProperty("user.dir") + "/reports/myreport" + timestamp + ".html";

		sparkReporter = new ExtentSparkReporter(reportPath);

		sparkReporter.config().setDocumentTitle("Automation Report");
		sparkReporter.config().setReportName("PRADEEP BHAT");
		sparkReporter.config().setTheme(Theme.STANDARD);

		extent = new ExtentReports();
		extent.attachReporter(sparkReporter);

		extent.setSystemInfo("Computer Name", "localhost");
		extent.setSystemInfo("Environment", "QA");
		extent.setSystemInfo("Tester Name", "Pradeep");
		extent.setSystemInfo("OS", "Windows 10");
		extent.setSystemInfo("Browser", "Chrome");
	}

	
	public void onTestSuccess(ITestResult result) {
		test = extent.createTest(result.getName());
		test.log(Status.PASS, "Test case PASSED: " + result.getName());
	}

	
	public void onTestFailure(ITestResult result) {
		test = extent.createTest(result.getName());
		test.log(Status.FAIL, "Test case FAILED: " + result.getName());
		test.log(Status.FAIL, "Cause: " + result.getThrowable());
	}


	public void onTestSkipped(ITestResult result) {
		test = extent.createTest(result.getName());
		test.log(Status.SKIP, "Test case SKIPPED: " + result.getName());
		captureScreenshot(result.getName());
	}

	//		String Sc_Path = System.getProperty("user.dir") + "/screenshot/myscr" + timestamp + ".png";

	public void captureScreenshot(String testName) {
		String timestamp1 = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss").format(new Date());
		String Sc_Path = System.getProperty("user.dir") + "/screenshot/myscr" + timestamp1 + ".png";
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(src, new File(Sc_Path));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	
	public void onFinish(ISuite suite) {
		extent.flush();
	}

	// Other unused ITestListener methods can be left blank if not needed
}

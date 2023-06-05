package orange.com.utility;

import org.testng.ITestListener;
import org.testng.ITestResult;

import orange.com.Testbase.Testbase;

public class Listener extends Testbase implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		logger.info("TESTCASE EXECUTION STARTED");

	}

	@Override
	public void onTestSuccess(ITestResult result) {
		logger.info("TESTCASE EXECUTION STOPPED");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		logger.info("TESTCASE EXECUTION FAILED");
		ScreenshotCode.getScreenshot(result.getName());
        logger.info("SCREENSHOT TAKEN");
	}

}

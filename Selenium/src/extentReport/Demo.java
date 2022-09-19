package extentReport;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Demo {

	@Test
	public void test() {
		ExtentReports reports = new ExtentReports("./extentReport/extent.html", false);
		//creating object for extent report
		
		ExtentTest test = reports.startTest("TestCase");
		//started the test execution
		
		test.log(LogStatus.PASS, "testcase is passed");
		test.log(LogStatus.SKIP, "testcase is skipped");
		test.log(LogStatus.FAIL, "testcase is failed");
		//logged the status
		
		reports.endTest(test);
		//stopped the execution
		
		reports.flush();
		//flush the junk
	}
}

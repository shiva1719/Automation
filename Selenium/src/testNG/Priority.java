package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority {
	@Test(priority=1)
	public void test1()
	{
		Reporter.log("1", true);
	}
	@Test             //default value of priority is "Zero"
	public void test2()
	{
		Reporter.log("2", true);
	}
}
   

//If the priorities are same then it will execute based on the ASCII or Alphabetical order
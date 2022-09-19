package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class SamescriptMultipleTimes_invocationCount {
  @Test(invocationCount=3,priority=1)      //default value of invocationCount is "1"
  public void test1() {                        
	  Reporter.log("hello", true);
  }
  @Test
  public void test2() {
	  Reporter.log("hi", true);
}
}                                 //if you specify invocationCount as "Zero" or less than Zero then it will skip the testcase

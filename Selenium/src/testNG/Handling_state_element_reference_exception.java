package testNG;

import org.testng.annotations.Test;

import pom.Login_by_refresh;

public class Handling_state_element_reference_exception extends Generic_script {
	@Test
	public void loginBtn() throws InterruptedException
	{
		driver.get("http://localhost/login.do");
		Thread.sleep(2000);
		Login_by_refresh ref=new Login_by_refresh(driver);
		Thread.sleep(2000);
		ref.login();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		ref.login();
	}
}

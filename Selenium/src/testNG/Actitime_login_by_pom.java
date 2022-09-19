package testNG;

import org.testng.annotations.Test;

import pom.Actitime_login_script;

public class Actitime_login_by_pom extends Generic_script{
	@Test
	public void login() throws InterruptedException
	{
		driver.get("http://localhost/login.do");
		Thread.sleep(2000);
		Actitime_login_script p1=new Actitime_login_script(driver);
		p1.usrTbox("Admin");
		Thread.sleep(2000);
		p1.pwdTbox("manager");
		Thread.sleep(2000);
		p1.login();
	}
}

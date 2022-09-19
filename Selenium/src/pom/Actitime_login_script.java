package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Actitime_login_script {
	@FindBy(id="username")
	private WebElement userName;
	@FindBy(name="pwd")
	private WebElement passWord;
	@FindBy(xpath="//div[.='Login ']")
	private WebElement loginBtn;
	 public Actitime_login_script(WebDriver driver)
	 {
		PageFactory.initElements(driver, this);
	 }
	public void usrTbox(String un)
	{
		userName.sendKeys(un);
	}
	public void pwdTbox(String pwd) {
		passWord.sendKeys(pwd);
	}
	public void login() {
		loginBtn.click();
	}
}

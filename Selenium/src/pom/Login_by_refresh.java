package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_by_refresh {
	
	@FindBy(xpath="//div[.='Login ']")
	private WebElement loginBtn;
	 public Login_by_refresh(WebDriver driver)
	 {
		PageFactory.initElements(driver, this);
	 }

	public void login() {
		loginBtn.click();
	}
}

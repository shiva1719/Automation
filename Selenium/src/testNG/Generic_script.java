package testNG;

import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class Generic_script {
	public WebDriver driver;
  @BeforeMethod
  public void openAppln() {
	  System.setProperty("webdriver.chrome.driver", "./Adselnm/chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  }
  @AfterMethod
  public void closeAppln() {
	  driver.close();
  }
  
}

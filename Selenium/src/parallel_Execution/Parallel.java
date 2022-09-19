package parallel_Execution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parallel {
	public WebDriver driver;
@Parameters({"browser"})
@Test
public void execute(String browser)
{
	System.setProperty("webdriver.gecko.driver", "./Adselnm/geckodriver.exe");
	System.setProperty("webdriver.chrome.driver", "./Adselnm/chromedriver.exe");
	if(browser.equals("firefox"))
	{
		driver=new FirefoxDriver();
		driver.get("https://www.youtube.com");
	}
	else{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
}}
}

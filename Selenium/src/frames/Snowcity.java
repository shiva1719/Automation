package frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Snowcity {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Adselnm/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://snowcityblr.com/");
		driver.findElement(By.xpath("//a[.='Contact Us' and @class='nav-top-link']")).click();
		driver.switchTo().frame("//div[@id='logo']/../../../../following-sibling::main[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[2]/div[2]/div[1]/div[1]/iframe[1]");
		driver.findElement(By.xpath("//a[@class='navigate-link']")).click();
		driver.switchTo().defaultContent();
		driver.close();
		
	}

}

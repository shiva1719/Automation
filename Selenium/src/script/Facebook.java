package script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./Adselnm/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
        driver.findElement(By.id("email")).sendKeys("shivarajbgd@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.id("pass")).sendKeys("shiva@123");
        Thread.sleep(2000);
        driver.findElement(By.name("login")).click();
	}
}


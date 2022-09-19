package css_selector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Dummy {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./Adselnm/geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        driver.get("https://www.facebook.com/");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("shivarajbgd@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("ghsjjsj");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@name='login']")).click();
	}

}

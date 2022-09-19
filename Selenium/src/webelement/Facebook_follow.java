package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Facebook_follow {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Adselnm/chromedriver.exe");    
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("shivrajbgd@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("shiva@919");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@name='login']")).click();
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//a[@aria-label='More']/../../../../../../../../preceding-sibling::div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/label[1]"));
		ele.click();
		Thread.sleep(2000);
		ele.sendKeys("Puneeth Rajkumar");
		Thread.sleep(2000);
		ele.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@aria-label='Puneeth Rajkumar, Verified account']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[.='Follow' and @class='a8c37x1j ni8dbmo4 stjgntxs l9j0dhe7 ltmttdrg g0qnabr5' ]")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//a[@aria-label='More']/../../../../../../../../following-sibling::div[1]/div[1]/span[1]/div[1]/div[1]/div[1] ")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[.='Log Out']")).click();
	}
}

package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Yahoo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./Adselnm/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
          driver.get("https://login.yahoo.com/?.intl=in&.lang=en-IN&src=search&activity=header-signin&pspid=2114723002&done=https%3A%2F%2Fin.search.yahoo.com%2F%3Ffr2%3Dinr&add=1");
          Thread.sleep(2000);
          driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("shivarajbagade@yahoo.com");
          Thread.sleep(2000);
          driver.findElement(By.xpath("//input[@id='login-signin']")).click();
          Thread.sleep(2000);
          driver.findElement(By.xpath("//input[@id='login-passwd']")).sendKeys("shiva@225");
          driver.findElement(By.xpath("//button[@name='verifyPassword']")).click();
          Thread.sleep(2000);
          driver.findElement(By.xpath("//div[@class='icon mail']")).click();
          Thread.sleep(2000);
          driver.findElement(By.xpath("//a[@rel='noopener' and @href='/d/compose/']")).click();
          driver.findElement(By.xpath("//input[@id='message-to-field']")).sendKeys("shivarajbgd@gmail.com");
          driver.findElement(By.xpath("//input[@data-test-id='compose-subject']")).sendKeys("Hi shivu This is auto generated");
          driver.findElement(By.xpath("//div[@aria-label='Message body' and @data-test-id='rte']")).sendKeys("Hi");
          Thread.sleep(2000);
          driver.findElement(By.xpath("//button[@type='button' and @title='Send this email']")).click();
	}

}

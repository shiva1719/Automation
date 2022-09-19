package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demowebshop {

	public static void main(String[] args) throws InterruptedException {
       System.setProperty("webdriver.gecko.driver", "./Adselnm/geckodriver.exe");
       WebDriver driver=new FirefoxDriver();
       driver.get("http://demowebshop.tricentis.com/");
       Thread.sleep(2000);
       driver.findElement(By.xpath("//img[@alt='Tricentis Demo Web Shop']/../../../following-sibling::div[1]/ul[1]/li[1]/a[1]")).click();
       Thread.sleep(2000);
       driver.findElement(By.xpath("//div[@class='page-title']/following-sibling::div[1]/div[3]/div[1]/div[1]/div[2]/div[3]/div[2]/input[1]")).click();
       Thread.sleep(2000);
       driver.findElement(By.xpath("//img[@alt='Tricentis Demo Web Shop']/../../../following-sibling::div[3]/div[2]/div[2]/div[2]/div[3]/div[3]/div[1]/div[2]/div[3]/div[2]/input[1]")).click();
       Thread.sleep(2000);
       driver.findElement(By.xpath("//span[.='Shopping cart']")).click();
	}

}

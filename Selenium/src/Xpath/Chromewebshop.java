package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Chromewebshop {
	public static void main(String[] args) throws InterruptedException {
	       System.setProperty("webdriver.chrome.driver", "./Adselnm/chromedriver.exe");
	       WebDriver driver=new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.get("http://demowebshop.tricentis.com/");
	       Thread.sleep(2000);
	       driver.findElement(By.xpath("(//a[@href='/books'])[1]")).click();
	       Thread.sleep(2000);
	       driver.findElement(By.xpath("(//input[@value='Add to cart'])[1]")).click();
	       Thread.sleep(2000);
	       driver.findElement(By.xpath("(//input[@value='Add to cart'])[2]")).click();
	         Thread.sleep(5000);
	       driver.findElement(By.xpath("//span[.='Shopping cart']")).click();
        }
}

package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Googlemap {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./Adselnm/geckodriver.exe");
         WebDriver driver=new FirefoxDriver();
            driver.get("https://www.google.com/maps/");
            Thread.sleep(2000);
            driver.findElement(By.xpath("//button[@id='hArJGc' and @aria-label='Directions']")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//button[@class='Hse3Ec FeXq4d']/../following-sibling::div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]")).sendKeys("Belagavi, Karnataka");
            Thread.sleep(2000);
            driver.findElement(By.xpath("//button[@class='Hse3Ec FeXq4d']/../following-sibling::div[2]/div[1]/div[1]/div[2]/button[1]")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//button[@class='Hse3Ec FeXq4d']/../following-sibling::div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/input[1]")).sendKeys("Bengaluru, Karnataka");
            Thread.sleep(3000);
            driver.findElement(By.xpath("//button[@class='Hse3Ec FeXq4d']/../following-sibling::div[2]/div[1]/div[2]/div[2]/button[1]")).click();
	}

}

package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Control_mainpage_frame_mainpage_frame {

		public static void main(String[] args) throws InterruptedException {
		    System.setProperty("webdriver.chrome.driver", "./Adselnm/chromedriver.exe");
		    WebDriver driver=new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/");
		    Thread.sleep(2000);
		    driver.findElement(By.id("iFrame")).click();
		    Thread.sleep(4000);
		    WebElement ele = driver.findElement(By.xpath("//li[@id='iFrame']/../following-sibling::div[1]/div[3]/p[1]/iframe[1]"));
		    Thread.sleep(2000);
		    driver.switchTo().frame(ele);
		    Thread.sleep(2000);
		    driver.findElement(By.id("s")).sendKeys("selenium");
		    Thread.sleep(2000);
		    driver.switchTo().defaultContent();
		    Thread.sleep(2000);
		    WebElement ele1 = driver.findElement(By.id("aswift_1"));
		    Thread.sleep(2000);
		    driver.switchTo().frame(ele1);
		    Thread.sleep(2000);
		    driver.findElement(By.id("aswift_1")).click();
		    Thread.sleep(4000);
	}

}

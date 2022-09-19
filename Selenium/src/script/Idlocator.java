package script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Idlocator {

	public static void main(String[] args) throws InterruptedException {
      System.setProperty("webdriver.gecko.driver", "./Adselnm/geckodriver.exe");
       WebDriver driver=new FirefoxDriver();
       driver.get("file:///C:/Users/umesh.KINGTIGER-999/Desktop/locators.html");
       WebElement ele = driver.findElement(By.id("a1"));
       Thread.sleep(2000);
       ele.click();
	}

}

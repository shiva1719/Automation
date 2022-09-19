package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Copypastebykeyboard {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./Adselnm/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		     driver.get("file:///C:/Users/umesh.KINGTIGER-999/Desktop/Keyboard%20function.html");
		     WebElement ele = driver.findElement(By.id("a1"));
		     Thread.sleep(2000);
		     ele.sendKeys(Keys.CONTROL+"ac");
		     Thread.sleep(2000);
		     WebElement ele1 = driver.findElement(By.id("a2"));
		     Thread.sleep(2000);
		     ele1.sendKeys(Keys.CONTROL+"av");
		     Thread.sleep(2000);
		     driver.quit();
	}

}

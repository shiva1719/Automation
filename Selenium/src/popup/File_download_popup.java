package popup;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class File_download_popup {

	public static void main(String[] args) throws InterruptedException, AWTException {
      System.setProperty("webdriver.gecko.driver", "./Adselnm/geckodriver.exe");
      WebDriver driver=new FirefoxDriver();
      driver.get("https://www.selenium.dev/downloads/");
      Thread.sleep(2000);
      driver.findElement(By.xpath("//a[.='4.4.0']")).click();
      Thread.sleep(2000);
      Robot r=new Robot();
      r.keyPress(KeyEvent.VK_LEFT);
      r.keyRelease(KeyEvent.VK_LEFT);
      r.keyPress(KeyEvent.VK_ENTER);
      r.keyRelease(KeyEvent.VK_ENTER);
	}

}

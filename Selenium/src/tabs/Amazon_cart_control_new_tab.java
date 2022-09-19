package tabs;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon_cart_control_new_tab {

	public static void main(String[] args) throws InterruptedException, AWTException {
     System.setProperty("webdriver.gecko.driver", "./Adselnm/geckodriver.exe");
     WebDriver driver=new FirefoxDriver();
     driver.get("https://www.amazon.in/");
     Thread.sleep(2000);
     WebElement ele = driver.findElement(By.xpath("//a[.=' Electronics ']"));
     Actions a=new Actions(driver);
     a.contextClick(ele).perform();
     Robot r=new Robot();
     r.keyPress(KeyEvent.VK_DOWN);
     r.keyRelease(KeyEvent.VK_DOWN);
     Thread.sleep(1000);
     r.keyPress(KeyEvent.VK_DOWN);
     r.keyRelease(KeyEvent.VK_DOWN);
     Thread.sleep(1000);
     r.keyPress(KeyEvent.VK_DOWN);
     r.keyRelease(KeyEvent.VK_DOWN);
     Thread.sleep(1000);
     r.keyPress(KeyEvent.VK_DOWN);
     r.keyRelease(KeyEvent.VK_DOWN);
     Thread.sleep(1000);
     r.keyPress(KeyEvent.VK_DOWN);
     r.keyRelease(KeyEvent.VK_DOWN);
     Thread.sleep(1000);
     r.keyPress(KeyEvent.VK_DOWN);
     r.keyRelease(KeyEvent.VK_DOWN);
     Thread.sleep(1000);
     r.keyPress(KeyEvent.VK_DOWN);
     r.keyRelease(KeyEvent.VK_DOWN);
     Thread.sleep(1000);
     r.keyPress(KeyEvent.VK_ENTER);
     r.keyRelease(KeyEvent.VK_ENTER);
     Thread.sleep(2000);
     r.keyPress(KeyEvent.VK_CONTROL);
     r.keyPress(KeyEvent.VK_T);
     Thread.sleep(1000);
     r.keyRelease(KeyEvent.VK_CONTROL);
     r.keyRelease(KeyEvent.VK_T); 
     Thread.sleep(2000);
     r.keyPress(KeyEvent.VK_CONTROL);
     r.keyPress(KeyEvent.VK_V);
     Thread.sleep(1000);
     r.keyRelease(KeyEvent.VK_CONTROL);
     r.keyRelease(KeyEvent.VK_V);
     Thread.sleep(2000);
     r.keyPress(KeyEvent.VK_ENTER);
     Thread.sleep(1000);
     r.keyRelease(KeyEvent.VK_ENTER);
     Thread.sleep(2000);
     Set<String> allwh = driver.getWindowHandles();
     ArrayList<String> l=new ArrayList<String>(allwh);
     String control = l.get(1);
     for (String string : l) {
		driver.switchTo().window(control);
	     driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iqoo 9 se");
	     r.keyPress(KeyEvent.VK_ENTER);
	     r.keyRelease(KeyEvent.VK_ENTER);
	}

	}

}

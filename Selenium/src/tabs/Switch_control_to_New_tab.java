package tabs;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Switch_control_to_New_tab {

	public static void main(String[] args) throws InterruptedException, AWTException {
      System.setProperty("webdriver.chrome.driver", "./Adselnm/chromedriver.exe");
      WebDriver driver=new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://www.google.co.in/");
      Thread.sleep(2000);
      WebElement ele = driver.findElement(By.xpath("//a[.='ಕನ್ನಡ']")); 
      Actions a=new Actions(driver);
      a.contextClick(ele).perform();
      Thread.sleep(2000);
      Robot r=new Robot();
      r.keyPress(KeyEvent.VK_DOWN);
      r.keyRelease(KeyEvent.VK_DOWN);
      Thread.sleep(1000);
      r.keyPress(KeyEvent.VK_ENTER);
      r.keyRelease(KeyEvent.VK_ENTER);
      Set<String> alwh = driver.getWindowHandles();
      int count = alwh.size();
      System.out.println(count);
      ArrayList<String> l=new ArrayList<String>(alwh);
      int count1 = l.size();
      System.out.println(count1);
      String control = l.get(1);
      Thread.sleep(4000);
      for (String wh : l) {
		driver.switchTo().window(control);
	}
	}

}

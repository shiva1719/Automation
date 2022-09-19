package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sizeofelement {

	public static void main(String[] args) {
      System.setProperty("webdriver.gecko.driver", "./Adselnm/geckodriver.exe");
      WebDriver driver=new FirefoxDriver();
      driver.navigate().to("https://ssc.nic.in/");
      WebElement ele = driver.findElement(By.xpath("//img[@class='lazy']"));
      int height = ele.getSize().getHeight();
      System.out.println(height);
      int width = ele.getSize().getWidth();
      System.out.println(width);
      driver.close();
	}

}

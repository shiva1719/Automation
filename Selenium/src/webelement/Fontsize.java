package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fontsize {

	public static void main(String[] args) {
      System.setProperty("webdriver.chrome.driver", "./Adselnm/chromedriver.exe");
      WebDriver driver=new ChromeDriver();
      driver.manage().window().maximize();
      driver.navigate().to("https://ssc.nic.in/");
      WebElement ele = driver.findElement(By.xpath("//input[@id='txtCaptcha']"));
      String font = ele.getCssValue("font");
	System.out.println(font);
      driver.close();
	}

}

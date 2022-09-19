package webelement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fetchnameandclear {

	public static void main(String[] args) throws InterruptedException {
       System.setProperty("webdriver.chrome.driver", "./Adselnm/chromedriver.exe");
       WebDriver driver=new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("file:///C:/Users/umesh.KINGTIGER-999/Desktop/fetch%20name.html");
       List<WebElement> textfield = driver.findElements(By.xpath("//input"));
       int count = textfield.size();
       for (WebElement norm : textfield) {
		norm.sendKeys("Shivaraj");
		Thread.sleep(1000);
	}
       for (int i = count-1; i>=0; i--) {
	      WebElement rev = textfield.get(i);
	      rev.clear();
		Thread.sleep(1000);
	}
       driver.quit();
	}

}

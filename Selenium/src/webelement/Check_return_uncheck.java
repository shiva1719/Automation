package webelement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Check_return_uncheck {

	public static void main(String[] args) throws InterruptedException {
       System.setProperty("webdriver.chrome.driver", "./Adselnm/chromedriver.exe");
       WebDriver driver=new ChromeDriver();
       driver.manage().window().maximize();
       driver.navigate().to("file:///C:/Users/umesh.KINGTIGER-999/Desktop/check%20and%20uncheck.html");
       List<WebElement> cb = driver.findElements(By.xpath("//input"));
       int count = cb.size();
       for (int i = 0; i < count; i++) {
		    WebElement check = cb.get(i);
		    check.click();
		    Thread.sleep(1000);
	}
       
       for (int i = count-1; i>=0; i--) {
		WebElement uncheck = cb.get(i);
		uncheck.click();
		Thread.sleep(1000);
	}
       driver.quit();
	}

}

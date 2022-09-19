package script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tagnamelocator {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Adselnm/chromedriver.exe");
         WebDriver driver=new ChromeDriver();
         driver.get("file:///C:/Users/umesh.KINGTIGER-999/Desktop/locators.html");
         Thread.sleep(2000);
         driver.findElement(By.tagName("a")).click();
	}

}

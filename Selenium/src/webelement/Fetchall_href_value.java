package webelement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Fetchall_href_value {

	public static void main(String[] args) {
       System.setProperty("webdriver.gecko.driver", "./Adselnm/geckodriver.exe");
       WebDriver driver=new FirefoxDriver();
       driver.get("https://www.amazon.in/");
       List<WebElement> links = driver.findElements(By.xpath("//a"));
       int count = links.size();
       System.out.println(count);
       for (WebElement we : links) {
		String fetch = we.getAttribute("href");
		System.out.println(fetch);
	}
       driver.quit();
	}

}

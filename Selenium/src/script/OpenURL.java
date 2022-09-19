package script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenURL {
	
	public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "./Adselnm/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com");
	}
}

package script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getpagesource {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Adselnm/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		String src= driver.getPageSource();
		System.out.println(src);
	}
}

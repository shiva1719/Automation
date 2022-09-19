package script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gettitle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Adselnm/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		     String title= driver.getTitle();
		System.out.println(title);

	}

}

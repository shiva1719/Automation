package script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Fetchurl {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","./Adselnm/geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        driver.get("https://www.flipkart.com");
        String url=driver.getCurrentUrl();
        System.out.println(url);
	}

}

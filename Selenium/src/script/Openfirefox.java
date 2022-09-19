package script;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Openfirefox {

	public static void main(String[] args) {
		String key="webdriver.gecko.driver";
		String value="./Adselnm/geckodriver.exe";
		System.setProperty(key, value);
		FirefoxDriver driver=new FirefoxDriver();	

	}

}

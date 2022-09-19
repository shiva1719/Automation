package script;

import org.openqa.selenium.chrome.ChromeDriver;

public class Openchrome {

	public static void main(String[] args) {
		String key="webdriver.chrome.driver";
		String value="./Adselnm/chromedriver.exe";
        System.setProperty(key, value);
        ChromeDriver driver=new ChromeDriver();
	}

}

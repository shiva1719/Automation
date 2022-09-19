package script;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Bothbrowser {

	public static void main(String[] args) {
		String key="webdriver.gecko.driver";
		String value="./Adselnm/geckodriver.exe";
		System.setProperty(key, value);
		FirefoxDriver driver=new FirefoxDriver();
		String key1="webdriver.chrome.driver";
		String value1="./Adselnm/chromedriver.exe";
        System.setProperty(key1, value1);
        ChromeDriver d1=new ChromeDriver();
	}

}

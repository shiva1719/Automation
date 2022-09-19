package script;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Closebrowser {

	public static void main(String[] args) throws InterruptedException {
		String key="webdriver.gecko.driver";
		String value="./Adselnm/geckodriver.exe";
		System.setProperty(key, value);
		FirefoxDriver driver=new FirefoxDriver();
		Thread.sleep(2000);
        driver.close();
	}

}

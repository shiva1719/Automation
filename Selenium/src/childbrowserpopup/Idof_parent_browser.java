package childbrowserpopup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Idof_parent_browser {

	public static void main(String[] args) throws InterruptedException {
     System.setProperty("webdriver.chrome.driver", "./Adselnm/chromedriver.exe");
     WebDriver driver=new ChromeDriver();
     driver.get("https://skpatro.github.io/demo/links/");
     Thread.sleep(2000);
     String p_id = driver.getWindowHandle();
     System.out.println(p_id);
	}

}

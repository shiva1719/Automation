package childbrowserpopup;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Fetch_title_and_close_parent_browser {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./Adselnm/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		Thread.sleep(2000);
		driver.findElement(By.name("NewWindow")).click();
		Thread.sleep(2000);
		Set<String> all = driver.getWindowHandles();
		int count = all.size();
		System.out.println(count);
		Thread.sleep(2000);
		String parent_id = driver.getWindowHandle();
		System.out.println(parent_id);
		for (String single : all) {
			driver.switchTo().window(single);
			String title = driver.getTitle();
			System.out.println(title);
			Thread.sleep(2000);
			if(single.equals(parent_id)){
				driver.close();}
		}
	}

}

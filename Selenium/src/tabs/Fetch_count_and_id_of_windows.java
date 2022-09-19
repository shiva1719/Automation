package tabs;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fetch_count_and_id_of_windows {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Adselnm/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		Thread.sleep(2000);
		driver.findElement(By.name("NewWindow")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("NewTab")).click();
		Set<String> alwh = driver.getWindowHandles();
		int count = alwh.size();
		System.out.println(count);
		for (String wh : alwh) {
			System.out.println(wh);
			
		}
	}

}

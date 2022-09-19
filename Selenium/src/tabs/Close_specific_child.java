package tabs;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Close_specific_child {
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
			driver.switchTo().window(wh);
			String t = driver.getTitle();
			System.out.println(t);
			Thread.sleep(4000);
			if (t.equals("About me - qavalidation")) {
				driver.close();
			}

		}
	}
}

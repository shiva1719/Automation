package childbrowserpopup;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Title_and_close_all_tabs_one_by_one {

	public static void main(String[] args) throws InterruptedException {
      System.setProperty("webdriver.chrome.driver", "./Adselnm/chromedriver.exe");
      WebDriver driver=new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://skpatro.github.io/demo/links/");
      Thread.sleep(2000);
      for (int i = 0; i < 4; i++) {
		driver.findElement(By.name("NewTab")).click();
		Thread.sleep(1000);
	}
      driver.findElement(By.name("NewWindow")).click();
      Thread.sleep(2000);
      Set<String> all = driver.getWindowHandles();
      Thread.sleep(1000);
      int count = all.size();
      System.out.println(count);
      for (String single : all) {
		driver.switchTo().window(single);
		String title = driver.getTitle();
		System.out.println(title);
		Thread.sleep(2000);
		driver.close();
	}
	}

}

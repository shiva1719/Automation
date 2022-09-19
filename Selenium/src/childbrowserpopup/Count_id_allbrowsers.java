package childbrowserpopup;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Count_id_allbrowsers {

	public static void main(String[] args) throws InterruptedException {
     System.setProperty("webdriver.chrome.driver", "./Adselnm/chromedriver.exe");
     WebDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://skpatro.github.io/demo/links/");
     Thread.sleep(2000);
     driver.findElement(By.name("NewWindow")).click();
     Thread.sleep(2000);
     driver.findElement(By.name("NewTab")).click();
     Thread.sleep(2000);
     Set<String> all = driver.getWindowHandles();
     int count = all.size();
     System.out.println(count);
     for (String single : all) {
		System.out.println(single);
	}
	}

}

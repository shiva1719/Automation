package tabs;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Close_only_child_browser {

	public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.gecko.driver", "./Adselnm/geckodriver.exe");
    WebDriver driver=new FirefoxDriver();
    driver.get("https://skpatro.github.io/demo/links/");
    Thread.sleep(2000);
    driver.findElement(By.name("NewWindow")).click();
    Thread.sleep(2000);
    driver.findElement(By.name("NewTab")).click();
    String p_id = driver.getWindowHandle();
    Set<String> allwh = driver.getWindowHandles();
    allwh.remove(p_id);
    for (String wh : allwh) {
    	driver.switchTo().window(wh);
		String t = driver.getTitle();
		System.out.println(t);
		driver.close();
	}
	}

}

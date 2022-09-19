package css_selector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtubechrome {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Adselnm/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.youtube.com/");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[name='search_query']")).sendKeys("Coke Studio | Season 14 | Pasoori | Ali Sethi x Shae Gill");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("button[id='search-icon-legacy']")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("yt-formatted-string[class='style-scope ytd-video-renderer']")).click();
	}

}

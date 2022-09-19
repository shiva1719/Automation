package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Youtubelike {

	public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.gecko.driver", "./Adselnm/geckodriver.exe");
    WebDriver driver=new FirefoxDriver();
    driver.get("https://www.youtube.com/");
    Thread.sleep(2000);
    driver.findElement(By.xpath("//input[@id='search']")).sendKeys("ra ra rakkamma kannada song");
    Thread.sleep(2000);
    driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//yt-formatted-string[@class='style-scope ytd-video-renderer' and text()='Ra Ra Rakkamma Kannada Lyric Video | Vikrant Rona |Kichcha Sudeep|Jacqueline Fernandez|Anup Bhandari']")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//yt-formatted-string[.='Share']/../../preceding-sibling::ytd-toggle-button-renderer[2]")).click();
	}

}

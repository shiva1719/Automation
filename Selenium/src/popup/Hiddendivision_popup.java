package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hiddendivision_popup {

	public static void main(String[] args) throws InterruptedException {
       System.setProperty("webdriver.chrome.driver", "./Adselnm/chromedriver.exe");
       WebDriver driver=new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://www.cleartrip.com/flights");
       Thread.sleep(2000);
       driver.findElement(By.xpath("//h4[.='Depart on']/../../following-sibling::div[1]/div[1]/div[1]/div[1]/div[1]/button[1")).click();
       Thread.sleep(2000);
       driver.findElement(By.xpath("(//div[.='20'])[1]")).click();
	}

}

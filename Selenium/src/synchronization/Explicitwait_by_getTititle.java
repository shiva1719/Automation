package synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwait_by_getTititle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Adselnm/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement ele = driver.findElement(By.xpath("//a[.='Mobiles' and @data-csa-c-content-id='nav_cs_mobiles']"));
		ele.click();
		WebDriverWait wait= new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.titleContains("Mobiles"));
	}

}

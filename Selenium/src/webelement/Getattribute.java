package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getattribute {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Adselnm/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://en.wikipedia.org/wiki/Flipkart");
		WebElement ele = driver.findElement(By.xpath("//a[@title='E-commerce' and .='e-commerce']"));
		Thread.sleep(2000);
		String att = ele.getAttribute("href");
         System.out.println(att);
         String text = ele.getText();
         System.out.println(text);
         driver.quit();
	}

}

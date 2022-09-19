package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkout {

	public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver", "./Adselnm/chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.amazon.in/");
    driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iphone 13 pro max");
    Thread.sleep(2000);
    driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//span[.='Apple iPhone 13 Pro Max (512GB) - Graphite']")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//span[.='Add to Cart' and @id='submit.add-to-cart-announce']")).click();
	}

}

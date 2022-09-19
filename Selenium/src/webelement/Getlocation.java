package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getlocation {

	public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "./Adselnm/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://en.wikipedia.org/wiki/Flipkart");
        WebElement ele = driver.findElement(By.xpath("//a[@title='E-commerce' and .='e-commerce']"));
        Point loc = ele.getLocation();
        System.out.println(loc);
        int x = loc.getX();
        System.out.println(x);
        int y = loc.getY();
        System.out.println(y);
        driver.close();
	}

}

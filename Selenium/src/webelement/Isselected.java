package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Isselected {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Adselnm/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/umesh.KINGTIGER-999/Desktop/Isselected.html");
        WebElement ele = driver.findElement(By.id("a2"));
        boolean b = ele.isSelected();
        Thread.sleep(2000);
        if (b) {
			System.out.println("checkbox is selected");
		}
        else {
			System.out.println("checkbox is not selected");
		}
        driver.quit();
	}

}

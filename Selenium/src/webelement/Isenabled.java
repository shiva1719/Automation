package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Isenabled {

	public static void main(String[] args) throws InterruptedException {
       System.setProperty("webdriver.chrome.driver", "./Adselnm/chromedriver.exe");
       WebDriver driver=new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("file:///C:/Users/umesh.KINGTIGER-999/Desktop/isenabled.html");
       Thread.sleep(2000);
       WebElement ele = driver.findElement(By.id("a1"));
       boolean b = ele.isEnabled();
            if(b){
                   System.out.println("enabled");
                 }
            else{
                   System.out.println("disabled");
                  }
       Thread.sleep(2000);
       driver.quit();                
	}

}

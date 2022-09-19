package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Isdisplayed {
public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "./Adselnm/geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
             driver.get("file:///C:/Users/umesh.KINGTIGER-999/Desktop/isenabled.html");
             WebElement ele = driver.findElement(By.id("a2"));
             boolean b = ele.isDisplayed();
             if(b){
            	 System.out.println("Text field is displayed");
             }
             else{
            	 System.out.println("Text field is not displayed");
             }
             driver.quit();
             
	}

}

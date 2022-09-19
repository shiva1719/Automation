package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class File_upload_popup {

	public static void main(String[] args) throws InterruptedException {
      System.setProperty("webdriver.chrome.driver", "./Adselnm/chromedriver.exe");
      WebDriver driver=new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("file:///C:/Users/umesh.KINGTIGER-999/Desktop/File%20upload%20popup.html");
      Thread.sleep(2000);
      WebElement ele = driver.findElement(By.name("upload file"));
      ele.sendKeys("C:\\Users\\umesh.KINGTIGER-999\\Desktop\\ALM notes.txt");
	}

}

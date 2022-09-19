package handling_disabled_textfield;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Disabled_textfiled_input {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Adselnm/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/umesh.KINGTIGER-999/Desktop/disabled_textfield.html");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("document.getElement.ById('t').value=''");
		
	}

}

package webelement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetsizebyDimension {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Adselnm/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		org.openqa.selenium.Dimension d=new org.openqa.selenium.Dimension(400, 500);
		driver.manage().window().setSize(d);
	}

}

package dropdown;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Months_dd_serialwise {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./Adselnm/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/r.php?locale=en_GB");
	Thread.sleep(2000);
	WebElement month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
	Select s=new Select(month);
	List<WebElement> options = s.getOptions();
	int count = options.size();
	System.out.println(count);
	for (WebElement we : options) {
		String b = we.getText();
		System.out.println(b);

	}
	}

}

package dropdown;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Months_dd_arraylist_to_treeset_upcasting {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Adselnm/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php?locale=en_GB");
		Thread.sleep(2000);
		WebElement months = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select s=new Select(months);
		Thread.sleep(2000);
		List<WebElement> opt = s.getOptions();
		int count = opt.size();
		System.out.println(count);
		TreeSet<String> t=new TreeSet<String>();
		ArrayList<String> l=new ArrayList<String>(t);
		for (WebElement we : opt) {
			String text = we.getText();
			l.add(text);
		}
		for (String string : l) {
			System.out.println(string);
		}
		driver.close();
	}

}

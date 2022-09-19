package dropdown;

import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Months_dd_using_treeset_reverse {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./Adselnm/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/r.php?locale=en_GB");
		WebElement months = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select s=new Select(months);
		List<WebElement> opt = s.getOptions();
		int count = opt.size();
		System.out.println(count);
		TreeSet<String> t=new TreeSet<String>(Collections.reverseOrder());
		for (WebElement we : opt) {
			String t1 = we.getText();
			t.add(t1);
		}
		for (String string : t) {
			System.out.println(string);
		}
	}
}

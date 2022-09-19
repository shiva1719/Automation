package dropdown;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Months_dd_sorted {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./Adselnm/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/r.php?locale=en_GB");
		WebElement months = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select s=new Select(months);
		List<WebElement> opt = s.getOptions();
		int count = opt.size();
		System.out.println(count);
	    ArrayList<String> l=new ArrayList<String>();
	    for (WebElement we : opt) {
			String t = we.getText();
			l.add(t);
		}
	    Collections.sort(l);
	    for (String t1 : l) {
			System.out.println(t1);
		}
		}
	}



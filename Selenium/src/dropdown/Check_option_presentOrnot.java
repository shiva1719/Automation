package dropdown;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Check_option_presentOrnot {

	public static void main(String[] args) throws InterruptedException {
     System.setProperty("webdriver.gecko.driver", "./Adselnm/geckodriver.exe");
     WebDriver driver=new FirefoxDriver();
     driver.get("https://www.facebook.com/r.php?locale=en_GB");
     Thread.sleep(2000);
     WebElement ele = driver.findElement(By.xpath("//select[@name='birthday_month']"));
     Select s=new Select(ele);
     List<WebElement> opt = s.getOptions();
     ArrayList<String> l=new ArrayList<String>();
     for (WebElement we : opt) {
		String t = we.getText();
		l.add(t);
	}
     if (l.contains("Jan")) {
		System.out.println("option is present");
	}
     else {
		System.out.println("option not present");
	}
	}

}

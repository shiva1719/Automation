package tabs;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Close_browser_without_close_and_quit {

	public static void main(String[] args) throws InterruptedException, AWTException {
       System.setProperty("webdriver.chrome.driver", "./Adselnm/chromedriver.exe");
       WebDriver driver=new ChromeDriver();
       driver.manage().window().maximize();
       Thread.sleep(2000);
       Robot robot = new Robot();
       robot.keyPress(KeyEvent.VK_ALT);
       robot.keyPress(KeyEvent.VK_SPACE);
       Thread.sleep(1000);
       robot.keyPress(KeyEvent.VK_C);
       robot.keyRelease(KeyEvent.VK_ALT);
       robot.keyRelease(KeyEvent.VK_SPACE);
       Thread.sleep(1000);
       robot.keyRelease(KeyEvent.VK_C);
	}

}

package testNG;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Actitime extends Generic_script {
  @Test
  public void validLogin() throws InterruptedException {
	  driver.findElement(By.id("username")).sendKeys("admin");
	  driver.findElement(By.name("pwd")).sendKeys("manager");
	  driver.findElement(By.xpath("//div[.='Login ']")).click();
	  Thread.sleep(2000);
	  String title = driver.getTitle();
	  System.out.println(title);
  }
  @Test
  public void timeTrack() throws InterruptedException 
  {
	  driver.findElement(By.xpath("//a[.='View Time-Track']")).click();
	  String url = driver.getCurrentUrl();
	  System.out.println(url);
  }
}

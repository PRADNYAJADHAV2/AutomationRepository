package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameLocators {
	public static void main(String[] args) throws InterruptedException {
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/vikra/Desktop/WebElement/radiobutton.html");
	Thread.sleep(2000);
	//identify A radio button by using name locators
	driver.findElement(By.name("name1")).click();
	Thread.sleep(2000);
	//identify D radio button by using name locators
	driver.findElement(By.name("name4")).click();
	Thread.sleep(2000);
	}

}

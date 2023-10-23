package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdLocators {
	public static void main(String[] args) throws InterruptedException {
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.get("file:///C:/Users/vikra/Desktop/WebElement/Assignrment.html");
	Thread.sleep(2000);
	//identify usernameTB by using id
	driver.findElement(By.id("11")).sendKeys("admin");
	
	Thread.sleep(2000);
	driver.findElement(By.id("12")).sendKeys("manager");
	Thread.sleep(2000);
	driver.findElement(By.tagName("Button")).click();
	Thread.sleep(2000);
	driver.close();
	}

}

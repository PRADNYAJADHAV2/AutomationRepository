package assignements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramLoginPage {
	public static void main(String[] args) throws InterruptedException {
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.get("https://www.instagram.com/accounts/login/");
	Thread.sleep(2000);
	
	driver.findElement(By.name("username")).sendKeys("pradnya._.00");
	Thread.sleep(2000);
	driver.findElement(By.name("password")).sendKeys("pradnya@123");
	//driver.findElement(By.tagName("Div")).click();
	
	Thread.sleep(3000);
	driver.close();
	}

}

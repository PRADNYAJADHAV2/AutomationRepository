package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorLocatror {
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=	new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	Thread.sleep(2000);
	
	//identify username by useing Cssselector
	driver.findElement(By.cssSelector("input[name*='username']")).sendKeys("Admin");
	//Identify password by useing cssselector
	driver.findElement(By.cssSelector("input[name*='password']")).sendKeys("admin123");
	
	driver.findElement(By.cssSelector("button[type='submit']")).click();
	Thread.sleep(2000);
	driver.quit(); 
	
	
	
	
	
	}

}

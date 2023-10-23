package methodsofWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class SendkeysMethod {
	public static void main(String[] args) {
		WebDriver  driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		WebElement USTB = driver.findElement(By.name("username"));
	
		USTB.sendKeys("Admin");
	WebElement PSTB=driver.findElement(By.name("password"));
	PSTB.sendKeys("admin123");
	
		
		
		
		
		
		
		
	}

}

package methodsofWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickMethod {
	public static void main(String[] args) {
		WebDriver  driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//Indentify userTB
		WebElement USTB = driver.findElement(By.name("username"));
	
		USTB.sendKeys("Admin");
		//identify PassTB
	WebElement PSTB=driver.findElement(By.name("password"));
	PSTB.sendKeys("admin123");
	//Click on login Button
	driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		
	}

}

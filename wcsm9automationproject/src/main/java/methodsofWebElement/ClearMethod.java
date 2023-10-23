package methodsofWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearMethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver  driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//Indentify userTB
		WebElement USTB = driver.findElement(By.name("username"));
	
		USTB.sendKeys("Admin");
		Thread.sleep(2000);
		//identify PassTB
	WebElement PSTB=driver.findElement(By.name("password"));
	
	PSTB.sendKeys("admin123");
	Thread.sleep(2000);
	driver.findElement(By.name("username")).clear();
	Thread.sleep(2000);

	driver.findElement(By.name("password")).clear();

	
	}

}

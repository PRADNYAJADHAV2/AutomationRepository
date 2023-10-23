package assignements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Netflixlogin {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =	new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.netflix.com/in/login");
		Thread.sleep(2000);
		//to identify email
		driver.findElement(By.name("email")).sendKeys("pradnya.pj22@gmail.com");
		Thread.sleep(2000);
		
		
	
		driver.findElement(By.id("id_password")).sendKeys("pradnya@123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Sign In']")).click();
		
		driver.quit();

	}

}

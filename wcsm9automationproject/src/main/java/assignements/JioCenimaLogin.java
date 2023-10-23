package assignements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JioCenimaLogin {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =	new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.jiocinema.com/?onboard=login-phone");
		Thread.sleep(2000);
		driver.findElement(By.id(":r2:")).sendKeys("7507899753");
		Thread.sleep(2000);
		driver.findElement(By.className("class=\"mui-style-1ja1tam-submit\"")).click();
		
		Thread.sleep(2000);
	}
	

}

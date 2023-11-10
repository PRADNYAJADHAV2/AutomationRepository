package assignements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bluestone {
	public static void main(String[] args) throws InterruptedException {
		WebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://www.bluestone.com/");
	
		Thread.sleep(2000);
		driver.findElement(By.id("denyBtn")).click();
		Thread.sleep(2000);
		driver.switchTo().frame(0);

		driver.findElement(By.id("chat-icon")).click();
		driver.findElement(By.id("chat-fc-name")).sendKeys("pradnya");
		Thread.sleep(2000);

		driver.findElement(By.id("chat-fc-email")).sendKeys("pradnya@gmail.com");
		Thread.sleep(2000);

		driver.findElement(By.id("chat-fc-phone")).sendKeys("75821235");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[@class='fc-button']")).click();
		Thread.sleep(2000);

	}
	


}

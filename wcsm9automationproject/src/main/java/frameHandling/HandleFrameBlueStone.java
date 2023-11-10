package frameHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrameBlueStone {
	public static void main(String[] args) throws InterruptedException {
		WebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://www.bluestone.com/");
	
		//handle popup
		driver.findElement(By.id("denyBtn")).click();
		Thread.sleep(2000);
		//Switch the control to frame
		//driver.switchTo().frame(6);
		driver.switchTo().frame("fc_widget");
		//WebElement frameele = driver.findElement(By.id("fc_widge"));
		//driver.switchTo().frame(frameele);
		Thread.sleep(2000);
			//click on chat box
		driver.findElement(By.id("chat-icon")).click();
		
		//hamdle all text box present inside in chot box
		//all the text box are designed under main webpage so swtich back to main webpage
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		driver.findElement(By.id("chat-fc-name")).sendKeys("pradnya");
		Thread.sleep(2000);

		driver.findElement(By.id("chat-fc-email")).sendKeys("pradnya@gmail.com");
		Thread.sleep(2000);

		driver.findElement(By.id("chat-fc-phone")).sendKeys("75821235");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[@class='fc-button']")).click();
		Thread.sleep(2000);
		driver.quit();

	}





	}



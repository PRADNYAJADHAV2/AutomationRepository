package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickMethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//section[text()='Button']")).click();
		driver.findElement(By.xpath("//a[text()='Right Click']")).click();
		
		WebElement rightclk1 = driver.findElement(By.xpath("(//button[text()='Right Click'])[1]"));
		Thread.sleep(2000);

		WebElement rightclk2 = driver.findElement(By.xpath("(//button[text()='Right Click'])[2]"));
		Thread.sleep(2000);

		WebElement rightclk3 = driver.findElement(By.xpath("(//button[text()='Right Click'])[3]"));
		Actions act = new Actions(driver);
		 act.contextClick(rightclk1).perform();
		Thread.sleep(2000);
		if(driver.findElement(By.xpath("//div[text()='Yes']")).isDisplayed())
		{
			System.out.println("is displY");
		}
		else
		{
			System.out.println("not display");
		}
		
		act.contextClick(rightclk2).perform();
		Thread.sleep(2000);

		act.contextClick(rightclk3).perform();
		Thread.sleep(2000);

		
		

	}

	
}

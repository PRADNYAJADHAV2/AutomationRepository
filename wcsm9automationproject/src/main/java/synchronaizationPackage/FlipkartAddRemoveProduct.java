package synchronaizationPackage;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlipkartAddRemoveProduct {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(80));
		//driver.get("https://www.google.com/");
		//driver.switchTo().activeElement().sendKeys("Flipkart",Keys.ENTER);
		driver.get("https://www.flipkart.com/");
		//handle the popup
		driver.findElement(By.xpath("//span[text()='✕']")).click();
		
		
		driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("iphone");
		//click on search symbol
		driver.findElement(By.xpath("//button[contains(@aria-label,'Se')]")).click();
		//get window handle
		Thread.sleep(2000);
		String parentHandle = driver.getWindowHandle();
		//click on product
		driver.findElement(By.xpath("(//div[@class='_4rR01T'])[2]")).click();
		//get the address of all the window
		Thread.sleep(2000);
		Set<String> allhandles = driver.getWindowHandles();
		for(String wh:allhandles) {
			if(!parentHandle.equals(wh))
			{
				driver.switchTo().window(wh);
				//System.out.println(wh);
			}
		}
			Thread.sleep(4000);
			//click on red color
			driver.findElement(By.xpath("(//div[@class='_2C41yO'])[1]")).click(); 
			Thread.sleep(2000);
			//click on storage 
			driver.findElement(By.xpath("(//body[@class='__web-inspector-hide-shortcut__'])[1]")).click();
			Thread.sleep(2000);
			//click on add to cart
			driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
		Thread.sleep(2000);

			driver.quit();
			
		}
}
	
		
		 



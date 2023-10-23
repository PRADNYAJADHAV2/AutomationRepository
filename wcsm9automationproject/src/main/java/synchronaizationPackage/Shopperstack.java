package synchronaizationPackage;

import java.nio.file.WatchEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Shopperstack {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get("https://www.shoppersstack.com/");
		driver.findElement(By.xpath("//img[@alt='SAMSUNG Galaxy Z Flip4 ']")).click();
		driver.findElement(By.id("Check Delivery")).sendKeys("411055");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
		WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='Check']")));
		ele.click();
		driver.findElement(By.xpath("//button[@id='Check']")).click();
		//driver.quit();
		//WebElement checkButton=driver.findElement(By.xpath("//button[@id='Check']"));
		
	//}
	//public static WebElement explicitwait(WebDriver driver,long sec,WebElement ele)
	///{
		 //WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(sec));
		// WebElement element = wait.until(ExpectedConditions.elementToBeClickable(ele));
		//return element;
	}
}



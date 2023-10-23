package synchronaizationPackage;

import java.time.Duration;
import java.util.concurrent.locks.Condition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Omayo {
	public static void main(String[] args) {
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	
	driver.get("https://omayo.blogspot.com/");
	driver.findElement(By.className("dropbtn")).click();
	
	//apply explicit wait
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(50));
	WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Flipkart']")));
	ele.click();
	driver.findElement(By.xpath("//a[text()='Flipkart']")).click();
	//driver.quit();
	
	
	
	}

}

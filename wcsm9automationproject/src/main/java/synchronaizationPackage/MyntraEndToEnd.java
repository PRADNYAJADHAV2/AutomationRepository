package synchronaizationPackage;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyntraEndToEnd {
	public static void main(String[] args) throws InterruptedException {
	ChromeOptions co =	new ChromeOptions();
	co.addArguments("--disable-notifications");
	WebDriver driver	=new ChromeDriver(co);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(90));
	driver.get("https://www.myntra.com/shop/men");
	driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("top");
	driver.findElement(By.xpath("//a[@class='desktop-submit']")).click();
	//driver.findElement(By.xpath("//div[@class='container-base myx-stretch __web-inspector-hide-shortcut__']")).click();
	String parent = driver.getWindowHandle();
	driver.findElement(By.xpath("//img[@class='img-responsive' and (@alt='Dream Beauty Fashion Sania Women Black & Beige Floral Printed Top')]")).click();
	Thread.sleep(2000);
	Set<String> allhandles = driver.getWindowHandles();
	for(String wh:allhandles) {
		if(!parent.equals(wh))
		{
			driver.switchTo().window(wh);
			//System.out.println(wh);
		}
	}
//	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(50));
//	WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@class='img-responsive' and (@alt='Dream Beauty Fashion Sania Women Black & Beige Floral Printed Top')]")));
//	ele.click();
	driver.findElement(By.xpath("(//div[@class='size-buttons-buttonContainer']/ancestor::div[@class='size-buttons-tipAndBtnContainer'])[1]")).click();
	Thread.sleep(2000);
	//driver.findElement(By.xpath("//div[@class='pdp-action-container pdp-fixed __web-inspector-hide-shortcut__']")).click();
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(90));
	WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='pdp-add-to-bag pdp-button pdp-flex pdp-center __web-inspector-hide-shortcut__']")));
	
	ele.click();
	Thread.sleep(1000);
	driver.quit();
	}

}

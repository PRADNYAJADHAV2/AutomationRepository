package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WithoutusingActionClass {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	driver.get("https://www.bluestone.com/");
	Thread.sleep(2000);
	//handle popup
	driver.findElement(By.id("denyBtn")).click();
	//identify webelement
	WebElement coin = driver.findElement(By.xpath("//a[@title='Coins']"));
Actions act = new Actions(driver);
act.moveToElement(coin).perform();
Thread.sleep(2000);
driver.findElement(By.xpath("//span[text()='Coins by Design']")).click();

if(driver.findElement(By.xpath("//h1[@class='page-title title-14']")).isDisplayed())
{
	System.out.println("text is display");
}
else
{
	System.out.println("text is not  display");

}
}

}

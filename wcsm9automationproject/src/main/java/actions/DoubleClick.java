package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//section[text()='Button']")).click();
		
		driver.findElement(By.xpath("//a[text()='Double Click']")).click();
		WebElement doubleclk1 = driver.findElement(By.xpath("(//button[text()='Yes'])[1]"));
		WebElement doubleclk2 = driver.findElement(By.xpath("(//button[text()='No'])[2]"));
		WebElement doubleclk3 = driver.findElement(By.xpath("//button[text()='5']"));

Actions act = new Actions(driver);
Thread.sleep(2000);
act.doubleClick(doubleclk1).perform();
Thread.sleep(2000);
if(driver.findElement(By.xpath("//span[text()='You selected \"Yes\"']")).isDisplayed())
{
	System.out.println("is display");
}
else
{
	System.out.println("is not display");
}

act.doubleClick(doubleclk2).perform();
Thread.sleep(2000);

act.doubleClick(doubleclk3).perform();

		
	}
	

}

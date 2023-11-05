package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DragAndDropAss {
	public static void main(String[] args) throws InterruptedException {
		WebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		Thread.sleep(2000);
		//all drag element
		WebElement src1 = driver.findElement(By.xpath("//li[@id='credit1']"));
		WebElement src2 = driver.findElement(By.xpath("(//li[@class='block13 ui-draggable'])[2]"));
		WebElement src3 = driver.findElement(By.xpath("//li[@id='credit2']"));
		WebElement src4 = driver.findElement(By.xpath("(//li[@class='block13 ui-draggable'])[1]"));
		

	}

}

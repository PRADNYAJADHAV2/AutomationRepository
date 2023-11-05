package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAnDrop {
	public static void main(String[] args) throws InterruptedException {
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	driver.get("https://demoapps.qspiders.com/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//section[text()='Mouse Actions']")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//section[text()='Drag & Drop']")).click();
	
	//store all drag element
	WebElement src1 = driver.findElement(By.xpath("//div[text()='Mobile Charger']"));
WebElement src2 = driver.findElement(By.xpath("//div[text()='Mobile Cover']"));
WebElement src3 = driver.findElement(By.xpath("//div[text()='Laptop Charger']"));
WebElement src4 = driver.findElement(By.xpath("//div[text()='Laptop Cover']"));

//store all drop element
WebElement targer1 = driver.findElement(By.xpath("(//div[@class='drop-column min-h-[200px] bg-slate-100'])[1]"));
WebElement targer2 = driver.findElement(By.xpath("(//div[@class='drop-column min-h-[200px] bg-slate-100'])[1]"));

WebElement targer3 = driver.findElement(By.xpath("(//div[@class='drop-column min-h-[200px] bg-slate-100'])[2]"));

WebElement targer4 = driver.findElement(By.xpath("(//div[@class='drop-column min-h-[200px] bg-slate-100'])[2]"));
//perform drag and drop from Mobile
		Actions act = new Actions(driver);
		Thread.sleep(2000);
		act.dragAndDrop(src1, targer1).perform();
		Thread.sleep(2000);
		act.dragAndDrop(src2, targer2).perform();

//perform drag and drop from laptop
		Thread.sleep(2000);
		act.dragAndDrop(src3, targer3).perform();
	Thread.sleep(2000);
	act.dragAndDrop(src4, targer4).perform();
	Thread.sleep(2000);

	driver.quit();





	}

}

package assignements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropASs {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://jquery.com/");
		driver.findElement(By.xpath("//a[text()='jQuery UI']")).click();
		driver.findElement(By.xpath("//a[text()='Droppable']")).click();
		
		//perform drag and drop elemnt
		WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));
		
		WebElement drop = driver.findElement(By.xpath("//div[@id='droppable']"));
	Actions act = new Actions(driver);
	act.dragAndDrop(drag, drop).perform();
		
	}

}

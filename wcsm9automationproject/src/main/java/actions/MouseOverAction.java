package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverAction {
	public static void main(String[] args) throws InterruptedException {
WebDriver	driver	=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.get("https://www.bluestone.com/");
Thread.sleep(2000);
//handle popup
driver.findElement(By.id("denyBtn")).click();

//perform mouseHover on watch jwallery
WebElement watchjwellry = driver.findElement(By.xpath("//a[@title='Watch Jewellery']"));
//create obj  actions class
Actions act = new Actions(driver);
act.moveToElement(watchjwellry).perform();
driver.findElement(By.xpath("//a[text()='Band']")).click();

Thread.sleep(2000);
driver.quit();
	}

}

package takescreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class ScreenshotWebElement {
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://www.bluestone.com/");
		driver.findElement(By.xpath("//span[@id='denyBtn']")).click();
		WebElement coins = driver.findElement(By.xpath("//a[@title='Coins']"));
		
		Actions act = new Actions(driver);
		Thread.sleep(2000);
		act.moveToElement(coins).perform();
		driver.findElement(By.xpath("//span[text()='Coins by Design']")).click();
		//take screenshot of webelement
		
		WebElement ele = driver.findElement(By.xpath("(//img[@class='hc img-responsive center-block'])[1]"));
		
		File src = ele.getScreenshotAs(OutputType.FILE);
		Thread.sleep(2000);
		File des = new File("./Screenshot/coin.png");
		Files.copy(src, des);
		
		
		
		
		
	}
	

}

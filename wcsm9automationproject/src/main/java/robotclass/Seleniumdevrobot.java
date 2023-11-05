package robotclass;
//scenario: selenium dev --> goto news --> right click-->clck pg dn button till inspect--<enter butto 
//inspect html document shodul be display
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Seleniumdevrobot {
	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://www.selenium.dev/");
		
		WebElement news = driver.findElement(By.xpath("//h2[text()='News']"));
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		Thread.sleep(2000);
		act.contextClick(news).perform();
		
		//pree the pge down button go till to inspect
		Robot robot = new Robot();
		
		for(int i=0;i<10;i++)
		{
			
			Thread.sleep(2000);

		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(2000);

		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
		}
	//hit enter button
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);

		driver.quit();
		
	
		
	}

}

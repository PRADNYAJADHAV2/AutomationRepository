package methodofWebdriver;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsM {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://www.google.com/");
		driver.switchTo().activeElement().sendKeys("bike");
		Thread.sleep(2000);
		List<WebElement> bikeoptions = driver.findElements(By.xpath("//div[@class='wM6W7d']"));
		Thread.sleep(2000);

		for(int i=0;i<bikeoptions.size();i++)
		{
			String bike = bikeoptions.get(i).getText();
			Thread.sleep(1000);
			System.out.println(bike);
		}
		//for(WebElement op:bikeoptions)
		//{
			//String option = op.getText();
			//System.out.println(option);
		//}
		//driver.quit();
	}
	

	

}

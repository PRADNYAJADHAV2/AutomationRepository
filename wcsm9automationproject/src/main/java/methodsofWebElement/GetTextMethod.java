package methodsofWebElement;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextMethod {
	public static void main(String[] args) throws InterruptedException {
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(50));
	driver.get("https://www.google.com/");
	driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("iphone");
	Thread.sleep(2000);
	List<WebElement> text = driver.findElements(By.xpath("//div[@class='wM6W7d']"));
	Thread.sleep(2000);

	for(int i=0;i<text.size();i++)
		
	{
		String allText = text.get(i).getText();
		System.out.println(allText);
	}
	//WebElement text = driver.findElement(By.xpath("//div[@class='wM6W7d']"));
	//System.out.println(text);
	
	
	}

}

package assignements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartFindElementsETE {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		//launch webapplication
		driver.get("https://www.flipkart.com/");
		//hamdle popup
		driver.findElement(By.xpath("//span[@role='button']")).click();
		//click on text
		driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("Laptop");
		//click on seach button
		driver.findElement(By.xpath("//button[@aria-label='Search for Products, Brands and More']")).click();
		//click on brand button
		driver.findElement(By.xpath("//div[@class='_2gmUFU _3V8rao' and (text()='Brand')]")).click();
	//click on HP button
		driver.findElement(By.xpath("//div[@class='_3879cV' and (text()='HP')]")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//span[text()='13 MORE']")).click();

		driver.findElement(By.xpath("//div[@class='_3879cV' and (text()='Core i7')]")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='_2gmUFU _3V8rao' and (text()='Operating System')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='_3879cV' and (text()='Windows 11')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='_3879cV' and (text()='4★ & above')]")).click();
		//Identify name of laptop
		List<WebElement> alllaptop = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		//indentify price of laptop
	List<WebElement> price = driver.findElements(By.xpath("//div[@class='_4rR01T']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1']"));
		for(int i=1;i<alllaptop.size();i++)
		{
			String laptop = alllaptop.get(i).getText();
			Thread.sleep(2000);
			
		for(int j=i;j<=i;j++)
				
				{
				String allprice = price.get(j).getText();
				Thread.sleep(1000);
				System.out.println(laptop+":"+allprice);
				
				
				}
		}
		
		
		
		
		
		
	}

}

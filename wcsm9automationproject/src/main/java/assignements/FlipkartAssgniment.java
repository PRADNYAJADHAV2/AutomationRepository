package assignements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartAssgniment {
	
	public static void main(String[] args) throws InterruptedException {
WebDriver driver	=	new ChromeDriver();
driver.manage().window().maximize();

Thread.sleep(2000);
driver.get("https://www.flipkart.com/");
Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='✕']")).click();
		
Thread.sleep(2000);

driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("mobile");
driver.findElement(By.xpath("//button[contains(@aria-label,'Se')]")).click();
 String price = driver.findElement(By.xpath("(//div[@class='_4rR01T']/ancestor::div[@class=_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1'])[1]")).getText();
System.out.println(price);
Thread.sleep(2000);

	}

}

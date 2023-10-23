package assignements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonETE {
	static WebDriver driver;
	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		//String browservalue=sc.next();
		System.out.println();
		WebDriver driver = new ChromeDriver();
		
		
		
		
		
		
		
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.amazon.in/");


		
	}
	
	public static void searchproduct(String product)
	
	{
		 WebElement searchbox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		 searchbox	 .sendKeys("apple watch");
		 
		driver.findElement(By.name("url")).click();
		driver.findElement(By.xpath("//option[text()='wathes']")).click();
		
	}
	
	
	

}

package methodsofWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnableMethod {
	//verify the login button 
	public static void main(String[] args) throws InterruptedException {
		WebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.get("https://www.instagram.com/accounts/login/?hl=en");
		//indentify login button
		
		Thread.sleep(2000);
		
		WebElement loginbutton = driver.findElement(By.xpath("//button[contains(@class,'_acan _acap _acas _aj1-')]"));
		//verify login button is disable or enable
		Thread.sleep(2000);

		boolean status = loginbutton.isEnabled();
		boolean w = loginbutton.isDisplayed();
		System.out.println(w);
		System.out.println(status);
	}
	
	

}

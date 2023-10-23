package methodofWebdriver; 

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandles {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		Thread.sleep(2000);
		
		String parentHandle = driver.getWindowHandle();
		 System.out.println("address of parent window "+parentHandle);
		 
		 driver.findElement(By.partialLinkText("Open a popup window")).click();
		 Thread.sleep(2000);
		 
		 
		 //take Address of parent as well as child browser
		 
		  Set<String> allHandles = driver.getWindowHandles();
		  
		  for(String wh:allHandles)
		  
		  {
			  if(!parentHandle.equals(wh))
					  
					  {
				  			System.out.println("addres Child window "+wh);
				  			
					  }
			  else
			  {
				  System.out.println("address of Parent window"+wh);
				  
			  }
			  
			  
			  driver.quit();
		  }
		
		
		
		
	}
}



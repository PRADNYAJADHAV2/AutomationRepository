package qsp;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class rtp {
	static WebDriver driver;//static kel upcaste chi need nhi
	
	public static void main(String[] args) throws InterruptedException {
		
	
		//to take the input from user
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the Browser Vlaue..");
		  String browservalue=sc.next();
		  
		  if(browservalue.equalsIgnoreCase("chrome"))
		  {
			    driver = new ChromeDriver();
			    driver.manage().window().maximize();
			    Thread.sleep(2000);	    
			    driver.close();
			    
			    
		  }
		  else if(browservalue.equalsIgnoreCase("firefox"))
		  {
			   driver = new FirefoxDriver();
			    driver.manage().window().maximize();
			    Thread.sleep(2000);
			    driver.close();
		  }
		  else if(browservalue.equalsIgnoreCase("Edge"))
		  {
			  driver = new EdgeDriver();
			    driver.manage().window().maximize();
			    Thread.sleep(2000);
			    driver.close();
		  }
		  else
		  {
			  System.out.println("Enter the valid BrowserValue");
		  }
		 
	}

}

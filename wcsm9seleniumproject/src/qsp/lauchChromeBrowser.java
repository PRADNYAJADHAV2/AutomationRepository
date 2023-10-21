package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class lauchChromeBrowser {
	

	public static void main(String[] args) throws InterruptedException {
		//Launch the Chrome browser we need to create object of ChromeDriver();
		
		
		WebDriver driver= new ChromeDriver();//upcaste
		driver.manage().window().maximize();//maximize window
		System.out.println("Chrome s open");
		Thread.sleep(2000); //delay
		
		driver.close();//close the browser
		System.out.println(" Chrome is close...");

	}

}

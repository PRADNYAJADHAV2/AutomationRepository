package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo1 {
	public static void main(String[] args) throws InterruptedException {
		//how to launch chrome browser
		
		 WebDriver driver =new ChromeDriver();
		 //maximize the window
		 driver.manage().window().maximize();
		 //stop exicution 2sec
		 Thread.sleep(2000);
		 //clse the window
		 driver.get("https://www.gmail.com");
		 Thread.sleep(2000);
		 
		 System.out.println(driver.getCurrentUrl());
		 System.out.println(driver.getTitle());
		 
		 

		 
		 driver.close();
		 
		 
	}

}

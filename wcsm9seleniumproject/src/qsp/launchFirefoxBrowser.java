package qsp;

import java.io.Closeable;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class launchFirefoxBrowser {
	public static void main(String[] args) throws InterruptedException {
		//launch the firefox we need to create object of FirefoxDriver();
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		System.out.println("Lauch the Firefox Driver");
		Thread.sleep(2000);//delay 
		driver.close();
		System.out.println("Fire close");
	}

}

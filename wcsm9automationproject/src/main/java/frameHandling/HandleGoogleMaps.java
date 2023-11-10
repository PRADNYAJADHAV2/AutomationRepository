package frameHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleGoogleMaps {
	public static void main(String[] args) throws InterruptedException {WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	driver.get("https://www.google.co.in/");
	//click on google apps link
	driver.findElement(By.xpath("//a[@class='gb_d']")).click();
	//swtich 
	Thread.sleep(2000);

	driver.switchTo().frame(1);
	Thread.sleep(2000);
	//click on map
	driver.findElement(By.xpath("//span[text()='Maps']")).click();
	
		
	}

}

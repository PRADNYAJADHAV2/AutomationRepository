package methodofWebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationMethod {
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver =	new ChromeDriver();
	driver.manage().window().maximize();
	//Launch the Web Application
	  Navigation nav = driver.navigate();
	  nav.to("https://selenium.dev");
	  Thread.sleep(2000);
	  //perform backward opration
	  nav.back();
	  Thread.sleep(2000);
	  //perform froward 
	  nav.forward();
	  //perform refresh
	  nav.refresh();
	  
	  driver.quit();
	
	}

}

package methodofWebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentUrl {
	public static void main(String[] args) throws InterruptedException {
		//launch the chrome browser
		 WebDriver driver =new ChromeDriver();
		 //maximaize the window
		 driver.manage().window().maximize();
		 //launch the web application
		 driver.get("https://online.actitime.com/pjadhav/timetrack/enter.do");
		 Thread.sleep(2000);
		 // we obtain Current Url
		 String currenturl = driver.getCurrentUrl();
		 System.out.println(currenturl);
		 
		 driver.quit();
		 
	
	
	
	}

}

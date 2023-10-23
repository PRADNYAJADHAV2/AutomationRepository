package methodofWebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getmethod {
	public static void main(String[] args) throws InterruptedException {
		//launch the chrome
		 WebDriver driver=new ChromeDriver();
		 //maximize the window
		 driver.manage().window().maximize();
		 //launch webapplication
		 driver.get("https://www.netflix.com/in/");
		 //webapplication will stop for 2 sec
		 Thread.sleep(2000);
		 //close browser
		 driver.close();
		 
	}

}

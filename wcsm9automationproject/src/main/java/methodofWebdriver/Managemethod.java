package methodofWebdriver;





import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Managemethod {
	public static void main(String[] args) throws InterruptedException {
		//Launch the chrome browser
		 WebDriver driver =new ChromeDriver();
		 //maiximize the chrome
		 
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
		 
		 //launch the Web application
		 driver.get("https://www.selenium.dev/downloads/");
		 Thread.sleep(2000);
		 
		 //minimize the browser
		 
		 //driver.manage().window().minimize();
		 
		
		//driver.manage().window().fullscreen();
		//driver.manage().window().minimize();
		 
		//set size of browser
		     Dimension targetSize = new Dimension(250,450);
		driver.manage().window().setSize(targetSize);
		//set position of browser
	  Point targetPosition = new Point(450,250);
		driver.manage().window().setPosition(targetPosition);
		Thread.sleep(2000);
		
		driver.quit();
		
		 
	}
	

}

package methodofWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitMethod {
	public static void main(String[] args) throws InterruptedException {
		
		//Launch the chrome
		WebDriver driver=new ChromeDriver();
		//maximize window of chrome
		driver.manage().window().maximize();
		//stop exicution foer 2 sec
		Thread.sleep(2000);
		//launch Webapplication
		driver.get("https://omayo.blogspot.com/");
		Thread.sleep(2000);
		 driver.findElement(By.partialLinkText("Open a popup window")).click();
		 Thread.sleep(2000);
		 driver.quit();

	}

}

package methodofWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseMethod {
	public static void main(String[] args) throws InterruptedException {
	
		 WebDriver driver =new ChromeDriver();
		 
		 //Maximize the browser
		 driver.manage().window().maximize();
		 
		 //launch webApplication
		 driver.get("https://omayo.blogspot.com/");
		 //stope the excution of script 2 sec
		 Thread.sleep(1000);
		 //click on pop window link...
		 driver.findElement(By.partialLinkText("Open a popup window")).click();
		 Thread.sleep(1000);
		 //close the browser
		 driver.close();
	}

}

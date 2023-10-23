package methodofWebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetHandleMethod {
	public static void main(String[] args) throws InterruptedException {
		
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://omayo.blogspot.com/");
	Thread.sleep(2000);
	//System.out.println(driver.getWindowHandle());
	//take the Address of parent window or current wimdow
	 String parentHandle = driver.getWindowHandle();
	 System.out.println("address of parent window "+parentHandle);
	driver.close();
	}

}


package methodofWebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSource {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.get("https://www.myntra.com/");
		
		Thread.sleep(2000);
		
		//take source code from welcome page
		
		String loginpagesorce =driver.getPageSource();
		System.out.println(loginpagesorce);
		//both way we can get the sourcecode
		//System.out.println(driver.getPageSource());
		
		driver.quit();
		
		
		
		
		
		
		
	}

}

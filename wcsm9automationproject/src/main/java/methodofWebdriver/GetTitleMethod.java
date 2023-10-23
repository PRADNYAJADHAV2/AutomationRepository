package methodofWebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleMethod {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.get("https://www.netflix.com/in/");
		Thread.sleep(2000);
		//Get the title of current webpage
		//String titleofpage =driver. getTitle();
		//System.out.println(titleofpage);
		System.out.println(driver.getTitle());
		driver.close();
	}

}

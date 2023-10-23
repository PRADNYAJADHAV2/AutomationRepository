package methodsofWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplay_IsSelect_isDisable {
	//Verify logout link in homepage of actitime
	public static void main(String[] args) throws InterruptedException {
		WebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.get("http://demoapps.qspiders.com/");
		//driver.get("https://desktop-k0cq021/login.do");
		//boolean disable = driver.findElement(By.xpath("//a[@class='bg-orange-500 hover:bg-orange-700 text-white py-2 px-4 rounded']")).isDisplayed();
		//System.out.println(disable);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[@class='poppins __web-inspector-hide-shortcut__']")).click();
		Thread.sleep(2000);

		 boolean select = driver.findElement(By.xpath("//main[@class='flex gap-10 ml-4 __web-inspector-hide-shortcut__']")).isSelected();
			System.out.println(select);


	}

}

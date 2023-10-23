package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLink {
	public static void main(String[] args) {
	WebDriver driver	=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/vikra/Desktop/WebElement/link.html");
	driver.findElement(By.partialLinkText("selenium")).click();
	driver.quit();
	}

}

package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class linkTextLocators {
	public static void main(String[] args) {
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/vikra/Desktop/WebElement/link.html");
	
	//Linktext locators
	driver.findElement(By.linkText("selenium link /a")).click();
	}
	

}

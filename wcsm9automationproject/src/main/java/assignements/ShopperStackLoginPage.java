package assignements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShopperStackLoginPage {
	public static void main(String[] args) throws InterruptedException {
WebDriver driver =	new ChromeDriver();
driver.manage().window().maximize();
Thread.sleep(2000);
 Navigation nav = driver.navigate();
 nav.to("https://www.shoppersstack.com/");

 nav.forward();
//driver.get("https://www.shoppersstack.com/");

Thread.sleep(2000);

//driver.findElement(By.id("loginBtn")).click();
driver.findElement(By.id("Email")).sendKeys("pradnya.pj22@gmail.com");
Thread.sleep(2000);
driver.findElement(By.id("Password")).sendKeys("Password@123");
Thread.sleep(2000);
	}

}

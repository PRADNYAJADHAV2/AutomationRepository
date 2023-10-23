package assignements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AirVistara {
	public static void main(String[] args) throws InterruptedException {
	ChromeOptions	co =new ChromeOptions();
	co.addArguments("--disable-notifications");
	WebDriver	driver=new ChromeDriver(co);
	driver.manage().window().maximize();
	driver.get("https://www.airvistara.com/in/en");
	driver.findElement(By.id("cookieModalCloseBtn")).click();
	driver.findElement(By.name("flightSearchFrom")).sendKeys("pune");
	driver.findElement(By.name("flightSearchTo")).sendKeys("mumbai");
	Thread.sleep(2000);
	driver.findElement(By.id("departCalendar")).click();
	Thread.sleep(2000);

	driver.findElement(By.cssSelector("a[data-date='29']")).click();
	Thread.sleep(2000);

	driver.findElement(By.cssSelector("a[data-date='30']")).click();
	Thread.sleep(2000);
driver.findElement(By.id("passengers")).click();

Thread.sleep(2000);
driver.findElement(By.cssSelector("button[value='business']")).click();

Thread.sleep(2000);
driver.findElement(By.cssSelector("button[class='col-xs-12 done_btn aubergine-button-dark passengerModalBtn']")).click();
Thread.sleep(2000);
driver.findElement(By.id("book-flight-widget")).click();

//driver.quit();
	
	

}
}
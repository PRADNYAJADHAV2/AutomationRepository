package popUpHandling;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp {
	public static void main(String[] args) throws InterruptedException {
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	driver.get("https://demoapps.qspiders.com/");
	driver.findElement(By.xpath("//section[text()='Popups']")).click();
	driver.findElement(By.xpath("//section[text()='Javascript']")).click();
	//genarate the popup
	driver.findElement(By.xpath("//button[text()='Alert Box']")).click();
	Thread.sleep(2000);
	Alert al = driver.switchTo().alert();
	//al.accept();
	String text = al.getText();
	System.out.println(text);
	al.accept();

	//al.dismiss();
	}

}

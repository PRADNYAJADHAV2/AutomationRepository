package popUpHandling;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationPopup {
	public static void main(String[] args) throws InterruptedException {
		WebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//section[text()='Popups']")).click();
		driver.findElement(By.xpath("//section[text()='Javascript']")).click();
		driver.findElement(By.xpath("//a[text()='Confirm']")).click();
		//genarate the popup
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
		Thread.sleep(2000);

		//Handle confirmation popup
		Alert cofirmation = driver.switchTo().alert();
	//	cofirmation.accept();
		//cofirmation.dismiss();
		String text = cofirmation.getText();
		System.out.println(text);
		//cofirmation.accept();
		Thread.sleep(2000);
		cofirmation.accept();


	}

}

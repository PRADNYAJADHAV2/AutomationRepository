package popUpHandling;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Fileup {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//section[text()='Popups']")).click();
		driver.findElement(By.xpath("//section[text()='File Uploads']")).click();
		Thread.sleep(2000);

		//perform double click on choose file
		WebElement choosefile = driver.findElement(By.xpath("//input[@id='fileInput']"));
		Actions act = new Actions(driver);
		Thread.sleep(2000);
		act.doubleClick(choosefile).perform();
		Thread.sleep(2000);

		File file = new File("./AutoITPgm/fileupload2.exe");

		String absPath = file.getAbsolutePath();

		Runtime.getRuntime().exec(absPath);
		Thread.sleep(2000);
		Runtime.getRuntime().exec(absPath);

		Thread.sleep(2000);
		driver.quit();
	
	}

}

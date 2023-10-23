package dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IsMultipleMethode {
	public static void main(String[] args) {
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	driver.get("https://demoapps.qspiders.com/");
	driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
	//single select dropdown
	WebElement phdrop = driver.findElement(By.xpath("//label[text()='Phone Number']/following-sibling::section/select"));
	Select sel = new Select(phdrop);
	boolean status1 = sel.isMultiple();
	System.out.println(status1);
	
	//multi select dropdown
	driver.findElement(By.partialLinkText("Multi Select")).click();
	WebElement statedrop = driver.findElement(By.xpath("//label[text()='State']/following-sibling::select"));
	Select sel1 = new Select(statedrop);
	boolean status2 = sel1.isMultiple();
	System.out.println(status2);
      
	}
	

}

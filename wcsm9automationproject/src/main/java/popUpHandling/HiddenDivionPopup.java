package popUpHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class HiddenDivionPopup {
	public static void main(String[] args) {
	WebDriver	driver=new EdgeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	driver.get("https://www.flipkart.com/");
	//Hidden Divison pop up
	WebElement hiddenDivsion = driver.findElement(By.xpath("//span[text()='✕']"));
	hiddenDivsion.click();
	}

}

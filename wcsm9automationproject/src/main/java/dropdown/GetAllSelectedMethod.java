package dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllSelectedMethod {
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver	=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	driver.get("file:///C:/Users/vikra/Desktop/WebElement/multselectdropdown.html");
	WebElement menudrop = driver.findElement(By.id("idd"));
	//get all option present in menu
	Select sel = new Select(menudrop);
	for(int i=1;i<4;i++)
	{
		Thread.sleep(2000);
		sel.selectByIndex(i);
		
	}
	//read all options
	List<WebElement> allopt = sel.getAllSelectedOptions();
	for(WebElement op:allopt)
	{
		Thread.sleep(2000);

		String opt = op.getText();
		System.out.println(opt);
		
	}
	}

}

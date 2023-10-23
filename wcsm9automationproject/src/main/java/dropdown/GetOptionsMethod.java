package dropdown;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class GetOptionsMethod {
	public static void main(String[] args) {
		WebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.get("https://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
		//single select dropdown
		WebElement phndropdown = driver.findElement(By.xpath("//label[text()='Phone Number']/following-sibling::section/select"));
		Select sel = new Select(phndropdown);
		List<WebElement> alloption = sel.getOptions();
		for(int i=0;i<alloption.size();i++)
		{
			String opt = alloption.get(i).getText();
			System.out.println(opt);
		}
		for(WebElement op:alloption)
		{
			String options = op.getText();
			System.out.println(options);
		}
		
	}
	
	
	

}

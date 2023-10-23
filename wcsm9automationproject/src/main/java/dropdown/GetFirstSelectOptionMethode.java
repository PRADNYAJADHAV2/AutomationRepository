package dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetFirstSelectOptionMethode {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("file:///C:/Users/vikra/Desktop/WebElement/singleselectdropdown.html");
		//single select
		//identify dropdown
		
		WebElement dropdown = driver.findElement(By.id("idd"));
		Select sel = new Select(dropdown);
		Thread.sleep(2000);
		sel.selectByValue("v6");
		WebElement firstselect = sel.getFirstSelectedOption();
		firstselect.getText();
		System.out.println(firstselect.getText());
		
		//multi selec
		driver.navigate().to("file:///C:/Users/vikra/Desktop/WebElement/multselectdropdown.html");
		
	WebElement dropdown2 = driver.findElement(By.id("idd"));
	Select sel2 = new Select(dropdown2);
	for(int i=6;i<8;i++)
	{
		sel2.selectByIndex(i);
		Thread.sleep(2000);
	}
	String text = sel2.getFirstSelectedOption().getText();
	Thread.sleep(2000);

	System.out.println(text);
	
		
		
		
		}

		
	}



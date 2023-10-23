package dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetWrappedElement {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("file:///C:/Users/vikra/Desktop/WebElement/singleselectdropdown.html");
		//single select
		//getWrapped method condiser as single webelemnt
		WebElement dropdown = driver.findElement(By.id("idd"));
		Select sel = new Select(dropdown);
		Thread.sleep(2000);
		WebElement allopt = sel.getWrappedElement();
		System.out.println(allopt.getText());
		
		
		List<WebElement> allOp = sel.getOptions();
		
		for(WebElement op:allOp)
		{
			System.out.println(op.getText());;
		}
		Thread.sleep(2000);
//without using select method
		//for(WebElement op:allOp)
		
		
		//	if(op.getText().equals("MOMO"))
		//{
			//op.click();
			//break;
		//}
		

	}}

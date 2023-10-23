package dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectionMethods {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.get("http://demoapps.qspiders.com/");
		//identify the dropdown
		driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
		
WebElement dropdown = driver.findElement(By.xpath("//select[@class='border-0 px-3 py-3 placeholder-blueGray-300 text-blueGray-600 bg-white rounded text-sm shadow focus:outline-none focus:ring  ease-linear transition-all duration-150 w-5/12']"));


    Select sel = new Select(dropdown);
    sel.selectByIndex(3);
    //identify country dropdown
     
     WebElement dropdpwn1 = driver.findElement(By.xpath("//label[text()='Country']/following-sibling::select"));
    		
    Select country = new Select(dropdpwn1);
    country.selectByValue("India");
    
    // indentify State dropdown
    
    WebElement dropdpwn2 = driver.findElement(By.xpath("//label[text()='State']/following-sibling::select"));
    			Select state = new Select(dropdpwn2);
    			state.selectByVisibleText("Maharashtra");
    			Thread.sleep(2000);
    			
    	WebElement dropdown3 = driver.findElement(By.xpath("//label[text()='City']/following-sibling::select"));
    	
	Select state1 = new Select(dropdown3);
	state1.selectByIndex(5);
	//select multiple options from multiselector
	Thread.sleep(2000);
for(int i=0;i<=5;i++)
{
	
	state1.selectByIndex(i);
	
}


driver.navigate().to("file:///C:/Users/vikra/Desktop/WebElement/multselectdropdown.html");
WebElement drop = driver.findElement(By.id("idd"));
Select sel2 = new Select(drop);
sel2.selectByIndex(4);
Thread.sleep(2000);
for(int i=0;i<=5;i++)
{
	sel2.selectByIndex(i);
	
}


sel2.deselectByIndex(4);
Thread.sleep(2000);

for(int i=0;i<=5;i++)
{
	sel2.deselectByIndex(i);
}






    			
    			
    			
	}
	
}

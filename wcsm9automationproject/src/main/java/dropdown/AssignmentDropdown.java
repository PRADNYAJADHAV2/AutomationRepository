package dropdown;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignmentDropdown {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("file:///C:/Users/vikra/Desktop/WebElement/singleselectdropdown.html");
		//single select Identify dropdown and stroe in ref varibale
		
		WebElement menudropdown = driver.findElement(By.id("idd"));
		//get all options from menudropdown
		Select sel = new Select(menudropdown);
		List<WebElement> alloption = sel.getOptions();
		//to eliminate duplicte we use Hashset
	HashSet<String> hs = new  HashSet<String>();
		//read list by using for loop and eliminate duplicate

		for(int i=0;i<alloption.size();i++)
		{
			WebElement dropdownoption = alloption.get(i);
			//get text of webelemnt
			String opt=dropdownoption.getText();
			//System.out.println(opt);
			
			//add dropdown into Hashsset and remove duplicate 
			
			hs.add(opt);
			Thread.sleep(2000);
		}
		
		Thread.sleep(2000);
		for(String options:hs)
		{
			System.out.println(options);
			Thread.sleep(2000);
		}
		
			


	}}

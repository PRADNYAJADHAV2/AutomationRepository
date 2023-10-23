package assignements;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//1] how to close all browser
//2] how to close all browser without quit()
//3]how to close only parent browser
//4] how to close only child browse 
public class OmayoQuetions {
	public static void main(String[] args) throws InterruptedException {
WebDriver	driver=new ChromeDriver();
driver.manage().window().maximize();
Thread.sleep(2000);
String parentHandle = driver.getWindowHandle();
System.out.println("address of parent window "+parentHandle);

driver.get("http://omayo.blogspot.com/");
driver.findElement(By.partialLinkText("Open a popup window")).click();

Thread.sleep(2000);
driver.close();

Set<String> allHandles = driver.getWindowHandles();

for(String wh:allHandles)

{
	  if(!parentHandle.equals(wh))
	  {
			System.out.println("addres Child window "+wh);
			
	  }
else
     {
        System.out.println("address of Parent window"+wh);

    }


	}
Thread.sleep(3000);
	driver.quit();
	}}
	



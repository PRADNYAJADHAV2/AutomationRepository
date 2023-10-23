package methodsofWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocation_GetSize_GetRect {
	public static void main(String[] args) {
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	driver.get("http://demoapps.qspiders.com/");
	WebElement emailTextBox = driver.findElement(By.cssSelector("input[name='email']"));
	
	//get the loction of email TextBox
	Point loc = emailTextBox.getLocation();
	int xaxis = loc.getX();
	int yaxis = loc.getY();
	System.out.println("location of email text box:"+xaxis+" : "+yaxis);
	
	//get the size of emailTextBox
	
	Dimension size = emailTextBox.getSize();
	
	int height=size.getHeight();
	
	int Width = size.getWidth();
	System.out.println("size):"+height+": "+Width);
	
	
	//get Size and location 
	Rectangle rect = emailTextBox.getRect();
	System.out.println(rect.getX()+":"+rect.getY());
    System.out.println(rect.getHeight()+":"+rect.getWidth());
	
	
	
		
	}

}

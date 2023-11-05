package javascriptexecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUP {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://www.selenium.dev/");
		//perform scroll down
	JavascriptExecutor	jse=(	JavascriptExecutor)driver;
	Thread.sleep(2000);
    jse.executeScript("window.scrollBy(0,500)");
	Thread.sleep(2000);

    jse.executeScript("window.scrollBy(0,-500)");
    
		
	}

}

package javascriptexecutor;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class SrollAndTakeScreenshot {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://www.selenium.dev/");
		//scroll till tiwttersymbol
		WebElement tiwttersym = driver.findElement(By.xpath("//i[@class='fab fa-twitter']"));
		//getLoction of twitter symbol
		Point loc = tiwttersym.getLocation();
		int xaix = loc.getX();
		int yaix = loc.getY();
		JavascriptExecutor	jse=(	JavascriptExecutor)driver;
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy("+xaix +","+yaix+")");
		Thread.sleep(2000);
//take screenshot
		TakesScreenshot ts = (TakesScreenshot)driver;
		//call the method
		File src = ts.getScreenshotAs(OutputType.FILE);
		//define way to store screenshot
		File dest = new File("./Screenshot/twittersym.png");
		//store ss src to des
		Files.copy(src, dest);
		//way 2 scrolling

		
	}
	

}

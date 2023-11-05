package takescreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;
//wsy 5
public class GetScreenshotMethod {
	public static void main(String[] args) throws IOException {
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	driver.get("https://www.selenium.dev/");
	
	//take screenshot of the webpage
	TakesScreenshot ts = (TakesScreenshot)driver;
	//call the method
	File src = ts.getScreenshotAs(OutputType.FILE);
	//define way to store screenshot
	File dest = new File("./Screenshot/selenium.png");
	//store ss src to des
	Files.copy(src, dest);
	
	}

}

package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class launchEdgeBrowser {
	public static void main(String[] args) throws InterruptedException {
		//launch the Edge browser we need to EdgeDriver();
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		System.out.println("Open edge...");
		Thread.sleep(2000);
		driver.close();
		System.out.println("Edge close");
	}

}


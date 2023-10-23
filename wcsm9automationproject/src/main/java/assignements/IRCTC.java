package assignements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IRCTC {
	public static void main(String[] args) throws InterruptedException {
ChromeOptions	co	=new ChromeOptions();
co.addArguments("--disable-notifications");
	WebDriver	driver=new ChromeDriver(co);
	driver.manage().window().maximize();
	driver.get("https://www.irctc.co.in/nget/train-search");
	driver.findElement(By.xpath("//input[@class='ng-tns-c57-8 ui-inputtext ui-widget ui-state-default ui-corner-all ui-autocomplete-input ng-star-inserted']")).sendKeys("pune");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[text()=' PUNE JN - PUNE ']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[contains(@class,'right loginCloseBtn ng-tns-c19-13')]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@class='ng-tns-c58-10 ui-inputtext ui-widget ui-state-default ui-corner-all ng-star-inserted']")).click();
	Thread.sleep(2000);
    driver.findElement(By.xpath("//a[@class='ui-state-default ng-tns-c58-10 ng-star-inserted']")).click();
    Thread.sleep(2000);
   driver.findElement(By.xpath("//input[@class='ng-tns-c57-9 ui-inputtext ui-widget ui-state-default ui-corner-all ui-autocomplete-input ng-star-inserted']")).sendKeys("mumbai");
   Thread.sleep(2000);
   driver.findElement(By.xpath("//span[text()= ' MUMBAI CENTRAL - MMCT ']")).click();
   Thread.sleep(2000);
   driver.findElement(By.xpath("//div[@class='ng-tns-c65-11 ui-dropdown ui-widget ui-state-default ui-corner-all']")).click();
   Thread.sleep(2000);
   driver.findElement(By.xpath("//li[@aria-label='Anubhuti Class (EA)']")).click();
   driver.findElement(By.xpath("//div[@class='ng-tns-c65-12 ui-dropdown ui-widget ui-state-default ui-corner-all']")).click();
   Thread.sleep(2000);
   driver.findElement(By.xpath("//li[@aria-label='LADIES']")).click();
   driver.findElement(By.xpath("//label[text()='Railway Pass Concession']")).click();
   Thread.sleep(2000);
   driver.findElement(By.xpath("//span[text()='OK']")).click();
   driver.findElement(By.xpath("//button[text()='Search']")).click();
   
   
}}
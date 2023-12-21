package SeleniumAssignment;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class ActivityTwo {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver browser = new ChromeDriver();
		browser.get("https://www.abhibus.com/");
		browser.manage().window().maximize();
		browser.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		browser.findElement(By.xpath("//input[@placeholder='From Station']")).sendKeys("chennai");
		browser.findElement(By.xpath("//div[text()='Chennai']")).click();
		browser.findElement(By.xpath("//input[@placeholder='To Station']")).sendKeys("Bangalore");
		browser.findElement(By.xpath("//div[text()='Bangalore']")).click();
		browser.findElement(By.xpath("//input[@placeholder='Onward Journey Date']")).click();
		browser.findElement(By.xpath("//span[@data-date='21']")).click();
		browser.findElement(By.xpath("//a[text()='Search']")).click();
		String FirstBusName=browser.findElement(By.xpath("//h5[@class='title']")).getText();
		System.out.println(FirstBusName);
		Thread.sleep(10000);
		browser.findElement(By.xpath("//span[text()='Sleeper']")).click();
		Thread.sleep(10000);
		String FirstBusSeatAvailability=browser.findElement(By.xpath("//div[@class='text-grey']")).getText();
		System.out.println(FirstBusSeatAvailability);
		Thread.sleep(10000);
		browser.findElement(By.xpath("//button[text()='Show Seats']")).click();
		Thread.sleep(5000);
		browser.findElement(By.xpath("//span[text()='DL8']")).click();
		Thread.sleep(5000);
		browser.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
		Thread.sleep(5000);
		browser.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
		String SeatNumber=browser.findElement(By.xpath("//span[text()='Seat Selected :']")).getText();
		Thread.sleep(5000);
		System.out.println(SeatNumber);
		String BusFare=browser.findElement(By.xpath("//span[text()='Base Fare :']")).getText();
		Thread.sleep(5000);
		System.out.println(BusFare);
		String Title=browser.getTitle();
		System.out.println(Title);
		browser.close();
		
		
		
	

}}

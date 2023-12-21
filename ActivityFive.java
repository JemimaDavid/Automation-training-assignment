package SeleniumAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActivityFive {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver browser = new ChromeDriver();
		browser.get("http://leaftaps.com/opentaps/");
		browser.manage().window().maximize();
		browser.findElement(By.id("username")).sendKeys("demosalesmanager");
		browser.findElement(By.id("password")).sendKeys("crmsfa");
		browser.findElement(By.xpath(("//input[@class='decorativeSubmit']"))).click();
		browser.findElement(By.xpath("//a[contains(text(),'SFA')]")).click();
		browser.findElement(By.xpath("//a[text()='Leads']")).click();
		browser.findElement(By.xpath("//a[text()='Find Leads']")).click();
		browser.findElement(By.xpath("//li[@id='ext-gen240__ext-gen254']")).click();
		browser.findElement(By.xpath("//input[@id='ext-gen270']")).sendKeys("99");
		browser.findElement(By.xpath("//button[@id='ext-gen334']")).click();
		Thread.sleep(5000);
		browser.findElement(By.xpath("//a[contains(text(),'10762')]")).click();
		browser.findElement(By.xpath("//a[contains(text(),'Delete')]")).click();
		Thread.sleep(5000);
		browser.findElement(By.xpath("//a[text()='Find Leads']")).click();
		browser.findElement(By.xpath("//input[@id='ext-gen246']")).sendKeys("11192");
		browser.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(10000);
		String Message=browser.findElement(By.xpath("//div[@class='x-paging-info']")).getText();
		System.out.println(Message);
		if(Message.contains("No records to display")) {
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
		}
	}

}

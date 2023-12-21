package SeleniumAssignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ActivityFour {

	public static void main(String[] args)throws InterruptedException {
		ChromeDriver browser = new ChromeDriver();
		browser.get("https://leafground.com/checkbox.xhtml");
		browser.manage().window().maximize();
		browser.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		browser.findElement(By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[1]")).click();
		Thread.sleep(10000);
		browser.findElement(By.xpath("(//div[@id='j_idt87:j_idt91']//div)[2]")).click();
		Thread.sleep(5000);
		String actualmessage =browser.findElement(By.xpath("//span[@class='ui-growl-title']")).getText();
		System.out.println(actualmessage);
		
		if(actualmessage.contains("Checked")) {
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
		}
		browser.findElement(By.xpath("(//div[@class='ui-chkbox ui-widget'])[3]")).click();
		browser.findElement(By.xpath("(//div[@class='ui-chkbox ui-widget'])[6]")).click();
		browser.findElement(By.xpath("//div[@id='j_idt87:j_idt100']")).click();	
		String actualmessagedisabled =browser.findElement(By.xpath("//span[@class='ui-growl-title']")).getText();
		System.out.println(actualmessagedisabled);
		
		if(actualmessagedisabled.contains("Checked")) {
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
		}
		Boolean selection=browser.findElement(By.xpath("//input[@id='j_idt87:j_idt102_input']")).isEnabled();
		System.out.println(selection);
		if(selection==false) {
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
		}
		
		browser.findElement(By.xpath("//ul[@data-label='Cities']")).click();
		browser.findElement(By.xpath("(//label[text()='London'])[2]")).click();
		browser.findElement(By.xpath("(//label[text()='Paris'])[2]")).click();
		browser.findElement(By.xpath("(//label[text()='Barcelona'])[2]")).click();
		browser.findElement(By.xpath("//div[@class='card']")).click();
		String selectedcities=browser.findElement(By.xpath("//ul[@data-label='Cities']")).getText();
		System.out.println(selectedcities);
		browser.close();
		

}}

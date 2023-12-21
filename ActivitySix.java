package SeleniumAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ActivitySix {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver browser = new ChromeDriver();
		browser.get("http://leaftaps.com/opentaps/");
		browser.manage().window().maximize();
		browser.findElement(By.id("username")).sendKeys("demosalesmanager");
		browser.findElement(By.id("password")).sendKeys("crmsfa");
		browser.findElement(By.xpath(("//input[@class='decorativeSubmit']"))).click();
		browser.findElement(By.xpath("//a[contains(text(),'SFA')]")).click();
		browser.findElement(By.xpath("//a[text()='Create Lead']")).click();
		browser.findElement(By.xpath(("//input[@id='createLeadForm_companyName']"))).sendKeys("systec");
		browser.findElement(By.xpath(("//input[@id='createLeadForm_firstName']"))).sendKeys("varoon");
		browser.findElement(By.xpath(("//input[@id='createLeadForm_lastName']"))).sendKeys("David");
		browser.findElement(By.xpath(("//input[@id='createLeadForm_firstNameLocal']"))).sendKeys("Jones");
		browser.findElement(By.xpath(("//input[@id='createLeadForm_departmentName']"))).sendKeys("Testing");
		browser.findElement(By.xpath(("//textarea[@id='createLeadForm_description']"))).sendKeys("Trying out automation with selenium");
		browser.findElement(By.xpath(("//input[@id='createLeadForm_primaryEmail']"))).sendKeys("Testuser@123.com");
		
		WebElement Statedropdown= browser.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select stateOptions =new Select(Statedropdown);
		stateOptions.selectByVisibleText("Armed Forces Americas");
		
		browser.findElement(By.xpath(("//input[@value='Create Lead']"))).click();
		Thread.sleep(5000);
		browser.findElement(By.xpath("//a[contains(text(),'Edit')]")).click();
		browser.findElement(By.xpath(("//textarea[@id='updateLeadForm_description']"))).clear();
		browser.findElement(By.xpath(("//textarea[@id='updateLeadForm_importantNote']"))).sendKeys("Adding important note");
		browser.findElement(By.xpath("//input[@value='Update']")).click();
		Thread.sleep(5000);
		String pageatitle=browser.getTitle();
		System.out.println(pageatitle);
		browser.close();
		
		
		
		

	}

}

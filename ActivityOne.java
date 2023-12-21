package SeleniumAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class ActivityOne {

	public static void main(String[] args) {
		ChromeDriver browser = new ChromeDriver();
		browser.get("http://leaftaps.com/opentaps/");
		browser.manage().window().maximize();
		browser.findElement(By.id("username")).sendKeys("demosalesmanager");
		browser.findElement(By.id("password")).sendKeys("crmsfa");
		browser.findElement(By.xpath(("//input[@class='decorativeSubmit']"))).click();
		browser.findElement(By.xpath("//a[contains(text(),'SFA')]")).click();
		browser.findElement(By.xpath("//a[contains(text(),'Accounts')]")).click();
		browser.findElement(By.xpath("//a[contains(text(),'Create Account')]")).click();
		browser.findElement(By.id("accountName")).sendKeys("JoDav");
		browser.findElement(By.xpath("//textarea[@class='inputBox']")).sendKeys("Selenium Automation Tester");
		
		WebElement Industrydropdown= browser.findElement(By.xpath(("(//select[@class='inputBox'])[2]")));
		Select industryOptions =new Select(Industrydropdown);
		industryOptions.selectByIndex(3);
		
		WebElement Ownershipdropdown= browser.findElement(By.xpath(("(//select[@class='inputBox'])[3]")));
		Select ownershipOptions =new Select(Ownershipdropdown);
		ownershipOptions.selectByVisibleText("S-Corporation");
		
		WebElement Sourcedropdown= browser.findElement(By.xpath(("(//select[@class='inputBox'])[4]")));
		Select sourceOptions =new Select(Sourcedropdown);
		sourceOptions.selectByValue("LEAD_EMPLOYEE");
		
		WebElement Campaigndropdown= browser.findElement(By.xpath(("(//select[@class='inputBox'])[5]")));
		Select campaignOptions =new Select(Campaigndropdown);
		campaignOptions.selectByIndex(6);
		
		WebElement Statedropdown= browser.findElement(By.id("generalStateProvinceGeoId"));
		Select stateOptions =new Select(Statedropdown);
		stateOptions.selectByValue("TX");
		
		browser.findElement(By.xpath("//input[@type='submit']")).click();
		WebElement Accountname=browser.findElement(By.xpath("(//span[@class='tabletext'])[3]"));
		String actualtext=Accountname.getText();
		String expectedtext= "JoDav";
		Assert.assertEquals(actualtext, expectedtext,"Expected and Actual are not same");
		
		browser.close();
		
		
		
	}

}

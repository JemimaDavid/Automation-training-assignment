package SeleniumAssignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ActivityThree {

	public static void main(String[] args) throws InterruptedException{
		ChromeDriver browser = new ChromeDriver();
		browser.get("https://en-gb.facebook.com/");
		browser.manage().window().maximize();
		browser.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		browser.findElement(By.xpath("//a[text()='Create new account']")).click();
		browser.findElement(By.xpath("//input[@placeholder='First name']")).sendKeys("Test");
		browser.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[2]")).sendKeys("user");
		browser.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[3]")).sendKeys("Testuser@gmail.com");
		browser.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[5]")).sendKeys("Vgy7ujd@");
		//Selecting Birthdate
		WebElement day=browser.findElement(By.xpath("//select[@id='day']"));
		Select birthday =new Select(day);
		birthday.selectByValue("5");
		
		//Selecting BirthMonth
		WebElement month=browser.findElement(By.xpath("//select[@id='month']"));
		Select birthmonth =new Select(month);
		birthmonth.selectByVisibleText("Jun");
		
		//Seleting BirthYear
		WebElement year=browser.findElement(By.xpath("//select[@id='year']"));
		Select birthyear =new Select(year);
		birthyear.selectByIndex(16);
		
		browser.findElement(By.xpath("//label[text()='Female']")).click();
		
		
		
	}

}

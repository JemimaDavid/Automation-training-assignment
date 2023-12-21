package SeleniumAssignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActivityEight {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver browser = new ChromeDriver();
		browser.get("https://leafground.com/radio.xhtml");
		browser.manage().window().maximize();
		browser.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		browser.findElement(By.xpath("(//label[text()='Chrome'])[1]")).click();
		Boolean Default=browser.findElement(By.xpath("(//label[text()='Safari'])[2]")).isSelected();
		Thread.sleep(2000);
		System.out.println(Default);
		if(Default==true) {
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
		}
	}

}

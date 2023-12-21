package SeleniumAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Rectangle;


public class ActivitySeven {

	public static void main(String[] args) {
		ChromeDriver browser = new ChromeDriver();
		browser.get(" https://leafground.com/button.xhtml");
		browser.manage().window().maximize();
		browser.findElement(By.xpath("//span[text()='Click']")).click();
		String title=browser.getTitle();
		System.out.println(title);
		if(title.contains("Dashboard")) {
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
		}
		
		browser.get(" https://leafground.com/button.xhtml");
		boolean buttonstyle=browser.findElement(By.xpath("(//button[@type='button'])[2]")).isEnabled();
		System.out.println(buttonstyle);
		if(buttonstyle==false) {
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
		}
		
		Rectangle position= browser.findElement(By.xpath("(//button[@type='button'])[3]")).getRect();
		System.out.println(position.getX());
		String Buttoncolor=browser.findElement(By.xpath("(//button[@type='button'])[4]")).getCssValue("background-color");
		System.out.println(Buttoncolor);
		Dimension size=browser.findElement(By.xpath("(//button[@type='button'])[5]")).getSize();
		System.out.println(size);
		browser.close();
	}
	

}

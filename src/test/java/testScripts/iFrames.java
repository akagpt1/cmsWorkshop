package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFrames {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		String strLbl = driver.findElement(By.cssSelector("label > span")).getText();
		System.out.println("Label in main page: " + strLbl);
		
		driver.switchTo().frame("frame1	");
		driver.findElement(By.tagName("input")).sendKeys("Welcome");
		
		//switch to frame 1 to frame 3
		driver.switchTo().frame("frame3");
		driver.findElement(By.id("a")).click();
		
		//again switch from frame3 to frame1, if we want to access immediate window so can do it by parentFrame
		driver.switchTo().parentFrame();
		driver.findElement(By.tagName("input")).clear();
		driver.findElement(By.tagName("input")).sendKeys("welcome to my world");
		
		//frame3 to main content
		driver.switchTo().defaultContent();
		strLbl = driver.findElement(By.cssSelector("label > span")).getText();
		System.out.println("Label after coming from frame to main page: " + strLbl);
		
	}

}

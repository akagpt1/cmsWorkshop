package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToolTip {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Actions actions = new Actions(driver);
		driver.get("https://jqueryui.com/tooltip/");
		//It is inside frame so first we have to switch to frame then only can access content
		driver.switchTo().frame(driver.findElement(By.cssSelector(".demo-frame")));
		//To select elements with a specific class, write a period (.) character, followed by the class name
		actions.moveToElement(driver.findElement(By.id("age"))).perform();
		String strTxt = driver.findElement(By.className("ui-tooltip-content")).getText();
		System.out.println("your content is: "+ strTxt);
		driver.findElement(By.id("age")).sendKeys("22");

	}

}

package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JSExecTest {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Actions actions = new Actions(driver);
		driver.get("https://demo.opencart.com/");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement menu =driver.findElement(
		By.cssSelector("ul.nav.navbar-nav > li:nth-child(3)"));

		WebElement menuItem = driver.findElement(
		By.xpath("(//a[contains(text(), 'Monitors (2)')][1])"));
		actions.moveToElement(menu).click(menuItem).build().perform();
		js.executeScript("window.scrollBy(10, 500)");
		js.executeScript("window.scrollBy(10, document.body.scrollHeight)");
		WebElement srcbox = (WebElement)js.executeScript(
		"document.getElementsByName('search')[0]");
		js.executeScript("history.go(-1)");
				
				
				
		
		
		

	}

}

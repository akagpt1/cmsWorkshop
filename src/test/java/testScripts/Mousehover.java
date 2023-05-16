package testScripts;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;



public class Mousehover {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=new ChromeDriver();
		Actions actions = new Actions(driver);
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/");
		TakesScreenshot screen = (TakesScreenshot)driver;
		File srcFile =screen.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile, new File("D:\\Screenshots\\fullscreen.png"));
//		Thread.sleep(1000);
		
		
		
//		WebElement menu =driver.findElement(
//				By.cssSelector("ul.nav.navbar-nav > li:nth-child(3)"));
//		
//		WebElement menuItem = driver.findElement(
//			By.xpath("(//a[contains(text(), 'Monitors (2)')][1])");
//		actions.moveToElement(menu).click(menuItem).build().perform();
		WebElement srcBox = driver.findElement(By.id("search"));
		WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(srcBox));
		WebDriver wait =new FluentWait <WebDriver>(driver)
		
		
//		Thread.sleep(2000);
//		actions.scrollToElement()
		
		
		
		driver.get("https://www.stqatools.com/demo/DoubleClick.php");
		//Thread.sleep(1000);
		WebElement dblBtn = driver.findElement(
				By.xpath("//button[contains(text(),'Click Me / Double Click Me!"));
				actions.doubleClick(dblBtn).perform();
				actions.doubleClick(dblBtn).doubleClick(dblBtn).perform();
						
	}

//	private static void copyFile(File srcFile, File file) {
//		// TODO Auto-generated method stub
		
	}
	
	

	

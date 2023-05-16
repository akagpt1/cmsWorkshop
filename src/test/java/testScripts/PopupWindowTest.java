package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupWindowTest {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://stqatools.com/demo/Windows.php");
		String ParentWin = driver.getWindowHandle();
		WebElement tabBtn = driver.findElement(
				By.xpath("//button[contains(text(), 'new Tab')]"));
		
		
		
		
		
		

	}

}

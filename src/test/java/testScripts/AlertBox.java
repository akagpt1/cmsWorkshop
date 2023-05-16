package testScripts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertBox {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://stqatools.com/demo/Alerts.php");
		Thread.sleep(1000);
//		WebElement btn1 = driver.findElement(By.cssSelector("button#jbalert"));
//		btn1.click();
//		Alert simple = driver.switchTo().alert();
//		System.out.println("Simple Alert Text" + simple.getText());
//		simple.accept();
		
//		WebElement btn2 = driver.findElement(By.cssSelector("button#jbclert"));
//		btn2.click();
//		Alert confirm = driver.switchTo().alert();
//		System.out.println("Simple Alert Text" + confirm.getText());
//		confirm.accept();
//		//confirm.dismiss();
		
		
		WebElement btn3 = driver.findElement(By.cssSelector("button#jcalert"));
		btn3.click();
		Alert prompt = driver.switchTo().alert();
		System.out.println("Simple Alert Text" + prompt.getText());
		prompt.sendKeys("testworld");
		prompt.accept();
		//prompt.dismiss();
		
		
		
		
		

	}

}

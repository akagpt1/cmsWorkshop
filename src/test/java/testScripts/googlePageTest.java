package testScripts;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver; 

public class googlePageTest {

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver","C:/users/Akanksha Gupta/Downloads/chromedriver_win32/chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
				driver.get("https://www.google.com/");
				WebElement searchBox = driver.findElement(By.name("q"));
				searchBox.sendKeys("Java Tutorial");
				//Thread.sleep(1000);
				List<WebElement> items = driver.findElements
						(By.xpath("(//ul[@class='G43f7e'][1]/li/descendant::div[@class='wM6W7d'])"));
				System.out.println("Total Items:" + items.size());
				for(int i = 0; i<items.size();i++) {
					System.out.println("Total Items: " + items.size());
					if(items.get(i).getText().equalsIgnoreCase("Java tutorial page")) {
						items.get(i).submit();
						break;
						
					}
				}


			}

		}



package testScripts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;
public class relativeLocatorTest {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://automationbookstore.dev/");
		String strid = driver.findElement(with(By.tagName("li"))
				.toLeftOf(By.id("pid16"))
				.below(By.id("pid1")))
				.getAttribute("id");
		System.out.println(strid);

	}

}

package Phase1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BootstrapModaldialogue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		// OR driver.get("https://practice-automation.com/modals/");
		
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class='_18u87m _3WuvDp']")));
		
		// find locator for login text box
		
		driver.findElement(By.xpath("//input[@class='_18u87m _3WuvDp']")).sendKeys("9916783450");
		
		driver.findElement(By.xpath("//span[@role='button']")).click();
		
		
	}

}

package Phase1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AcceptCokkiesDialogueBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// Accept cookies pop Up
		
       WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.opera.com/download");
		
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Accept cookies')]")));
		
		
		// click on accept cookies button
		
		driver.findElement(By.xpath("//span[contains(text(),'Accept cookies')]")).click();
		
		

	}

}

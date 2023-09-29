package Phase1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MouseHover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		
		Actions a = new Actions(driver);
		
		WebElement e1= driver.findElement(By.xpath("//*[@class='nav-line-2 ']"));
		
		a.moveToElement(e1).perform();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//driver.findElement(By.linkText("Watchlist")).click();
		
		
	driver.findElements(By.xpath("//span[@class='nav-text']")).get(6).click();
		
		
		

	}

}

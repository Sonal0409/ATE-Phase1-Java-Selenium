package Phase1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CalenderAutomation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		
		// Click on the text box for calender to open
		
		driver.findElement(By.id("datepicker")).click();
		
		// Selenium to Wait until the calender to apper..
		// lets localte the calander  and wait for it to appear
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ui-datepicker-div")));
		
		String monthYear = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
		
		System.out.println(monthYear);
		
		// Split the month and year based on regualr expression space " " 
		
		String my[] = monthYear.split(" ");
		
		String month = my[0];
		String year = my[1];
		
		while(!(month.equals("November") && year.equals("2024")))
		{
			// click on the next button in the calender
			
			driver.findElement(By.xpath("//div[@id='ui-datepicker-div']//descendant::a[2]")).click();
			
			//capture the month and year again
			
			monthYear = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
			
			// same above code, more reusable with less line
			month = monthYear.split(" ")[0];
			year =  monthYear.split(" ")[1];
		}
		
		
		driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//descendant::td[31]")).click();
		
		
		
		
		
	}

}

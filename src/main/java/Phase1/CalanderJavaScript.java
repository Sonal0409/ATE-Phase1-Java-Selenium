package Phase1;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalanderJavaScript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//JAVASCriptExecutor
		
WebDriver driver = new ChromeDriver();

driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		
		JavascriptExecutor jse =  ((JavascriptExecutor)driver);
		
		jse.executeScript("document.getElementById('datepicker').value='11/25/2024'" );
		

	}

}

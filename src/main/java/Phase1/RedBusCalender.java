package Phase1;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBusCalender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				
				driver.get("https://www.redbus.com/");
				
				JavascriptExecutor jse =  ((JavascriptExecutor)driver);
				
				jse.executeScript("document.getElementById('onward_cal').value='11/25/2024'" );
				

	}

}

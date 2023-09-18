package Phase1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticagtionPopups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		// Maximize the browser window
		
		driver.manage().window().maximize();
		
		//1. Open the url on the browser along with username and password.
		
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		

	}

}

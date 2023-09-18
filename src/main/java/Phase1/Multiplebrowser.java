package Phase1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Multiplebrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String browsername = "Firefox";
		
		WebDriver driver =null;
		
		if(browsername.equals("Chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		    driver.manage().window().maximize();
		}
		else if(browsername.equals("Firefox")){
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
            driver.manage().window().maximize();	
		}
		
		driver.get("https://www.google.com/");
		
	    String title1 = driver.getTitle(); // get the title of the webpage
		
		System.out.println("the title of the page 1 is : " + title1);
		driver.close();
	}

}

package Phase1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Errortext {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
driver.get("https://login.live.com/login.srf?wa=wsignin1.0&rpsnv=13&ct=1633946131&rver=7.3.6960.0&wp=SAPI&wreply=https%3A%2F%2Faccount.live.com%2FSummaryPage.aspx%3Fuaid%3Ddd6e13a6d0bc446f9a3713ec1c06d930&lc=1033&id=38936&mkt=en-US&uaid=dd6e13a6d0bc446f9a3713ec1c06d930");
		
		driver.findElement(By.id("idSIButton9")).click();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String errtext= driver.findElement(By.id("usernameError")).getText();
		
		System.out.println(errtext);
		
		

	}

}

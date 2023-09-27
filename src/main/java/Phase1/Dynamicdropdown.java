package Phase1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamicdropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
       WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://search.yahoo.com/;_ylt=Awr9CKorUGVhlFEA4O9XNyoA?fr=mcafee");
		
		driver.findElement(By.id("yschsp")).sendKeys("Simplilearn");
		Thread.sleep(7000);
		
		// capture all the list of values in the drop down
		
		List<WebElement> l1 = 	driver.findElements(By.xpath("//ul[@role='listbox']/child::li"));
		
		Thread.sleep(3000);
		
		System.out.println("Total list of values are: "+ l1.size());
		
		
		 for(int i=0;i<l1.size();i++) {
		 
		 String text = l1.get(i).getText(); 
		 
		 System.out.println(text);
		 
		 if(text.contains("free courses")) {
			 l1.get(i).click(); 
			 break; 
			 }
		  }
		 
		

	}

}

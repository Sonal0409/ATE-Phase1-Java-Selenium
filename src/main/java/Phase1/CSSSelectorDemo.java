package Phase1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		
		//  create a CSS Selector using ID attribute
		// # represents id
		// tagname#idvalue
		driver.findElement(By.cssSelector("input#email")).sendKeys("admin@gmail.com");
		
	   // format = tagname.classvalue[attribute=value]
		// create a CSS Selector using class attribute
				// . represents Class attribute
		// OR
		// tag.class
		
		//driver.findElement(By.cssSelector("input.inputtext _55r1 _6luy[name='email']")).sendKeys("admin@gmail.com");
		
		
		// tag[attribute=value]
		driver.findElement(By.cssSelector("input[name='pass']")).sendKeys("admin@123");
		
		driver.navigate().to("https://en.wikipedia.org/w/index.php?title=Special:CreateAccount&returnto=Wikipedia%3ASign+up");
		
		
		
		driver.findElement(By.linkText("Log in")).click();
		
		// Contains inner test -> css=font:contains(“Password:”)
		
	String text = driver.findElement(By.cssSelector("label:contains('Username')")).getText();
		
		System.out.println(text);
		//

	}

}

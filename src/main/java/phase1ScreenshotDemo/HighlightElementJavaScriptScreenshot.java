package phase1ScreenshotDemo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class HighlightElementJavaScriptScreenshot {
	
	public static void drawborder(WebElement element, WebDriver driver)
	{
		JavascriptExecutor js =  ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].style.border='3px solid red'", element);
		
	}
	
	public static void main(String[] args) throws IOException  {
	
	WebDriver driver = new ChromeDriver();
	
	// Maximize the browser window
	
	driver.manage().window().maximize();
	
	//1. Open the url on the browser
	
	driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	
	WebElement submitBTN = driver.findElement(By.xpath("//div[@class='floatL leftwidth']/descendant::input[3]"));

	// draw border on the element for highlighting
	
	drawborder(submitBTN,driver);
	
	// Take screenshot
	File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File destFile = new File("./Screenshots/rediff.png");
	FileUtils.copyFile(srcFile, destFile);
	
	
	
	
	
	
	
	
	
	
	
}

}
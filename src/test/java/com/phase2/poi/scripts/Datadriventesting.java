package com.phase2.poi.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class Datadriventesting {
	
WebDriver driver = null ;
	
	@BeforeClass
	public void setup()
	{
		 driver = new ChromeDriver();
		 driver.get("https://en.wikipedia.org/w/index.php?title=Special:CreateAccount&returnto=Special%3ASearch&returntoquery=search%3D%26go%3DGo");
		 driver.manage().window().maximize();
	}
	
	@Test(dataProvider="testdata")
	public void createAccount(String username,String password, String retype, String email)
	{
		driver.findElement(By.id("wpName2")).clear();
		driver.findElement(By.id("wpName2")).sendKeys(username);
		driver.findElement(By.id("wpPassword2")).clear();
		driver.findElement(By.id("wpPassword2")).sendKeys(password);
		driver.findElement(By.id("wpRetype")).clear();
		driver.findElement(By.id("wpRetype")).sendKeys(retype);
		driver.findElement(By.id("wpEmail")).clear();
		driver.findElement(By.id("wpEmail")).sendKeys(email);
		
	}
	
	@DataProvider(name="testdata")
	public Object[][] getTestData()
	{
		
		Object input[][]= Xls_dataProvider.getTestData("Sheet1");
		return input;
	}

}

package com.phase2.Listeners;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

// Add listerner class, so that event are recirded in the output

@Listeners(ITestListernerClass.class)

public class TestCaseListeners {
	
	
	@Test(priority='1')
	public void method1()
	{
		System.out.println("This is method 1");
	}
	
	@Test(priority='2')
	public void method2()
	{
		System.out.println("This is method 2");
		Assert.assertTrue(false);
	}
	
	@Test(priority='3', timeOut=1000)
	public void method3() throws InterruptedException
	{
		Thread.sleep(2000);
		System.out.println("This is method 1");
	}
	
	@Test(priority='4', dependsOnMethods="method3")
	public void method4()
	{
		System.out.println("This is method 1");
	}

}

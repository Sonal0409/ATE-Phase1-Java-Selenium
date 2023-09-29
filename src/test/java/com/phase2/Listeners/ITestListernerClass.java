package com.phase2.Listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ITestListernerClass implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		
		System.out.println("The testcase has started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("The test case is success");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("This test case shas failed");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("This test cases is skipped");
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		System.out.println("This test case sfialed due to timeout error");
	}

	@Override
	public void onStart(ITestContext context) {
		
		System.out.println("onStart");
	}

	@Override
	public void onFinish(ITestContext context) {
		
		System.out.println("onFinish");
	}
	
	
	

}

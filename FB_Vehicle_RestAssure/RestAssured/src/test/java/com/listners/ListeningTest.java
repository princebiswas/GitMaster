package com.listners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListeningTest implements ITestListener {
	
	public void onTestStart(ITestResult result)
	{
		System.out.println("Run Test Method"+result.getMethod().getMethodName());
	}
	
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("Run Test Sucess"+result.getMethod().getMethodName());
	}
	
	public void onTestFailure(ITestResult result)
	{
		System.out.println("Run Test Failure"+result.getMethod().getMethodName());
	}
	
	public void onTestSkipped(ITestResult result)
	{
		System.out.println("Run Test Skipped"+result.getMethod().getMethodName());
		
	}
	
	public void onTestFailedButWithinSuccessPercentage(ITestResult result)
	{
		
	}
	
	public void onTestFailedWithTimeout(ITestResult result)
	{
		
	}
	
	public void onStart(ITestContext context)
	{
		System.out.println("Test Start "+ context.getName());
	}
	
	public void onFinish(ITestContext context)
	{
		System.out.println("Test Finish"+context.getName());
		
	}
	
	

}

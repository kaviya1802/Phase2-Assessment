package com.simplilearn.listener;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.simplilearn.logger.LogCreation;

public class listener implements ITestListener{
	
	DateTimeFormatter dtf= DateTimeFormatter.ofPattern("yyyy/mm/dd HH:MM:SS");
	LocalDateTime local = LocalDateTime.now();
	String correctDate = local.format(dtf);
	
	LogCreation logs;
	
	public void onTestStart(ITestResult result) {
		
		try {
			logs.writeLogger(result.getName()+" has started at " +correctDate +"\n");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void onTestSuccess(ITestResult result) {
		try {
			logs.writeLogger(result.getName()+" is success at "+correctDate+"\n");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void onTestFailure(ITestResult result) {
		try {
			logs.writeLogger(result.getName()+" has failed at "+correctDate+"\n");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void onTestSkipped(ITestResult result) {
		try {
			logs.writeLogger(result.getName()+" has skipped at "+correctDate+"\n");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	public void onStart(ITestContext context) {
		logs = new LogCreation();
		
		try {
			logs.createlogger("SwiggyLogs");
			logs.writeLogger(context.getName()+ " has started at "+correctDate +"\n");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void onFinish(ITestContext context) {
		try {
			logs.writeLogger(context.getName()+" has finished at "+correctDate+ "\n");
			logs.closeLogger();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

}

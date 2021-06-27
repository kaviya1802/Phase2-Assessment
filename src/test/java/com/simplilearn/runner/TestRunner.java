package com.simplilearn.runner;



import org.junit.runner.RunWith;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Listeners;

import com.cucumber.listener.Reporter;
import com.simplilearn.listener.listener;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/Feature/Login.feature",
		glue = {"stepDefinition"},
		plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		
		monochrome = true,
		publish = true
		)

@Listeners(listener.class)

public class TestRunner {

	@AfterClass
	public void tearDown() {
		Reporter.loadXMLConfig("/home/nallakavi35gmai/eclipse-workspace/Phase2-Assessment/src/test/resources/extent-config.xml");
	}
}


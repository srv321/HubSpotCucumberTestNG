package MyRunner;

import java.io.File;


import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.vimalselvam.cucumber.listener.ExtentProperties;
import com.vimalselvam.cucumber.listener.Reporter;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

	@CucumberOptions(
	        features = "src/main/java/Features",
	        glue = {"stepDefinitions"},
	        tags = {"~@Ignore"},
	        dryRun = false,
	        plugin={"com.cucumber.listener.ExtentCucumberFormatter:output/report.html ",
	        		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
	        		"pretty",
	        		"html:target/cucumber-reports/cucumber-pretty",
	        		"json:target/cucumber-reports/CucumberTestReport.json",
	        		"rerun:target/cucumber-reports/rerun.txt"
	        		})

	
	public class MyRunnerExtentReport extends AbstractTestNGCucumberTests { 
		@BeforeClass 
		public static void setup() { 
		ExtentProperties extentProperties = ExtentProperties.INSTANCE; 
		extentProperties. setReportPath("output/myreport.html") ; 
		}


		@AfterClass 
		public static void teardown() { 
		Reporter.loadXMLConfig(new File("C:\\Users\\Saurav Saha\\eclipse-workspace"
				+ "\\HubSpotCucumberTestNG\\src\\main\\java\\config\\extent-config.xml"));
		Reporter.setSystemInfo("user", System.getProperty("user.name")); 
		Reporter.setSystemInfo("os","Mac OSX"); 
		Reporter.setTestRunnerOutput("Samp1e test runner output message"); 
		}
	
}
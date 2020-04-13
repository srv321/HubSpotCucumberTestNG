package MyRunner;

import java.io.File;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.cucumber.listener.ExtentProperties;
import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
	
	@CucumberOptions(
	        features = "src/main/java/Features",
	        glue = {"stepDefinitions"},
	        tags = {"~@Ignore"},
	        dryRun = false,
	        format = {
	                "pretty",
	                "html:target/cucumber-reports/cucumber-pretty",
	                "json:target/cucumber-reports/CucumberTestReport.json",
	                "rerun:target/cucumber-reports/rerun.txt"
	        },
	        plugin={"com.cucumber.listener.ExtentCucumberFormatter:output/report.html "})

	
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
package MyRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features= {"src/main/java/Features"},
plugin={"json:target/cucumber.json","html:target/site/cucumber-pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
glue="stepDefinitions")


	
	public class MyRunnerExtentReport extends AbstractTestNGCucumberTests { 
	/*
	 * @BeforeClass public static void setup() { ExtentProperties extentProperties =
	 * ExtentProperties.INSTANCE; extentProperties.
	 * setReportPath("output/myreport.html") ; }
	 * 
	 * 
	 * @AfterClass public static void teardown() { Reporter.loadXMLConfig(new
	 * File("C:\\Users\\Saurav Saha\\eclipse-workspace" +
	 * "\\HubSpotCucumberTestNG\\src\\main\\java\\config\\extent-config.xml"));
	 * Reporter.setSystemInfo("user", System.getProperty("user.name"));
	 * Reporter.setSystemInfo("os","Mac OSX");
	 * Reporter.setTestRunnerOutput("Samp1e test runner output message"); }
	 */
	
}
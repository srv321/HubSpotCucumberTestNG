package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class LoginStepDefinition {
	
//	test
	
	WebDriver driver;
	WebDriverWait wait;

	@Given("^user is already on Login Page$")
	public void user_is_already_on_Login_Page(){
		
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium Live Training-Naveen\\drivers\\chromedriver79.0.3945.36.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://app.hubspot.com/login");
		wait = new WebDriverWait(driver, 10);
	
	}

	@When("^title of login page is HubSpot Login$")
	public void title_of_login_page_is_HubSpot_Login(){
		
		wait.until(ExpectedConditions.titleContains("HubSpot Login"));
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "HubSpot Login");

	}

	@Then("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and(String username, String password) {
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
	}

	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() {
		driver.findElement(By.id("loginBtn")).click();
	}

	@Then("^user is on home page$")
	public void user_is_on_home_page(){
		wait.until(ExpectedConditions.titleContains("Reports dashboard"));
		String title = driver.getTitle();
		Assert.assertEquals(title, "Reports dashboard");
	
	}

	@Then("^Close the browser$")
	public void close_the_browser() {
		driver.quit();
	}

}

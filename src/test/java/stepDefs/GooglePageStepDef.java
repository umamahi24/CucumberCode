package stepDefs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GooglePageStepDef {
	
	WebDriver driver;
	@Given("User is on Google page")
	public void user_is_on_google_page() {
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String title=driver.getTitle();
		Assert.assertEquals("Google", title);
	   	}
	@When("Enter Java in search box")
	public void enter_java_in_search_box() {
		WebElement searchBox=driver.findElement(By.id("APjFqb"));
		searchBox.sendKeys("Java");
		searchBox.submit();
	   
	}
	@Then("Java tutorial page displayed")
	public void java_tutoril_page() {
		Assert.assertEquals("Java - Google Search", driver.getTitle());
		driver.close();
	   
	}
	
	@When("Enter selenium in search box")
	public void enter_selenium_in_search_box() {
		WebElement searchBox=driver.findElement(By.id("APjFqb"));
		searchBox.sendKeys("selenium");
		searchBox.submit();
		
	}
	@Then("selenium tutorial page displayed")
	public void selenium_tutorial_page_displayed() {
		Assert.assertEquals("selenium1 - Google Search", driver.getTitle());
		driver.close();
	}
	
	@After
	public void attachScreenshot(Scenario scenario) {
		if(scenario.isFailed()) {
			TakesScreenshot screen=(TakesScreenshot)driver;
			byte[] imgBytes=screen.getScreenshotAs(OutputType.BYTES);
			scenario.attach(imgBytes, "image/png", "ScreenImage");
		}
		
	}

}

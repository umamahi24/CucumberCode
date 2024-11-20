package stepDefs;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserLoginStepDef {
	WebDriver driver;
	
	@Given("User is on login page")
	public void user_is_on_login_page() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/login");
	  
	}
//	@When("User enters credentials")
//	public void user_enters_credentials() {
//		
//		driver.findElement(By.id("username")).sendKeys("tomsmith");
//	    driver.findElement(By.name("password")).sendKeys("SuperSecretPassword!");
//	   driver.findElement(By.className("radius")).click();
//	   
//
//	   
//	}
	@Then("Should display home page")
	public void should_display_home_page() {
		boolean isValidUser = driver.findElement(By.cssSelector("div.success")).isDisplayed();
		Assert.assertTrue(isValidUser);
	   driver.close();
	}
	
	@When("User enters {string} and {string}")
	public void user_enters_and(String strUser, String strPswd) {

		driver.findElement(By.id("username")).sendKeys(strUser);
	    driver.findElement(By.name("password")).sendKeys(strPswd);
	   driver.findElement(By.className("radius")).click();
	   
	    
	}
	
	@When("User enters credentials in step")
	public void user_enters_credentials(DataTable dataTable) {
		
		List<List<String>> data=dataTable.asLists();
		String strUser=data.get(0).get(0);
		String pswd=data.get(0).get(1);
		driver.findElement(By.id("username")).sendKeys(strUser);
	    driver.findElement(By.name("password")).sendKeys(pswd);
	   driver.findElement(By.className("radius")).click();
	   
	}
	@Then("Should display home page with msg")
	public void should_display_home_page_with_msg(DataTable dataTable) {
		
		List<List<String>> msg =dataTable.asLists();
		String expectedMsg=msg.get(0).get(0);
		String actualMsg= driver.findElement(By.cssSelector("div.success")).getText();
		Assert.assertTrue(actualMsg.trim().contains(expectedMsg));
		//Assert.assertEquals(expectedMsg.trim(),actualMsg.trim() );
		driver.close();
		
		
	    
	}
	
	@When("User enters credentials in step as Map")
	public void user_enters_credentials_in_step_as_map(DataTable dataTable) {
		List<Map<String,String>> data=dataTable.asMaps();
		String strUser=data.get(0).get("userName");
		String pswd=data.get(0).get("pswd");
		driver.findElement(By.id("username")).sendKeys(strUser);
	    driver.findElement(By.name("password")).sendKeys(pswd);
	   driver.findElement(By.className("radius")).click();
	   
	}

	


}

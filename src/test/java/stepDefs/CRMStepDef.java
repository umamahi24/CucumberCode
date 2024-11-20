package stepDefs;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class CRMStepDef {
	
	
	@BeforeAll
	public static void setUp() {
		System.out.println("Before all Scenario");
	}
	
	@AfterAll
	public static void tearDown() {
		System.out.println("After all Scenario");
	}
	@Before(value="@RegressionTest",order=1)
	public static void readPropFile() {
		System.out.println("Read property files");
	}
	
	@Before(value="@RegressionTest",order=2)
	public static void connectDB() {
		System.out.println("connect DB");
	}
	@Before(value="@RegressionTest",order=3)
	public static void takeSceenshot() {
		System.out.println("Take Screenshot");
	}
	
	@After("@RegressionTest")
	public static void edgeBrowserInit() {
		System.out.println("edge broswer");
	}
//	@After("@RegressionTest")
//	public static void closeDriver() {
//		System.out.println("Close driver");
//	}
	@When("User create a new deal")
	public void user_create_a_new_deal() {
		System.out.println("Create deal");
	    
	}
	
	@When("User update deal")
	public void user_update_deal() {
		System.out.println("update deal");
	}
	

	@Given("User login into app")
	public void user_login_into_app() {
		System.out.println("user login");
	 
	}
	@When("User view a deal")
	public void user_view_a_deal() {
		System.out.println("View deal");
	  
	}
	@When(" User delete a deal")
	public void user_delete_a_deal() {
		System.out.println("Delete deal");
	  
	}
	
	
	@When("User update task")
	public void user_update_task() {
		System.out.println("update task");
	   
	}
	
	@When("User delete a task")
	public void user_delete_a_task() {
		System.out.println("delete task");
	    
	}
	
	

	@When("User view a task")
	public void user_view_a_task() {
		System.out.println("view task");
	  
	}
	
	
	@When("User create a new task")
	public void user_create_a_new_task() {
		System.out.println("new task");
	   
	}
}

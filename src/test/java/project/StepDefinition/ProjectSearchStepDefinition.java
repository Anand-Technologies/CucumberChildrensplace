package project.StepDefinition;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.libglobal.HelperClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.loginpojo.LoginPOJOClass;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ProjectSearchStepDefinition extends HelperClass {
	
	@Given("^User is on home page$")
	public void user_is_on_home_page() throws Throwable {
		   launchBrowser();
		   launchUrl("https://www.childrensplace.com/us/home");
		   
	}
	@Given("^PopUp need to close$")
	public void popup_need_to_close() throws Throwable {
		driver.findElement(By.xpath("(//button[@aria-label='Close this modal'])[1]")).click();
	}	
	@When("^User enter the username and password$")
	public void user_enter_the_username_and_password(DataTable d) throws Throwable {
	    List<Map<String,String>> mp = d.asMaps(String.class, String.class);
		LoginPOJOClass l = new LoginPOJOClass();
	    l.getLogin().click();
	    fill(l.getUsername(),mp.get(0).get("username"));
	    fill(l.getPassword(),mp.get(1).get("password"));
	    l.getSignin();
	}

	@Then("^User login successful$")
	public void user_login_successful() throws Throwable {
	    System.out.println("Login successful");
	    driver.manage().deleteAllCookies();
	}


	@When("^user has enter the product and give enter$")
	public void user_has_enter_the_product_and_give_enter(DataTable s) throws Throwable {
		List<String> li = s.asList(String.class);
		LoginPOJOClass l = new LoginPOJOClass();
		fill(l.getSearch(),li.get(0)+Keys.ENTER);		
	}

	@Then("^user has view the availability product$")
	public void user_has_view_the_availability_product() throws Throwable {
	   System.out.println("User has searched successfully");
		  driver.manage().deleteAllCookies();
	}
		
}

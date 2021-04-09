package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefination {

	@Before 
	//this Before annotation came from cucmberJunit
	//not THE JUnit
	public void start() {
		
	}
	@After
	public void end() {
		
	}
	@Before("@smoke") 
	//customized hookx
	//when we want to run this annotation before any tags
	public void start1() {
		
	}
	@After("@smoke")
	public void end1() {
		
	}
	WebDriver dr;
	@Given("^open blank browser$")
	public void open_blank_browser() throws Throwable {
	   dr=new ChromeDriver();
	}

	@Given("^navigate to url$")
	public void navigate_to_url() throws Throwable {
	    dr.get("");
	}

	@When("^user type userid in userText box$")
	public void user_type_userid_in_userText_box() throws Throwable {
	    dr.findElement(By.id("id")).sendKeys("");
	}

	@When("^user type password in passText box$")
	public void user_type_password_in_passText_box() throws Throwable {
	    dr.findElement(By.xpath("")).sendKeys("password");
	}

	@When("^user click on login button$")
	public void user_click_on_login_button() throws Throwable {
	  dr.findElement(By.xpath("")).click();
	}

	@Then("^user should see his profile page$")
	public void user_should_see_his_profile_page() throws Throwable {
	    if(dr.findElement(By.xpath("sign out xpath")).isDisplayed()) {
	    	System.out.println("i am in the right page");
	    }
	}
	
	@When("^user type s(\\d+) in passText box$")
	public void user_type_s_in_passText_box(int arg1) throws Throwable {
	   dr.findElement(By.xpath("")).sendKeys("");
	}

	@Then("^user should not see his profile page$")
	public void user_should_not_see_his_profile_page() throws Throwable {
	    
	}

	@When("^user type g(\\d+) in passText box$")
	public void user_type_g_in_passText_box(int arg1) throws Throwable {
	 
	}


}

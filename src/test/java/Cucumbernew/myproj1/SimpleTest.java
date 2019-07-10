package Cucumbernew.myproj1;

import cucumber.api.java.en.When;

//import org.testng.annotations.Test;

public class SimpleTest {
	@When("^login using user(\\d+) and pass(\\d+)$")
	public void login_using_user_and_pass(int arg1, int arg2) throws Throwable {
	   
		System.out.println("Users here logged in using below credentials");
		
	}

}

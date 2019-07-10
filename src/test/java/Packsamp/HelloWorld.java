package Packsamp;

//import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class HelloWorld {
	String obj;
	@Given("^when the user print hello world$")
	public void when_the_user_print_hello_world() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		obj = "Hello World";
	}

	@Then("^hello world display in the console$")
	public void hello_world_display_in_the_console() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println(obj);
	}
 
}

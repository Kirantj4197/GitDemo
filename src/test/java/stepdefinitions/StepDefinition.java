package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {

	

    @Given("^User is on Landing Page$")
    public void user_is_on_landing_page() throws Throwable {

    System.out.println("sce  1  step 1");
    }


    @When("^user login to the application with \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void user_login_to_the_application_with_something_and_password_something(String strArg1, String strArg2) throws Throwable {
   
    	System.out.println(strArg1);
    	System.out.println(strArg2);
    }


    @Then("^Home Page is populated$")
    public void home_page_is_populated() throws Throwable {
    	System.out.println("common  step 3");
       
    }

    @And("^links to all courses are displayed \"([^\"]*)\"$")
    public void links_to_all_courses_are_displayed_something(String strArg3) throws Throwable {
       System.out.println(strArg3);
    }


    @Given("^user launches the application$")
    public void user_launches_the_application() throws Throwable {
       System.out.println("sce 2 step 1");
       System.out.println("chnages to test pushing the code to git hub ");
       System.out.println("im confused");
    }
    

    @Given("^User is on Page$")
    public void user_is_on_page() throws Throwable {
        
    }

    @When("^logins with (.+) and (.+)$")
    public void logins_with_and(String username, String password) throws Throwable {
       
    }

    @Then("^links to all courses are validated$")
    public void links_to_all_courses_are_validated() throws Throwable {
     
    }

  

    
    
    
}

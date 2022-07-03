package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	
	@Before("@sanityTest")
	public void add()
	{
		
	}
	
	@After("@smokeTest")
	public void subtract()
	{
		
	}

}

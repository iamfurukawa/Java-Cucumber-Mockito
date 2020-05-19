package com.democucumber.steps;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import com.democucumber.Models.User;
import com.democucumber.Services.CalculatorIMCService;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

@RunWith(SpringRunner.class)
public class UserSteps {

	private User user;

	private User userMocked;

	private String result;

	private CalculatorIMCService calculatorIMCService;

	@Before
	public void setUp() {
		this.user = new User();
		this.calculatorIMCService = new CalculatorIMCService();
		this.result = "";
		this.userMocked = mock(User.class);
	}

	@Given("^the user called \"(.*?)\" with (.*) kilos and (.*) height$")
	public void createUser(final String name, final int weight, final float height) throws Throwable {
		user.setName(name);
		user.setHeight(height);
		user.setWeight(weight);
	}

	@Given("^a user mocked$")
	public void createUserMocked() throws Throwable {
		when(this.userMocked.getName()).thenReturn("Bob");
		when(this.userMocked.getWeight()).thenReturn(100);
		when(this.userMocked.getHeight()).thenReturn(2.0F);
	}

	@When("^I calculate the IMC$")
	public void calculateIMC() throws Throwable {
		this.result = calculatorIMCService.calculateIMC(user);
	}

	@When("^I calculate the IMC for a user mocked$")
	public void calculateIMCForAUserMocked() throws Throwable {
		this.result = calculatorIMCService.calculateIMC(userMocked);
	}

	@Then("^the result is \"(.*?)\"$")
	public void checkResult(final String resultExpected) throws Throwable {
		assertEquals(resultExpected, this.result);
	}

	@Then("^assert the user mocked$")
	public void checkResultMocked() throws Throwable {
		assertEquals("Acima do Peso", this.result);
		assertEquals(this.userMocked.getName(), "Bob");
		assertEquals(this.userMocked.getWeight(), 100);
		assertEquals(this.userMocked.getHeight(), 2.0);
	}
}

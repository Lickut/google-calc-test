package google_calculator.google_calculator_test.steps;

import net.thucydides.core.annotations.Steps;

import org.jbehave.core.annotations.Alias;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import google_calculator.google_calculator_test.steps.serenity.CalculatorSteps;
import static org.assertj.core.api.Assertions.assertThat;

public class SimpleMathemeticalOperationsSteps {

	@Steps
	CalculatorSteps calculator;

	@Given("The user is on the calculator page")
	public void givenTheUserIsOnCalculatorPage() {
		calculator.openCalculatorPage();
	}

	@When("The user enters '<argument>'")
	@Alias("The user enters '$argument'")
	public void whenTheUseEntersArgument(String argument) {
		calculator.enterArgument(argument);
	}

	@Then("The user sees '<result>'")
	@Alias("The user sees '$result'")
	public void theUserSeesResult(String result) {
		assertThat(calculator.getCalculationResult()).isEqualTo(result);
	}
}

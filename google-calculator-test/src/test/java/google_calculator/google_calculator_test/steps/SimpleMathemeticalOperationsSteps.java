package google_calculator.google_calculator_test.steps;

import static org.assertj.core.api.Assertions.assertThat;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import google_calculator.google_calculator_test.steps.serenity.CalculatorSteps;
import net.thucydides.core.annotations.Steps;

public class SimpleMathemeticalOperationsSteps {

	public static final String EQUALS_SIGN = "=";

	@Steps
	CalculatorSteps calculator;

	@Given("The user is on the calculator page")
	public void givenTheUserIsOnCalculatorPage() {
		calculator.openCalculatorPage();
	}

	@When("The user enters arguments <argument1> and <argument2> with operation <operation> using web buttons")
	public void whenTheUseEntersArgument(@Named("argument1") String argument1, @Named("argument2") String argument2,
			@Named("operation") String operation) {
		calculator.enterCalculatorButton(argument1);
		calculator.enterCalculatorButton(operation);
		calculator.enterCalculatorButton(argument2);
	}

	@When("The user presses equals web button")
	public void userPressesEqualsButton() {
		calculator.enterCalculatorButton(EQUALS_SIGN);
	}
	
	@When("The user enters arguments <argument1> and <argument2> with operation <operation> using keyboard")
	public void usersFocusesCalculatorDisplayOutput(@Named("argument1") String argument1, @Named("argument2") String argument2,
			@Named("operation") String operation){
		calculator.focusCalculatorDisplayOutput();
		
	}

	@Then("The user sees <result>")
	public void theUserSeesResult(@Named("result") String result) {
		assertThat(calculator.getCalculationResult()).isEqualTo(result);
	}
}

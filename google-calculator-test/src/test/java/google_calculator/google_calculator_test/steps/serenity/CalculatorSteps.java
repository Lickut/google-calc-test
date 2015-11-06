package google_calculator.google_calculator_test.steps.serenity;

import java.util.Arrays;

import google_calculator.google_calculator_test.pages.GoogleCalculatorPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class CalculatorSteps extends ScenarioSteps {

	private static final long serialVersionUID = 3372126130449152478L;
	
	GoogleCalculatorPage calculatorPage;

    @Step
    public void openCalculatorPage(){
    	calculatorPage.open();
    }
	
	@Step
    public void enterArgument(String argument) {
		System.out.println("argument:" +argument);
    	String [] digits = argument.split("");
//    	System.out.println("digits: "+Arrays.toString(digits));
    	for (int i = 0; i<digits.length; i++){
    		calculatorPage.pressCalculatorButton(digits[i]);
    	}
    }

    @Step
    public String getCalculationResult() {
        return calculatorPage.getDisplayOutput();
    }
}
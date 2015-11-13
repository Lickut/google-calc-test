package google_calculator.google_calculator_test.steps.serenity;

import java.util.Arrays;

import org.openqa.selenium.Keys;

import google_calculator.google_calculator_test.pages.GoogleCalculatorPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class CalculatorSteps extends ScenarioSteps {

	private static final long serialVersionUID = 3372126130449152478L;

	GoogleCalculatorPage calculatorPage;

	@Step
	public void openCalculatorPage() {
		calculatorPage.open();
	}

	@Step
	public void enterCalculatorButton(String argument) {
//		System.out.println("argument:" + argument);
		String[] digits = argument.split("");
		// System.out.println("digits: "+Arrays.toString(digits));
		for (int i = 0; i < digits.length; i++) {
			calculatorPage.pressCalculatorButton(digits[i]);
		}
	}
	
	@Step
	public void enterKeyboardCalculatorButton(String argument){
		char[] digits = argument.toCharArray();
		System.out.println(Arrays.toString(digits));
		for (int i = 0; i < digits.length; i++) {
			System.out.println("digit:"+digits[i]);
				if(Character.isDigit(digits[i])){
					System.out.println("button:"+digits[i]);
					System.out.println(Keys.valueOf("NUMPAD"+digits[i]));
					calculatorPage.pressCalculatorButton(Keys.valueOf("NUMPAD"+digits[i]));
			}
				else{
					switch(digits[i]){
					case '=': calculatorPage.pressCalculatorButton(Keys.EQUALS);break;
					case '.': calculatorPage.pressCalculatorButton(Keys.SEPARATOR);break;
					case '−': calculatorPage.pressCalculatorButton(Keys.SUBTRACT);break;
					case '+': calculatorPage.pressCalculatorButton(Keys.ADD);break;
					case '÷': calculatorPage.pressCalculatorButton(Keys.DIVIDE);break;
					case '×':  calculatorPage.pressCalculatorButton(Keys.MULTIPLY);break;
					default: throw new IllegalArgumentException("No such keys on the keyboard: "+argument);
					}
				}
		}
	}
	
	@Step
	public void focusCalculatorDisplayOutput(){
		calculatorPage.focusDisplayOutput();
	}
	
	@Step
	public String getCalculationResult() {
		return calculatorPage.getDisplayOutput();
	}
}
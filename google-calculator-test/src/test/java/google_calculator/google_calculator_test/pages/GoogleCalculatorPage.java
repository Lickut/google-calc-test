package google_calculator.google_calculator_test.pages;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import net.serenitybdd.core.annotations.findby.By;

@DefaultUrl("https://www.google.com.ua/#q=1-1")
public class GoogleCalculatorPage extends PageObject {

	@FindBy(className = "cwbsc")
	private WebElement calculatorButtons;

	@FindBy(id = "cwos")
	private WebElement displayOutput;

	public void pressCalculatorButton(String buttonName) {
		System.out.println("buttonName: "+buttonName);
		calculatorButtons.findElement(By.xpath("//span[contains(.,'" + buttonName + "')]/../..")).click();
	}

	public String getDisplayOutput() {
		return displayOutput.getText();
	}
}

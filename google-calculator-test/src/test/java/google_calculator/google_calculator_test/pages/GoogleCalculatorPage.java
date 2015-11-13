package google_calculator.google_calculator_test.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

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
	
	@FindBy(id = "cwtltblr")
	private WebElement display;

	public void pressCalculatorButton(String buttonName) {
		System.out.println("buttonName: "+buttonName);
		calculatorButtons.findElement(By.xpath("//span[@class='cwbts' and contains(.,'" + buttonName + "')]/../..")).click();
	}
	
	public void pressCalculatorButton(Keys buttonKey) {
		System.out.println("buttonName: "+buttonKey);
		display.sendKeys(buttonKey);;
	}

	public String getDisplayOutput() {
		return displayOutput.getText();
	}
	
	public void focusDisplayOutput(){
//		new Actions(getDriver()).moveToElement(displayOutput).click().perform();
	}
}
	

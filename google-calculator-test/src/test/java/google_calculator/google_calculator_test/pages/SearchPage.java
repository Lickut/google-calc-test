package google_calculator.google_calculator_test.pages;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.google.com")
public class SearchPage extends PageObject {

	@FindBy(id = "lst-ib")
	private WebElement searchTextField;

	@FindBy(name = "btnG")
	private WebElement searchButton;

	public void enterSearchQuery(String query) {
		searchTextField.sendKeys(query);
	}
	
	public void search(){
//		withTimeoutOf(5, TimeUnit.SECONDS).waitForPresenceOf(By.name("btnG"));
		searchButton.click();
	}
}

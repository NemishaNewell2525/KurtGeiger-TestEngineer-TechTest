package buttons.pdp;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.kg.qa.base.TestBase;

public class BtnAddToBag extends TestBase {


	//Object repository

	@FindBy(id="add-to-cart-ss17")
	WebElement Btnaddtobag;


	// Initialising the Page Objects:

	public BtnAddToBag() {
		PageFactory.initElements(driver, this);
	}


	//Actions
	public void AddtobagSelect(){
		Btnaddtobag.click();
	}
}
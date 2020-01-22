package buttons.pdp;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.kg.qa.base.TestBase;


public class BtnSeven extends TestBase {


	//Object repository

	@FindBy(xpath = "//*[@id=\"root\"]/div/div[1]/div[2]/div[2]/div[3]/ul[2]/li[2]/button")
	WebElement Btnseven;


	// Initialising the Page Objects:

	public BtnSeven() {
		PageFactory.initElements(driver, this);
	}


	//Actions
	public void SevenSelect(){
		Btnseven.click();
	}
}
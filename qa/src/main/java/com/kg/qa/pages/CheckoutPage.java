package com.kg.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.kg.qa.base.TestBase;



public class CheckoutPage extends TestBase {

	// Initialising the Page Objects:

	public CheckoutPage() {
		PageFactory.initElements(driver, this);
	}

	//Actions

	public boolean validate_CP_URL(WebDriver driver, String expectedURL)
	{
		boolean result=false;
		if (driver.getCurrentUrl().equalsIgnoreCase(expectedURL))
		{
			result = true;
		}
		return result;
	}


}

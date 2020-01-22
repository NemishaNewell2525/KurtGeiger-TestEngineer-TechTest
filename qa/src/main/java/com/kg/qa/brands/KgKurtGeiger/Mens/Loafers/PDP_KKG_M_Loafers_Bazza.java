package com.kg.qa.brands.KgKurtGeiger.Mens.Loafers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.kg.qa.base.TestBase;


public class PDP_KKG_M_Loafers_Bazza extends TestBase {


	//Object repository

	@FindBy(xpath = "//a[@href='https://www.kurtgeiger.com/brands/ugg']")
	WebElement DPDBazzaGreySyntheticKgKurtGeiger;

	@FindBy(xpath = "//input[@type='buttoon' and @value='Grey']")
	WebElement BtnGrey;

	@FindBy(xpath = "//input[[@type='buttoon' and @value='7']")
	WebElement BtnSeven;

	
	// Initialising the Page Objects:

	public PDP_KKG_M_Loafers_Bazza() {
		PageFactory.initElements(driver, this);
	}


	//Actions
	public boolean validate_PDP_KKG_M_Loafers_Bazza_URL(WebDriver driver, String expectedURL)
	{
		boolean result=false;
		if (driver.getCurrentUrl().equalsIgnoreCase(expectedURL))
		{
			result = true;
		}
		return result;
	}
}
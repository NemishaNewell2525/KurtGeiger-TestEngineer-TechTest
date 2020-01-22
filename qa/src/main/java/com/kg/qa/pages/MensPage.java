package com.kg.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.kg.qa.base.TestBase;
import com.kg.qa.brands.KgKurtGeiger.Mens.Loafers.PDP_KKG_M_Loafers_Bazza;


public class MensPage extends TestBase {


	//Object repository

	@FindBy(xpath = "//a[@href='/men/shoes/casuals/loafers/bazza-grey-synthetic-kg-kurt-geiger']")
	WebElement DPDBazzaGreySyntheticKgKurtGeiger;


	// Initialising the Page Objects:

	public MensPage() {
		PageFactory.initElements(driver, this);
	}


	//Actions

	public PDP_KKG_M_Loafers_Bazza ClickDPDBazzaGreySyntheticKgKurtGeiger(){
		DPDBazzaGreySyntheticKgKurtGeiger.click();
		return new PDP_KKG_M_Loafers_Bazza();
	}

	public boolean validate_MP_URL(WebDriver driver, String expectedURL)
	{
		boolean result=false;
		if (driver.getCurrentUrl().equalsIgnoreCase(expectedURL))
		{
			result = true;
		}
		return result;
	}

	public boolean validate_pdp_kkg_m_loafers_bazza_URL(WebDriver driver, String expectedURL)
	{
		boolean result=false;
		if (driver.getCurrentUrl().equalsIgnoreCase(expectedURL))
		{
			result = true;
		}
		return result;
	}
}
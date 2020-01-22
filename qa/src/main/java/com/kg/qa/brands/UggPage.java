package com.kg.qa.brands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.kg.qa.base.TestBase;
import com.kg.qa.brands.UggPage;


public class UggPage extends TestBase {


	//Object repository

	@FindBy(xpath = "//*[@id=\"product_list___2A64u\"]")
	WebElement UGGProductList;


	// Initialising the Page Objects:

	public UggPage() {
		PageFactory.initElements(driver, this);
	}


	//Actions
	public boolean validate_UP_URL(WebDriver driver, String expectedURL)
	{
		boolean result=false;
		if (driver.getCurrentUrl().equalsIgnoreCase(expectedURL))
		{
			result = true;
		}
		return result;
	}

	public boolean validate_Ugg_productlist(){
		return UGGProductList.isDisplayed();
	}


}
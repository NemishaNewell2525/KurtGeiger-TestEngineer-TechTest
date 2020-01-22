package com.kg.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.kg.qa.base.TestBase;
import com.kg.qa.brands.UggPage;


public class BrandsPage extends TestBase {


	//Object repository

	@FindBy(xpath = "//a[@href='https://www.kurtgeiger.com/brands/ugg']")
	WebElement UGGLink;


	// Initialising the Page Objects:

	public BrandsPage() {
		PageFactory.initElements(driver, this);
	}


	//Actions
	
	public UggPage clickOnUGGLink(){
		UGGLink.click();
		return new UggPage();
	}

	public boolean validate_BP_URL(WebDriver driver, String expectedURL)
	{
		boolean result=false;
		if (driver.getCurrentUrl().equalsIgnoreCase(expectedURL))
		{
			result = true;
		}
		return result;
	}
}
package com.kg.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.kg.qa.base.TestBase;


public class HomePage extends TestBase {


	//Object repository

	@FindBy(xpath = "//a[@href='/shop-by-brand']")
	WebElement BRANDSLink;

	@FindBy(xpath = "//a[@href='/men/shoes']")
	WebElement MENLink;

	@FindBy(xpath = "//*[@id=\"ss17-wrapLinksSearch\"]/ul/li[7]/a/span[2]")
	WebElement BAGItemsNumberLink;

	@FindBy(xpath = "//*[@id=\"ss17-wrapLinksSearch\"]/ul/li[7]")
	WebElement MyBagLink;


	// Initialising the Page Objects:

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	//Actions

	public BrandsPage clickOnBRANDSLink(){
		BRANDSLink.click();
		return new BrandsPage();
	}

	public MensPage clickOnMENLink(){
		MENLink.click();
		return new MensPage();
	}

	public boolean validate_HP_URL(WebDriver driver, String expectedURL)
	{
		boolean result=false;
		if (driver.getCurrentUrl().equalsIgnoreCase(expectedURL))
		{
			result = true;
		}
		return result;
	}

	public String validate_BAGItems_Number_1(){
		new WebDriverWait(driver, 20).until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//*[@id=\"ss17-wrapLinksSearch\"]/ul/li[7]/a/span[2]"), "1"));
		return BAGItemsNumberLink.getText();
	}

	public CheckoutPage clickOnMyBagLink(){
		MyBagLink.click();
		return new CheckoutPage();
	}
}




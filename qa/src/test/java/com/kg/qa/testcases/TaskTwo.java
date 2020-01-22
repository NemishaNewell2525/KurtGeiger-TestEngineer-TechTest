package com.kg.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.kg.qa.base.TestBase;
import com.kg.qa.pages.HomePage;
import com.kg.qa.pages.MensPage;
import com.kg.qa.pages.CheckoutPage;
import com.kg.qa.brands.KgKurtGeiger.Mens.Loafers.PDP_KKG_M_Loafers_Bazza;
import buttons.pdp.BtnAddToBag;
import buttons.pdp.BtnSeven;

public class TaskTwo extends TestBase {

	HomePage homePage;
	MensPage menspage;
	PDP_KKG_M_Loafers_Bazza pdp_kkg_m_loafers_bazza;
	CheckoutPage checkoutpage;
	BtnSeven btnseven;
	BtnAddToBag btnaddtobag;


	public TaskTwo() {
		super();
	}


	@BeforeMethod
	public void setUp() {
		initialization();
		homePage = new HomePage();
		menspage = new MensPage();
		checkoutpage = new CheckoutPage();
		pdp_kkg_m_loafers_bazza = new PDP_KKG_M_Loafers_Bazza();
		btnseven = new BtnSeven();
		btnaddtobag = new BtnAddToBag();
	}

	@Test(priority=1, alwaysRun=true)
	public void verifyMensPageLoad(){
		menspage = homePage.clickOnMENLink();
		Assert.assertTrue(menspage.validate_MP_URL(driver, "https://www.kurtgeiger.com/men/shoes" ));
	}

	@Test(priority=2, alwaysRun=true)
	public void verifyPDP_KKG_M_Loafers_Bazza(){
		menspage = homePage.clickOnMENLink();
		pdp_kkg_m_loafers_bazza = menspage.ClickDPDBazzaGreySyntheticKgKurtGeiger();
		Assert.assertTrue(menspage.validate_pdp_kkg_m_loafers_bazza_URL(driver, "https://www.kurtgeiger.com/men/shoes/casuals/loafers/bazza-grey-synthetic-kg-kurt-geiger" ));
	}

	@Test(priority=3, alwaysRun=true)
	public void verifySize(){
		menspage = homePage.clickOnMENLink();
		pdp_kkg_m_loafers_bazza = menspage.ClickDPDBazzaGreySyntheticKgKurtGeiger();
		btnseven.SevenSelect();	
	}

	@Test(priority=4, alwaysRun=true)
	public void verifyAddtobag(){
		menspage = homePage.clickOnMENLink();
		pdp_kkg_m_loafers_bazza = menspage.ClickDPDBazzaGreySyntheticKgKurtGeiger();
		btnseven.SevenSelect();	
		btnaddtobag.AddtobagSelect();
	}
	

	@Test(priority=5, alwaysRun=true)
	public void verifyBagitemNumber(){
		menspage = homePage.clickOnMENLink();
		pdp_kkg_m_loafers_bazza = menspage.ClickDPDBazzaGreySyntheticKgKurtGeiger();
		btnseven.SevenSelect();	
		btnaddtobag.AddtobagSelect();
		String number = homePage.validate_BAGItems_Number_1();
		Assert.assertEquals(number, "1");
	}
	
	@Test(priority=6, alwaysRun=true)
	public void verifyCheckoutPageLoad(){
		menspage = homePage.clickOnMENLink();
		pdp_kkg_m_loafers_bazza = menspage.ClickDPDBazzaGreySyntheticKgKurtGeiger();
		btnseven.SevenSelect();	
		btnaddtobag.AddtobagSelect();
		checkoutpage = homePage.clickOnMyBagLink();
		Assert.assertTrue(checkoutpage.validate_CP_URL(driver, "https://www.kurtgeiger.com/checkout/cart/" ));
	}
	

	@AfterMethod
	public void tearDown(){
		driver.quit();
	}


}


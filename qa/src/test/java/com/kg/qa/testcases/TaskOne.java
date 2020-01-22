package com.kg.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.kg.qa.base.TestBase;
import com.kg.qa.pages.HomePage;
import com.kg.qa.pages.BrandsPage;
import com.kg.qa.brands.UggPage;
import com.kg.qa.util.TestUtil;

public class TaskOne extends TestBase {

	TestUtil testUtil;
	HomePage homePage;
	BrandsPage brandspage;
	UggPage uggpage;


	public TaskOne() {
		super();
	}
	
	
	@BeforeMethod
	public void setUp() {
		initialization();
		testUtil = new TestUtil();
		homePage = new HomePage();
		brandspage = new BrandsPage();
		uggpage = new UggPage();
	}

	
	@Test(priority=1, alwaysRun=true)
	public void verifyHomePageLoad(){
		Assert.assertTrue(homePage.validate_HP_URL(driver, "https://www.kurtgeiger.com/" ));
	}

	@Test(priority=2, alwaysRun=true)
	public void verifyHeaderBrandsLink(){
		brandspage = homePage.clickOnBRANDSLink();
	}

	@Test(priority=3, alwaysRun=true)
	public void verifyBrandsPageLoad(){
		brandspage = homePage.clickOnBRANDSLink();
		Assert.assertTrue(brandspage.validate_BP_URL(driver, "https://www.kurtgeiger.com/shop-by-brand" ));
	}

	@Test(priority=4, alwaysRun=true)
	public void verifyUggPageLoad(){
		brandspage = homePage.clickOnBRANDSLink();
		uggpage = brandspage.clickOnUGGLink();
		Assert.assertTrue(uggpage.validate_UP_URL(driver, "https://www.kurtgeiger.com/brands/ugg" ));
	}

	@Test(priority=5, alwaysRun=true)
	public void verifyUggProductsPageLoad(){
		brandspage = homePage.clickOnBRANDSLink();
		uggpage = brandspage.clickOnUGGLink();
		boolean uggproductlist = uggpage.validate_Ugg_productlist();
		Assert.assertTrue(uggproductlist);
	}


	@AfterMethod
	public void tearDown(){
		driver.quit();
	}

}


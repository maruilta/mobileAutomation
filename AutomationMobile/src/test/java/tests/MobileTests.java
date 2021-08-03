package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import screens.DashBoardScreen;
import util.tests.BaseMobileTest;
public class MobileTests extends BaseMobileTest {

	@Test(priority = 1)
	public void test1() {
		DashBoardScreen dash = new DashBoardScreen(driver);
		dash.scrollToText("Colombia");
		dash.checkColombia();
		dash.tapConfirm();
		dash.acceptDataPrivacyPolicies();
	}

	@Test(priority = 2)
	public void test2(){
		DashBoardScreen dash = new DashBoardScreen(driver);
		dash.scrollToText("Colombia");
		dash.checkColombia();
		dash.tapConfirm();
		dash.acceptDataPrivacyPolicies();
		dash.getSearchInput().click();
		dash.getEditableSearchInput().click();
		dash.goToChooseADateRage();
		dash.selectADateRange();
		dash.confirmSearch();
	}

	//Test3
	@Test(priority = 3)
	public void test3(){
		DashBoardScreen dash = new DashBoardScreen(driver);
		boolean allFourDisplayed = dash.areAllFourBottomButtonsDisplayed();
		Assert.assertTrue(allFourDisplayed,"Not all buttons at the footer of the screen are displayed.");
	}

	//Test4
	@Test(priority = 4)
	public void test4(){
		DashBoardScreen dash = new DashBoardScreen(driver);
		dash.scrollToText("Colombia");
		dash.checkColombia();
		dash.tapConfirm();
		dash.acceptDataPrivacyPolicies();
		dash.openConfiguration();
		dash.clickSettingsButton();
		dash.clickFacebookCheckbox();
		dash.clickSaveButton();
	}
}
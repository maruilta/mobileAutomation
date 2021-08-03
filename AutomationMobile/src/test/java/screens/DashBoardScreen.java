package screens;

import static io.appium.java_client.pagefactory.LocatorGroupStrategy.ALL_POSSIBLE;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.HowToUseLocators;
import util.screens.BaseScreen;

/**
 * DashBoard screen.
 * 
 * @author Hans.Marquez
 *
 */
public class DashBoardScreen extends BaseScreen {

	/**
	 * Constructor method.
	 *
	 * @author Hans.Marquez
	 * <p>
	 * //* @param androidDriver
	 * : AndroidDriver
	 */
	public DashBoardScreen(AndroidDriver<AndroidElement> driver) {
		super(driver);
	}

	// AndroidElements
	@HowToUseLocators(androidAutomation = ALL_POSSIBLE)
	@AndroidFindBy(uiAutomator = "UiSelector().resourceIdMatches(\".*button1.*\")")
	@AndroidFindBy(uiAutomator = "UiSelector().resourceIdMatches(\".*button1.*\").textContains(\"OK\")")
	@AndroidFindBy(uiAutomator = "UiSelector().resourceIdMatches(\".*permission.*allow.*button.*\")")
	private AndroidElement alertsPopUps;

	@HowToUseLocators(androidAutomation = ALL_POSSIBLE)
	@AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.disney.wdpro.dlr:id/tmpsubacts_root\").childSelector(new UiSelector().textContains(\"Sign In\"))")
	@AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.disney.wdpro.dlr:id/tmpsubacts_primary\")")
	private AndroidElement signInButton;

	@HowToUseLocators(androidAutomation = ALL_POSSIBLE)
	@AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.disney.wdpro.dlr:id/tmpsubacts_root\").childSelector(new UiSelector().textContains(\"Sign In\"))")
	@AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.disney.wdpro.dlr:id/tmpsubacts_primary\")")
	private AndroidElement userTextBox;

	@HowToUseLocators(androidAutomation = ALL_POSSIBLE)
	@AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.disney.wdpro.dlr:id/tmpsubacts_root\").childSelector(new UiSelector().textContains(\"Sign In\"))")
	@AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.disney.wdpro.dlr:id/tmpsubacts_primary\")")
	private AndroidElement passwordTextBox;


	/**
	 * @author Hans.Marquez
	 * @description: Handle with random PopUps available in DashBoard Screen.
	 */
	public LoginScreen goToLoginScreen() {
		alertControl();
		click(signInButton);
		return new LoginScreen(driver);
	}


	/**
	 * Alert control.
	 */
	@Override
	public void alertControl() {
		int retries = 0;
		while (retries < 3) {
			if (alertsPopUps.isDisplayed() == true) {
				click(alertsPopUps, 3);
				retries++;
			}
		}
	}

	//Test 1: Privacidad de datos
	public void checkColombia() {
		click(colombiaOption);
	}

	public void tapConfirm() {
		click(confirmButton);
	}

	public void acceptDataPrivacyPolicies() {
		click(acceptDataPrivacyPoliciesButton);
	}

	//Test 2: Seleccionar fechas del 1 al 5 de Octubre en Cartagena
	public AndroidElement getSearchInput() {
		return searchInput;
	}

	public AndroidElement getEditableSearchInput() {
		return editableSearchInput;
	}

	public void goToChooseADateRage() {
		cartagenaOption.click();
	}

	public void selectADateRange() {
		scrollDown(2);
		click(startDate);
		click(endDate);
	}
	public void confirmSearch(){
		click(confirmDateButton);
	}




	//Test 3
	public boolean areAllFourBottomButtonsDisplayed(){
		if(
				isElementAvailable(homeButton) &
						isElementAvailable(discoverButton) &
						isElementAvailable(favoritesButton) &
						isElementAvailable(settingsButton)
		){
			return true;
		}else{
			return false;
		}
	}

	//Test4
	public void openConfiguration(){
		click(configurationButton);
	}
	public void clickSettingsButton(){
		click(getSettingsButton);
	}
	public void clickFacebookCheckbox(){
		click(facebookCheckbox);
	}
	public void clickSaveButton(){
		click(saveButton);
	}


	@HowToUseLocators(androidAutomation = ALL_POSSIBLE)
	//Test1
	@AndroidFindBy(uiAutomator="UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().className(\"android.view.ViewGroup\").index(22))")
	private AndroidElement colombiaOption;
	@AndroidFindBy(uiAutomator = "UiSelector().resourceId(\"com.trivago:id/activityPlatformSelectionConfirmButton\")")
	private AndroidElement confirmButton;
	/*@AndroidFindBy(id = "com.trivago:id/activityCookieConsentContentTitleTextView")
	private AndroidElement privacyPoliciesTitle;*/
	@AndroidFindBy(id = "com.trivago:id/activityCookieConsentContentAcceptButton")
	private AndroidElement acceptDataPrivacyPoliciesButton;

	//Test 2
	@AndroidFindBy(id = "com.trivago:id/fragmentHomeExpandedDealformDestinationTextView")
	private AndroidElement searchInput;
	@AndroidFindBy(id = "com.trivago:id/activitySearchDestinationSearchEditText")
	private AndroidElement editableSearchInput;
	@AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"Cartagena\").resourceIdMatches(\".*searchDestinationTitleTextView\")")
	private AndroidElement cartagenaOption;
	@AndroidFindBy(id = "com.trivago:id/fragmentHomeExpandedDealformSearchTextView")
	private AndroidElement searchButton;
	@AndroidFindBy(id = "com.trivago:id/fragmentHotelSearchResultsExpandedDealformDestinationTextView")
	private AndroidElement searchResultsInput;
	@AndroidFindBy(id = "com.trivago:id/fragmentHotelSearchResultsExpandedDealformCalendarTextView")
	private AndroidElement selectedDateRange;
	@AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"Seleccionar fechas\")")
	private AndroidElement dateSelection;
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ListView/android.widget.LinearLayout[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout[2]")
	private AndroidElement startDate;
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ListView/android.widget.LinearLayout[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout[6]")
	private AndroidElement endDate;
	@AndroidFindBy(id = "com.trivago:id/activityDatesSelectionCalendarApplyTextView")
	private AndroidElement confirmDateButton;

	//Test 3
	@AndroidFindBy(id = "com.trivago:id/action_home")
	private AndroidElement homeButton;
	@AndroidFindBy(id = "com.trivago:id/action_discover")
	private AndroidElement discoverButton;
	@AndroidFindBy(id = "com.trivago:id/action_favourites")
	private AndroidElement favoritesButton;
	@AndroidFindBy(id = "com.trivago:id/action_settings")
	private AndroidElement settingsButton;


	//Test 4
	@AndroidFindBy(id = "com.trivago:id/action_settings")
	private AndroidElement configurationButton;
	@AndroidFindBy(id = "com.trivago:id/fragmentSettingsManageMyDataTextView")
	private AndroidElement getSettingsButton;
	//@AndroidFindBy(id = "com.trivago:id/activityDataManagerTitleTextView")
	//private AndroidElement dataManagerTitle;
	@AndroidFindBy(id = "com.trivago:id/activityDataManagerFacebookCheckbox")
	private AndroidElement facebookCheckbox;
	@AndroidFindBy(id = "com.trivago:id/activityDataManagerSaveButton")
	private AndroidElement saveButton;
}

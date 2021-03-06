package screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.HowToUseLocators;
import static io.appium.java_client.pagefactory.LocatorGroupStrategy.*;
import util.screens.BaseScreen;


/**
 * Object of the first screen that appears when we open the application.
 * 
 * @author Arley.Bolivar
 *
 */

public class TutorialScreen extends BaseScreen {

	/**
	 * Constructor method.
	 *
	 * @author Arley.Bolivar
	 * @param driver the driver
	 */
	public TutorialScreen(AndroidDriver<AndroidElement> driver) {
		super(driver);
	}

	// AndroidElements
	@HowToUseLocators(androidAutomation = ALL_POSSIBLE)
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageButton\").descriptionContains(\"Close\")") 
    @AndroidFindBy(uiAutomator = "new UiSelector().classNameMatches(\".*Button.*\")")
    private AndroidElement alertsPopUps;
	

	/**
	 * @author Hans.Marquez
	 *
	 * @description: Returns the DashBoard screen after after handling
	 *               popUps.
	 *
	 * @return DashBoardScreen
	 */
	public DashBoardScreen handleAlerts() {
		alertControl();
		return new DashBoardScreen(driver);
	}
	

	/**
	 * Alert control.
	 */
	@Override
	public void alertControl() {
		click(alertsPopUps);
	}

}

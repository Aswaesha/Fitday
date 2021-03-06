package tests;

import org.testng.annotations.Test;
import utils.AllureUtils;


import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class LogNavbarTest extends BaseTest {
    @Test(description = "Add food in dashboard")
    public void addFoodAtDashboard(){
        loginPage.open();
        loginPage.login(username, password);

        logNavbarPage.clickAddFoodButton();
        logNavbarPage.inputFoodText();
        logNavbarPage.clickPlusListButton();

        assertEquals(logNavbarPage.checkFoodTable(), "Apple, raw", "Food not found");
        driver.manage().deleteAllCookies();
        AllureUtils.takeScreenshot(driver);
    }

    @Test(description = "Add activity at dashboard")
    public void addActivityAtDashboard() {
        loginPage.open();
        loginPage.login(username, password);

        logNavbarPage.clickAddActivityButton();
        logNavbarPage.inputActivityText();

        logNavbarPage.clickPlusActivityButton();
        logNavbarPage.clickAddToActivityLogButton();

        assertEquals(logNavbarPage.checkActivityTable(), "fast ballroom dancing", "Activity not found");
        driver.manage().deleteAllCookies();
        AllureUtils.takeScreenshot(driver);
    }

    @Test(description = "Change weight data")
    public void changeWeight(){
        loginPage.open()
                .login(username, password);

        logNavbarPage.open("/app/log/weight");

        logNavbarPage.clickEditButton();
        logNavbarPage.clickInput();

        logNavbarPage.inputWeightText();
        logNavbarPage.clickSaveButton();


        assertEquals(logNavbarPage.checkoutWeight(), "109.0 lbs", "Weight is not correct");
        driver.manage().deleteAllCookies();
        AllureUtils.takeScreenshot(driver);
    }

    @Test(description = "Check popup")
    public void checkPopUp(){
        loginPage.open()
                .login(username, password);

        logNavbarPage.open("/app/log/stats");

        logNavbarPage.clickDropdown();
        logNavbarPage.clickDropdownValue();
        logNavbarPage.clickPlusButton();

        assertTrue(logNavbarPage.checkoutPopup(), "Popup is not displayed");
        AllureUtils.takeScreenshot(driver);
    }

    @Test(description = "Add mood at diary")
    public void addMoodInDiary() {
        loginPage.open()
                .login(username, password);

        logNavbarPage.open("/app/log/diary");

        logNavbarPage.clickEditGreyButton();
        logNavbarPage.inputMoodText();
        logNavbarPage.clickSaveButton();

        assertEquals(logNavbarPage.checkoutTextMood(), "I am happy", "Mood is not add");
        driver.manage().deleteAllCookies();
        AllureUtils.takeScreenshot(driver);
    }
}

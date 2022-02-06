//package tests;
//
//import org.testng.annotations.Test;
//import utils.AllureUtils;
//
//import static org.testng.Assert.assertEquals;
//import static org.testng.Assert.assertTrue;
//
//public class ForumsNavbarTest extends BaseTest {
//    @Test(description = "Open forums across Navbar")
//    public void clickForumNavbar() {
//        loginPage.open()
//                .login(username, password);
//
//        homePage.isPageOpen();
//
//        navbarPage.clickOnNavbar("FORUMS");
//
//        assertTrue(forumsNavbarPage.isPageOpen(), "Forums page is not open");
//        AllureUtils.takeScreenshot(driver);
//    }
//
//    @Test(description = "Open forum page across navbar forums home")
//    public void clickForumsHomeNavbar() {
//        loginPage.open()
//                .login(username, password);
//
//        homePage.isPageOpen();
//
//        navbarPage.selectMenuOption("FORUMS", "HOME");
//
//        assertEquals(forumsNavbarPage.checkoutTitleDiscussionBoards(), "FitDay Discussion Boards","Forums page is not open");
//        AllureUtils.takeScreenshot(driver);
//    }
//}

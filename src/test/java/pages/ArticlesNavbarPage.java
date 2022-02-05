package pages;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

@Log4j2
public class ArticlesNavbarPage extends BasePage {
    public static final By ARTICLES_BUTTON_NAVBAR = By.xpath("//div[@id='menu']/ul//li//a/span[text()='ARTICLES']");
    public static final By ARTICLES_FITNESS_BUTTON_NAVBAR = By.xpath("//div[@id='menu']/div//ul/li//a[text()='FITNESS']");
    public static final By ARTICLES_NUTRITION_BUTTON_NAVBAR = By.xpath("//div[@id='menu']/div//ul[4]/li//a[text()='NUTRITION']");
    public static final By ARTICLES_HOME_BUTTON_NAVBAR = By.xpath("//div[@id='menu']/div//ul/li//a[text()='HOME']");
    public static final String MAIN_ITEM_NAVBAR = "//a[span[text()='%s']]";
    public static final String SIDE_ITEM_BUTTON_NAVBAR = "//ul[contains(@style, 'block')]/li//a[text()='%s']";

    @Step("click on articles fitness navbar")
    public void selectMenuOption(String firstMenuOption, String secondMenuOption) {
        log.info("click start");
        Actions action = new Actions(driver);
        WebElement we = driver.findElement(By.xpath(String.format(MAIN_ITEM_NAVBAR, firstMenuOption)));
        action.moveToElement(we).build().perform();
        log.info("navig on articles navbar");
        driver.findElement(By.xpath(String.format(SIDE_ITEM_BUTTON_NAVBAR, secondMenuOption))).click();
        log.info("click on articles navbar");
    }

//    @Step("click on articles navbar")
//    public void clickOnArticlesNavbar() {
//        driver.findElement(ARTICLES_BUTTON_NAVBAR).click();
//        log.info("click on articles navbar");
//    }



//    @Step("click on articles fitness navbar")
//    public void clickOnArticlesFitnessNavbar() {
//        log.info("click start");
//        Actions action = new Actions(driver);
//        WebElement we = driver.findElement(ARTICLES_BUTTON_NAVBAR);
//        action.moveToElement(we).build().perform();
//        driver.findElement(ARTICLES_FITNESS_BUTTON_NAVBAR).click();
//        log.info("click on articles navbar");
//    }
//
//    @Step("click on articles nutrition navbar")
//    public void clickOnArticlesNutritionNavbar() {
//        Actions action = new Actions(driver);
//        WebElement we = driver.findElement(ARTICLES_BUTTON_NAVBAR);
//        action.moveToElement(we).build().perform();
//        driver.findElement(ARTICLES_NUTRITION_BUTTON_NAVBAR).click();
//        log.info("click on articles navbar");
//    }
//
//    @Step("click on articles home navbar")
//    public void clickOnArticlesHomeNavbar() {
//        Actions action = new Actions(driver);
//        WebElement we = driver.findElement(ARTICLES_BUTTON_NAVBAR);
//        action.moveToElement(we).build().perform();
//        driver.findElement(ARTICLES_HOME_BUTTON_NAVBAR).click();
//        log.info("click on articles navbar");
//    }

    @Step("check title after click on fitness in article navbar")
    public boolean checkoutTitle() {
        return driver.findElement(TITLE_CATEGORIES).isDisplayed();
    }

    public ArticlesNavbarPage(WebDriver driver) {
        super(driver);
    }

//    @Override
//    public boolean isPageOpen() {
//        return isExist(FITNESS_BUTTON);
//    }
//}
@Override
public boolean isPageOpen() {
    return false;
}
}
package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.*;


import java.util.concurrent.TimeUnit;

public class BaseTest {
    WebDriver driver;
    String username, password;

    LoginPage loginPage;
    SingUpPage singUpPage;
    SingUpModalPage singUpModalPage;
    LogoPage logoPage;
    SearchPage searchPage;
    MainPage mainPage;

    @BeforeMethod(alwaysRun = true)
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");

        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        username = System.getenv().getOrDefault("QASE_USERNAME", utils.PropertyReader.getProperty("fitDay.username"));
        password = System.getenv().getOrDefault("QASE_PASSWORD", utils.PropertyReader.getProperty("fitDay.password"));

        loginPage = new LoginPage(driver);
        singUpPage = new SingUpPage(driver);
        singUpModalPage = new SingUpModalPage(driver);
        logoPage = new LogoPage(driver);
        searchPage = new SearchPage(driver);
        mainPage = new MainPage(driver);
//        //private static final Cookie COOKIE = new Cookie("usprivacy", "1---", ".fitday.com");
//        WebDriver driver = new ChromeDriver(options);
//        driver.manage().addCookie(COOKIE);
    }


    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        driver.quit();
    }
}

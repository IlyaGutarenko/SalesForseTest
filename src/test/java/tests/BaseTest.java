package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.*;
import pages.*;
import pages.Account.AccountDetailsPage;
import pages.Account.AccountListPage;
import pages.Account.NewAccountPage;
import pages.Contacts.ContactsDetailsPage;
import pages.Contacts.ContactsListPage;
import pages.Contacts.NewContactsPage;
import utils.Listener;


import java.util.concurrent.TimeUnit;

import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;

@Listeners(Listener.class)
public class BaseTest {

    WebDriver driver;
    LoginPage loginPage;
    HomePage homePage;
    AccountListPage accountListPage;
    NewAccountPage newAccountPage;
    AccountDetailsPage accountDetailsPage;
    ContactsListPage contactsListPage;
    NewContactsPage newContactsPage;
    ContactsDetailsPage contactsDetailsPage;


    @BeforeTest
    @Parameters({"browser"})
    public void setUp(@Optional("chrome") String browser) {
        if (browser.equals("chrome")) {
            chromedriver().setup();
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--start-maximized");
//            options.addArguments("--headless");
            driver = new ChromeDriver(options);
        } else {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        }




        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
        accountListPage = new AccountListPage(driver);
        newAccountPage = new NewAccountPage(driver);
        accountDetailsPage = new AccountDetailsPage(driver);
        contactsListPage = new ContactsListPage(driver);
        newContactsPage = new NewContactsPage(driver);
        contactsDetailsPage = new ContactsDetailsPage(driver);
    }

    @AfterTest(alwaysRun = true)
    public void tearDown() {
        driver.quit();
    }

}

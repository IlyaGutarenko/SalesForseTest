package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public abstract class BasePage {

    public static final By NEW_BUTTON = By.xpath("//div[@title='New']");
    public static final By SAVE_BUTTON = By.xpath("//button[@title='Save']");
    public static final By DETAILS_TAB = By.xpath("//li[@data-tab-value='detailTab']");
    public String URL = "https://gutarenkocompany.lightning.force.com";

    public WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public abstract boolean isPageOpen();

    protected boolean isExist(By locator) {
        try {
            return driver.findElement(locator).isDisplayed();
        } catch (NoSuchElementException ex) {
            System.out.println(">>>>>>>>>>>>> Page is not loaded");
            return false;
        }
    }
}

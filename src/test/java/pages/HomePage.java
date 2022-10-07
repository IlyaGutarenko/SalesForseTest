package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }


    public static final By HOME_TITLE = By.xpath("//nav[@role='navigation']//span[text()='Home']");

    @Override
    public boolean isPageOpen() {
        return isExist(HOME_TITLE);
    }








}

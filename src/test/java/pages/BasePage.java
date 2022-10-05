package pages;


import org.openqa.selenium.WebDriver;

public abstract class BasePage {
    String URL = "https://login.salesforce.com/";

    WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

}

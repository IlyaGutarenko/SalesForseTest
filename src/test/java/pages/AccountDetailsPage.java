package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountDetailsPage extends BasePage {

    public AccountDetailsPage(WebDriver driver) {
        super(driver);
    }

    String fieldValueLocatorByText = "//records-lwc-detail-panel//span[text()='%s']/ancestor::records-record-layout-item//lightning-formatted-text";
    String fieldValueLocatorByUrl = "//records-lwc-detail-panel//span[text()='%s']/ancestor::records-record-layout-item//lightning-formatted-url";
    String fieldValueLocatorByNumber = "//records-lwc-detail-panel//span[text()='%s']/ancestor::records-record-layout-item//lightning-formatted-phone";
    public static final By DETAILS_TAB = By.xpath("//li[@data-tab-value='detailTab']");

    public String getTextByTextByField(String fieldName){
        return driver.findElement(By.xpath(String.format(fieldValueLocatorByText, fieldName))).getText();
    }

    public String getTextByUrlByField(String fieldName){
        return driver.findElement(By.xpath(String.format(fieldValueLocatorByUrl, fieldName))).getText();
    }

    public String getTextByNumberByField(String fieldName){
        return driver.findElement(By.xpath(String.format(fieldValueLocatorByNumber, fieldName))).getText();
    }

    @Override
    public boolean isPageOpen() {
        return isExist(DETAILS_TAB);
    }

    public AccountDetailsPage openDetails(){
        driver.findElement(DETAILS_TAB).click();
        return this;
    }
}

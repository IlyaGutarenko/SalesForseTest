package pages;

import elements.DropDown;
import elements.Input;
import elements.TextArea;
import model.Account;
import org.openqa.selenium.WebDriver;

public class NewAccountPage extends BasePage {

    public NewAccountPage(WebDriver driver) {
        super(driver);
    }

    public boolean isPageOpen() {
        return false;
    }

    public AccountDetailsPage create(Account account) {
        new Input(driver, "Account Name").write(account.getAccountName());
        new Input(driver, "Website").write(account.getWebsite());
        new Input(driver, "Phone").write(account.getPhone());
        new Input(driver, "Employees").write(account.getEmployees());
        new Input(driver, "Billing City").write(account.getBillingCity());
        new Input(driver, "Billing State/Province").write(account.getBillingStateProvince());
        new Input(driver, "Billing Zip/Postal Code").write(account.getBillingZipPostalCode());
        new Input(driver, "Billing Country").write(account.getBillingCountry());
        new Input(driver, "Shipping City").write(account.getShippingCity());
        new Input(driver, "Shipping State/Province").write(account.getShippingStateProvince());
        new Input(driver, "Shipping Zip/Postal Code").write(account.getShippingZipPostalCode());
        new Input(driver, "Shipping Country").write(account.getShippingCountry());
        new TextArea(driver, "Description").writeTextArea(account.getDescription());
        new TextArea(driver, "Billing Street").writeTextArea(account.getBillingStreet());
        new TextArea(driver, "Shipping Street").writeTextArea(account.getShippingStreet());
        new DropDown(driver,"Industry").selectOptionsAccount(account.getIndustry());
        new DropDown(driver, "Type").selectOptionsAccount(account.getType());

        return clickSave();
    }

    public AccountDetailsPage clickSave() {
        driver.findElement(SAVE_BUTTON).click();
        return new AccountDetailsPage(driver);
    }
}

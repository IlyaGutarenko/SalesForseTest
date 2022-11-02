package pages.Account;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class AccountListPage extends BasePage {

    public static final By ACCOUNT_TITLE = By.xpath("//span[@class='slds-var-p-right_x-small']");


    public AccountListPage(WebDriver driver) {
        super(driver);
    }

    public boolean isPageOpen() {
        return isExist(ACCOUNT_TITLE);
    }

    //логинимся
    //перейти в аккаунт
    public AccountListPage open() {
        driver.get(URL + "/lightning/o/Account/list?filterName=Recent");
        return this;
    }

    //нажать кнопку NEW
    public NewAccountPage clickButtonNew() {
        driver.findElement(NEW_BUTTON).click();
        return new NewAccountPage(driver);
    }
    //заполнить поля
    //нажать кнопку SAVE

}
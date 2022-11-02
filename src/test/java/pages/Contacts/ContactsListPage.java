package pages.Contacts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class ContactsListPage extends BasePage {

    public static final By CONTACTS_TITLE = By.xpath("//span[@class='slds-var-p-right_x-small']");

    public ContactsListPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpen() {
        return isExist(CONTACTS_TITLE);
    }


    //перейти в аккаунт
    public ContactsListPage open(){
        driver.get(URL + "/lightning/o/Contact/list?filterName=Recent");
        return this;
    }
    //нажать кнопку New
    public NewContactsPage clickButtonNew() {
        driver.findElement(NEW_BUTTON).click();
        return new NewContactsPage(driver);
    }





}

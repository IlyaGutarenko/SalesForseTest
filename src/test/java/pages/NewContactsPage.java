package pages;

import elements.Input;
import model.Contacts;
import org.openqa.selenium.WebDriver;

public class NewContactsPage extends BasePage {

    public NewContactsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpen() {
        return false;
    }

    public ContactsDetailsPage createContacts(Contacts contacts){
        new Input(driver,"First Name").writeContacts(contacts.getAccountName());
        new Input(driver,"Middle Name").writeContacts(contacts.getMiddleName());


        return clickSave();
    }

    public ContactsDetailsPage clickSave(){
        driver.findElement(SAVE_BUTTON).click();
        return new ContactsDetailsPage(driver);
    }
}

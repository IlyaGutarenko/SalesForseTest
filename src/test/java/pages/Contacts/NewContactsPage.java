package pages.Contacts;

import elements.DropDown;
import elements.Input;
import elements.TextArea;
import model.Contacts;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class NewContactsPage extends BasePage {

    public NewContactsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpen() {
        return false;
    }

    public ContactsDetailsPage createContacts(Contacts contacts){
        new Input(driver,"First Name").writeContacts(contacts.getFirstName());
        new Input(driver,"Middle Name").writeContacts(contacts.getMiddleName());
        new Input(driver,"Last Name").writeContacts(contacts.getLastName());
        new Input(driver,"Suffix").writeContacts(contacts.getSuffix());
        new Input(driver,"Title").writeContacts(contacts.getTitle());
        new Input(driver,"Email").writeContacts(contacts.getEmail());
        new Input(driver,"Phone").writeContacts(contacts.getPhone());
        new Input(driver,"Mobile").writeContacts(contacts.getMobile());
        new Input(driver,"Department").writeContacts(contacts.getDepartment());
        new TextArea(driver,"Mailing Street").writeContactsTextArea(contacts.getMailingStreet());
        new Input(driver,"Mailing City").writeContacts(contacts.getMailingCity());
        new Input(driver,"Mailing Zip/Postal Code").writeContacts(contacts.getMailingZipPostalCode());
        new Input(driver,"Mailing State/Province").writeContacts(contacts.getMailingStateProvince());
        new Input(driver,"Mailing Country").writeContacts(contacts.getMailingCountry());
        new DropDown(driver,"Salutation").selectOptionsContacts(contacts.getSalutation());
        new DropDown(driver,"Account Name").selectOptionsContacts(contacts.getAccountName());


        return clickSave();
    }

    public ContactsDetailsPage clickSave(){
        driver.findElement(SAVE_BUTTON).click();
        return new ContactsDetailsPage(driver);
    }
}

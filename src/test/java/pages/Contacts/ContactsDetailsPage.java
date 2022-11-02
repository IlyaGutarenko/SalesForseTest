package pages.Contacts;

import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class ContactsDetailsPage extends BasePage {

    public ContactsDetailsPage(WebDriver driver) {
        super(driver);
    }



    @Override
    public boolean isPageOpen() {
        return isExist(DETAILS_TAB);
    }

    public ContactsDetailsPage openDetails(){
        driver.findElement(DETAILS_TAB).click();
        return this;
    }
}

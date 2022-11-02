package tests;

import model.Account;
import model.Contacts;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ContactsTest extends BaseTest {

    @Test
    public void contactsShouldBeCreated(){
        loginPage
                .open()
                .authorization("ilya2007.91-v5an@force.com", "alidi12345");
                boolean contactsListPageIsOpen = contactsListPage
                        .open()
                        .isPageOpen();
        assertTrue(contactsListPageIsOpen,"Страница ContactsList не открылась");
        Contacts contacts = new Contacts("Dr.","Ilya","Zel","Gut", "ig", "Zel",
                "Hello", "test@test.ru", "+11111", "+22222", "LA", "123", "DSK", "Vit",
                "12345", "V", "Bel");
        contactsListPage
                .open()
                .clickButtonNew()
                .createContacts(contacts);
//                .openDetails();


    }

}

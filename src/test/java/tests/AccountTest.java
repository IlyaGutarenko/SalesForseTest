package tests;

import model.Account;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class AccountTest extends BaseTest {

    @Test
    public void accountShouldBeCreated() {
        loginPage.open()
                .authorization("ilya2007.91-v5an@force.com", "alidi12345");
        boolean accountListPageIsOpen = accountListPage
                .open()
                .isPageOpen();
        assertTrue(accountListPageIsOpen, "Страница AccountList не открылась");
        Account account = new Account("Zel", "www", "+1111111", "2", "Витебск", "Витебск",
                "123", "Bel", "Minsk", "Min", "321", "Bel",
                "Hello", "test", "test", "Media",  "Press");
        accountListPage.open()
                .clickButtonNew()
                .create(account)
                .openDetails();

        assertEquals(account.getAccountName(),accountDetailsPage.getTextByTextByField("Account Name"));
        assertEquals(account.getType(),accountDetailsPage.getTextByTextByField("Type"));
        assertEquals(account.getWebsite(),accountDetailsPage.getTextByUrlByField("Website"));
//        assertEquals(account.getPhone(),accountDetailsPage.getTextByNumberByField("Phone"));
//        assertEquals(account.getEmployees(),accountDetailsPage.getTextByNumberByField("Employees"));
//        assertEquals(account.getBillingCity(),accountDetailsPage.getTextByTextByField("Billing City"));
//        assertEquals(account.getBillingStateProvince(),accountDetailsPage.getTextByTextByField("Billing State/Province"));
//        assertEquals(account.getBillingZipPostalCode(),accountDetailsPage.getTextByTextByField("Billing Zip/Postal Code"));
//        assertEquals(account.getBillingCountry(),accountDetailsPage.getTextByTextByField("Billing Country"));
//        assertEquals(account.getShippingCity(),accountDetailsPage.getTextByTextByField("Shipping City"));
//        assertEquals(account.getShippingStateProvince(),accountDetailsPage.getTextByTextByField("Shipping State/Province"));
//        assertEquals(account.getShippingZipPostalCode(),accountDetailsPage.getTextByTextByField("Shipping Zip/Postal Code"));
//        assertEquals(account.getShippingCountry(),accountDetailsPage.getTextByTextByField("Shipping Country"));
//        assertEquals(account.getBillingStreet(),accountDetailsPage.getTextByTextByField("Billing Street"));
//        assertEquals(account.getShippingStreet(),accountDetailsPage.getTextByTextByField("Shipping Street"));
        assertEquals(account.getIndustry(),accountDetailsPage.getTextByTextByField("Industry"));

    }
}

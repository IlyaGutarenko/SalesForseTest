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
                "Hello", "test", "test");
        accountListPage.open()
                .clickButtonNew()
                .create(account);
    }
}

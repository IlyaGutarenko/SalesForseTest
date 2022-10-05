package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class LoginTest extends BaseTest {


    @Test
    public void loginTest() {
        loginPage.open()
                .authorization("ilya2007.91-v5an@force.com", "alidi12345");

        assertTrue(homePage.isPageOpen());
    }

}

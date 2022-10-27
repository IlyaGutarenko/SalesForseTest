package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Input {

    public Input(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

    WebDriver driver;
    String label;
    String inputIntoAccountLocator = "//div[contains(@class, 'modal-body')]//span[text() = '%s']/ancestor::div[contains(@class, 'uiInput')]//input";
    String inputIntoContactsLocator = "//div[contains(@class, 'modal-body')]//span[text()='%s']/ancestor::div[contains(@class, 'slds-form-element__control')]//input";


    public void write(String text) {
        driver.findElement(By.xpath(String.format(inputIntoAccountLocator, this.label))).sendKeys(text);

    }

    public void writeContacts(String text) {
        driver.findElement(By.xpath(String.format(inputIntoContactsLocator, this.label))).sendKeys(text);

    }
}

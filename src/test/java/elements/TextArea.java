package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TextArea {
    WebDriver driver;
    String label;
    String textAreaAccountLocator = "//div[contains(@class, 'modal-body')]//span[text() = '%s']/ancestor::div[contains(@class, 'uiInput')]//textarea";
    String textAreaContactsLocator = "//div[contains(@class, 'modal-body')]//span[text()='%s']/ancestor::div[contains(@class, 'slds-form-element__control')]//textarea";

    public TextArea(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

    public void writeTextArea(String text) {
        driver.findElement(By.xpath(String.format(textAreaAccountLocator, this.label))).sendKeys(text);
    }
    public void writeContactsTextArea(String text) {
        driver.findElement(By.xpath(String.format(textAreaContactsLocator, this.label))).sendKeys(text);
    }
}

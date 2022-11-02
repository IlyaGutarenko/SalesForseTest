package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TextArea {

    public TextArea(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

    WebDriver driver;
    String label;
    String textAreaAccountLocator = "//div[contains(@class, 'modal-body')]//span[text() = '%s']/ancestor::div[contains(@class, 'uiInput')]//textarea";
    String textAreaContactsLocator = "//div[contains(@class, 'modal-body')]//label[text()='%s']/ancestor::lightning-textarea[contains(@class, 'slds-form-element')]//textarea";



    public void writeTextArea(String text) {
        driver.findElement(By.xpath(String.format(textAreaAccountLocator, this.label))).sendKeys(text);
    }

    public void writeContactsTextArea(String text) {
        driver.findElement(By.xpath(String.format(textAreaContactsLocator, this.label))).sendKeys(text);
    }
}

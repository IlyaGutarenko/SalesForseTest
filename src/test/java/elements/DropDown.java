package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DropDown {

    WebDriver driver;
    String label;
    String inputIntoAccountLocator = "//div[contains(@class, 'modal-body')]//span[text() = '%s']/ancestor::div[contains(@class, 'uiInput')]//div[@class='uiMenu']";
    String optionLocator = "//div[contains(@class,'visible')]//a[text()='%s']";

    public DropDown(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }
    public void selectOptionsAccount(String option){
        driver.findElement(By.xpath(String.format(inputIntoAccountLocator, this.label))).click();
        driver.findElement(By.xpath(String.format(optionLocator,option))).click();
    }
}
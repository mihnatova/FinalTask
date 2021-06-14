package AmazonPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SettingsPage extends BasePage{

    private static final String CURRENCY_SETTINGS_DROPDOWN_BUTTON = "//span[@id='a-autoid-0-announce']";
    private static final String AUSTRALIAN_DOLLAR_BUTTON = "//a[@id='icp-sc-dropdown_6']";
    private static final String SAVE_CHANGES_BUTTON = "//input[@class='a-button-input']";

    public SettingsPage(WebDriver driver) {
        super(driver);
    }

    public void clickCurrencySettingsDropdownButton(){
        driver.findElement(By.xpath(CURRENCY_SETTINGS_DROPDOWN_BUTTON)).click();
    }

    public void clickAustralianDollarCurrencyButton(){
        driver.findElement(By.xpath(AUSTRALIAN_DOLLAR_BUTTON)).click();
    }

    public void clickSaveChangesButton(){
        driver.findElement(By.xpath(SAVE_CHANGES_BUTTON)).click();
    }
}

package AmazonPagesTests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SettingsTests extends BaseTests{

    private static final String SEARCH_KEYWORD = "laptop";
    private static final String CURRENCY_VALUE_AFTER_CHANGE = "//span[@class='a-price-symbol']";

    @Test
    public void checkCurrencyIsInAustralianDollars(){
        getHomePage().clickUSAFlagButtonOnheader();
        getSettingPage().clickCurrencySettingsDropdownButton();
        getSettingPage().clickAustralianDollarCurrencyButton();
        getSettingPage().clickSaveChangesButton();
        getHomePage().searchByKeyWord(SEARCH_KEYWORD);
        Assert.assertEquals(getLaptopPage().searchResultsAfterCurrencyChangeCount(), 20);
    }
}

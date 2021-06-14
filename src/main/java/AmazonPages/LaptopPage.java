package AmazonPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class LaptopPage extends BasePage{

    private static final String FOUR_PLUS_STARS_RATING_BUTTON = "//i[@class='a-icon a-icon-star-medium a-star-medium-4']";
    private static final String RATING_SEARCH_RESULTS_LIST = "//i[@class='a-icon a-icon-star-small a-star-small-4 aok-align-bottom']";
    private static final String CURRENCY_VALUE_AFTER_CHANGE = "//span[@class='a-price-symbol']";


    public LaptopPage(WebDriver driver) {
        super(driver);
    }

    public void clickOnFourPlusStarsRatingButton(){
        driver.findElement(By.xpath(FOUR_PLUS_STARS_RATING_BUTTON)).click();
    }

    public List<WebElement> getRatingSearchResultsList(){
        return driver.findElements(By.xpath(RATING_SEARCH_RESULTS_LIST));
    }

    public int ratingSearchResultsCount(){
        return getRatingSearchResultsList().size();
    }

    public List<WebElement> getSearchResultsListAfterCurrencyChange(){
        return driver.findElements(By.xpath(CURRENCY_VALUE_AFTER_CHANGE));
    }

    public int searchResultsAfterCurrencyChangeCount(){
        return getSearchResultsListAfterCurrencyChange().size();
    }

}

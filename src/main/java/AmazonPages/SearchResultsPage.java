package AmazonPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SearchResultsPage extends BasePage{

    private static final String SEARCH_RESULTS_PRODUCTS_LIST = "//h2[@class='a-size-mini a-spacing-none a-color-base s-line-clamp-2']";

    public SearchResultsPage(WebDriver driver) {
        super(driver);
    }

    public List<WebElement> getSearchResultsList(){
        return driver.findElements(By.xpath(SEARCH_RESULTS_PRODUCTS_LIST));
    }

    public int searchResultsCount(){
        return getSearchResultsList().size();
    }
}

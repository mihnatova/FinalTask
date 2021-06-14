package AmazonPagesTests;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchTests extends BaseTests{

    private static final String SEARCH_KEYWORD = "laptop";
    private static final String EXPECTED_SEARCH_QUERY = "s?k=laptop";

    @Test
    public void checkThatUrlContainsSearchQuery(){
        getHomePage().searchByKeyWord(SEARCH_KEYWORD);
        Assert.assertTrue(getDriver().getCurrentUrl().contains(EXPECTED_SEARCH_QUERY));
    }

    @Test
    public void checkElementsAmountOnSearchPage(){
        getHomePage().searchByKeyWord(SEARCH_KEYWORD);
        Assert.assertEquals(getSearchResultsPage().searchResultsCount(), 27);
    }

    @Test
    public void checkThatSearchResultsAreRatedWithAtLeastFourStars(){
        getHomePage().searchByKeyWord(SEARCH_KEYWORD);
        getLaptopPage().clickOnFourPlusStarsRatingButton();
        Assert.assertEquals(getLaptopPage().ratingSearchResultsCount(), 5);
    }

}

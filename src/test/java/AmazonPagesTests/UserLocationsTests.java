package AmazonPagesTests;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class UserLocationsTests extends BaseTests{

    @Test
    public void checkUserLocationChanged(){
        getHomePage().clickAllItemsButton();
        getHomePage().waitForVisibilityOfElement(30, getHomePage().getUserLocationButton());
        getHomePage().clickUserLocationButton();
        getUserLocationPage().clickUserlocationSelectionChangeButton();
        getUserLocationPage().clickUnitedKingdomUserLocationButton();
        getUserLocationPage().clickGoBackToWebsiteButton();
        getHomePage().clickUKFlagLocator();
    }

}

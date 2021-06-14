package AmazonPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserLocationPage extends BasePage{

    private static final String USER_LOCATION_SELECTION_CHANGE_BUTTON = "//span[@class = 'a-button-text a-declarative']";
    private static final String UNITED_KINGDOM_USER_LOCATION_BUTTON = "//span[contains(text(),'United Kingdom')]";
    private static final String GO_BACK_TO_WEBSITE_BUTTON = "//input[@class='a-button-input']";

    public UserLocationPage(WebDriver driver) {
        super(driver);
    }

    public void clickUserlocationSelectionChangeButton(){
        driver.findElement(By.xpath(USER_LOCATION_SELECTION_CHANGE_BUTTON)).click();
    }

    public void clickUnitedKingdomUserLocationButton(){
        driver.findElement(By.xpath(UNITED_KINGDOM_USER_LOCATION_BUTTON)).click();
    }

    public void clickGoBackToWebsiteButton(){
        driver.findElement(By.xpath(GO_BACK_TO_WEBSITE_BUTTON));
    }
}

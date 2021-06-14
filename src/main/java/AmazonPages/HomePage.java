package AmazonPages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    JavascriptExecutor js = (JavascriptExecutor) driver;

    private static final String SEARCH_INPUT = "//input[@id='twotabsearchtextbox']";
    private static final String ALL_ITEMS_BUTTON = "//a[@id='nav-hamburger-menu']";
    private static final String USER_LOCATION_BUTTON = "//a[@href='/gp/navigation-country/select-country/?ref_=nav_em_locale_0_1_1_38']"; //a[contains(text(),'United States')]
    private static final String UK_FLAG_LOCATOR = "//span[@class='icp-nav-flag icp-nav-flag-gb']";
    private static final String USA_FLAG_HEADER_BUTTON = "//a[@class='nav-a nav-a-2 icp-link-style-2']";
    private static final String CURRENCY_VALUE_AFTER_CHANGE = "//span[@class='a-price-symbol']";


    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void searchByKeyWord(final String keyword){
        driver.findElement(By.xpath(SEARCH_INPUT)).sendKeys(keyword, Keys.ENTER);
    }

    public void clickAllItemsButton(){
        driver.findElement(By.xpath(ALL_ITEMS_BUTTON)).click();
    }

    public By getUserLocationButton(){
        return By.id(USER_LOCATION_BUTTON);
    }

    public void clickUserLocationButton(){
        driver.findElement(By.xpath(USER_LOCATION_BUTTON)).click();
    }

    public void clickUKFlagLocator(){
        driver.findElement(By.xpath(UK_FLAG_LOCATOR));
    }

    public void clickUSAFlagButtonOnheader(){
        driver.findElement(By.xpath(USA_FLAG_HEADER_BUTTON)).click();
    }

}

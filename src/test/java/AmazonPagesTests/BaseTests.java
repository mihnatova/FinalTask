package AmazonPagesTests;

import AmazonPages.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;

public class BaseTests {

    private WebDriver driver;
    private static final String AMAZON_URL = "https://www.amazon.com/";

    @BeforeTest
    public void setUp() {
        chromedriver().setup();
    }

    @BeforeMethod
    public void testsSetUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(AMAZON_URL);
    }

    @AfterMethod
    public void tearDown(){
        driver.close();
    }

    public WebDriver getDriver() { return driver;}

    public HomePage getHomePage() { return new HomePage(getDriver());}

    public SearchResultsPage getSearchResultsPage() {return new SearchResultsPage(getDriver());}

    public LaptopPage getLaptopPage() {return new LaptopPage(getDriver());}

    public UserLocationPage getUserLocationPage() {return new UserLocationPage(getDriver());}

    public SettingsPage getSettingPage() {return new SettingsPage(getDriver());}
}

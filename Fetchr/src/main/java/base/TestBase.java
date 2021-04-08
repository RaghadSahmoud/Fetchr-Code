package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TestBase {

     public WebDriver driver;
    String BrowserName = "chrome";
    String Url = "http://track.fetchr.us/";

    @BeforeClass
    public void setUp() {
        if (BrowserName.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get(Url);
        } else if (BrowserName.equalsIgnoreCase("Firfox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
            driver.manage().window().maximize();
            driver.get(Url);
        }
    }

    @AfterClass(enabled = false)
    public void tearDown() {
        driver.quit();
    }
}

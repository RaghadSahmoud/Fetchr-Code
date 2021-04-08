package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class PageBase{
   public WebDriver driver;
    public PageBase(WebDriver driver){
        this.driver=driver;
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        PageFactory.initElements(driver,this);
        this.driver = driver;
        //This initElements method will create all WebElements
        PageFactory.initElements(driver, this);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
}

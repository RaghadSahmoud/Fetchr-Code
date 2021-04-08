package pages;

import base.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderHistoryPage extends PageBase {

    public OrderHistoryPage(WebDriver driver) {
        super(driver);

    }
    public WebElement ShipmentLabel = driver.findElement(By.xpath("//h4[contains(text(),'Shipment Activity')]"));

    @FindBy(css = "button.btn.btn-default.btn-style")
    WebElement ExitBtn;

    public void clickExit(){
        ExitBtn.click();
    }
}


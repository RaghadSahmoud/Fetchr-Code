package pages;

import base.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage extends PageBase {


    public HomePage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id ="tracking_id")
    WebElement SearchTextBox;
    WebElement SubmitButton = driver.findElement(By.id("search_submit"));

    public void insertOrderNumber (String orderNum){
        SearchTextBox.clear();
        SearchTextBox.sendKeys(orderNum);



    }
    public void clickSubmit(){
        SubmitButton.click();
    }
    @FindBy(how = How.ID,id="orderHistory")
    WebElement OrderHistoryLink;
    public void clickOrderHistory(){
        OrderHistoryLink.click();
    }



}

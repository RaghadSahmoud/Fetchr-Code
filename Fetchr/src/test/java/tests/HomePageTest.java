package tests;

import base.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.OrderHistoryPage;

public class HomePageTest extends TestBase {
   // WebDriverWait wait;
    HomePage homePage ;

    @DataProvider(name = "searchData")
    public Object [][] getData(){
        return new Object[][]
                {
                        {"34134180154194"},
                        {"34151904231797"},
                        {"34151732726730"},
                        {"34171168191850"},
                        {"34197984503777"}
                };
    }
    @Test(dataProvider = "searchData")
    public void UsercanSearchForOrder(String orderNum){
        homePage= new HomePage(driver);
        homePage.insertOrderNumber(orderNum);
        homePage.clickSubmit();
        homePage.clickOrderHistory();
        OrderHistoryPage orderHistoryPage = new OrderHistoryPage(driver);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(orderHistoryPage.ShipmentLabel));
        Assert.assertTrue(orderHistoryPage.ShipmentLabel.isDisplayed());
        orderHistoryPage.clickExit();




        //wait =new WebDriverWait(driver,20);
       // Assert.assertTrue(homePage.ShipElementLabel.isDisplayed());

    }
}

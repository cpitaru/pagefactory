package alltests.junittests.searchproducts;

import alltests.junittests.base.FunctionalTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SearchProducts;
import pages.UserPage;

import static org.testng.AssertJUnit.assertEquals;

public class SearchProductsTest extends FunctionalTest {
    @Test

    public void searchProducts() {
        LoginPage loginPage = new LoginPage(driver);

        loginPage.clickOnLoginDropdown();
        loginPage.enterEmailAddress("CosminTest.automation@gmail.com");
        loginPage.enterPassword("Automation123!");

        UserPage userPage = loginPage.clickLoginButton();
        userPage.clickSearchBar(driver);
        userPage.enterProductNameOnSearchBar(driver,"casti gaming razer");

        SearchProducts searchProducts = userPage.clickSearchButton(driver);
        assertEquals("Rezultate cautare", driver.findElement(By.xpath("/html/body/div/div[3]/main/div[2]/div[1]/div[1]/h1")).getText());
    }


}

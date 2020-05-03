package product;

import base.FunctionalTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import pages.*;

import static org.testng.AssertJUnit.assertEquals;

public class ProductTests extends FunctionalTest {

    @Test
    public void clickOnAProduct() {
        driver.get("https://altex.ro/");
        LoginPage loginPage = new LoginPage(driver);

        loginPage.clickOnLoginDropdown();
        loginPage.enterEmailAddress("CosminTest.automation@gmail.com");
        loginPage.enterPassword("Automation123!");

        UserPage userPage = loginPage.clickLoginButton();
        userPage.clickSearchBar(driver);
        userPage.enterProductNameOnSearchBar(driver,"casti gaming razer");

        SearchProducts searchProducts = userPage.clickSearchButton(driver);

        ProductPage productPage = searchProducts.clickOnProduct();
        assertEquals("Casti Gaming Wireless RAZER Nari, stereo, multiplatforma, dongle 2.4Ghz, 3.5mm, negru",
                driver.findElement(By.xpath("/html/body/div/div[3]/main/div/div[2]/div[1]/div[1]/div/div[1]/h1/div")).getText());
    }

}

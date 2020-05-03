package cart;

import base.FunctionalTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.*;

import static org.testng.AssertJUnit.assertEquals;

public class CartTests extends FunctionalTest {
    @Test
    public void addAProductToCart() {
        LoginPage loginPage = new LoginPage(driver);

        loginPage.clickOnLoginDropdown();
        loginPage.enterEmailAddress("CosminTest.automation@gmail.com");
        loginPage.enterPassword("Automation123!");

        UserPage userPage = loginPage.clickLoginButton();
        userPage.clickSearchBar(driver);
        userPage.enterProductNameOnSearchBar(driver, "casti gaming razer");

        SearchProducts searchProducts = userPage.clickSearchButton(driver);

        ProductPage productPage = searchProducts.clickOnProduct();
        productPage.addToCart();
        assertEquals("Produsul a fost adaugat in cosul de cumparaturi",
                driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/h2")).getText());
        CartPage cartPage = productPage.viewCart(driver);
        assertEquals("Cos",driver.findElement(By.xpath("/html/body/div/div[2]/main/div[3]/div/section/div/h2")).getText());
    }
}

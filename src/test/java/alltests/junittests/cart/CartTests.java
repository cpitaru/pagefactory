package alltests.junittests.cart;

import alltests.junittests.base.FunctionalTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.*;

import static org.testng.AssertJUnit.assertEquals;

public class CartTests extends FunctionalTest {
    @Test
    public void addAProductToCartAndCloseModalViewWithXButton() {
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
        productPage.closeModalView();
        productPage.clickOnUserDropdown();

        LogoutPage logoutPage = productPage.clickLogoutButton(driver);
        assertEquals("Vreau un cont nou",driver.findElement(By.xpath("//*[@id=\"__next\"]/div[3]/main/div[1]/h1")).getText());
//        productPage.backModalButton();
//        CartPage cartPage = productPage.viewCart(driver);
//        assertEquals("Cos",driver.findElement(By.xpath("/html/body/div/div[2]/main/div[3]/div/section/div/h2")).getText());
    }

    @Test
    public void addAProductToCartAndAccessViewCart() {
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
        productPage.closeModalView();
        productPage.clickOnCartDropdown();
        CartPage cartPage = productPage.viewCart(driver);
        assertEquals("Cos",driver.findElement(By.xpath("/html/body/div/div[2]/main/div[3]/div/section/div/h2")).getText());
        cartPage.emptyCart();
        assertEquals("Nu ai produse in cos.",driver.findElement(By.xpath("/html/body/div/div[2]/main/div[3]/div/section/div/div/div/h3")).getText());

        UserPage cartPageToUserPage = cartPage.clickOnBackButtonToArriveAtUserpage(driver);
        assertEquals("Oferte zilnice",driver.findElement(By.xpath("/html/body/div/div[3]/main/div[2]/div/div/h3")).getText());

        cartPageToUserPage.clickOnUserDropdown(driver);

        LogoutPage logoutPage = cartPageToUserPage.clickLogoutButton(driver);
        assertEquals("Vreau un cont nou",driver.findElement(By.xpath("//*[@id=\"__next\"]/div[3]/main/div[1]/h1")).getText());

    }
}

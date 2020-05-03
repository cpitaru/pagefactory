package alltests.junittests.logout;

import alltests.junittests.base.FunctionalTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.LogoutPage;
import pages.UserPage;

import static org.testng.AssertJUnit.assertEquals;

public class LogoutTests extends FunctionalTest {
    @Test
    public void successfullyLogout() {
        driver.get("https://altex.ro/");
        LoginPage loginPage = new LoginPage(driver);

        loginPage.clickOnLoginDropdown();
        loginPage.enterEmailAddress("CosminTest.automation@gmail.com");
        loginPage.enterPassword("Automation123!");

        UserPage userPage = loginPage.clickLoginButton();
        LogoutPage logoutPage = userPage.clickLogoutButton(driver);
        logoutPage.waitForTextToLoad();
        assertEquals("Vreau un cont nou",driver.findElement(By.xpath("//*[@id=\"__next\"]/div[3]/main/div[1]/h1")).getText());
    }
}

package login;

import base.FunctionalTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.LogoutPage;
import pages.UserPage;

import java.util.concurrent.TimeUnit;

import static org.testng.AssertJUnit.*;

public class LoginTests extends FunctionalTest {

    @Test
    public void successfullyLogin() {
        LoginPage loginPage = new LoginPage(driver);

        loginPage.clickOnLoginDropdown();
        loginPage.enterEmailAddress("CosminTest.automation@gmail.com");
        loginPage.enterPassword("Automation123!");

        UserPage userPage = loginPage.clickLoginButton();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        assertEquals("Contul meu", driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/div/div/div[3]/div[1]/a/div[3]/span")).getText());
    }

}

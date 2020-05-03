package sumarcont;

import base.FunctionalTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SumarCont;
import pages.UserPage;

import static org.testng.AssertJUnit.assertEquals;

public class SumarContTests extends FunctionalTest {
    @Test
    public void accessingSumarContAndAssertingMessage() {
        driver.get("https://altex.ro/");
        LoginPage loginPage = new LoginPage(driver);

        loginPage.clickOnLoginDropdown();
        loginPage.enterEmailAddress("CosminTest.automation@gmail.com");
        loginPage.enterPassword("Automation123!");

        UserPage userPage = loginPage.clickLoginButton();

        SumarCont sumarCont = userPage.clickSumarContButton(driver);
        assertEquals("Salut Cosmin Test", driver.findElement(By.xpath("/html/body/div/div[3]/main/div/div[1]/div[2]/div[1]/div/p[1]/strong")).getText());
    }
}

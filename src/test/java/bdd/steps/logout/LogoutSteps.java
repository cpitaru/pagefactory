package bdd.steps.logout;

import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.testng.AssertJUnit.assertEquals;

public class LogoutSteps {
    private WebDriver driver;

    @When("I click the logout button")
    public void whenIClickTheLogoutButton() {
        driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/div/div/div[3]/div[1]/div/div[2]/div/ul/li[10]")).click();
    }

    @Then("I log out successfully")
    public void thenILogOutSuccessfully() {
        assertEquals("Vreau un cont nou",driver.findElement(By.xpath("//*[@id=\"__next\"]/div[3]/main/div[1]/h1")).getText());
    }
}

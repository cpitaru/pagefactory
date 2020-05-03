package bdd.steps.login;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.testng.AssertJUnit.assertEquals;

public class LoginSteps {
    private WebDriver driver;

    @Given("I have a regular user with $emailAddress and $password credentials")
    public void givenIHaveARegularUserWithEmailaddressAndPasswordCredentials(@Named("emailAddress") String emailAddress, @Named("password") String password) {
        driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/div/div/div[3]/div[1]/div/div[2]/div/form/input[1]")).sendKeys(emailAddress);
        driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/div/div/div[3]/div[1]/div/div[2]/div/form/input[2]")).sendKeys(password);
    }

    @When("I click the login button")
    public void whenIClickTheLoginButton() {
        driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/div/div/div[3]/div[1]/div/div[2]/div/form/div[3]/span/button")).click();
    }

    @Then("I log in successfully")
    public void thenILogInSuccessfully() {
        assertEquals("Contul meu",driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/div/div/div[3]/div[1]/a/div[3]/span")).getText());
    }
}

package bdd.steps.sumarcont;

import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.testng.AssertJUnit.assertEquals;

public class SumarContSteps {
    private WebDriver driver;

    @When("I click on Sumar cont")
    public void whenIClickOnSumarCont() {
        driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/div/div/div[3]/div[1]/div/div[2]/div/ul/li[1]")).click();
    }

    @Then("I am directed to Sumar cont page")
    public void thenIAmDirectedToSumarContPage() {
        assertEquals("Salut Cosmin Test", driver.findElement(By.xpath("/html/body/div/div[3]/main/div/div[1]/div[2]/div[1]/div/p[1]/strong")).getText());
    }
}

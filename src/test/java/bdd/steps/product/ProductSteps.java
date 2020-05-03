package bdd.steps.product;

import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.testng.AssertJUnit.assertEquals;

public class ProductSteps {
    private WebDriver driver;

    @When("I click on a specific Product")
    public void whenIClickOnASpecificProduct() {
        driver.findElement(By.xpath("/html/body/div/div[3]/main/div[2]/div[1]/div[2]/ul/li[2]/div/div[2]/h2/a")).click();
    }

    @Then("I am directed to that product's page")
    public void thenIAmDirectedToThatProductsPage() {
        assertEquals("Casti Gaming RAZER Kraken Green 2019, stereo, 3.5mm, verde",
                driver.findElement(By.xpath("/html/body/div/div[3]/main/div/div[2]/div[1]/div[1]/div/div[1]/h1/div")).getText());
    }
}

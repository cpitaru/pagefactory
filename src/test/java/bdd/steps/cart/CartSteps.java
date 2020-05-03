package bdd.steps.cart;

import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.testng.AssertJUnit.assertEquals;

public class CartSteps {
    private WebDriver driver;

    @When("I add it to Cart")
    public void whenIAddItToCart() {
        WebElement addToCartButton = driver.findElement(
                By.xpath("/html/body/div/div[3]/main/div/div[2]/div[1]/div[2]/div[2]/div/div/div[4]/div/div[1]/div[1]/div/div/button/div/div[2]/div"));
        addToCartButton.click();
    }

    @Then("the product was added successfully to the cart")
    public void thenTheProductWasAddedSuccessfullyToTheCart() {
        assertEquals("Produsul a fost adaugat in cosul de cumparaturi",
                driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/h2")).getText());
    }
}

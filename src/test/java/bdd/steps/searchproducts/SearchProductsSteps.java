package bdd.steps.searchproducts;

import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.testng.AssertJUnit.assertEquals;

public class SearchProductsSteps {
    private WebDriver driver;

    @When("I search after $product")
    public void whenISearchAfterProduct(@Named("product") String product) {
        WebElement searchBar = driver.findElement(By.xpath(""));
        searchBar.sendKeys(product);
    }

    @When("I click on the search button")
    public void whenIClickOnTheSearchButton() {
        WebElement searchButton = driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/div/div/div[4]/form/div/div[2]/button/div/div/div"));
        searchButton.click();
    }

    @Then("I receive information regarding the product")
    public void thenIReceiveInformationRegardingTheProduct() {
        assertEquals("Rezultate cautare", driver.findElement(By.xpath("/html/body/div/div[3]/main/div[2]/div[1]/div[1]/h1")).getText());
    }
}

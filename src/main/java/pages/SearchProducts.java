package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchProducts extends PageObject {
    private WebDriver driver;

    @FindBy(xpath = "/html/body/div/div[3]/main/div[2]/div[1]/div[2]/ul/li[2]/div/div[1]/a/img")
    private WebElement headsets;


    public ProductPage clickOnProduct() {
        driver.findElement(By.xpath("/html/body/div/div[3]/main/div[2]/div[1]/div[2]/ul/li[2]/div/div[1]/a/img")).click();
        return new ProductPage(driver);
    }

    public SearchProducts(WebDriver driver) {
        this.driver = driver;
    }

}

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchProducts extends PageObject {
    private WebDriver driver;

    @FindBy(xpath = "/html/body/div/div[3]/main/div[2]/div[1]/div[2]/ul/li[2]/div/div[1]/a/img")
    private WebElement headsets;


    public ProductPage clickOnProduct() {
        WebDriverWait wait = new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[3]/main/div[2]/div[1]/div[2]/ul/li[2]/div/div[1]")));

        driver.findElement(By.xpath("/html/body/div/div[3]/main/div[2]/div[1]/div[2]/ul/li[2]/div/div[1]")).click();
        return new ProductPage(driver);
    }

    public SearchProducts(WebDriver driver) {
        this.driver = driver;
    }

    public void waitForTextToLoad() {
        WebDriverWait wait = new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[3]/main/div[2]/div[1]/div[1]/h1 ")));
    }
}

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductPage extends PageObject {
    private WebDriver driver;

    @FindBy(xpath = "/html/body/div/div[3]/main/div/div[2]/div[1]/div[2]/div[2]/div/div/div[4]/div/div[1]/div[1]/div/div/button/div/div[2]/div")
    private WebElement addToCartButton;

    @FindBy(xpath = "/html/body/div[2]/div[2]/div[3]/a/div/div/div")
    private WebElement viewCartButton;

    public void addToCart() {
        driver.findElement(By.xpath("/html/body/div/div[3]/main/div/div[2]/div[1]/div[2]/div[2]/div/div/div[4]/div/div[1]/div[1]/div/div/button/div/div[2]/div")).click();
    }

    public CartPage viewCart(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div[3]/a/div/div/div")));
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[3]/a/div/div/div")).click();
        return new CartPage(driver);
    }
    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }
}

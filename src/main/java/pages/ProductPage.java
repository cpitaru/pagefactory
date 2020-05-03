package pages;

import org.jbehave.core.annotations.When;
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

    @FindBy(xpath = "//*[@id=\"__next\"]/div[2]/div[1]/div/div/div/div[3]/div[2]/a/div[3]")
    private WebElement cartDropdown;

    @FindBy(xpath = "/html/body/div/div[2]/div[1]/div/div/div/div[3]/div[1]/a/div[3]/span")
    private WebElement userDropdown;

    @FindBy(xpath = "/html/body/div/div[2]/div[1]/div/div/div/div[3]/div[1]/div/div[2]/div/ul/li[10]/a")
    private WebElement logoutButton;

    public void addToCart() {
        WebDriverWait wait = new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[3]/main/div/div[2]/div[1]/div[2]/div[2]/div/div/div[4]/div/div[1]/div[1]" +
                "/div/div/button/div/div[2]/div")));
        driver.findElement(By.xpath("/html/body/div/div[3]/main/div/div[2]/div[1]/div[2]/div[2]/div/div/div[4]/div/div[1]/div[1]/div/div/button/div/div[2]/div")).click();
    }

    public void closeModalView() {
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/i")).click();
    }

    public void backModalButton() {
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div[3]/div/button")));
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[3]/div/button")).click();
    }
    public CartPage viewCart(WebDriver driver) {
        /*
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div[3]/a/div/")));
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[3]/a/div/")).click();
        THIS PART OF CODE WAS DESTINATED TO "Vezi cosul" button within the modal view
*/
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[1]/div/div/div/div[3]/div[2]/div/div[2]/div/div[3]/a/div/div/div")).click();
        return new CartPage(driver);
    }

    public void clickOnCartDropdown() {
//        driver.findElement((By) cartDropdown).click();
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[1]/div/div/div/div[3]/div[2]/a/div[3]")).click();
    }

    public void clickOnUserDropdown() {
        driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/div/div/div[3]/div[1]/a/div[3]/span")).click();
    }

    public LogoutPage clickLogoutButton(WebDriver driver) {
        driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/div/div/div[3]/div[1]/div/div[2]/div/ul/li[10]/a")).click();
        return new LogoutPage(driver);
    }

    public void waitForTextToLoad() {
        WebDriverWait wait = new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[3]/main/div/div[2]/div[1]/div[1]/div[1]/div[1]/h1/div")));
    }

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    public void waitForProductToBeAddedInCart() {
        WebDriverWait wait = new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div[2]/div[1]/h2")));
    }

    public void waitForTextAfterAddingProductToCartToLoad() {
        WebDriverWait wait = new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div[2]/div[1]/h2")));
    }
}

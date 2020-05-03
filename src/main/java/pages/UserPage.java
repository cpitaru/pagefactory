package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class UserPage extends PageObject {
    private WebDriver driver;

    @FindBy(xpath = "/html/body/div/div[2]/div[1]/div/div/div/div[3]/div[1]/a")
    private WebElement userDropdown;

    @FindBy(xpath = "/html/body/div/div[2]/div[1]/div/div/div/div[3]/div[1]/div/div[2]/div/ul/li[10]")
    private WebElement logoutButton;

    @FindBy(xpath = "/html/body/div/div[2]/div[1]/div/div/div/div[3]/div[1]/div/div[2]/div/ul/li[1]")
    private WebElement sumarContButton;

    @FindBy(xpath = "/html/body/div/div[2]/div[1]/div/div/div/div[4]/form/div/div[1]/input")
    private WebElement searchBar;

    @FindBy(xpath = "/html/body/div/div[2]/div[1]/div/div/div/div[4]/form/div/div[2]/button/div/div/div")
    private WebElement searchButton;


    public String confirmationUserDropdownText() {
        return userDropdown.getText();
    }

    public UserPage(WebDriver driver) {
        this.driver = driver;
    }

    public UserPage clickOnUserDropdown(WebDriver driver) {
        driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/div/div/div[3]/div[1]/a/div[3]/span")).click();
        return new UserPage(driver);
    }


    public SumarCont clickSumarContButton(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[2]/div[1]/div/div/div/div[3]/div[1]/div/div[2]/div/ul/li[1]")));
        WebElement sumarContBtn = driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/div/div/div[3]/div[1]/div/div[2]/div/ul/li[1]"));
        sumarContBtn.click();
        return new SumarCont(driver);
    }


    public void clickSearchBar(WebDriver driver) {
        WebElement searchBar = driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/div/div/div[4]/form/div/div[1]/input"));
        searchBar.click();

    }

    public void enterProductNameOnSearchBar(WebDriver driver,String productName) {
        WebElement enteredProductName = driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/div/div/div[4]/form/div/div[1]/input"));
        enteredProductName.sendKeys(productName);
//        this.searchBar.clear();
//        this.searchBar.sendKeys((CharSequence) productName);
//        driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/div/div/div[4]/form/div/div[1]/input")).clear();
//        driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/div/div/div[4]/form/div/div[1]/input")).sendKeys(productName);

    }

    public SearchProducts clickSearchButton(WebDriver driver) {

        WebElement clickedSearchButton = driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/div/div/div[4]/form/div/div[2]/button/div/div/div"));
        clickedSearchButton.click();
        return new SearchProducts(driver);
    }


    public LogoutPage clickLogoutButton(WebDriver driver) {
//        driver.findElement((By) logoutButton).click();
//        return new LogoutPage(driver);
        WebDriverWait wait = new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[2]/div[1]/div/div/div/div[3]/div[1]/div/div[2]/div/ul/li[10]/a")));
        driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/div/div/div[3]/div[1]/div/div[2]/div/ul/li[10]/a")).click();
        return new LogoutPage(driver);
    }

    public void waitForOferteZilniceToLoad() {
        WebDriverWait wait = new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[3]/main/div[2]/div/div/h3")));
    }
}

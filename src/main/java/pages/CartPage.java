package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends PageObject {
    private WebDriver driver;

    @FindBy(xpath = "/html/body/div/div[2]/div[1]/div/div/div/div[3]/div[1]/a/div[3]/span")
    private WebElement userDropdown;

    @FindBy(xpath = "/html/body/div/div[2]/div[1]/div/div/div/div[3]/div[1]/div/div[2]/div/ul/li[10]/a")
    private WebElement logoutButton;

    public void clickOnUserDropdown() {
        driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/div/div/div[3]/div[1]/a/div[3]/span")).click();
    }

    public void emptyCart() {
        driver.findElement(By.xpath("/html/body/div/div[2]/main/div[3]/div/section/div/div/div[1]/div[1]/button/div/div/div")).click();
    }

    public UserPage clickOnBackButtonToArriveAtUserpage(WebDriver driver) {
        driver.findElement(By.xpath("/html/body/div/div[2]/main/div[3]/div/section/div/div/div/a/span")).click();
        return new UserPage(driver);
    }

    public LogoutPage clickLogoutButton(WebDriver driver) {
        driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/div/div/div[3]/div[1]/div/div[2]/div/ul/li[10]/a")).click();
        return new LogoutPage(driver);
    }

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }
}

package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageObject{
    private WebDriver driver;

    @FindBy(xpath = "/html/body/div/div[2]/div[1]/div/div/div/div[3]/div[1]/a")
    private WebElement loginDropdown;

    @FindBy(xpath = "//*[@id=\"__next\"]/div[2]/div[1]/div/div/div/div[3]/div[1]/div/div[2]/div/form/input[1]")
    private WebElement eMailAddress;

    @FindBy(xpath = "//*[@id=\"__next\"]/div[2]/div[1]/div/div/div/div[3]/div[1]/div/div[2]/div/form/input[2]")
    private WebElement password;

    @FindBy(xpath = "/html/body/div/div[2]/div[1]/div/div/div/div[3]/div[1]/div/div[2]/div/form/div[3]/span/button")
    private WebElement loginButton;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void clickOnLoginDropdown() {
        loginDropdown.click();
    }


    public void enterEmailAddress(String enterEMailAddress) {
        this.eMailAddress.clear();
        this.eMailAddress.sendKeys((CharSequence) enterEMailAddress);
    }

    public void enterPassword(String enterPassword) {
        this.password.clear();
        this.password.sendKeys((CharSequence) enterPassword);
    }

    public UserPage clickLoginButton() {
        loginButton.click();
        return new UserPage(driver);
    }




}

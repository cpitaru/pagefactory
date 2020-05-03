package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LogoutPage extends PageObject{
    private WebDriver driver;

    public LogoutPage(WebDriver driver) {
        this.driver = driver;
    }

    public void waitForTextToLoad() {
        WebDriverWait wait = new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"__next\"]/div[3]/main/div[1]/h1")));
    }

    public void waitForTextAfterLoggingOutToLoad() {
        WebDriverWait wait = new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[3]/main/div[1]/h1")));
    }
}

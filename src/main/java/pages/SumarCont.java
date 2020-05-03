package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SumarCont extends PageObject {
    private WebDriver driver;

    @FindBy(xpath = "/html/body/div/div[3]/main/div/div[1]/div[2]/div[1]/div/p[1]")
    private WebElement sumarContText;

    public SumarCont(WebDriver driver) {
        this.driver = driver;
    }


}

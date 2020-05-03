package bdd.utils;

import org.jbehave.core.annotations.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenSite {
    private WebDriver driver;

    @Given("I access https://www.altex.ro")
    public void givenIAccessHttpswwwaltexro() {
        System.setProperty("webdriver.chrome.driver","D:/_automation/workspace/pagefactory/src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://altex.ro/");
    }

    @Given("I click on user dropdown")
    public void givenIClickOnUserDropdown() {
        driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/div/div/div[3]/div[1]/a")).click();
    }
}

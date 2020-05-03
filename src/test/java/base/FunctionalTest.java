package base;

import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class FunctionalTest {
    protected WebDriver driver;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver","D:/_automation/workspace/pagefactory/src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://altex.ro/");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

//    @After
//    public void cleanup() {
//        driver.manage().deleteAllCookies();
//    }
//
//    @AfterClass
//    public void tearDown() {
//        driver.quit();
//    }
}

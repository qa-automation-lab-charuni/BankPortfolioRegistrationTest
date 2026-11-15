package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TestApp {
    private WebDriver driver;
    private static TestApp myObj;
    // public static WebDriver driver;
    PropertyFileReader property = new PropertyFileReader();

    public static TestApp getInstance() {
        if (myObj == null) {
            myObj = new TestApp();
            return myObj;
        } else {
            return myObj;
        }
    }

    //get the selenium driver
    public WebDriver getDriver() {
        return driver;
    }

    //when selenium opens the browsers it will automatically set the web driver
    private void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    public static void setMyObj(TestApp myObj) {
        TestApp.myObj = myObj;
    }

    public void openBrowser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }

    public void navigateToURL() {
        String url = property.getProperty("config", "url");
        driver.get(url);
    }

    public void closeBrowser() {
        driver.quit();
    }

    public WebElement waitUntilNextElementAppears(By locator, int timeOut) {
        WebElement element = new WebDriverWait(TestApp.getInstance().getDriver(), Duration.ofSeconds(timeOut)).until
                (ExpectedConditions.presenceOfElementLocated(locator));
        return element;
    }
}
package steps;

import org.openqa.selenium.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.junit.Assert;

public class SeleniumSteps {

    public WebDriver driver = null;

    public WebDriver configureChromeDriver() {

        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("--start-maximized");
        options.addArguments("--kiosk");
        options.addArguments("--start-fullscreen");

        return new ChromeDriver(options);

    }

    public void setUpDriver() {
        driver = configureChromeDriver();
    }

    public void openUrl(String url) {
        driver.get(url);
    }

    public void clickOnElement(By locator) {
        driver.findElement(locator).click();
    }

    public void enterTextOnElement(By locator, String text) {
        try {
            driver.findElement(locator).sendKeys(text);
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail(e.getMessage());
        }
    }

    public void enterKeyboardEventOnElement(By locator, Keys keys){
        try {
            driver.findElement(locator).sendKeys(keys);
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail(e.getMessage());
        }
    }

    public void quitDriver() {
        driver.quit();
    }

}

package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.Main;

public class DriverWork {
    private WebDriver driver;
    Main main;

    @BeforeMethod
    public void driverSetup() {
        driver = new ChromeDriver();
    }

    @Test
    public void isNewPateCreated() {
        main = new Main(driver);
        main.openPage();
        main.beltsFind();
        main.labelClick();
        main.labelBrandClick();
        main.searchButtonClick();
        main.scroll();
    }

    @AfterMethod(alwaysRun = true)
    public void browserTearDown() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
        driver = null;
    }
}

package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.JavascriptExecutor;

public class Main {
    private static final String HOMEPAGE_URL = "https://www.svt.by/";
    private final WebDriver driver;
    @FindBy(xpath = "//label[@for='wedges_count[7]']")
    private WebElement labelButton;

    @FindBy(xpath = "//label[@for='GOODYEAR']")
    private WebElement labelBrand;

    @FindBy(xpath = "//button[@class='fr-btn fr-btn-primary floatingButton']")
    private WebElement searchButton;

    public Main(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public Main openPage() {
        driver.get(HOMEPAGE_URL);
        return this;
    }

    public void labelBrandClick() {
        labelBrand.click();
    }

    public void labelClick() {
        labelButton.click();
    }

    public void searchButtonClick(){ searchButton.click();}

    public void beltsFind(){
        driver.get("https://svt.by/poly_v_belts_catalog");
    }

    public void scroll(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
    }
}

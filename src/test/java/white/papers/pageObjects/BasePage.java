package white.papers.pageObjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;

import static org.testng.AssertJUnit.assertTrue;

public class BasePage {

    public static WebDriver driver;
    protected String URL = "https://www.thebioagency.com/news-and-views/white-papers/";
    public static final int DEFAULT_WAIT_FOR_ELEMENT = 10;

    public BasePage(WebDriver myDriver) {
        this.driver = myDriver;
    }

    public void open() {
        driver.get(URL);
    }

    public static WebElement waitForElement(WebDriver driver, final By by) {
        WebElement element;
        try {
            WebDriverWait wait = new WebDriverWait(driver, DEFAULT_WAIT_FOR_ELEMENT);
            element = wait.until(ExpectedConditions.visibilityOfElementLocated(by));

            return element;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public void assertTitle(String pageTitle){
        assertTrue("Title does not match" + "expected =>" + pageTitle + "actual =>"+ driver.getTitle(), driver.getTitle().contains(pageTitle));
    }

    public void assertElementExists(String elementCss){
        boolean status = waitForElement(driver, By.cssSelector(elementCss)).isDisplayed();
        Assert.assertEquals(true, status);
    }
}

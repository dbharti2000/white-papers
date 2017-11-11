package white.papers.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    private static final String CSS_FIRST_PAPER = "[data-reactid='.0.1.1.$=1$/news-and-views/white-papers/.0.1.0.4.$0.0.0'] span";
    private static final String FIRST_PAPER_TITLE = "DIGITAL TRANSFORMATION: REBIRTH OF THE ORGANISATION";
    private static final String RIGHT_SCROLL_FIRST_BUTTON = "[data-reactid='.0.1.1.$=1$/news-and-views/white-papers/digital-transformation-rebirth-of-the-organisation/.1.0.0.1.0.0.1']";
    private static final String RIGHT_SCROLL_SECOND_BUTTON = "[data-reactid='.0.1.1.$=1$/news-and-views/white-papers/digital-transformation-rebirth-of-the-organisation/.0.2']";
    private static final String RIGHT_SCROLL_THIRD_BUTTON = "[data-reactid='.0.1.1.$=1$/news-and-views/white-papers/digital-transformation-rebirth-of-the-organisation/.0.2']";
    private static final String RIGHT_CLOSE_BUTTON = "[data-reactid='.0.1.1.$=1$/news-and-views/white-papers/digital-transformation-rebirth-of-the-organisation/.0.3.0']";
    private static final String SUBMIT_BUTTON_CSS = "[data-reactid='.0.1.1.$=1$/news-and-views/white-papers/digital-transformation-rebirth-of-the-organisation/.0.0.3.0.7.0']";
    private static final String DOWNLOAD_BUTTON_CSS = "[data-reactid = '.0.1.1.$=1$/news-and-views/white-papers/digital-transformation-rebirth-of-the-organisation/.0.0.3.2.1.0']";
    private static final String NAME_FEILD_CSS = "#Name";
    private static final String COMPANY_FEILD_CSS = "#Company";
    private static final String JOB_TITLE_FEILD_CSS = "#JobTitle";
    private static final String EMAIL_FEILD_CSS = "#Email";
    private static final String SUBMIT_CSS = "[data-reactid='.0.1.1.$=1$/news-and-views/white-papers/digital-transformation-rebirth-of-the-organisation/.0.0.3.0.7.0']";

    public HomePage(WebDriver myDriver) {
        super(myDriver);
        driver = myDriver;

    }

    public void selectFirstPaperAtHomePage() throws Throwable {
        waitForElement(driver, By.cssSelector(CSS_FIRST_PAPER)).click();
        assertTitle(FIRST_PAPER_TITLE);
    }

    public void selectRightScrollButtonOnFirstPage() throws Throwable {
        waitForElement(driver, By.cssSelector(RIGHT_SCROLL_FIRST_BUTTON)).click();
        assertElementExists(RIGHT_CLOSE_BUTTON);
    }

    public void selectRightScrollButtonOnSecondPage() throws Throwable {
        waitForElement(driver, By.cssSelector(RIGHT_SCROLL_SECOND_BUTTON)).click();
        assertElementExists(RIGHT_CLOSE_BUTTON);
    }

    public void selectRightScrollButtonOnThirdPage() throws Throwable {
        waitForElement(driver, By.cssSelector(RIGHT_SCROLL_THIRD_BUTTON)).click();
        assertElementExists(SUBMIT_BUTTON_CSS);
    }

    public void fillAndSubmitForm() throws Throwable {
        driver.findElement(By.cssSelector(NAME_FEILD_CSS)).sendKeys("testName");
        driver.findElement(By.cssSelector(JOB_TITLE_FEILD_CSS)).sendKeys("testJob");
        driver.findElement(By.cssSelector(COMPANY_FEILD_CSS)).sendKeys("testCompany");
        driver.findElement(By.cssSelector(EMAIL_FEILD_CSS)).sendKeys("test@test.co.uk");
        driver.findElement(By.cssSelector(SUBMIT_CSS)).click();
    }

    public void assertFormSubmission() throws Throwable {
        assertElementExists(DOWNLOAD_BUTTON_CSS);

    }

}

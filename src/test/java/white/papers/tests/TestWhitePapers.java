package white.papers.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import white.papers.driver.DriverManager;
import white.papers.pageObjects.*;

import java.io.IOException;

public class TestWhitePapers {

    protected static WebDriver driver;
    private HomePage homePage;

    //initialising the page objects in setup
    @BeforeMethod
    public void setUp() throws IOException {
        driver = new DriverManager().getDriver();
        homePage = PageFactory.initElements(driver, HomePage.class);
    }

    @Test(description = "checkPaper")
    public void testWhitePapers() throws Throwable {
        homePage.open();
        homePage.selectFirstPaperAtHomePage();
        homePage.selectRightScrollButtonOnFirstPage();
        homePage.selectRightScrollButtonOnSecondPage();
        homePage.selectRightScrollButtonOnThirdPage();
        homePage.fillAndSubmitForm();
        homePage.assertFormSubmission();
    }

    @AfterMethod
    public void tearDown() {
        DriverManager.destroyDriver(driver);
        System.out.println("Clean-up after the test execution");
    }
}

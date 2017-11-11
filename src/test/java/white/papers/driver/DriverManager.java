package white.papers.driver;

import org.openqa.selenium.WebDriver;
import white.papers.utils.PropertyReaders;

import java.io.IOException;


public class DriverManager {
    public static WebDriver getDriver() throws IOException {
        String browser = new PropertyReaders().readProperty("browser");
        return DriverFactory.createInstance(browser);
    }

    public static void destroyDriver(WebDriver driver) {
        driver.quit();
        driver = null;
    }
}

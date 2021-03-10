package help;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class Browser {

    public static WebDriver driver;

    /**
     * This method represents open a new browser
     *
     * @param browserName this is the name of browser
     *                    can be chrome, opera, edge e.c.
     */
    public static void open(String browserName) {

        switch (browserName) {
            case "chrome":
                System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\chromedriver.exe");
                driver = new ChromeDriver();
                driver.manage().window().maximize();
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                break;
//            case "firefox":break;
//            case "opera":break;
            default:
                Assert.fail("No such browser.");
        }
    }

    /**
     * By this method browser goes to the target URL
     *
     * @param url this is the target URL
     */
    public static void goToUrl(String url) {

        driver.

                get(url);
    }

    /**
     * This method closes the browser.
     */
    public static void close() {
        driver.quit();
    }

}

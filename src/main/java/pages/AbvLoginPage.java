package pages;

import help.Browser;
import help.Verifications;
import help.WaitUntil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AbvLoginPage {
    private static final By USERNAME = By.id("username");
    private static final By PASSWORD = By.id("password");
    private static final By LOG_IN = By.id("loginBut");


    private static final By REGISTRY_BUTTON = By.cssSelector("a#promoZone+p>a");

    /**
     * This method represents log in the abv-mail box with valid credentials
     * @param username name of the user
     * @param password user's password
     */
    public static void positiveLogin(String username, String password) {
        Browser.driver.findElement(USERNAME).sendKeys(username);
        Browser.driver.findElement(PASSWORD).sendKeys(password);
        Browser.driver.findElement(LOG_IN).click();
    }

    /**
     * This method opens registry form in case user does not have registration and wants to make a new one
     */
    public static void openRegistry() {
        Browser.driver.findElement(REGISTRY_BUTTON).click();
    }
}

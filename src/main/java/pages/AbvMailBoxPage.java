package pages;

import help.Browser;
import org.openqa.selenium.By;

public class AbvMailBoxPage {

    private static final By USER_LOG = By.id("gwt-uid-386");

    /**
     * This method provides user's logout from the mail box.
     */
    public static void logOut() {
        Browser.driver.findElement(USER_LOG).click();
        Browser.driver.findElement(By.id("gwt-uid-389")).click();

    }
}

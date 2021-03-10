package help;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Frames {

    private static final String GDPR_FRAME = "abv-GDPR-frame";
    private static final By CHILD_FRAME_ELEMENT = By.id("gdpr-consent-notice");
    private static final By ACCEPT_BUTTON = By.id("save");

    /**
     * This method provides passing and accepting the GDPR frame, which appears when user makes any actions in login page or registration page.
     */
    public static void passGDPRFrame() {
        Browser.driver.switchTo().frame(GDPR_FRAME);
        WebElement frameElement = Browser.driver.findElement(CHILD_FRAME_ELEMENT);
        Browser.driver.switchTo().frame(frameElement);
        Browser.driver.findElement(ACCEPT_BUTTON).click();
        Browser.driver.switchTo().defaultContent();
    }

}


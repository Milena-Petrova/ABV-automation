package help;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUntil {

   static WebDriverWait wait = new WebDriverWait(Browser.driver,10);

    /**
     * This method provides stopping the browser until expected page appears
     * @param title title name of the expected page
     */
    public static void waitPageTitle(String title) {
        wait.until(ExpectedConditions.titleContains(title));
    }


}

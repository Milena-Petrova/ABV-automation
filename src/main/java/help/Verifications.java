package help;

import org.testng.Assert;

public class Verifications {
    /**
     * This method verifies whether the user is on the expected page.
     * @param expected_condition title of the expected page
     * @param error_message message in case verification is failed
     */
    public static void verificationTitle(String expected_condition, String error_message) {
        String actual = Browser.driver.getTitle();
        System.out.println(actual);
        Assert.assertTrue(actual.contains(expected_condition), error_message);
    }

}

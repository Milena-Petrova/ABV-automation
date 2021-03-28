package abvLogin;

import help.Browser;
import help.Frames;
import help.Verifications;
import help.WaitUntil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.AbvLoginPage;
import pages.AbvMailBoxPage;
import sun.util.locale.provider.AvailableLanguageTags;

public class PositiveLoginTest {

    @BeforeMethod
    public void setUp() {
        Browser.open("chrome");
    }

    @Test
    public void successfulLogIn() {
        Browser.goToUrl("https://www.abv.bg/");
        Frames.passGDPRFrame();
        WaitUntil.waitPageTitle("АБВ Поща");
        AbvLoginPage.positiveLogin("milipt","***************");
        WaitUntil.waitPageTitle("АБВ поща");
        Verifications.verificationTitle("непрочетени) - АБВ поща","Unsuccessful login..");
        AbvMailBoxPage.logOut();
        WaitUntil.waitPageTitle("Гювеч: указател на български сайтове");
        Verifications.verificationTitle("Гювеч: указател на български сайтове","Unsuccessful log out.");
    }

    @AfterMethod
    public void tearDown() {
       Browser.close();
    }
}


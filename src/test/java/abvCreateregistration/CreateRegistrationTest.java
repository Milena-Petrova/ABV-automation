package abvCreateregistration;

import help.Browser;
import help.Frames;
import help.Verifications;
import help.WaitUntil;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.AbvLoginPage;
import pages.AbvRegistryPage;

import java.io.IOException;

public class CreateRegistrationTest {
   @BeforeMethod
    public void setUp(){
       Browser.open("chrome");
       Browser.goToUrl("https://www.abv.bg/");
   }

   @Test
    public void successfulRegistration() throws IOException {
       //"user","password","firstName", "secondName","sex","birthday","month","year"
       AbvLoginPage.openRegistry();
       WaitUntil.waitPageTitle("АБВ Профил");
       Verifications.verificationTitle("АБВ Профил","This is not registration page.");
       Frames.passGDPRFrame();
       AbvRegistryPage.createNewRegistration("milipt1921","1234567890","Milen", "Petrov","мъж","1","1","2000");


   }
   @AfterMethod
   public void tearDown(){

      Browser.driver.quit();
   }

}

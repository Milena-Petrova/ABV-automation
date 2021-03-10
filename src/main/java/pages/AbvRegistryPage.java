package pages;

import help.Browser;
import help.WaitUntil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import sun.plugin.javascript.navig.Image;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.IOException;
import java.net.URL;

public class AbvRegistryPage {

    private static String imageUrl;

    /**
     * This method creates a new user registration
     *
     * @param user       unique name of the user
     * @param password   user's password
     * @param firstName  first user name
     * @param secondName last user name
     * @param sex        gender parameter, could be "мъж" or "жена"
     * @param birthday   user's day of birth
     * @param month      user's month of birth
     * @param year       user's year of birth
     */
    public static void createNewRegistration(String user, String password, String firstName, String secondName, String sex, String birthday, String month, String year) throws IOException {
        Browser.driver.findElement(By.id("regformUsername")).sendKeys(user);
        Browser.driver.findElement(By.cssSelector("a.abv-button")).click();
        WebDriverWait waitImage = new WebDriverWait(Browser.driver,10);
        waitImage.until(ExpectedConditions.visibilityOf(Browser.driver.findElement(By.id("preview3"))));
//        ********** до тук минава , но понякога фейлва, не мога да хвана защо, веднъж клика на бутона провери, веднъж не *************
////
//        URL url = new URL(Browser.driver.findElement(By.id("preview3")).getAttribute("src"));
//        System.out.println(url);
//
//        BufferedImage image = ImageIO.read(url);
//        System.out.println(image);
//        String s = new OCR().recognizeCharacters((RenderedImage) image);
//

        //  System.out.println("Text From Image : \n"+ s);
        //   System.out.println("Length of total text : \n"+ s.length());
//        String cssValue = Browser.driver.findElement(By.id("preview3")).getCssValue("src");
//        System.out.println(cssValue);
//        Browser.driver.findElement(By.id("captchaAnswer2")).sendKeys(cssValue);
//
//        Assert.assertEquals(Browser.driver.findElement(By.cssSelector("div.abv-messageGray.abv-ok")).getText(),"Потребителското име е свободно");
//        Browser.driver.findElement(By.id("password")).sendKeys(password);
//        Browser.driver.findElement(By.id("password2")).sendKeys(password);
//        if(!Browser.driver.findElement(By.id("phoneRecovery1")).isSelected()){
//            Browser.driver.findElement(By.id("phoneRecovery1")).click();
        //       }
    }


}


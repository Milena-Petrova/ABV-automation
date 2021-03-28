package examples;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class MySecondAutomationTests {
   private WebDriver driver;

    @BeforeMethod
    public void openBrowser() {
        System.setProperty("webdriver.chrome.driver", "C:\\WebDrivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.abv.bg/");

    }

    @Test
    public void testAbvLogin() {
//        driver.switchTo().frame("abv-GemiusCounter");
//        driver.findElement(By.xpath("//div[@class='action-wrapper']")).click();

        WebElement element = driver.findElement(By.id("input#username"));

        element.sendKeys("milipt");

        WebElement element1 = driver.findElement(By.id("input#password"));
        element1.sendKeys("mynameismilena");
        WebElement element2 = driver.findElement(By.id("input#loginBut"));



      //  element2.click();

      //  element1.sendKeys(Keys.RETURN);


    }
//
//    @AfterMethod
//    public void closeWeb() {
//        driver.close();
//    }

}

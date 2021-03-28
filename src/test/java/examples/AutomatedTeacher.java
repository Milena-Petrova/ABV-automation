package examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.AssertJUnit.assertEquals;

public class AutomatedTeacher {

 WebDriver driver;
    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\WebDrivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://shop.pragmatic.bg/admin/index.php?route=common/dashboard&user_token=AlbEZuNHaJRDJl7uaAJo08QnX8BDXLXG");

    }
    @Test
    public void checkDate() {
        driver.findElement(By.cssSelector("input#input-username")).sendKeys("admin");
        driver.findElement(By.cssSelector("input#input-password")).sendKeys("parola123!");
        driver.findElement(By.xpath("//div[@class='text-right']//button")).click();
        assertEquals("Dashboard", driver.getTitle());
        driver.findElement(By.cssSelector("li#menu-sale>a[class*='parent collapsed']")).click();
        driver.findElement(By.cssSelector("ul#collapse4 li a[href*='order']")).click();
        assertEquals("Orders", driver.getTitle());
        WebElement dateAdded = driver.findElement(By.cssSelector("input[name='filter_date_added'] + span button.btn-default"));
        dateAdded.click();
        dateAdded.click();
        WebElement dateModified = driver.findElement(By.cssSelector("input[name='filter_date_modified'] + span button.btn-default"));
        dateModified.click();
        dateModified.click();
    }
    @AfterMethod
    public void tearDown(){

    }
}

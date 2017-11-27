package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class BaseClass {
    protected static WebDriver driver;

    @BeforeSuite
    public static void beforeSuite() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","Here/needs/to/be/path/to/your/local/driver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().fullscreen();
        driver.manage().deleteAllCookies();
        System.out.println("Test started...");
        driver.get("https://www.google.com");
    }


    @AfterSuite
    public static void afterSuite() {
        driver.quit();
        System.out.println("Test finished...");
    }

    public void verifyElementIsPresrent(WebElement el){

        try {
            el.isDisplayed();
            System.out.println("Element is present");
        }catch (NoSuchElementException e){
            e.printStackTrace();
        }
    }
}

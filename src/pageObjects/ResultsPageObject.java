package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utility.BaseClass;

public class ResultsPageObject extends BaseClass{

    // Locators
    private WebElement searchLine = driver.findElement(By.id("gs_htif0"));

    //Methods
    public void verifyElements(){
        verifyElementIsPresrent(searchLine);
    }
}

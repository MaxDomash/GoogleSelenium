package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utility.BaseClass;

public class HomePageObject extends BaseClass{

    // Locators
   private  WebElement inputField = driver.findElement(By.id("lst-ib"));
   private  WebElement logo = driver.findElement(By.id("hplogo"));
   private WebElement btn = driver.findElement(By.name("btnK"));


    // Methods
    public void enterTextAndSubmit(String str){

        inputField.sendKeys(str + "\n");
    }

    public void verifyHomePageElements(){
        verifyElementIsPresrent(logo);
        verifyElementIsPresrent(btn);
    }
}

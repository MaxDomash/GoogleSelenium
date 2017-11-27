package tests;

import org.testng.annotations.Test;
import pageObjects.HomePageObject;
import pageObjects.ResultsPageObject;
import utility.BaseClass;

public class BasicTests extends BaseClass {

    @Test
    public void homePageTest1_enterText(){
         new HomePageObject().enterTextAndSubmit("blabla");
    }

    @Test
    public void homePageTest2_getText(){
        new HomePageObject().verifyHomePageElements();
    }

    @Test
    public void resultPageTest1_verifyElements(){
        new HomePageObject().enterTextAndSubmit("blabla");
        new ResultsPageObject().verifyElements();
    }
}

package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import utilities.Driver;

public class US_1_7_23_26_Resul {


    @Test
    public void homePageTest(){

    // https://qa.smartcardlink.com anasayfasina gidin
    Driver.getDriver().get("https://qa.smartcardlink.com");

    // Anasayfanin goruntulendigini test edin
    HomePage homePage=new HomePage();
    Assert.assertTrue(homePage.siteLogoX.isDisplayed());
    Driver.closeDriver();









}
    }



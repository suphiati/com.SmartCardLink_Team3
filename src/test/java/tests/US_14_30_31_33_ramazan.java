package tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.devtools.v85.network.model.DataReceived;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AdminDashboard;
import pages.HomePage;
import pages.InPage;
import pages.UserDashboard;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_14_30_31_33_ramazan extends InPage {


@Test
    public void uS14(){

    initialize();

    Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));

    homePage.signInButton.click();

    homePage.emailKutusu.sendKeys(ConfigReader.getProperty("ramazanEmail"));
    homePage.passwordKutusu.sendKeys(ConfigReader.getProperty("ramazanCurrentPassword"));
    homePage.loginButonu.click();
    ReusableMethods.wait(3);
    userDashboard.kullaniCikisBolumu.click();
    ReusableMethods.wait(1);
    userDashboard.changePasswordButonu.click();
    ReusableMethods.wait(1);
   userDashboard.currentPasswordKutusu.sendKeys(ConfigReader.getProperty("ramazanCurrentPassword"));
   userDashboard.newPasswordKutusu.sendKeys(ConfigReader.getProperty("ramazanNewPassword"));
   userDashboard.confirmPasswordKutusu.sendKeys(ConfigReader.getProperty("ramazanNewPassword"));
   userDashboard.changePasswordSaveButonu.click();
   ReusableMethods.wait(1);

    Assert.assertTrue(userDashboard.passwordSuccesfullyChangedYaziElementi.isDisplayed());

    ReusableMethods.wait(5);


    //Dili degistirmek icin

    userDashboard.kullaniCikisBolumu.click();
    ReusableMethods.wait(1);
    userDashboard.changeLanguageButonu.click();
    userDashboard.languageSwitchButton.click();
    userDashboard.dilSeçmeMetinKutusu.sendKeys("English"+ Keys.ENTER);
    userDashboard.changeLanguageSaveButonu.click();

    Assert.assertTrue(userDashboard.passwordSuccesfullyChangedYaziElementi.isDisplayed());
    ReusableMethods.wait(3);

    userDashboard.kullaniCikisBolumu.click();
    userDashboard.signOutButonu.click();
    ReusableMethods.wait(1);

    Assert.assertTrue(homePage.emailKutusu.isDisplayed());



    Driver.closeDriver();
    }

    @Test
    public void uS30(){
        initialize();

        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
        homePage.signInButton.click();

        homePage.emailKutusu.sendKeys(ConfigReader.getProperty("ramazanEmail"));
        homePage.passwordKutusu.sendKeys(ConfigReader.getProperty("ramazanCurrentPassword"));
        homePage.loginButonu.click();


    }
}

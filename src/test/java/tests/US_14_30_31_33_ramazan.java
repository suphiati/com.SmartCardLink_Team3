package tests;

import org.openqa.selenium.devtools.v85.network.model.DataReceived;
import org.testng.annotations.Test;
import pages.AdminDashboard;
import pages.HomePage;
import pages.UserDashboard;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_14_30_31_33_ramazan {
    HomePage homePage=new HomePage();
    UserDashboard userDashboard=new UserDashboard();
    AdminDashboard adminDashboard=new AdminDashboard();

@Test
    public void uS14(){

    Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));

    homePage.signInButton.click();

    homePage.emailKutusu.sendKeys(ConfigReader.getProperty("ramazanEmail"));
    homePage.passwordKutusu.sendKeys(ConfigReader.getProperty("ramazanCurrentPassword"));
    homePage.loginButonu.click();
    ReusableMethods.wait(3);
    userDashboard.kullaniCikisBolumu.click();
    ReusableMethods.wait(1);
    userDashboard.changePasswordButonu.click();
   userDashboard.currentPasswordKutusu.sendKeys(ConfigReader.getProperty("ramazanCurrentPassword"));
   userDashboard.newPasswordKutusu.sendKeys(ConfigReader.getProperty("ramazanNewPassword"));
   userDashboard.confirmPasswordKutusu.sendKeys(ConfigReader.getProperty("ramazanNewPassword"));
   userDashboard.changePasswordSaveButonu.click();
    ReusableMethods.wait(3);


    Driver.closeDriver();
    }
}

package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AdminDashboard;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class US_17_34_35_Eren extends TestBaseRapor {

    HomePage homePage=new HomePage();
    AdminDashboard adminDashboard= new AdminDashboard();
    @Test
    public void us_034_subscriberDeleteTest() {
        extentTest=extentReports.createTest("us_034_subscriberDeleteTesti","kullanici admin olarak giris yapar.Subscriber'lari siler ve sildigini dogrular");
        //kullanici verilen url'e gider
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
        extentTest.info("kullanici verilen url'e gider");


        //kullanici sign in butonuna tiklar
        homePage.signInButton.click();
        extentTest.info("kullanici sign in butonunu tiklar");

        //kullanici admin bilgilerini girer ve login butonuna basar
        homePage.emailKutusu.sendKeys(ConfigReader.getProperty("admin_username1"));
        extentTest.info("email kutusuna verilen email'i girer");

        homePage.passwordKutusu.sendKeys(ConfigReader.getProperty("admin_password1"));
        extentTest.info("password kutusuna verilen password'u girer");

        homePage.loginButonu.click();
        extentTest.info("login butonuna tiklar");

        //AdminKullanici acilan Admin Dashboard sayfasinda users sayfasina tiklar

        adminDashboard.usersSayfasi.click();
        extentTest.info("acilan AdminDashboard sayfasinda users sayfasina tiklar");


        //AdminKullanici acilan users sayfasinda subscriberi goruntuleyebildigini ve aboneligin aktif oldugunu test eder
        Assert.assertTrue(adminDashboard.usersSayfasiKullaniciElementi.isDisplayed());
        extentTest.info("acilan users sayfasinda subscriberi goruntuleyebildigini test eder");


        Assert.assertTrue(adminDashboard.usersSayfasiActiveButonu.isDisplayed());
        extentTest.info("acilan users sayfasinda subscriberin aboneliginin aktif oldugunu test eder");


        //AdminKullanici subscriber'i siler ve silebildigini dogrular
        adminDashboard.usersSayfasiDeleteElementi.click();
        adminDashboard.usersSayfasiDeleteOnayButonu.click();
        extentTest.info("subscriber'i siler");
        ReusableMethods.wait(2);




        Assert.assertTrue(adminDashboard.usersSayfasiDeleteOnayYazisi.isDisplayed());
        extentTest.info("subscriber'i silebildigini dogrular");
        ReusableMethods.wait(2);


        //AdminKullanici sayfayi kapatir
        Driver.closeDriver();
        extentTest.info("sayfayi kapatir");
    }

}

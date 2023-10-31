package tests;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
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

import java.security.Key;

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

        //Siteye gidin
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));

        //Sign in butonuna basin
        homePage.signInButton.click();

        //Geçerli admin bilgilerini girip basarili bir sekilde giris yapin
        homePage.emailKutusu.sendKeys(ConfigReader.getProperty("admin_username2"));
        homePage.passwordKutusu.sendKeys(ConfigReader.getProperty("admin_password1"));
        homePage.loginButonu.click();

        //Panelden "Countries"e tiklayin
        adminDashboard.countriesButton.click();

        //Sayfada toplam ulke sayisinin gorunur oldugunu test edin
        Assert.assertTrue(adminDashboard.toplamCountriesYazisi.isDisplayed());

        //Yeni ulke eklemek icin new country butonuna basin
        adminDashboard.newCountryButton.click();

        //Eklemek istediginiz ulkelerin bilgilerini giriniz ve save tusuna tiklayin
        adminDashboard.ulkeIsimKutusu.sendKeys(ConfigReader.getProperty("eklenmekIstenenUlkeAdi"));
        adminDashboard.shortCodeKutusu.sendKeys(ConfigReader.getProperty("eklenmekIstenenUlkeShortCode"));
        ReusableMethods.wait(1);
        adminDashboard.ulkeEklemeSaveButonu.click();

        ReusableMethods.wait(5);

        //Bilgileri girilen ulkenin listede olup olmadigini test edin
        Assert.assertEquals(ConfigReader.getProperty("eklenmekIstenenUlkeAdi"),adminDashboard.countryTableIlkKare.getText());
        ReusableMethods.wait(2);

        //Sonraki testler icin eklenen ulkeyi silin
        adminDashboard.ilkSıradakiUlkeyiSilmeButonu.click();
        adminDashboard.ilkSıradakiUlkeyiSilmeOnayButonu.click();
        ReusableMethods.wait(3);

        //States bölümüne gecin
        adminDashboard.statesSayfasi.click();
        ReusableMethods.wait(3);

        //Toplam eyalet sayisinin goruntulenebilir oldugunu test edin
        System.out.println(adminDashboard.toplamEyaletSonucYazisi.getText());
        Assert.assertTrue(adminDashboard.toplamEyaletSonucYazisi.isDisplayed());

        //New State butonuna basin
        adminDashboard.newStateButton.click();

        //Olusturmak istediginiz eyalet adini giriniz
        adminDashboard.eyaletIsmiKutusu.sendKeys("atest");
        //Eyaletin baglanacagi ulkeyi secin
        adminDashboard.eyaletinBaglanacagiUlkeKutusu.click();
        ReusableMethods.wait(1);
        adminDashboard.getEyaletinBaglanacagiUlkeninYazilacagiKutu.sendKeys("angola"+Keys.ENTER);

        adminDashboard.ulkeEklemeSaveButonu.click();

        ReusableMethods.wait(3);

        //Eklediginiz eyaletin basariyla eklendigini test edin
        Assert.assertEquals(ConfigReader.getProperty("eklenmekIstenenEyaletAdi"),
                adminDashboard.countryTableIlkKare.getText());

        //Sonraki testler icin eklenen eyaleti silin
        adminDashboard.eyaletSilmeKutusu.click();
        adminDashboard.ilkSıradakiUlkeyiSilmeOnayButonu.click();
        ReusableMethods.wait(5);


    }







    @Test
    public void us30CitiesBolumu(){
    initialize();

        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
        homePage.signInButton.click();

        //Geçerli admin bilgilerini girip basarili bir sekilde giris yapin
        homePage.emailKutusu.sendKeys(ConfigReader.getProperty("admin_username2"));
        homePage.passwordKutusu.sendKeys(ConfigReader.getProperty("admin_password1"));
        homePage.loginButonu.click();
        adminDashboard.countriesButton.click();

        //Cities bolumune gecin
        adminDashboard.citiesSayfasi.click();

        ReusableMethods.wait(3);
    }


}

package tests;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AdminDashboard;
import pages.UserDashboard;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_12_28_29_32_Suphi {

    UserDashboard userDashboardPage = new UserDashboard();
    AdminDashboard adminDashboard = new AdminDashboard();


    @Test
    public void US12_AyarlarGirisDogrulama() {
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
        //*** hata almamın sebebi Path From Content Root bende "configuration.properties" iken, burada ConfigReader class ında "src/configuration.properties


        userDashboardPage.signIn.click();
        ReusableMethods.wait(1);

        userDashboardPage.kullaniciAdi.sendKeys("atilim_88@hotmail.com");
        userDashboardPage.kullaniciSifre.sendKeys("123456Suphi.");
        userDashboardPage.loginButonu.click();

        userDashboardPage.ayarlarButonu.click();
        ReusableMethods.wait(2);

        String expectedSettings = "Settings";
        String actualSettings = userDashboardPage.settingsBasligi.getText();

        Assert.assertEquals(actualSettings, expectedSettings);

        // Kimlik bilgileri görüntüleme ve değiştirme

        String expectedCredentials = "Credentials";
        String actualCredentials = userDashboardPage.credentialsBasligi.getText();
        Assert.assertEquals(actualCredentials, expectedCredentials);


        // Saat formatı degistirme
        userDashboardPage.saatformati12.click();
        userDashboardPage.saatformati24.click();

        userDashboardPage.saveButonu.click();
        ReusableMethods.wait(1);

        String expectedAlertNotu = "Settings updated successfully";
        String actualAlert = userDashboardPage.guncellemeDogrulama.getText();
        Assert.assertTrue(actualAlert.contains(expectedAlertNotu));


        //Enable Contact
        userDashboardPage.enableContactButton.click();

        userDashboardPage.saveButonu.click();
        ReusableMethods.wait(2);

        String expectedAlertNotuEnableContact = "Settings updated successfully";
        String actualAlertEnableContact = userDashboardPage.guncellemeDogrulama.getText();
        Assert.assertTrue(actualAlertEnableContact.contains(expectedAlertNotuEnableContact));

        ReusableMethods.wait(8);

        //Hide vCard Sticky Bar
        userDashboardPage.hideStickyBarButonu.click();

        userDashboardPage.saveButonu.click();
        ReusableMethods.wait(3);

        String expectedAlertNotuHideBar = "Settings updated successfully";
        String actualAlertHideBar = userDashboardPage.guncellemeDogrulama.getText();
        Assert.assertTrue(actualAlertHideBar.contains(expectedAlertNotuHideBar));

        ReusableMethods.wait(8);

        //WhatssApp Share
        userDashboardPage.whatasappShareButonu.click();

        userDashboardPage.saveButonu.click();
        ReusableMethods.wait(3);

        String expectedAlertNotuWhatsApp = "Settings updated successfully";
        String actualAlertWhatsApp = userDashboardPage.guncellemeDogrulama.getText();
        Assert.assertTrue(actualAlertWhatsApp.contains(expectedAlertNotuWhatsApp));

        ReusableMethods.wait(8);

        // Currency Secimi
        userDashboardPage.selectCurrencyDollar.click();
        userDashboardPage.currencyBox.sendKeys("EURO" + Keys.ENTER);
        //userDashboardPage.currencyEuroSecimi.click();

        userDashboardPage.saveButonu.click();
        ReusableMethods.wait(3);

        String expectedAlertNotuCurrency = "Settings updated successfully";
        String actualAlertCurreny = userDashboardPage.guncellemeDogrulama.getText();
        Assert.assertTrue(actualAlertCurreny.contains(expectedAlertNotuCurrency));

        userDashboardPage.currencyEuroSecimi.click();
        userDashboardPage.currencyBox.sendKeys("Dollar" + Keys.ENTER);
        ReusableMethods.wait(1);
        userDashboardPage.saveButonu.click();
        ReusableMethods.wait(2);

        // Stripe seçimi
        userDashboardPage.stripeEnableButonu.click();
        userDashboardPage.stripeKeyBox.sendKeys("4242424242424242");
        userDashboardPage.stripeSecretBox.sendKeys("567");

        userDashboardPage.saveButonu.click();
        ReusableMethods.wait(2);
        String expectedAlertNotuStripe = "Settings updated successfully";
        String actualAlertStripe = userDashboardPage.guncellemeDogrulama.getText();
        Assert.assertTrue(actualAlertStripe.contains(expectedAlertNotuStripe));
        ReusableMethods.wait(2);

        //userDashboardPage.stripeKeyBox.sendKeys(Keys.DELETE);
        userDashboardPage.stripeKeyBox.click();
        userDashboardPage.stripeKeyBox.clear();
        userDashboardPage.stripeSecretBox.click();
        userDashboardPage.stripeSecretBox.clear();
        ReusableMethods.wait(1);
        userDashboardPage.stripeEnableButonu.click();

        userDashboardPage.saveButonu.click();
        ReusableMethods.wait(8);


        //Paypal secimi
        userDashboardPage.paypalEnableDisableButonu.click();
        ReusableMethods.wait(1);
        userDashboardPage.paypalClientIdBox.sendKeys("123456789");
        userDashboardPage.paypalSecretBox.sendKeys("0000");
        userDashboardPage.paypalModeBox.sendKeys("Normal");

        userDashboardPage.saveButonu.click();
        ReusableMethods.wait(2);

        String expectedAlertNotuPaypal = "Settings updated successfully";
        String actualAlertPaypal = userDashboardPage.guncellemeDogrulama.getText();
        Assert.assertTrue(actualAlertPaypal.contains(expectedAlertNotuPaypal));

        ReusableMethods.wait(1);

        userDashboardPage.paypalClientIdBox.click();
        userDashboardPage.paypalClientIdBox.clear();
        userDashboardPage.paypalSecretBox.click();
        userDashboardPage.paypalSecretBox.clear();
        userDashboardPage.paypalModeBox.click();
        userDashboardPage.paypalModeBox.clear();
        ReusableMethods.wait(1);
        userDashboardPage.paypalEnableDisableButonu.click();

        userDashboardPage.saveButonu.click();
        ReusableMethods.wait(1);

        userDashboardPage.kullaniCikisBolumu.click();
        userDashboardPage.signOut.click();
        ReusableMethods.wait(2);


        Driver.closeDriver();


    }

    @Test
    public void US28AdminDashBoard(){

        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));

        // Admin olarak sayfaya giriş
        ReusableMethods.wait(1);
        adminDashboard.signIn.click();
        adminDashboard.AdminAdi.sendKeys("admin07@smartcardlink.com");
        adminDashboard.AdminSifre.sendKeys("123123123");
        adminDashboard.loginButonu.click();

        //Withdraw Transactions sayfasına giriş

        adminDashboard.withdrawTransactions.click();
        String expectedwithdrawTitle="Withdraw Transactions";
        String actualWithdrawTitle=adminDashboard.withdrawTransactions.getText();

        Assert.assertEquals(actualWithdrawTitle,expectedwithdrawTitle);

        //User onay
        String expectedUserBasligi="USER";
        String actualUserBasligi=adminDashboard.userBasligi.getText();
        Assert.assertTrue(actualUserBasligi.contains(expectedUserBasligi));

        String expectedTestUser="elff931@gmail.com";
        String actualTestUser=adminDashboard.odemeYapilacakKisiAdi.getText();
        Assert.assertTrue(actualTestUser.contains(expectedTestUser));

        //Amount onay
        String expectedAmountBasligi="AMOUNT";
        String actualAmountBasligi=adminDashboard.amountBasligi.getText();
        Assert.assertEquals(actualAmountBasligi,expectedAmountBasligi);

        String expectedOdenenMiktar="$10.00";
        String actualOdenenMiktar=adminDashboard.odemeTutari.getText();
        Assert.assertTrue(actualOdenenMiktar.contains(expectedOdenenMiktar));

        //Payment Type onay
        String expectedPaymentBasligi="PAYMENT TYPE";
        String actualPaypemetBasligi=adminDashboard.paymentTypeBasligi.getText();
        Assert.assertTrue(actualPaypemetBasligi.contains(expectedPaymentBasligi));

        String expectedOdemeCesidi="Cash";
        String actualOdemeCesidi=adminDashboard.odemeTipi.getText();
        Assert.assertTrue(actualOdemeCesidi.contains(expectedOdemeCesidi));

        //Tarih onay
        String expectedDateBasligi="DATE";
        String actualDateBasligi=adminDashboard.dateBasligi.getText();
        Assert.assertTrue(actualDateBasligi.contains(expectedDateBasligi));

        String expectedTarih="30th Sep, 2023";
        String actualTarih=adminDashboard.odemeTarihi.getText();
        Assert.assertTrue(actualTarih.contains(expectedTarih));

        adminDashboard.kullaniCikisBolumu.click();
        adminDashboard.signOut.click();
        ReusableMethods.wait(2);


        Driver.closeDriver();


    }


    @Test
    public void US29_ParaBirimleri() {

        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));

        ReusableMethods.waitForPageToLoad(5);

        // Admin olarak sayfaya giriş
        adminDashboard.signIn.click();
        adminDashboard.AdminAdi.sendKeys("admin07@smartcardlink.com");
        adminDashboard.AdminSifre.sendKeys("123123123");
        adminDashboard.loginButonu.click();


        //Currencies secim sayisi
        adminDashboard.currencies.click();

        String expectedSayfaveToplamBilgisi = "Showing 1 to 10 of 135 results";
        String actualSyfaveToplamBilgisi = adminDashboard.sayfaveCurrenciesToplam.getText();
        Assert.assertEquals(actualSyfaveToplamBilgisi, expectedSayfaveToplamBilgisi);

        String expectedToplamCurrencies = "135";
        String actualTOplamCurrencies = adminDashboard.toplamCurrencies.getText();
        Assert.assertEquals(actualTOplamCurrencies, expectedToplamCurrencies);

        adminDashboard.kullaniCikisBolumu.click();
        adminDashboard.signOut.click();
        ReusableMethods.wait(2);

        Driver.closeDriver();

    }

    @Test
    public void US32CouponTesti(){
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));

        ReusableMethods.waitForPageToLoad(5);

        // Admin olarak sayfaya giriş
        adminDashboard.signIn.click();
        adminDashboard.AdminAdi.sendKeys("admin07@smartcardlink.com");
        adminDashboard.AdminSifre.sendKeys("123123123");
        adminDashboard.loginButonu.click();
    }

}

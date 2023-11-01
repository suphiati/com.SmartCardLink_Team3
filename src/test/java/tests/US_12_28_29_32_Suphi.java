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


    AdminDashboard adminDashboardPage = new AdminDashboard();
    UserDashboard userDashboardPage=new UserDashboard();

    @Test
    public void US12AyarlarGirisDogrulama() {
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));


        userDashboardPage.signIn.click();
        ReusableMethods.wait(1);

        userDashboardPage.kullaniciAdi.sendKeys("suphi@gmail.com");
        userDashboardPage.kullaniciSifre.sendKeys("19A.t.i.88");
        userDashboardPage.loginButonu.click();

        userDashboardPage.ayarlarButonu.click();
        ReusableMethods.wait(2);

        String expectedSettings = "Settings";
        String actualSettings = userDashboardPage.settingsBasligi.getText();

        Assert.assertEquals(actualSettings, expectedSettings);

        // Kimlik bilgileri görüntüleme ve değiştirme

        String expectedCredentials="Credentials";
        String actualCredentials=userDashboardPage.credentialsBasligi.getText();
        Assert.assertEquals(actualCredentials,expectedCredentials);

        // Currency Secimi
        userDashboardPage.selectCurrencyBox.click();
        userDashboardPage.currencyBox.sendKeys("EURO"+ Keys.ENTER);
        //userDashboardPage.currencyEuroSecimi.click();


        // Saat formatı degistirme
        userDashboardPage.saatformati12.click();
        userDashboardPage.saatformati24.click();

        userDashboardPage.saveButonu.click();
        ReusableMethods.wait(1);

        String expectedAlertNotu="Settings updated successfully";
        String actualAlert=userDashboardPage.guncellemeDogrulama.getText();
        Assert.assertTrue(actualAlert.contains(expectedAlertNotu));



        //Enable Contact
        userDashboardPage.enableContactButton.click();

        userDashboardPage.saveButonu.click();
        ReusableMethods.wait(2);

        String expectedAlertNotuEnableContact="Settings updated successfully";
        String actualAlertEnableContact=userDashboardPage.guncellemeDogrulama.getText();
        Assert.assertTrue(actualAlertEnableContact.contains(expectedAlertNotuEnableContact));

        ReusableMethods.wait(10);

        //Hide vCard Sticky Bar
        userDashboardPage.hideStickyBarButonu.click();

        userDashboardPage.saveButonu.click();
        ReusableMethods.wait(3);

        String expectedAlertNotuHideBar="Settings updated successfully";
        String actualAlertHideBar=userDashboardPage.guncellemeDogrulama.getText();
        Assert.assertTrue(actualAlertHideBar.contains(expectedAlertNotuHideBar));

        ReusableMethods.wait(10);

        //WhatssApp Share
        userDashboardPage.whatasappShareButonu.click();

        userDashboardPage.saveButonu.click();
        ReusableMethods.wait(3);

        String expectedAlertNotuWhatsApp="Settings updated successfully";
        String actualAlertWhatsApp=userDashboardPage.guncellemeDogrulama.getText();
        Assert.assertTrue(actualAlertWhatsApp.contains(expectedAlertNotuWhatsApp));

        ReusableMethods.wait(10);



        userDashboardPage.saveButonu.click();
        ReusableMethods.wait(3);

        String expectedAlertNotuCurrency="Settings updated successfully";
        String actualAlertCurreny=userDashboardPage.guncellemeDogrulama.getText();
        Assert.assertTrue(actualAlertCurreny.contains(expectedAlertNotuCurrency));

        userDashboardPage.currencyEuroSecimi.click();
        userDashboardPage.currencyBox.sendKeys("Dollar"+Keys.ENTER);
        ReusableMethods.wait(1);
        userDashboardPage.saveButonu.click();
        ReusableMethods.wait(2);

        // Stripe seçimi
        userDashboardPage.stripeEnableButonu.click();
        userDashboardPage.stripeKeyBox.sendKeys("4242424242424242");
        userDashboardPage.stripeSecretBox.sendKeys("567");

        userDashboardPage.saveButonu.click();
        ReusableMethods.wait(2);
        String expectedAlertNotuStripe="Settings updated successfully";
        String actualAlertStripe=userDashboardPage.guncellemeDogrulama.getText();
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
        ReusableMethods.wait(10);


        //Paypal secimi
        userDashboardPage.paypalEnableDisableButonu.click();
        ReusableMethods.wait(1);
        userDashboardPage.paypalClientIdBox.sendKeys("123456789");
        userDashboardPage.paypalSecretBox.sendKeys("0000");
        userDashboardPage.paypalModeBox.sendKeys("Normal");

        userDashboardPage.saveButonu.click();
        ReusableMethods.wait(2);

        String expectedAlertNotuPaypal="Settings updated successfully";
        String actualAlertPaypal=userDashboardPage.guncellemeDogrulama.getText();
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
        adminDashboardPage.signIn.click();
        adminDashboardPage.AdminAdi.sendKeys("admin07@smartcardlink.com");
        adminDashboardPage.AdminSifre.sendKeys("123123123");
        adminDashboardPage.loginButonu.click();

        //Withdraw Transactions sayfasına giriş

        adminDashboardPage.withdrawTransactions.click();
        String expectedwithdrawTitle="Withdraw Transactions";
        String actualWithdrawTitle=adminDashboardPage.withdrawTransactions.getText();

        Assert.assertEquals(actualWithdrawTitle,expectedwithdrawTitle);

        //User onay
        String expectedUserBasligi="USER";
        String actualUserBasligi=adminDashboardPage.userBasligi.getText();
        Assert.assertTrue(actualUserBasligi.contains(expectedUserBasligi));

        adminDashboardPage.kullaniciSirala.click();
        ReusableMethods.wait(1);

        String expectedTestUser="elff931@gmail.com";
        String actualTestUser=adminDashboardPage.odemeYapilacakKisiAdi.getText();
        Assert.assertTrue(actualTestUser.contains(expectedTestUser));

        //Amount onay
        String expectedAmountBasligi="AMOUNT";
        String actualAmountBasligi=adminDashboardPage.amountBasligi.getText();
        Assert.assertEquals(actualAmountBasligi,expectedAmountBasligi);

        String expectedOdenenMiktar="$10.00";
        String actualOdenenMiktar=adminDashboardPage.odemeTutari.getText();
        Assert.assertTrue(actualOdenenMiktar.contains(expectedOdenenMiktar));

        //Payment Type onay
        String expectedPaymentBasligi="PAYMENT TYPE";
        String actualPaypemetBasligi=adminDashboardPage.paymentTypeBasligi.getText();
        Assert.assertTrue(actualPaypemetBasligi.contains(expectedPaymentBasligi));

        String expectedOdemeCesidi="Cash";
        String actualOdemeCesidi=adminDashboardPage.odemeTipi.getText();
        Assert.assertTrue(actualOdemeCesidi.contains(expectedOdemeCesidi));

        //Tarih onay
        String expectedDateBasligi="DATE";
        String actualDateBasligi=adminDashboardPage.dateBasligi.getText();
        Assert.assertTrue(actualDateBasligi.contains(expectedDateBasligi));

        String expectedTarih="30th Sep, 2023";
        String actualTarih=adminDashboardPage.odemeTarihi.getText();
        Assert.assertTrue(actualTarih.contains(expectedTarih));

        adminDashboardPage.kullaniCikisBolumu.click();
        adminDashboardPage.signOut.click();
        ReusableMethods.wait(2);


        Driver.closeDriver();


    }


    @Test
    public void US29_ParaBirimleri() {

        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));

        ReusableMethods.waitForPageToLoad(5);

        // Admin olarak sayfaya giriş
        adminDashboardPage.signIn.click();
        adminDashboardPage.AdminAdi.sendKeys("admin07@smartcardlink.com");
        adminDashboardPage.AdminSifre.sendKeys("123123123");
        adminDashboardPage.loginButonu.click();


        //Currencies secim sayisi
        adminDashboardPage.currencies.click();

        String expectedSayfaveToplamBilgisi = "Showing 1 to 10 of 135 results";
        String actualSyfaveToplamBilgisi = adminDashboardPage.sayfaveCurrenciesToplam.getText();
        Assert.assertEquals(actualSyfaveToplamBilgisi, expectedSayfaveToplamBilgisi);

        String expectedToplamCurrencies = "135";
        String actualTOplamCurrencies = adminDashboardPage.toplamCurrencies.getText();
        Assert.assertEquals(actualTOplamCurrencies, expectedToplamCurrencies);

        adminDashboardPage.kullaniCikisBolumu.click();
        adminDashboardPage.signOut.click();
        ReusableMethods.wait(2);

        Driver.closeDriver();

    }

    @Test
    public void US32CouponTesti(){
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));

        // Admin olarak sayfaya giriş
        adminDashboardPage.signIn.click();
        adminDashboardPage.AdminAdi.sendKeys("admin07@smartcardlink.com");
        adminDashboardPage.AdminSifre.sendKeys("123123123");
        adminDashboardPage.loginButonu.click();


        //Coupon code basligi
        adminDashboardPage.couponCode.click();
        ReusableMethods.wait(1);
        String expectedCouponCodeBasligi="Coupon Codes";
        String actualCouponCodesBasligi= adminDashboardPage.couponCodeBasligi.getText();
        Assert.assertTrue(actualCouponCodesBasligi.contains(expectedCouponCodeBasligi));


        //Yeni kupon kodu ekleme
        String expectedAddCouponCodeBasligi="Add Coupon Code";
        String actualAddCouponCodeBasligi=adminDashboardPage.addCouponCodeButonu.getText();
        Assert.assertTrue(actualAddCouponCodeBasligi.contains(expectedAddCouponCodeBasligi));

        adminDashboardPage.addCouponCodeButonu.click();

//** Fixed Type için
        //Kupon adı
        adminDashboardPage.enterCouponName.sendKeys("FIXED TYPE");

        //Kupon cesidi
        adminDashboardPage.couponTypeFixedButonu.click();

        // İndirim miktari
        adminDashboardPage.couponDiscount.sendKeys("10");

        //son kullanma tarihi
        adminDashboardPage.couponExpireDateSelect.click();
        // adminDashboardPage.expireNextMonth.click();
        adminDashboardPage.couponExpireDay.click();

        //Status
        adminDashboardPage.addCouponStatus.click();

        //Save
        adminDashboardPage.saveCouponCode.click();


        // -- eklenen kupon üzerinde kupon sayfasında yapılan değişiklikler

        //Kupon adını basligi görüntüleme
        ReusableMethods.wait(2);
        String expectedCouponNameBasligi="COUPON NAME";
        String actualCouponNameBasligi=adminDashboardPage.couponNameBasligi.getText();
        Assert.assertEquals(actualCouponNameBasligi,expectedCouponNameBasligi);

        //Kupon adını görüntüleme
        String expectedKuponAdi=adminDashboardPage.enterCouponName.getText();
        String actualKuponAdi=adminDashboardPage.girilenKuponAdi.getText();
        Assert.assertTrue(actualKuponAdi.contains(expectedKuponAdi));

        //Kupon çeşidi basligi görüntüleme
        String expectedCouponTypeBasligi="COUPON TYPE";
        String actualCouponTypeBasligi=adminDashboardPage.couponTypeBasligi.getText();
        Assert.assertEquals(actualCouponTypeBasligi,expectedCouponTypeBasligi);

        //Kupon cesidi
        String expectedCouponType="Fixed";
        String actualCouponType=adminDashboardPage.secilenCouponFixed.getText();
        Assert.assertEquals(actualCouponType,expectedCouponType);

        //kupon indirim görüntüleme
        String expectedCouponDiscount=adminDashboardPage.couponDiscount.getText();
        String actualCouponDiscount=adminDashboardPage.girilenDiscountMiktari.getText();
        Assert.assertTrue(actualCouponDiscount.contains(expectedCouponDiscount));


        //son kullanma tarihigörüntüleme

        String expectedExpireBasligi="EXPIRE AT";
        String actualExpireBasligi=adminDashboardPage.expireAtBasligi.getText();
        Assert.assertTrue(actualExpireBasligi.contains(expectedExpireBasligi));

        //girilen son kullanma tarihi
        String expectedGirilenTarih= "30th Nov, 2023";
        String actualGirlenTarih=adminDashboardPage.girilenExpireAtTarihi.getText();
        Assert.assertTrue(actualGirlenTarih.contains(expectedGirilenTarih));

        // status basligi
        String expectedStatusBasligi="STATUS";
        String actualStatusBasligi=adminDashboardPage.statusBasligi.getText();
        Assert.assertTrue(actualStatusBasligi.contains(expectedStatusBasligi));

        //status degisiklik basarili
        String expectedStatusSuccessDogrulama="Success";
        String actualStatusSuccessDogrulama=adminDashboardPage.statusDegisiklikSuccessBasligi.getText();
        Assert.assertTrue(actualStatusSuccessDogrulama.contains(expectedStatusSuccessDogrulama));

        //action basligi görüntüleme
        String expectedActionBasligi="ACTION";
        String actualActionBasligi=adminDashboardPage.actionBasligi.getText();
        Assert.assertTrue(actualActionBasligi.contains(expectedActionBasligi));

        //action edit kupon butonu
        adminDashboardPage.actionCouponEdit.click();

        ReusableMethods.wait(1);

        //edit kupon kodu bölümü görüntüleme
        String expectedEditCoupon="Edit Coupon Code";
        String actualEditCoupon=adminDashboardPage.editCouponCodeBasligi.getText();
        Assert.assertTrue(actualEditCoupon.matches(expectedEditCoupon));
        ReusableMethods.wait(5);

        //status degistir
        adminDashboardPage.ediCouponStatus.click();

        //değişiklik kaydet
        adminDashboardPage.editCouponSaveButton.click();

        //delete kupon butonu
        ReusableMethods.wait(3);

        adminDashboardPage.couponDelete.click();
        ReusableMethods.wait(1);
        adminDashboardPage.yesDeleteButonu.click();


        //Kupon silindi dogrulama
        String expectedKuponSilindiDogrulama="Coupon Code has been deleted.";
        String actualKuponSilindiDogrulama=adminDashboardPage.kuponSilindiBasligi.getText();
        Assert.assertEquals(actualKuponSilindiDogrulama,expectedKuponSilindiDogrulama);

        ReusableMethods.wait(5);

        adminDashboardPage.addCouponCodeButonu.click();

//** Percentage Type için
        //Kupon adı
        adminDashboardPage.enterCouponName.sendKeys("PERCENTAGETYPE");

        //Kupon cesidi
        adminDashboardPage.couponTypePercentageButonu.click();

        // İndirim miktari
        adminDashboardPage.couponDiscount.click();
        adminDashboardPage.couponDiscount.sendKeys("15");

        //son kullanma tarihi
        adminDashboardPage.couponExpireDateSelect.click();

        adminDashboardPage.couponExpireDay.click();

        ReusableMethods.wait(1);

        //Status
        adminDashboardPage.addCouponStatus.click();

        //Save
        adminDashboardPage.saveCouponCode.click();

        ReusableMethods.wait(2);
        adminDashboardPage.couponDelete.click();
        adminDashboardPage.yesDeleteButonu.click();

        ReusableMethods.wait(1);

        //Kupon silindi dogrulama
        String expectedKuponSilindiDogrulamaPercentage="Coupon Code has been deleted.";
        String actualKuponSilindiDogrulamaPercentage=adminDashboardPage.kuponSilindiBasligi.getText();
        Assert.assertEquals(actualKuponSilindiDogrulamaPercentage,expectedKuponSilindiDogrulamaPercentage);

        ReusableMethods.wait(2);

        Driver.closeDriver();



    }
}


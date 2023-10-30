package tests;

import com.github.javafaker.Faker;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CreateAnAccount;
import pages.HomePage;
import pages.UserDashboard;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_5_8_16_22_ahmet_burak {



    @Test
    public void createAccountTesti(){
        CreateAnAccount createAnAccount = new CreateAnAccount();
        //1- Kullanıcı browser'i açar ve "https://qa.smartcardlink.com" anasayfasına gider.
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
        Driver.getDriver().navigate().refresh();
        //2- Kullanıcı ana sayfada sağ üst köşede bulunan Sign in butonuna tıklar.

        ReusableMethods.wait(3);
        createAnAccount.signInButtonElementi.click();

        //3- Sign in sayfası açıldığında login butonu altında çıkan Create an account butonuna tıklar.
        createAnAccount.createAccountButtonElementi.click();

        //4- Kayıt sayfası açıldığında first name, last name, E-mail, password, confirm password bilgilerini doldurur.
        Faker faker = new Faker();
       createAnAccount.firstNameBox.sendKeys(faker.name().firstName());
       createAnAccount.lastNameBox.sendKeys(faker.name().lastName());
       createAnAccount.emailBox.sendKeys(faker.internet().emailAddress());
       createAnAccount.passwordBox.sendKeys("aloeVera123.");
       createAnAccount.confirmPasswordBox.sendKeys("aloeVera123.");

        //5- Gizlilik politikasını kabul eder ve submit butonuna tıklar.
        createAnAccount.privacyAcceptElementi.click();
        createAnAccount.submitButtonElementi.click();

        //6- "You have registered succesfully." mesajını aldığını test eder.
        ReusableMethods.wait(10);
        Assert.assertTrue(createAnAccount.kayitBasariylaYapildiMesaji.isDisplayed());

        //7- Sayfayı kapatır.
        Driver.closeDriver();
    }



    @Test
    public void appointmentsGoruntulemeTesti(){
        HomePage homePage = new HomePage();
        CreateAnAccount createAnAccount = new CreateAnAccount();
        //1- Kullanıcı browser'i açar ve "https://qa.smartcardlink.com" anasayfasına gider.
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
        Driver.getDriver().navigate().refresh();
        //2- Kullanıcı ana sayfada sağ üst köşede bulunan Sign in butonuna tıklar.

        ReusableMethods.wait(3);
        createAnAccount.signInButtonElementi.click();

        //3- Sınırsız planda açmış olduğu kullanıcı e-mail ve password'ünü yazar ve login butonuna tıklar.

        homePage.emailKutusu.sendKeys("atakentlale@gmail.com");
        homePage.passwordKutusu.sendKeys("Nurum@2323");
        homePage.loginButonu.click();

        //4- Açılan sayfanın sol tarafındaki menüden Appointments'a tıklar.
        homePage.appointmentsElementi.click();
        ReusableMethods.wait(2);

        //5- Appointments sayfasına ulaştığını doğrular.
        Assert.assertTrue(homePage.appointmentsSayfaDogrulamaElementi.isDisplayed());

        //6- Kullanici yeni bir randevu olusturur.
        //YENİ RANDEVU OLUSTURULMUYOR.======BUG======

        ReusableMethods.wait(2);
        //7- Kullanıcı randevularının randevu saysafasında görüldüğünü doğrular.
        Assert.assertTrue(homePage.appointmentsSayfasiSonucYaziElementi.isDisplayed());
        ReusableMethods.wait(2);

        //8- Sayfayı kapatır.
        Driver.closeDriver();
    }



    @Test
    public void vcardOlusturmaTesti(){


        CreateAnAccount createAnAccount = new CreateAnAccount();
        //1- Kullanıcı browser'i açar ve "https://qa.smartcardlink.com" anasayfasına gider.
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
        Driver.getDriver().navigate().refresh();
        //2- Kullanıcı ana sayfada sağ üst köşede bulunan Sign in butonuna tıklar.

        ReusableMethods.wait(3);
        createAnAccount.signInButtonElementi.click();

        //3- Kullanici daha önce acmis oldugu hesabindan sisteme giris yapar.
        HomePage homePage = new HomePage();
        homePage.emailKutusu.sendKeys("atakentlale@gmail.com");
        homePage.passwordKutusu.sendKeys("Nurum@2323");
        homePage.loginButonu.click();

        //4- Açılan sayfanın sol tarafındaki menüden Vcards secenegine tıklar.

        homePage.vcard.click();

        //5- Yeni acilan sayfanin sag üst kosesinde bulunan New VCard butonuna tiklar.
        homePage.newcard.click();

        //6- Kullanici kirmiziyla isaretlenmis doldurulmasi zorunlu alanlari (URL Alias, VCard Name) doldurur.
        Faker faker = new Faker();
        homePage.urlAliasKutusu.sendKeys(faker.internet().url());
        homePage.vcardNameKutusu.sendKeys(faker.name().username());

        //7- Save butonuna tiklar.
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        ReusableMethods.wait(5);
        homePage.vcardSaveButonu.click();

        //8- "VCard created successfully." mesajini aldigini dogrular.
        ReusableMethods.wait(10);
        Assert.assertTrue(homePage.vcardCreatedSuccessfullyYazisi.isDisplayed());

        //9- Kullanici tekrardan sayfanin sol tarafindaki menu seceneginden VCards kismina tiklar.
        homePage.vcardSecenegi.click();

        //10- Sayfanin altinda kayitli olan kartlarin bilgisini veren sonuc yazi elementinin goruntulendigini dogrular.
        ReusableMethods.wait(5);
        Assert.assertTrue(homePage.vcardSayfasiSonucYaziElementi.isDisplayed());

        //11- Vcard ile ilgili sayfadaki tüm işlem butonlarının aktif oldugunu dogrular.
        Assert.assertTrue(homePage.vcardUrlLinkKopyalamaButonu.isEnabled());
        Assert.assertTrue(homePage.vcardStatsButonu.isEnabled());
        Assert.assertTrue(homePage.vcardStatusButonu.isEnabled());
        Assert.assertTrue(homePage.qrKodButonu.isEnabled());
        Assert.assertTrue(homePage.downloadVcardButonu.isEnabled());
        Assert.assertTrue(homePage.enquiriesButonu.isEnabled());
        Assert.assertTrue(homePage.duplicateVcardButonu.isEnabled());
        Assert.assertTrue(homePage.editButonu.isEnabled());
        Assert.assertTrue(homePage.deleteButonu.isEnabled());

        //12- Sayfayi kapatir.
        Driver.closeDriver();

    }
}

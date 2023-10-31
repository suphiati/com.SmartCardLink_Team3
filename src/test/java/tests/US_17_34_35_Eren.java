package tests;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AdminDashboard;
import pages.HomePage;
import pages.InPage;
import pages.UserDashboard;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class US_17_34_35_Eren extends TestBaseRapor {
    HomePage homePage=new HomePage();
    AdminDashboard adminDashboard=new AdminDashboard();

    UserDashboard userDashboard= new UserDashboard();

    @Test
    public void us_17_AffiliationsPageTest1(){//PASSED
        extentTest=extentReports.createTest("AffiliationsPageTest1","Unlimited kullanici unlimited hesap bilgileri ile giris yaptiktan sonra Affilations bolumunde toplam ve guncel tutari goruntuleyebildigini ve davetiye gonderebildigini dogrular");

        //1-Kullanici verilen url'e gider
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
        extentTest.info("kullanici verilen url'e gider");

        //2-Acilan sayfada sign in butonunu tiklar
        homePage.signInButton.click();
        extentTest.info("kullanici sign in butonunu tiklar");

        //3-sign in bolumune admin bilgilerini(email ve password)girer ve login butonuna basarak login olur
        homePage.emailKutusu.sendKeys(ConfigReader.getProperty("erenEmail"));
        homePage.passwordKutusu.sendKeys(ConfigReader.getProperty("erenPassword"));
        homePage.loginButonu.click();
        extentTest.info("sign in bolumde yer alan email ve password kutucuklarina Unlimited kullanici bilgilerini(email ve password)girer ve login butonuna basarak login olur");
        ReusableMethods.wait(2);

        //4-acilan userDashboard sayfasinda affilations bolumune tiklar
        userDashboard.affilationsButonu.click();
        extentTest.info("acilan userdashboard sayfasinda affilations bolumune tiklar");

        //5-Toplam ve guncel tutarin goruntulendigini test eder
        Assert.assertTrue(userDashboard.totalAffilationAmount.isDisplayed());
        extentTest.info("total tutarin goruntulendigini test eder");

        Assert.assertTrue(userDashboard.currentAffilationAmount.isDisplayed());
        extentTest.info("current tutarin goruntulendigini test eder");

        //6-Send invite bolumune tiklar ve davetiye gonderebildigini dogrular
        Faker faker=new Faker();
        userDashboard.affilationsSendInvite.click();

        userDashboard.affilationsSendInviteEmailBox.sendKeys(faker.internet().emailAddress());

        userDashboard.affilationsSendInviteSendMail.click();
        ReusableMethods.wait(2);

        Assert.assertTrue(userDashboard.currentAffilationAmount.isDisplayed());

        extentTest.info("Send invite bolumune tiklar ve davetiye gonderebildigini dogrular");

        //7-Sayfayi kapatir
        Driver.closeDriver();
        extentTest.info("Sayfayi kapatir");
    }

    @Test
    public void us_17_AffiliationsPageTest2(){//PASSED
        extentTest=extentReports.createTest("AffiliationsPageTest2","Unlimited kullanici unlimited hesap bilgileri ile giris yaptiktan sonra Affilations bolumunden para cekme islemi yapabildigini dogrular");

        //1-Kullanici verilen url'e gider
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
        extentTest.info("kullanici verilen url'e gider");

        //2-Acilan sayfada sign in butonunu tiklar
        homePage.signInButton.click();
        extentTest.info("kullanici sign in butonunu tiklar");

        //3-sign in bolumune admin bilgilerini(email ve password)girer ve login butonuna basarak login olur
        homePage.emailKutusu.sendKeys(ConfigReader.getProperty("erenEmail"));
        homePage.passwordKutusu.sendKeys(ConfigReader.getProperty("erenPassword"));
        homePage.loginButonu.click();
        extentTest.info("sign in bolumde yer alan email ve password kutucuklarina Unlimited kullanici bilgilerini(email ve password)girer ve login butonuna basarak login olur");
        ReusableMethods.wait(2);

        //4-acilan userDashboard sayfasinda affilations bolumune tiklar
        userDashboard.affilationsButonu.click();
        extentTest.info("acilan userdashboard sayfasinda affilations bolumune tiklar");

        //5-acilan affilations bolumunde para cekme islemi yapabildigini dogrular
        userDashboard.affilationsWithdraw.click();
        userDashboard.affilationsWithdrawAmount.click();

        userDashboard.enterAmount.sendKeys("1");
        ReusableMethods.wait(1);
        userDashboard.paypalEmail.sendKeys("yusuftuna01@gmail.com");
        ReusableMethods.wait(1);
        userDashboard.withdrawSave.click();
        ReusableMethods.wait(1);

        Assert.assertTrue(userDashboard.withdrawSuccess.isDisplayed());
        extentTest.info("acilan affilations bolumunde para cekme islemi yapabildigini dogrular");

        //6-sayfayi kapatir
        Driver.closeDriver();
        extentTest.info("Sayfayi kapatir");
    }


    @Test
    public void us_034_subscriberDeleteTest() {//PASSED
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

    @Test
    public void us_035_adminOpinionsAndQuestionsTest1(){//PASSED
        extentTest=extentReports.createTest("adminOpinionsAndQuestionsTest1","Admin, bilglieri ile giriş yaptıktan sonra kullanıcı görüşlerini görüntüleyebildiğini ve kullanıcı görüşlerinin içeriğini görüntüleyebildigini doğrular");

        //1-Kullanici verilen url'e gider
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
        extentTest.info("kullanici verilen url'e gider");

        //2-Acilan sayfada sign in butonunu tiklar
        homePage.signInButton.click();
        extentTest.info("kullanici sign in butonunu tiklar");

        //3-sing in bolumune admin bilgilerini(email ve password)gire ve login butonuna basarak login olur
        homePage.emailKutusu.sendKeys(ConfigReader.getProperty("admin_username2"));
        homePage.passwordKutusu.sendKeys(ConfigReader.getProperty("admin_password1"));
        homePage.loginButonu.click();
        extentTest.info("sign in bolumde yer alan email ve password kutucuklarina admin bilgilerini(email ve password)girer ve login butonuna basarak login olur");

        //4-acilan admindashboard sayfasinda Front CMS bolumune tiklar
        adminDashboard.frontCmsSayfasi.click();
        ReusableMethods.wait(1);
        extentTest.info("acilan admindashboard sayfasinda Front CMS bolumune tiklar");

        //5-acilan Front CMS sekmesinde Testimonials kismina tiklar
        adminDashboard.frontCmsSayfasiTestimonialsButton.click();
        ReusableMethods.wait(1);
        extentTest.info("acilan Front CMS sekmesinde Testimonials kismina tiklar");

        //6-Testimonials kisminda gorusleri gorup goremedigini test eder
        Assert.assertTrue(adminDashboard.gorusGoruntulemeElementi.isDisplayed());
        ReusableMethods.wait(2);
        extentTest.info("Testimonials kisminda kullanici goruslerini gorup goremedigini test eder");

        //7-Testimonials kisminda goruslerin iceriginin gorutulendigini test eder
        adminDashboard.gorusIcerikGoruntulemeElementi.click();
        ReusableMethods.wait(2);
        Assert.assertTrue(adminDashboard.gorusIcerikGoruntulemeKontrolElementi.isDisplayed());
        adminDashboard.gorusIcerikGoruntulemeKapatma.click();
        extentTest.info("Testimonials kısmında kullanıcı görüşlerinin içeriğini görütülendiğini test eder");

        //8-Sayfayi kapatir
        Driver.closeDriver();
        extentTest.info("Sayfayi kapatir");

    }

    @Test
    public void us_035_adminOpinionsAndQuestionsTest2() throws AWTException {
        extentTest=extentReports.createTest("adminOpinionsAndQuestionsTest2","Admin, bilglieri ile giriş yaptıktan sonra kullanıcı görüşlerini düzenleyebildiğini  ve yeni kullanıcı görüşü ekleyebildiğini doğrular");

        //1-Kullanici verilen url'e gider
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
        extentTest.info("kullanici verilen url'e gider");

        //2-Acilan sayfada sign in butonunu tiklar
        homePage.signInButton.click();
        extentTest.info("kullanici sign in butonunu tiklar");

        //3-sing in bolumune admin bilgilerini(email ve password)gire ve login butonuna basarak login olur
        homePage.emailKutusu.sendKeys(ConfigReader.getProperty("admin_username2"));
        homePage.passwordKutusu.sendKeys(ConfigReader.getProperty("admin_password1"));
        homePage.loginButonu.click();
        extentTest.info("sign in bolumde yer alan email ve password kutucuklarina admin bilgilerini(email ve password)girer ve login butonuna basarak login olur");

        //4-acilan admindashboard sayfasinda Front CMS bolumune tiklar
        adminDashboard.frontCmsSayfasi.click();
        ReusableMethods.wait(1);
        extentTest.info("acilan admindashboard sayfasinda Front CMS bolumune tiklar");

        //5-acilan Front CMS sekmesinde Testimonials kismina tiklar
        adminDashboard.frontCmsSayfasiTestimonialsButton.click();
        ReusableMethods.wait(1);
        extentTest.info("acilan Front CMS sekmesinde Testimonials kismina tiklar");

        //6-Testimonials kisminda gorusleri duzenleyebildigini test eder
        adminDashboard.gorusDuzenlemeElementi.click();
        ReusableMethods.wait(1);
        adminDashboard.gorusDuzenlemeElementiDescriptionKutusu.sendKeys("Checked");
        ReusableMethods.wait(1);
        adminDashboard.gorusDuzenlemeElementiSaveKutusu.click();
        ReusableMethods.wait(1);

        Assert.assertTrue(adminDashboard.gorusDuzenlemeSuccessYazisi.isDisplayed());
        ReusableMethods.wait(1);
        extentTest.info("Testimonials kisminda gorusleri duzenleyebildigini test eder");

        //7-Testimonials kisminda yeni gorus ekleyebildigini test eder
        adminDashboard.addTestimonialButton.click();
        ReusableMethods.wait(1);
        adminDashboard.addTestimonialNameBox.sendKeys("TestName");
        ReusableMethods.wait(1);
        adminDashboard.addTestimonialDescriptionBox.sendKeys("TestDescription");
        ReusableMethods.wait(2);



        adminDashboard.addTestimonialAddImage.click();
        ReusableMethods.wait(2);


      //  adminDashboard.addTestimonialAddImage.sendKeys("C:\\Users\\Aero\\Desktop\\TestImg.jpg");
        ReusableMethods.wait(1);

        StringSelection resim=new StringSelection("C:\\idea projects\\SmartCardLink_Team3\\a.jpg");
        //StringSelection resim=new StringSelection(System.getProperty("user.dir")+"SmartCardLink_Team3\\a.jpg");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(resim,null);
        Robot robot=new Robot();
        ReusableMethods.wait(1);

        robot.keyPress(KeyEvent.VK_CONTROL);

        robot.keyPress(KeyEvent.VK_V);

        ReusableMethods.wait(1);

        robot.keyRelease(KeyEvent.VK_V);
        robot.keyPress(KeyEvent.VK_CONTROL)  ;



        ReusableMethods.wait(5);


        robot.keyPress(KeyEvent.VK_ENTER);


        ReusableMethods.wait(2);


        adminDashboard.testimonialSave.click();

        Assert.assertTrue(adminDashboard.addTestimonialSuccessElementi.isDisplayed());
        extentTest.info("Testimonials kisminda yeni gorus ekleyebildigini test eder");

        //8-sayfayi kapatir
        Driver.closeDriver();
        extentTest.info("sayfayi kapatir");

    }

    @Test
    public void us_035_adminOpinionsAndQuestionsTest3(){//PASSED
        extentTest=extentReports.createTest("adminOpinionsAndQuestionsTest3","Admin bilglieri ile giriş yaptıktan sonra görüşleri silebildiğini ve Enquiries kisminda soruları görüntüleyebildiğini doğrular ");

        //1-Kullanici verilen url'e gider
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
        extentTest.info("kullanici verilen url'e gider");

        //2-Acilan sayfada sign in butonunu tiklar
        homePage.signInButton.click();
        extentTest.info("kullanici sign in butonunu tiklar");

        //3-sign in bolumune admin bilgilerini(email ve password)gire ve login butonuna basarak login olur
        homePage.emailKutusu.sendKeys(ConfigReader.getProperty("admin_username2"));
        homePage.passwordKutusu.sendKeys(ConfigReader.getProperty("admin_password1"));
        homePage.loginButonu.click();
        extentTest.info("sign in bolumde yer alan email ve password kutucuklarina admin bilgilerini(email ve password)girer ve login butonuna basarak login olur");

        //4-acilan admindashboard sayfasinda Front CMS bolumune tiklar
        adminDashboard.frontCmsSayfasi.click();
        ReusableMethods.wait(1);
        extentTest.info("acilan admindashboard sayfasinda Front CMS bolumune tiklar");

        //5-acilan Front CMS sekmesinde Testimonials kismina tiklar
        adminDashboard.frontCmsSayfasiTestimonialsButton.click();
        ReusableMethods.wait(1);
        extentTest.info("acilan Front CMS sekmesinde Testimonials kismina tiklar");

        //6-Testimonials kisminda gorus silebildigini test eder
        adminDashboard.deleteTestimonialButton.click();
        ReusableMethods.wait(1);
        adminDashboard.deleteTestimonialOnay.click();
        ReusableMethods.wait(1);
        Assert.assertTrue(adminDashboard.deleteTestimonialSuccess.isDisplayed());
        ReusableMethods.wait(1);
        extentTest.info("Testimonials kisminda gorus silebildigini test eder");


        //7-Enquiries kismina tiklar
        adminDashboard.frontCmsSayfasiEnquiriesButton.click();
        extentTest.info("Enquiries kismina tiklar");

        //8-Sorulari goruntuleyebildigini test eder
        Assert.assertTrue(adminDashboard.enquiriesQuestionTable.isDisplayed());
        extentTest.info("Sorulari goruntuleyebildigini test eder");

        //9-Sayfayi kapatir
        Driver.closeDriver();
        extentTest.info("Sayfayi kapatir");

    }
}

package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.InPage;
import pages.UserDashboard;
import utilities.Driver;

public class US_1_7_23_26_Resul extends InPage {


    @Test
    public void US01homePageTest(){

    // https://qa.smartcardlink.com anasayfasina gidin
    Driver.getDriver().get("https://qa.smartcardlink.com");

    // Anasayfanin goruntulendigini test edin
    HomePage homePage=new HomePage();
    //Assert.assertTrue(homePage.siteLogoX.isDisplayed());
    Driver.closeDriver();

}

@Test
    public void US07dashboardPageTesti(){

        //HomePage homePage=new HomePage();
        //UserDashboard userDashboard=new UserDashboard();

        //Kullanici hesap bilgileri ile siteye basarili bir sekilde giris yapmali
    Driver.getDriver().get("https://qa.smartcardlink.com");
    homePage.signInButton.click();
    homePage.emailKutusu.sendKeys("acar-resul-38@hotmail.com");
    homePage.passwordKutusu.sendKeys("Kobra191?");
    homePage.loginButonu.click();

    //Kullanici header kısmında Dashboard yazisinin gorunur oldugunu dogrulamali
    Assert.assertTrue(userDashboard.dashboardYazisi.isDisplayed());

    //Dashboard sayfasinda  Total Active Vcards bilgisi gorunur olmali
    Assert.assertTrue(userDashboard.totalActiveVCardsYazisi.isDisplayed());

    //Dashboard sayfasinda  Total DeActive VCards bilgisi gorunur olmali
    Assert.assertTrue(userDashboard.totalDeActiveVCardsYazisi.isDisplayed());

    //Dashboard sayfasinda  Today Enquiries bilgisi gorunur olmali
    Assert.assertTrue(userDashboard.todayEnquiriesYazisi.isDisplayed());

    //Dashboard sayfasinda  Today Appointments bilgisi gorunur olmali
    Assert.assertTrue(userDashboard.todayAppointmentsYazisi.isDisplayed());

    //Dashboard sayfasinda  Vcard Analytic tablo bilgisi gorunur olmali
    Assert.assertTrue(userDashboard.vcardAnalyticYazisi.isDisplayed());
    Assert.assertTrue(userDashboard.vcardAnalyticGrafikSekli.isDisplayed());

    //Dashboard sayfasinda  Today Appointments randevu bilgisi gorunur olmali
    Assert.assertTrue(userDashboard.todayAppointmentsRandevuBilgiBolumu.isDisplayed());

    //Kullanici Dashboard sayfasinda Switch Charts'ın aktif oldugunu dogrulamali
    // ve tablo degisimlerini goruntuleyebilmeli
    userDashboard.switchChartsButton.click();
    Assert.assertTrue(userDashboard.vcardAnalyticGrafikSekli.isDisplayed());

    //Kullanici Dashboard sayfasinda tarih kısmının aktif oldugunu dogrulamali
    // ve tarih-tablo degisimlerini goruntuleyebilmeli




}
    }
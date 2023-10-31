package tests;

import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import org.openqa.selenium.JavascriptExecutor;
import utilities.ReusableMethods;

import javax.swing.*;
import java.util.Set;

public class US_004_Hasan {

    @Test
    public void tc001(){
        HomePage homePage=new HomePage();
        //1- https://qa.smartcardlink.com/ adresine gidilir.
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));

        //2- Sayfanın footer bölümüne gelinir.
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");

        //3- "Smart Card Link" yazısının görünür olduğudoğrulanır.
        Assert.assertTrue(homePage.footerSmartCardLinkText.isDisplayed());

        //4- "Facebook" iconunun görünür olduğu doğrulanır.
        Assert.assertTrue(homePage.footerFacebookLink.isDisplayed());

        //5- "Twitter" iconunun görünür olduğu doğrulanır.
        Assert.assertTrue(homePage.footerTwitterLink.isDisplayed());

        //6- "Instagram" iconun görünür olduğu doğrulanır.
        Assert.assertTrue(homePage.footerInstagramLink.isDisplayed());

        //7- "Linkedin" iconunun görünür olduğu doğrulanır.
        Assert.assertTrue(homePage.footerLinkedinLink.isDisplayed());

        //8- "Pinterest" iconunun görünür olduğu doğrulanır.
        Assert.assertTrue(homePage.footerPinterestLink.isDisplayed());

        //9- "Terms & Conditions" linkinin görünür olduğu doğrulanır.
        Assert.assertTrue(homePage.footerTermsConditionsLink.isDisplayed());

        //10- "Privacy Policy" linkinin görünür olduğu doğrulanır.
        Assert.assertTrue(homePage.footerPrivacyPolicyLink.isDisplayed());

        //11- "FAQ" linkinin görünür olduğu doğrulanır.
        Assert.assertTrue(homePage.footerFAQLink.isDisplayed());
        ReusableMethods.wait(1);
        Driver.closeDriver();
    }

    @Test
    public void tc002(){
        HomePage homePage=new HomePage();
        SoftAssert softAssert=new SoftAssert();
        //1- https://qa.smartcardlink.com/ adresine gidilir.
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
        //mainWindowHandle değerini tanımla
         String mainWindowHandle = Driver.getDriver().getWindowHandle();

        //2- Sayfanın footer bölümüne gelinir.
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");

        //3- "Facebook" iconuna click yapılınca "https://facebook.com" adresine gittiği doğrulanır
        String expectedFacebookUrl=ConfigReader.getProperty("footerFacebookUrl");
        ReusableMethods.waitAndClick(homePage.footerFacebookLink);
        Driver.getDriver().switchTo().window(ReusableMethods.getNewWindowHandle());   //yeni pencereye geç
        String actualFacebookUrl=Driver.getDriver().getCurrentUrl();
        softAssert.assertEquals(actualFacebookUrl,expectedFacebookUrl,"Facebook URL test FAILED");
        Driver.getDriver().switchTo().window(mainWindowHandle);  //Ana pencereye geri dön

        //4- "Twitter" iconuna click yapılınca "https://twitter.com" adresine gittiği doğrulanır.
        String expectedTwitterUrl=ConfigReader.getProperty("footerTwitterUrl");
        ReusableMethods.waitAndClick(homePage.footerTwitterLink);
        Driver.getDriver().switchTo().window(ReusableMethods.getNewWindowHandle()); //yeni pencereye geç
        String actualTwitterUrl=Driver.getDriver().getCurrentUrl();
        softAssert.assertEquals(actualTwitterUrl,expectedTwitterUrl,"Twitter URL test FAILED");
        Driver.getDriver().switchTo().window(mainWindowHandle);  //Ana pencereye geri dön

        //5- "Instagram" iconuna click yapılınca "https://instagram.com" adresine gittiği doğrulanır.
        String expectedInstagramUrl=ConfigReader.getProperty("footerInstagramUrl");
        ReusableMethods.waitAndClick(homePage.footerInstagramLink);
        Driver.getDriver().switchTo().window(ReusableMethods.getNewWindowHandle()); //yeni pencereye geç
        String actualInstagramUrl=Driver.getDriver().getCurrentUrl();
        softAssert.assertEquals(actualInstagramUrl,expectedInstagramUrl,"Instagram URL test FAILED");
        Driver.getDriver().switchTo().window(mainWindowHandle);  //Ana pencereye geri dön

        //6- "Linkedin" iconuna click yapılınca "https://linkedinç.com" adresine gittiği doğrulanır.
        String expectedLinkedinUrl=ConfigReader.getProperty("footerLinkedinUrl");
        ReusableMethods.waitAndClick(homePage.footerLinkedinLink);
        Driver.getDriver().switchTo().window(ReusableMethods.getNewWindowHandle()); //yeni pencereye geç
        String actualLinkedinUrl=Driver.getDriver().getCurrentUrl();
        softAssert.assertEquals(actualLinkedinUrl,expectedLinkedinUrl,"Linkedin URL test FAILED");
        Driver.getDriver().switchTo().window(mainWindowHandle);  //Ana pencereye geri dön

        //7- "Pinterest" iconuna click yapılınca "https://pinterest.com" adresine gittiği doğrulanır.
        String expectedPinterestUrl=ConfigReader.getProperty("footerPinterestUrl");
        ReusableMethods.waitAndClick(homePage.footerPinterestLink);
        Driver.getDriver().switchTo().window(ReusableMethods.getNewWindowHandle()); //yeni pencereye geç
        String actualPinterestUrl=Driver.getDriver().getCurrentUrl();
        softAssert.assertEquals(actualPinterestUrl,expectedPinterestUrl,"Pinterest URL test FAILED");
        Driver.getDriver().switchTo().window(mainWindowHandle);  //Ana pencereye geri dön

        //8- "Terms & Conditions" linkine click yapılınca "Terms & Conditions" yazısının görünür oluğu doğrulanır.
        ReusableMethods.waitAndClick(homePage.footerTermsConditionsLink);
        Driver.getDriver().switchTo().window(ReusableMethods.getNewWindowHandle()); //yeni pencereye geç
        softAssert.assertTrue(homePage.termsAndConditionsText.isDisplayed(),"Term & Contitions Text test FAILED");
        Driver.getDriver().switchTo().window(mainWindowHandle);  //Ana pencereye geri dön

        //9- "Privacy Policy" linkine tıklandığında "Privacy Policy" yazısının görünür olduğu doğrulanır.
        ReusableMethods.waitAndClick(homePage.footerPrivacyPolicyLink);
        Driver.getDriver().switchTo().window(ReusableMethods.getNewWindowHandle()); //yeni pencereye geç
        softAssert.assertTrue(homePage.privacyPolicyText.isDisplayed(),"Privacy Policy Text test FAILED");
        Driver.getDriver().switchTo().window(mainWindowHandle);  //Ana pencereye geri dön

        //10- "FAQ" linkine tıklandığında "Frequently Asked Questions (FAQ)" yazısının görünür olduğu doğrulanır.
        ReusableMethods.waitAndClick(homePage.footerFAQLink);
        Driver.getDriver().switchTo().window(ReusableMethods.getNewWindowHandle()); //yeni pencereye geç
        softAssert.assertTrue(homePage.fQAText.isDisplayed(),"FQA Text test FAILED");
        Driver.getDriver().switchTo().window(mainWindowHandle);  //Ana pencereye geri dön


        //Tüm sayfaları kapat
        ReusableMethods.wait(1);
        Driver.getDriver().quit();
        softAssert.assertAll();

    }
}

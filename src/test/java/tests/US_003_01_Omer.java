package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

public class US_003_01_Omer {

    @Test
    public void HomePageBodyGorunurlukTestleri() throws IOException {
        HomePage homePage = new HomePage();
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
        //HomePage sayfasi 'SmartCard' bolumu ile ilgili testler
        String smartCardBolumu = homePage.homePageSmartCardBolumu.getText();
        //System.out.println(smartCardBolumu);
        Assert.assertTrue(homePage.homePageSmartCardBolumu.isDisplayed());
        Assert.assertTrue(smartCardBolumu.contains("Smart Card Link"));
        Assert.assertTrue(smartCardBolumu.contains("Prepare an extensive digital business card."));
        Assert.assertTrue(smartCardBolumu.contains("Get Started")); // bu butonun clickable oldugunu diger test'te yapilacak
        Assert.assertTrue(homePage.homePageSmartCardBolumuLogo.isDisplayed());
        //HomePage sayfasi 'Features' bolumu ile ilgili testler
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Assert.assertTrue(homePage.homePageFeaturesBolumuTitle.isDisplayed());
        Assert.assertTrue(homePage.homePageFeaturesBolumuBirinciBolum.isDisplayed());
        Assert.assertTrue(homePage.homePageFeaturesBolumuIkinciBolum.isDisplayed());
        Assert.assertTrue(homePage.homePageFeaturesBolumuUcuncuBolum.isDisplayed());
        Assert.assertTrue(homePage.homePageFeaturesBolumuDorduncuBolum.isDisplayed());
        Assert.assertTrue(homePage.homePageFeaturesBolumuBesinciBolum.isDisplayed());
        Assert.assertTrue(homePage.homePageFeaturesBolumuAltinciBolum.isDisplayed());
        //HomePage sayfasi 'About SmartCard' bolumu ile ilgili testler
        Assert.assertTrue(homePage.homePageAboutSmartCardBolumuBaslik.isDisplayed());
        Assert.assertTrue(homePage.homePageAboutSmartCardBolumuBirinciBolum.isDisplayed());
        Assert.assertTrue(homePage.homePageAboutSmartCardBolumuIkinciBolum.isDisplayed());
        Assert.assertTrue(homePage.homePageAboutSmartCardBolumuUcuncuBolum.isDisplayed());
        //HomePage sayfasi 'Choose a plan that's right for you' bolumu ile ilgili testler
        Assert.assertTrue(homePage.homePageStandart.isDisplayed());
        actions.sendKeys(Keys.PAGE_DOWN).
                sendKeys(Keys.PAGE_DOWN).
                sendKeys(Keys.PAGE_DOWN).
                sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.wait(1);
        Assert.assertTrue(homePage.homePageStandart.isDisplayed());
        Assert.assertTrue(homePage.homePageSilver.isDisplayed());
        homePage.nextButonu.click();
        ReusableMethods.wait(1);
        homePage.nextButonu.click();
        Assert.assertTrue(homePage.homePageGold.isDisplayed());
        Assert.assertTrue(homePage.homePageUnlimited.isDisplayed());
        actions.sendKeys(Keys.PAGE_DOWN).
                sendKeys(Keys.PAGE_DOWN).perform();
        //HomePage sayfasi 'Stories From Our Customers' bolumu ile ilgili testler
        Assert.assertTrue(homePage.homePageStoriesFromCustomersBolumu.isDisplayed());
        ReusableMethods.wait(1);
        homePage.homePageSlidebutton.click();
        ReusableMethods.wait(1);
        String SecondCustomer = Driver.getDriver().findElement(By.xpath("//*[@id='slick-slide11']")).getText();
        ReusableMethods.getScreenshot("SecondCustomer");
        //HomePage sayfasi 'Contact Us' bolumu ile ilgili testler
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Assert.assertTrue(homePage.homePageContactUsAllElements.isDisplayed());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        //HomePage sayfasi 'Subscribe Here' bolumu ile ilgili testler
        Assert.assertTrue(homePage.homePageSubscribeHereBolumu.isDisplayed());




    }
}

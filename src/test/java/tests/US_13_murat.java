package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.UserDashboard;
import utilities.Driver;

import java.time.Duration;

public class US_13_murat {

    WebDriver driver;
    UserDashboard userDashboard;
    HomePage homePage;
    WebDriverWait wait;

    @BeforeMethod
    public void setup() {
        driver = Driver.getDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        userDashboard = new UserDashboard();
        homePage = new HomePage();

        driver.get("https://qa.smartcardlink.com/");

        wait.until(ExpectedConditions.elementToBeClickable(homePage.signInButton)).click();
        homePage.emailKutusu.sendKeys("bymute@gmail.com");
        homePage.passwordKutusu.sendKeys("tomhardy01*");
        homePage.loginButonu.click();
    }

    @Test
    public void userLogin() {
        // Asserting redirection to the user dashboard by checking the URL
        String expectedURL = "https://qa.smartcardlink.com/admin/dashboard";
        String currentURL = driver.getCurrentUrl();
        assert currentURL.equals(expectedURL);
    }

    @Test

    public void viewAccountSettings() {
        //Kullanıcı, sitede "Kullanıcı İsmi"nin üzerinden aşağı açılır menü ile "Account Settings"e erişebilmelidir.
        userDashboard.kullaniCikisBolumu.click();

        // Assert to check if Profile Details Title is displayed
        assert userDashboard.profileDetailsBasligi.isDisplayed();
    }

    @AfterMethod
    public void teardown() {
        Driver.closeDriver();
    }

}

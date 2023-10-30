package tests;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.AdminDashboard;
import pages.HomePage;
import utilities.Driver;

import java.time.Duration;

public class US_19_murat {

    WebDriver driver;
    AdminDashboard adminDashboard;
    HomePage homePage;
    WebDriverWait wait;

    @BeforeMethod
    public void setup() {
        driver = Driver.getDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        adminDashboard = new AdminDashboard();
        homePage = new HomePage();

        driver.get("https://qa.smartcardlink.com/");

        wait.until(ExpectedConditions.elementToBeClickable(homePage.signInButton)).click();
        homePage.emailKutusu.sendKeys("admin07@smartcardlink.com");
        homePage.passwordKutusu.sendKeys("123123123");
        homePage.loginButonu.click();
    }

    @Test
    public void adminLogin() {
        // Asserting redirection to the admin dashboard by checking the URL
        String expectedURL = "https://qa.smartcardlink.com/sadmin/dashboard";
        String currentURL = driver.getCurrentUrl();
        assert currentURL.equals(expectedURL);
    }

    @Test
    public void viewRegisteredUsers() {
        adminDashboard.usersSayfasi.click();

        // Wait until the list of users is displayed
        wait.until(ExpectedConditions.visibilityOf(adminDashboard.kullaniciTablosu));

        // Assert to check if a list of users is displayed
        assert adminDashboard.kullaniciTablosu.isDisplayed();
    }

    @Test
    public void changeUserInformation() {
        Faker faker = new Faker();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        String firstName = faker.name().firstName();  // Generate a random first name

        adminDashboard.usersSayfasi.click();


        if(!adminDashboard.kullaniciTablosuEditButonlari.isEmpty()) { // Check if the list is not empty
            adminDashboard.kullaniciTablosuEditButonlari.get(0).click();
        }

        // Update user details
        wait.until(ExpectedConditions.elementToBeClickable(adminDashboard.firstNameInput));
        adminDashboard.firstNameInput.clear();
        adminDashboard.firstNameInput.sendKeys(firstName); // Use the generated first name

        wait.until(ExpectedConditions.elementToBeClickable(adminDashboard.saveButonu));
        adminDashboard.saveButonu.click();

        // Assert to verify user details were updated
        wait.until(ExpectedConditions.visibilityOf(adminDashboard.successfulMessage));
        assert adminDashboard.successfulMessage.isDisplayed();
    }

    @Test
    public void changePassword() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        Faker faker = new Faker();

        // Generate a random password using Faker
        String randomPassword = faker.internet().password(10, 15, true, true, true);

        wait.until(ExpectedConditions.elementToBeClickable(adminDashboard.usersSayfasi)).click();

        if(!adminDashboard.sifreDegisButonlari.isEmpty()) { // Check if the list is not empty
            wait.until(ExpectedConditions.elementToBeClickable(adminDashboard.sifreDegisButonlari.get(0))).click();
        }

        wait.until(ExpectedConditions.visibilityOf(adminDashboard.yeniSifreInput)).sendKeys(randomPassword);
        wait.until(ExpectedConditions.visibilityOf(adminDashboard.yeniSifreOnayInput)).sendKeys(randomPassword);
        wait.until(ExpectedConditions.elementToBeClickable(adminDashboard.yeniSifreOnayButonu)).click();

        // Assert to verify password was changed
        wait.until(ExpectedConditions.visibilityOf(adminDashboard.yeniSifreOnayMesaji));
        assert adminDashboard.yeniSifreOnayMesaji.isDisplayed();
    }

    @Test
    public void openNewAccount() {
        Faker faker = new Faker();

        String firstName = faker.name().firstName();
        String lastName = faker.name().lastName();
        String email = faker.internet().emailAddress();
        String password = faker.internet().password(8, 15);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.elementToBeClickable(adminDashboard.usersSayfasi)).click();
        wait.until(ExpectedConditions.elementToBeClickable(adminDashboard.addUserButonu)).click();

        adminDashboard.firstNameInput.sendKeys(firstName);
        adminDashboard.lastNameInput.sendKeys(lastName);
        adminDashboard.emailInput.sendKeys(email);
        adminDashboard.passwordInput.sendKeys(password);
        adminDashboard.confirmPasswordInput.sendKeys(password);

        wait.until(ExpectedConditions.elementToBeClickable(adminDashboard.saveButonu)).click();

        // Assert to verify new user was added
        wait.until(ExpectedConditions.visibilityOf(adminDashboard.successfulMessage));
        assert adminDashboard.successfulMessage.isDisplayed();
    }

    @Test
    public void deleteAnAccount() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.elementToBeClickable(adminDashboard.usersSayfasi)).click();

        if(!adminDashboard.deleteButonlari.isEmpty()) { // Check if the list is not empty
            wait.until(ExpectedConditions.elementToBeClickable(adminDashboard.deleteButonlari.get(0))).click();
        }

        wait.until(ExpectedConditions.elementToBeClickable(adminDashboard.deleteOnayButonu)).click();

        // Assert to verify user was deleted
        wait.until(ExpectedConditions.visibilityOf(adminDashboard.deleteOnayMesaji));
        assert adminDashboard.deleteOnayMesaji.isDisplayed();
    }

    @Test
    public void viewUsersActivityStatus() {
        adminDashboard.usersSayfasi.click();

        // Assuming 'is_active' toggles represent the activity status of users.
        assert !adminDashboard.userActivityToggles.isEmpty();

        // Optionally, if you want to ensure that at least one user is active
        boolean foundActive = false;
        for (WebElement toggle : adminDashboard.userActivityToggles) {
            if (toggle.isSelected()) {  // Check if the toggle is checked (meaning the user is active)
                foundActive = true;
                break;
            }
        }
        assert foundActive;
    }

    @Test
    public void viewTotalNumberOfActiveUsers() {
        adminDashboard.usersSayfasi.click();

        // Get the total number of active users displayed on the page using the locator
        String activeUsersCount = adminDashboard.activeUsersCountElement.getText();

        // Convert the String to an integer for assertions
        int activeUsers = Integer.parseInt(activeUsersCount);

        // Assert to check if the number of active users is displayed and greater than 0
        assert activeUsers > 0;
    }

    @AfterMethod
    public void teardown() {
        Driver.closeDriver();
    }

}


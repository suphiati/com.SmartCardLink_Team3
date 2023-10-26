package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HomePage {
    public HomePage(){
        PageFactory.initElements(Driver.getDriver(),this);


    }
    // Header/Features Link
    @FindBy(xpath="//a[text()='Features']")
    public WebElement FeaturesTextLink;

    //Homepage SignIn Button
    @FindBy(xpath = "//a[@class='btn btn-white fs-18 ms-3 d-lg-block d-none']")
    public WebElement signInButton;

    //SignIn emailKutusu
    @FindBy(id = "email")
    public WebElement emailKutusu;

    //SignIn passwordKutusu
    @FindBy(id = "password")
    public WebElement passwordKutusu;

    //SignIn loginButonu
    @FindBy(xpath = "//*[@class='btn btn-primary']")
    public WebElement loginButonu;

    @FindBy(xpath = "")
    public WebElement siteLogoX; // Ramazan hocam bu locate çakışma yapacak. Bunu silebilirsiniz.

    @FindBy(xpath = "//span[text()='Smart Card Link']") //hasan
    public WebElement footerSmartCardLinkText;

    @FindBy(xpath = "//a[@title='Facebook']") //hasan
    public WebElement footerFacebookLink;

    @FindBy(xpath = "//a[@title='Twitter']") //hasan
    public WebElement footerTwitterLink;

    @FindBy(xpath = "//a[@title='Instagram']") //hasan
    public WebElement footerInstagramLink;

    @FindBy(xpath = "//a[@title='Linkedin']") //hasan
    public WebElement footerLinkedinLink;

    @FindBy(xpath = "//a[@title='Pinterest']") //hasan
    public WebElement footerPinterestLink;

    @FindBy(xpath = "//a[text()='Terms & Conditions']") //hasan
    public WebElement footerTermsConditionsLink;

    @FindBy(xpath = "//a[text()='Privacy Policy']") //hasan
    public WebElement footerPrivacyPolicyLink;

    @FindBy(xpath = "//a[text()='FAQ']") //hasan
    public WebElement footFAQLink;




}

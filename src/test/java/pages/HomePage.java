package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;


public class HomePage {
    public HomePage() {
        PageFactory.initElements(Driver.getDriver(), this);

    }

    // Header/Features Link
    @FindBy(xpath = "//a[text()='Features']")
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

    @FindBy(xpath = "(//a[@aria-current='page'])[2]")
    public WebElement vcard;

    @FindBy(xpath = "//a[@type='button']")
    public WebElement newcard;


    // APPOİNTMENTS
    // Dashboard menudeki Appointments seçeneği
    @FindBy(xpath = "//span[text()='Appointments']")
    public WebElement appointmentsElementi;

    // Appointments sayfasi dogrulama elementi
    @FindBy(xpath = "//a[text()='Appointments']")
    public WebElement appointmentsSayfaDogrulamaElementi;

    //  Appointments sayfasi sonuc yazi elementi
    @FindBy(xpath = "//div[@class='col-12 text-muted pagination-record ms-sm-3']")
    public WebElement appointmentsSayfasiSonucYaziElementi;

    //==============================================================================
    // VCARD
    // VCard sayfasindaki save butonu
    @FindBy(xpath = "//input[@id='vcardSaveBtn']")
    public WebElement vcardSaveButonu;

    // VCard sayfasi sonuc yazi elementi
    @FindBy(xpath = "/html/body/div[1]/div/div[3]/div[2]/div/div/div/div/div/div[6]/div[2]/div/strong")
    public WebElement vcardSayfasiSonucYaziElementi;

    //  Dashboard menudeki VCard seçeneği
    @FindBy(xpath = "(//span[@class='aside-menu-icon pe-3'])[2]")
    public WebElement vcardSecenegi;

    // Vcard sayfasindaki New Vcard butonu
    @FindBy(linkText = "New VCard")
    public WebElement newVcardButonu;

    // New Vcard sayfasi URL Alias kutusu
    @FindBy(id = "vcard-url-alias")
    public WebElement urlAliasKutusu;

    // New Vcard sayfasi Vcard Name kutusu
    @FindBy(xpath = "(//input[@class='form-control'])[2]")
    public WebElement vcardNameKutusu;

    // Vcard sayfasi, vcard'in Url linkini kopyalama butonu
    @FindBy(xpath = "(//*[@title='copy'])[1]")
    public WebElement vcardUrlLinkKopyalamaButonu;

    // Vcard sayfasi, Stats butonu
    @FindBy(xpath = "(//*[@data-icon='chart-line'])[1]")
    public WebElement vcardStatsButonu;

    // Vcard sayfasi, Status butonu
    @FindBy(xpath = "//input[@data-id='211']")
    public WebElement vcardStatusButonu;

    // Vcard sayfasında, Action yazısının altindaki Qr kod butonu
    @FindBy(xpath = "(//*[@fill='currentColor'])[19]")
    public WebElement qrKodButonu;

    // Vcard sayfasında, Action yazısının altindaki download Vcard Butonu
    @FindBy(xpath = "(//*[@fill='currentColor'])[20]")
    public WebElement downloadVcardButonu;

    // Vcard sayfasında, Action yazısının altindaki enquiries Butonu
    @FindBy(xpath = "(//*[@fill='currentColor'])[21]")
    public WebElement enquiriesButonu;

    // Vcard sayfasında, Action yazısının altindaki duplicate Vcard Butonu
    @FindBy(xpath = "(//*[@fill='currentColor'])[22]")
    public WebElement duplicateVcardButonu;

    // Vcard sayfasında, Action yazısının altindaki edit Butonu
    @FindBy(xpath = "(//*[@fill='currentColor'])[23]")
    public WebElement editButonu;

    // Vcard sayfasında, Action yazısının altindaki delete Butonu
    @FindBy(xpath = "(//*[@fill='currentColor'])[24]")
    public WebElement deleteButonu;

    // Vcard basariyla olusturuldu mesaji
    @FindBy(xpath = "/html/body/div[1]/div/div[3]/div[2]/div/div/div[2]/div")
    public WebElement vcardCreatedSuccessfullyYazisi;

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

    // =============================HOME PAGE BODY ELEMENTLERİ =================================
    //        ============================== Smart Card Bolumu ==============================
    @FindBy(xpath = "//*[@class='hero-content '] ")
    public WebElement homePageSmartCardBolumu;

    @FindBy(xpath = " //*[@src=' https://smartcardlink.com//uploads/front_cms/10/Adsız-tasarım-(25).png']")
    public WebElement homePageSmartCardBolumuLogo;
    //                    ============== Features Bolumu =======================
    @FindBy(xpath = "(//*[@class='container'])[3]")
    public WebElement homePageFeaturesBolumuTitle;                                  // Features basligi

    @FindBy(xpath = "(//*[@class='feature-card card h-100 flex-row me-md-2'])[1]")
    // Features basligi altındaki 'Share... ile baslayan kisim'
    public WebElement homePageFeaturesBolumuBirinciBolum;
    @FindBy(xpath = "(//*[@class='feature-card card h-100 flex-row me-md-2'])[2]")
    // Features basligi altındaki 'Scan... ile baslayan kisim'
    public WebElement homePageFeaturesBolumuIkinciBolum;
    @FindBy(xpath = "(//*[@class='feature-card card h-100 flex-row me-md-2'])[3]")
    // Features basligi altındaki 'Social... ile baslayan kisim'
    public WebElement homePageFeaturesBolumuUcuncuBolum;
    @FindBy(xpath = "(//*[@class='feature-card card h-100 flex-row me-md-2'])[4]")
    // Features basligi altındaki 'Various... ile baslayan kisim'
    public WebElement homePageFeaturesBolumuDorduncuBolum;
    @FindBy(xpath = "(//*[@class='feature-card card h-100 flex-row me-md-2'])[5]")
    // Features basligi altındaki 'Pricing... ile baslayan kisim'
    public WebElement homePageFeaturesBolumuBesinciBolum;
    @FindBy(xpath = "(//*[@class='feature-card card h-100 flex-row me-md-2'])[6]")
    // Features basligi altındaki 'Click... ile baslayan kisim'
    public WebElement homePageFeaturesBolumuAltinciBolum;
    //                      ============== About SmartCard Bolumu =======================

    @FindBy(xpath = "//*[@id='frontAboutTabUsTab']")
    public WebElement homePageAboutSmartCardBolumuBaslik;             // About SmartCard title

    @FindBy(xpath = "(//*[@class='col-12 margin-b-80px'])[1]")
    // About SmartCard basligi altındaki 'QR Code... ile baslayan kisim'
    public WebElement homePageAboutSmartCardBolumuBirinciBolum;
    @FindBy(xpath = "(//*[@class='col-12 margin-b-80px'])[2]")
    // About SmartCard basligi altındaki 'Customization... ile baslayan kisim'
    public WebElement homePageAboutSmartCardBolumuIkinciBolum;
    @FindBy(xpath = "(//*[@class='col-12 margin-b-80px'])[3]")
    // About SmartCard basligi altındaki 'Real-Time Updates... ile baslayan kisim'
    public WebElement homePageAboutSmartCardBolumuUcuncuBolum;

    //                         ============== 'Choose a plan that's right for you' Bolumu =======================
    @FindBy(xpath = "(//*[@class='text-dark text-center mb-60'])[2]")
    public WebElement homePageChooseAPlanBolumuTitle;                // Choose A Plan bolumu title

    @FindBy(xpath = "(//*[@id='slick-slide00'])")                  //Choose A Plan bolumundeki Standart bolumu
    public WebElement homePageStandart;

    @FindBy(xpath = "(//*[@id='slick-slide01'])")                   //Choose A Plan bolumundeki Silver bolumu
    public WebElement homePageSilver;


    @FindBy(xpath = "(//*[@id='slick-slide02'])")                   //Choose A Plan bolumundeki Gold bolumu
    public WebElement homePageGold;

    @FindBy(xpath = "(//*[@id='slick-slide03'])")                  //Choose A Plan bolumundeki Gold bolumu
    public WebElement homePageUnlimited;

    @FindBy(xpath = "//*[@aria-label='Next']")                  // Choose A Plan bolumunumdeki next right butonu
    public WebElement nextButonu;


    @FindBy(xpath = "//*[@class='testimonial-section pt-80 pb-80 bg-darkblue']")
    public WebElement homePageStoriesFromCustomersBolumu;                   // StoriesFromCustomers  Bolumu

    @FindBy(xpath = "//*[@id='slick-slide-control11']")                // StoriesFromCustomers  Bolumundeki sekme butonu
    public WebElement homePageSlidebutton;

    //                         ============== 'Contact Us' Bolumu =======================

    @FindBy(xpath = "//*[@id='frontContactUsTab']")
    public WebElement homePageContactUsAllElements;

    @FindBy(xpath = "//*[@class='row justify-content-center']")
    public WebElement homePageSubscribeHereBolumu;


    // =============================HOME PAGE BODY ELEMENTLERİ -SON =================================


}



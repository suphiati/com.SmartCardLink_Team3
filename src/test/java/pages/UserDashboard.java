package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class UserDashboard {


    public UserDashboard(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    // Dashboard yazisi elemnti
    @FindBy(xpath = "//a[@class='nav-link p-0 active']")
    public WebElement dashboardYazisi;

    //  Total Active Vcards yazisi elementi
    @FindBy(linkText = "Total Active VCards")
    public WebElement totalActiveVCardsYazisi;

    //  Total DeActive VCards yazisi elementi
    @FindBy(linkText = "Total DeActive VCards")
    public WebElement totalDeActiveVCardsYazisi;
    //  Today Enquiries yazisi elementi
    @FindBy(linkText = "Today Enquiries")
    public WebElement todayEnquiriesYazisi;
    //   Today Appointments yazisi elementi
    @FindBy(linkText = "Today Appointments")
    public WebElement todayAppointmentsYazisi;
    //    Vcard Analytic yazisi elementi
    @FindBy(linkText = " Vcard Analytic")
    public WebElement vcardAnalyticYazisi;
    //Vcard Analytic grafik tablo
    @FindBy(xpath = "//div[@id='dashboardWeeklyUserBarChartContainer']")
    public WebElement vcardAnalyticGrafikSekli;
    //Today Appointments Randevu bilgisi bölümü
    @FindBy(linkText = "Today Appointments")
    public WebElement todayAppointmentsRandevuBilgiBolumu;
    //Switch Charts linki
    @FindBy(xpath = "//button[@title='Switch Chart']")
    public WebElement switchChartsButton;



    //***** SUPHİ *****//
    @FindBy(linkText = "Sign In")
    public WebElement signIn;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement kullaniciAdi;

    //Kullanıcı olarak giris sifre
    @FindBy(xpath = "//input[@name='password']")
    public WebElement kullaniciSifre;

    //Kullanici login butonu
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement loginButonu;

    //Ayarlar giriş
    @FindBy(xpath = "(//span[@class='aside-menu-title'])[6]")
    public WebElement ayarlarButonu;

    //Settings basligi gorunurlugu
    @FindBy(xpath = "//a[@class='nav-link p-0 active']")
    public WebElement settingsBasligi;

    //Credentials basligi gorunurlugu
    @FindBy(xpath = "//h1")
    public WebElement credentialsBasligi;

    // Stripe basligi yazisi
    @FindBy(xpath = "//*[.='Stripe']")
    public WebElement stripeYazisi;

    //Stripe Enable butonu
    @FindBy(xpath = "//input[@id='stripeEnable']")
    public WebElement stripeEnableButonu;

    //Stripe Key basligi yazisi
    @FindBy(xpath = "//label[@for='stripe_key']")
    public WebElement stripeKeyYazisi;

    //Stripe Key box
    @FindBy(xpath = "//input[@id='stripeKey']")
    public WebElement stripeKeyBox;

    //Stripe Secret basligi yazisi
    @FindBy(xpath = "//label[@for='stripe_secret']")
    public WebElement stripeSecretYazisi;

    //Stripe Secret box
    @FindBy(xpath = "//input[@id='stripeSecret']")
    public WebElement stripeSecretBox;


    //Paypal basligi yazisi
    @FindBy(xpath = "//*[.='Paypal']")
    public WebElement paypalYazisi;

    //Paypal Enable-Disable butonu
    @FindBy(xpath = "//input[@id='paypalEnable']")
    public WebElement paypalEnableDisableButonu;

    //Paypal Client Id basligi yazisi
    @FindBy(xpath = "//label[@for='paypal_client_id']")
    public WebElement paypalClientIdYazisi;


    //Paypal Client Id Box
    @FindBy(xpath = "//input[@id='paypalKey']")
    public WebElement paypalClientIdBox;


    //Paypal Secret yazisi basligi
    @FindBy(xpath = "//label[@for='paypal_secret']")
    public WebElement paypalSecretYazisi;

    //Paypal Secret Box
    @FindBy(xpath = "//input[@id='paypalSecret']")
    public WebElement paypalSecretBox;

    //Paypal Mode Yazi basligi
    @FindBy(xpath = "//label[@for='paypal_mode']")
    public WebElement paypalModeYazisi;

    //Paypal Mode Box
    @FindBy(xpath = "//input[@id='paypalMode']")
    public WebElement paypalModeBox;

    //Currency Baslik Yazisi
    @FindBy(xpath = "//label[@for='currency']")
    public WebElement currencyYazisi;

    //Select Currency Box
    @FindBy(xpath = "//span[@title='Select Currency']")
    public WebElement selectCurrency;

    @FindBy(xpath = "//input[@role='searchbox']")
    public WebElement currencyBox;

    //Curency Dolar secili ise
    @FindBy(xpath = "//span[@title='$ - USD US Dollar']")
    public WebElement selectCurrencyDollar;



    //Currency Euro seçimi
    @FindBy(xpath = "//span[@title='€ - EUR Euro']")
    public WebElement currencyEuroSecimi;

    //Time Format Yazisi
    @FindBy(xpath = "//label[@for='time_format']")
    public WebElement saatFormatiYazisi;

    //12 saat seçimi
    @FindBy(xpath = "//label[@for='time_format-0']")
    public WebElement saatformati12;

    //24 saat seçimi
    @FindBy(xpath = "//label[@for='time_format-1']")
    public WebElement saatformati24;

    //Enable Contact basligi yazisi
    @FindBy(xpath = "//label[@for='enable_contact']")
    public WebElement enableContact;

    //Enable Contact butonu
    @FindBy(xpath = "//input[@name='enable_contact']")
    public WebElement enableContactButton;

    //Hide vCard Sticky Bar basligi yazisi
    @FindBy(xpath = " //label[@for='hide_stickybar']")
    public WebElement hideStickyBarYazisi;

    //Hide vCard Sticky Bar butonu
    @FindBy(xpath=" //input[@name='hide_stickybar']")
    public WebElement hideStickyBarButonu;

    //Whatsapp Share basligi yazisi
    @FindBy(xpath = " //label[@for='whatsapp_share']")
    public WebElement whatasappShareYazisi;

    //Hide vCard Sticky Bar butonu
    @FindBy(xpath=" //input[@name='whatsapp_share']")
    public WebElement whatasappShareButonu;

    // Save butonu
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement saveButonu;


    //Ayarlarda yapılan güncellemeler basarili yazisi
    @FindBy(xpath = "//*[@*='alert']")
    public WebElement guncellemeDogrulama;

    //Log out
    @FindBy(xpath = "//button[@id='dropdownMenuButton1']")
    public WebElement kullaniCikisBolumu;

    @FindBy(xpath = "//a[@class='dropdown-item text-gray-900 d-flex']")
    public WebElement signOut;

    //***** SUPHİ *****//


}


package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AdminDashboard {
    public AdminDashboard(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    //AdminDashboard usersButonu
    @FindBy(xpath = "(//span[@class='aside-menu-title'])[3]")
    public WebElement usersSayfasi;

    //AdminDashboard users sayfasi kullanici elementi
    @FindBy(xpath = "(//*[@class='d-flex align-items-center'])[2]")
    public WebElement usersSayfasiKullaniciElementi;

    //AdminDashboard users sayfasi active butonu
    @FindBy(xpath = "(//*[@class='form-check-input user-active cursor-pointer'])[1]")
    public WebElement usersSayfasiActiveButonu;

    //AdminDashboard users sayfasi delete elementi
    @FindBy(xpath = "(//*[@class='btn px-1 text-danger fs-3 user-delete-btn'])[1]")
    public WebElement usersSayfasiDeleteElementi;

    @FindBy(xpath = "//*[@class='swal-button swal-button--confirm']")
    public WebElement usersSayfasiDeleteOnayButonu;

    //AdminDashboard delete oldu bildirim yazisi
    @FindBy(xpath = "//*[@class='swal-button swal-button--confirm']")
    public WebElement usersSayfasiDeleteOnayYazisi;

    @FindBy(linkText = "Sign In")
    public WebElement signIn;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement AdminAdi;

    //Kullanıcı olarak giris sifre
    @FindBy(xpath = "//input[@name='password']")
    public WebElement AdminSifre;

    //Kullanici login butonu
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement loginButonu;


    //********************************//

    //Withdraw Transaction giris
    @FindBy(xpath = "(//span[@class='aside-menu-title'])[11]")
    public WebElement withdrawTransactions;

    //Kullanici
    @FindBy(xpath = "(//div[@class='d-flex align-items-center']//span['User'])[1]")
    public WebElement userBasligi;


    //Ödeme Tutari

    //Ödeme Tipi

    //Ödeme Tarihi

//********************************//

    //Currencies
    @FindBy(xpath = "(//span[@class='aside-menu-title'])[12]")
    public WebElement currencies;

    //para birim sayisi
    @FindBy(xpath = "//div[@class='text-muted ms-sm-3 pagination-record']//strong[3]")
    public WebElement toplamCurrencies;

    //para birimi genel
    @FindBy(xpath = "//div[@class='text-muted ms-sm-3 pagination-record']")
    public WebElement sayfaveCurrenciesToplam;


//********************************//

    //Cupon Codes
    @FindBy(xpath = "(//span[@class='aside-menu-title'])[15]")
    public WebElement cuponCode;

    @FindBy(xpath = "//a[@class='btn btn-primary']")
    public WebElement addCouponCode;

    //Yeni kupon ekle
    @FindBy(xpath = "//h3[@class='modal-title']")
    public WebElement addCouponCodeSekmesi;

    //Kupon kodu giris
    @FindBy(xpath = "//input[@id='couponName']")
    public WebElement enterCouponName;

    //İnidirim çeşidi
    @FindBy(xpath = "//input[@id='percentageType']")
    public WebElement couponTypePercentage;

    @FindBy(xpath = "//input[@id='fixedType']")
    public WebElement couponTypeFixed;

    //İndirim miktari
    @FindBy(xpath = "//input[@id='couponDiscount']")
    public WebElement couponDiscount;

    //kupon bitiş tarihi
    @FindBy(xpath = "//input[@id='couponExpireAt']")
    public WebElement couponExpireDateSelect;

    //bitiş ayı seç
    @FindBy(xpath = "//select[@aria-label='Month']")
    public WebElement couponExpireMonth;

    //bitiş yılı secimi
    @FindBy(xpath = "//input[@aria-label='Year']")
    public WebElement couponExpireYear;

    //bitiş günü seçimi


    //Kupon durumu
    @FindBy(xpath = "//input[@id='couponStatus']")
    public WebElement couponStatus;

    //Kupon kodunu kaydet

    @FindBy(xpath = "//button[@id='couponCodeSaveBtn']")
    public WebElement saveCouponCode;
}

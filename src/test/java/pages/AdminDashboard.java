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


    //***** SUPHİ *****//

    //Ana sayfa sign in
    @FindBy(linkText = "Sign In")
    public WebElement signIn;

    //Kullanici adi
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

    //Kullanici basligi
    @FindBy(xpath = "(//div[@class='d-flex align-items-center']//span['User'])[1]")
    public WebElement userBasligi;

    //kullanici bilgisi
    @FindBy(xpath = "(//div[@class='d-flex align-items-center']//span['User'])[7]")
    public WebElement odemeYapilacakKisiAdi;


    //Ödeme Tutari basligi
    @FindBy(xpath = "//thead/tr/th[2]")
    public WebElement amountBasligi;

    //odeme turari
    @FindBy(xpath = "(//span[@class='badge bg-success me-2'])[5]")
    public WebElement odemeTutari;

    //Ödeme Tipi basligi
    @FindBy(xpath = "//thead/tr/th[3]")
    public WebElement paymentTypeBasligi;

    //odeme tipi
    @FindBy(xpath = "(//span[@class='badge bg-primary me-2'])[5]")
    public WebElement odemeTipi;

    //Date basligi
    @FindBy (xpath = "//thead/tr/th[4]")
    public WebElement dateBasligi;

    //odeme tarihi
    @FindBy(xpath = "(//span[@class='badge bg-secondary me-2'])[5]")
    public WebElement odemeTarihi;

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

    // --- Coupon Codes
    @FindBy(xpath = "(//span[@class='aside-menu-title'])[15]")
    public WebElement couponCode;

    //Coupon code basligi
    @FindBy(xpath = "//a[@class='nav-link p-0 active']")
    public WebElement couponCodeBasligi;


    //kupon kodu ekle dogrulama
    @FindBy(xpath = "//a[@class='btn btn-primary']")
    public WebElement addCouponCodeButonu;

    //Yeni kupon ekle
    @FindBy(xpath = "(//h3[@class='modal-title'])[1]")
    public WebElement addCouponCodeSayfaBasligi;

    //Kupon kodu giris
    @FindBy(xpath = "//input[@id='couponName']")
    public WebElement enterCouponName;

    //İndirim Percentage basligi gorunurlugu
    @FindBy(xpath = "//label[@for='percentageType']")
    public WebElement percentageTypeGornurlugu;

    //İndirim çeşidi percentage butonu
    @FindBy(xpath = "//input[@id='percentageType']")
    public WebElement couponTypePercentageButonu;

    //İndirim Fixed Type basligi gorunurlugu
    @FindBy(xpath = "//label[@for='fixedType']")
    public WebElement fixedTypeGornurlugu;

    //İndirim çeşidi Fixed butonu
    @FindBy(xpath = "//input[@id='fixedType']")
    public WebElement couponTypeFixedButonu;


    //İndirim miktari
    @FindBy(xpath = "//input[@id='couponDiscount']")
    public WebElement couponDiscount;

    //Girilen kupon İndirim goruntuleme
    @FindBy(xpath = "//tr[1]/td[3]")
    public WebElement girilenDiscountMiktari;

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
    @FindBy(xpath ="//span[@aria-label='November 6, 2023']")
    public WebElement couponExpireDay;

    //Next month
    @FindBy(xpath = "//span[@class='flatpickr-next-month']")
    public WebElement expireNextMonth;


    //Kupon durumu
    @FindBy(xpath = "//input[@id='couponStatus']")
    public WebElement addCouponStatus;

    //kupon edit durumu
    @FindBy(xpath = "//input[@id='editCouponStatus']")
    public WebElement ediCouponStatus;

    //Kupon kodunu kaydet

    @FindBy(xpath = "//button[@id='couponCodeSaveBtn']")
    public WebElement saveCouponCode;

    //edit kuponu kaydet
    @FindBy(xpath = "//button[@id='editCouponCodeSaveBtn']")
    public WebElement editCouponSaveButton;

    // -- eklenen kupon üzerinde kupon sayfasında yapılan değişiklikler

    //Kupon adı basligi görüntüleme
    @FindBy(xpath = "//div[@class='d-flex align-items-center']/span[text()='Coupon Name']")
    public WebElement couponNameBasligi;

    //Girilen kupon adını bulmak için
    @FindBy(xpath = "//table/tbody/tr[1]/td[1]")
    public WebElement girilenKuponAdi;

    //Kupon çeşidini görüntüleme
    @FindBy(xpath = "//div[@class='d-flex align-items-center']/span[text()='Coupon Type']")
    public WebElement couponTypeBasligi;

    //Secilen kupon cesidi Percentage goruntuleme
    @FindBy(xpath = "//tbody/tr[1]/td[2]/span")
    public WebElement secilenCouponPercentage;

    //Secilen kupon cesidi Fixed goruntuleme
    @FindBy(xpath = "//tbody/tr[1]/td[2]/span")
    public WebElement secilenCouponFixed;


    //kupon indirim görüntüleme
    @FindBy(xpath = "//div[@class='d-flex align-items-center']/span[text()='Coupon Discount']")
    public WebElement couponDiscountBasligi;

    //son kullanma tarihigörüntüleme
    @FindBy(xpath = "//div[@class='d-flex align-items-center']/span[text()='Expire At']")
    public WebElement expireAtBasligi;

    @FindBy(xpath = "//tbody/tr[1]/td[4]/span")
    public WebElement girilenExpireAtTarihi;

    // status basligi
    @FindBy(xpath = "//thead/tr/th[5]")
    public WebElement statusBasligi;

    //status success
    @FindBy(xpath = "//div[@class='toast-title']")
    public WebElement statusDegisiklikSuccessBasligi;
    //status degisikligi basarili
    @FindBy(xpath = "//div[@class='toast-message']")
    public WebElement statusDegisiklikBasarili;

    //Percentage kuponu status butonu
    @FindBy(xpath = "//input[@id='changeCouponStatus'][1]")
    public WebElement changeStatusButonu;

    //action basligi görüntüleme
    @FindBy(xpath = "//thead/tr/th[6]")
    public WebElement actionBasligi;

    //action edit kupon butonu
    @FindBy(xpath = "(//td/div[1]/a[1])[@title='Edit'][1]/*[@data-icon='pen-to-square']")
    public WebElement actionCouponEdit;

    //edit kupon kodu bölümü görüntüleme
    @FindBy(xpath = "//h3[text()='Edit Coupon Code']")
    public WebElement editCouponCodeBasligi;

    //delete kupon butonu
    @FindBy(xpath = "//a[@class='btn px-1 text-danger fs-3 delete-coupon-code']")
    public WebElement couponDelete;

    // Kupon silme evet
    @FindBy(xpath = "//button[@class='swal-button swal-button--confirm']")
    public WebElement yesDeleteButonu;


    //Sign out bolümü
    @FindBy(xpath = "//button[@id='dropdownMenuButton1']")
    public WebElement kullaniCikisBolumu;


    //Sign Out
    @FindBy(xpath = "//a[@class='dropdown-item text-gray-900 d-flex']")
    public WebElement signOut;


    //***** SUPHİ *****//
}

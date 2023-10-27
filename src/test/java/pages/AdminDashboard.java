package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AdminDashboard {
    public AdminDashboard(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    //**Eren Gok**
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


    //AdminDashboard FrontCMS sekmesi
    @FindBy(xpath = "//span[text()='Front CMS']")
    public WebElement frontCmsSayfasi;

    //AdminDashboard FrontCMS sekmesi ==> Testimonials butonu
    @FindBy(xpath = "(//a[@class='nav-link p-0 '])[21]")
    public WebElement frontCmsSayfasiTestimonialsButton;

    @FindBy(xpath = "(//*[@class='d-flex align-items-center'])[2]")
    public WebElement gorusGoruntulemeElementi;

    //AdminDashboard FrontCMS sekmesi ==> Testimonials butonu==>gorus icerik goruntuleme elementi
    @FindBy(xpath = "(//*[@class='btn px-1 text-info fs-3 view-testimonial-btn '])[1]")
    public WebElement gorusIcerikGoruntulemeElementi;

    //AdminDashboard FrontCMS sekmesi ==> Testimonials butonu==> gorus icerik goruntuleme elementi ==> gorus icerik goruntulenebildigi kontrol elementi
    @FindBy(xpath = "//*[text()='New Testimonial']")
    public WebElement gorusIcerikGoruntulemeKontrolElementi;

    //AdminDashboard FrontCMS sekmesi ==> Testimonials butonu==>gorus duzenleme butonu
    @FindBy(xpath = "(//*[@class='btn px-1 text-primary fs-3 front-testimonial-edit-btn'])[1]")
    public WebElement gorusDuzenlemeElementi;

    //AdminDashboard FrontCMS sekmesi ==> Testimonials butonu==>gorus duzenleme butonu==>DescriptionKutusu
    @FindBy(xpath = "//*[@id='editDescription']")
    public WebElement gorusDuzenlemeElementiDescriptionKutusu;

    //AdminDashboard FrontCMS sekmesi ==> Testimonials butonu==>gorus duzenleme butonu==>Save kutusu
    @FindBy(xpath = "//*[@id='testimonialUpdate']")
    public WebElement gorusDuzenlemeElementiSaveKutusu;

    //AdminDashboard FrontCMS sekmesi ==> Testimonials butonu==>gorus duzenleme butonu==>Save kutusu==>Success yazisi
    @FindBy(xpath = "//div[@class'=toast toast-success']")
    public WebElement gorusDuzenlemeSuccessYazisi;



    //AdminDashboard FrontCMS sekmesi ==> Testimonials bolumu Add Testimonials butonu
    @FindBy(xpath = "//*[@class='btn btn-primary ms-auto']")
    public WebElement addTestimonialButton;

    //AdminDashboard FrontCMS sekmesi ==> Testimonials bolumu Add Testimonials sonrasi ==>Name kutusu
    @FindBy(xpath = "//*[@id='name']")
    public WebElement addTestimonialNameBox;

    //AdminDashboard FrontCMS sekmesi ==> Testimonials bolumu Add Testimonials sonrasi ==>Description kutusu
    @FindBy(xpath = "//*[@id='description']")
    public WebElement addTestimonialDescriptionBox;

    //AdminDashboard FrontCMS sekmesi ==> Testimonials bolumu Add Testimonials sonrasi ==>Resim ekleme butonu
    @FindBy(xpath = "(//*[@id='profileImageIcon'])[1]")
    public WebElement addTestimonialAddImage;

    //AdminDashboard FrontCMS sekmesi ==> Enquiries butonu
    @FindBy(xpath = "(//a[@class='nav-link p-0 '])[22]")
    public WebElement frontCmsSayfasiEnquiriesButton;

    //**Eren Gok**



    //***** SUPHİ *****//
    @FindBy(xpath = "//a[@class='btn btn-white fs-18 ms-3 d-lg-block d-none']")
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

    // -- Withdraw Transaction giris
    @FindBy(xpath = "(//span[@class='aside-menu-title'])[11]")
    public WebElement withdrawTransactions;
    //Kullanici basligi
    @FindBy(xpath = "(//div[@class='d-flex align-items-center']//span['User'])[1]")
    public WebElement userBasligi;

    //kullanici bilgisi
    @FindBy(xpath = "(//div[@class='d-flex align-items-center']//span['User'])[7]")
    public WebElement odemeYapilacakKisiAdi;


    //Ödeme Tutari
    @FindBy(xpath = "//thead/tr/th[2]")
    public WebElement amountBasligi;

    @FindBy(xpath = "(//span[@class='badge bg-success me-2'])[5]")
    public WebElement odemeTutari;

    //Ödeme Tipi
    @FindBy(xpath = "//thead/tr/th[3]")
    public WebElement paymentTypeBasligi;

    @FindBy(xpath = "(//span[@class='badge bg-primary me-2'])[5]")
    public WebElement odemeTipi;

    //Ödeme Tarihi
    @FindBy (xpath = "//thead/tr/th[4]")
    public WebElement dateBasligi;
    @FindBy(xpath = "(//span[@class='badge bg-secondary me-2'])[5]")
    public WebElement odemeTarihi;


//********************************//

    // -- Currencies
    @FindBy(xpath = "(//span[@class='aside-menu-title'])[12]")
    public WebElement currencies;

    //para birim sayisi
    @FindBy(xpath = "//div[@class='text-muted ms-sm-3 pagination-record']//strong[3]")
    public WebElement toplamCurrencies;

    //para birimi genel
    @FindBy(xpath = "//div[@class='text-muted ms-sm-3 pagination-record']")
    public WebElement sayfaveCurrenciesToplam;


//********************************//

    // -- Cupon Codes
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


    //Log out
    @FindBy(xpath = "//button[@id='dropdownMenuButton1']")
    public WebElement kullaniCikisBolumu;

    @FindBy(xpath = "//a[@class='dropdown-item text-gray-900 d-flex']")
    public WebElement signOut;

    //***** SUPHİ *****//

}

package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

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
    @FindBy(xpath = "//*[@id='showDesc']")
    public WebElement gorusIcerikGoruntulemeKontrolElementi;

    //AdminDashboard FrontCMS sekmesi ==> Testimonials butonu==> gorus icerik goruntuleme elementi ==> gorus icerik goruntuleme elementi kapatma tusu
    @FindBy(xpath = "(//*[@class='btn-close'])[3]")
    public WebElement gorusIcerikGoruntulemeKapatma;

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
    @FindBy(xpath = "//div[text()='Success']")
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

    //AdminDashboard FrontCMS sekmesi ==> Testimonials bolumu Add Testimonials sonrasi ==>Succes yazisi
    @FindBy(xpath = "//div[text()='Success']")
    public WebElement addTestimonialSuccessElementi;

    //AdminDashboard FrontCMS sekmesi ==> Testimonials bolumu Testimonials delete simgesi
    @FindBy(xpath = "(//a[@class='btn px-1 text-danger fs-3 front-testimonial-delete-btn'])[1]")
    public WebElement deleteTestimonialButton;

    //AdminDashboard FrontCMS sekmesi ==> Testimonials bolumu Testimonials delete simgesi==>delete onay butonu
    @FindBy(xpath = "//button[text()='Yes, Delete!']")
    public WebElement deleteTestimonialOnay;

    //AdminDashboard FrontCMS sekmesi ==> Testimonials bolumu Testimonials delete simgesi==>delete onay butonu==>success
    @FindBy(xpath = "//div[@class='swal-icon--success__ring']")
    public WebElement deleteTestimonialSuccess;

    //AdminDashboard FrontCMS sekmesi ==> Enquiries butonu
    @FindBy(xpath = "(//a[@class='nav-link p-0 '])[22]")
    public WebElement frontCmsSayfasiEnquiriesButton;

    //AdminDashboard FrontCMS sekmesi ==> Enquiries butonu==> sorular tablosu
    @FindBy(xpath = "//tbody")
    public WebElement enquiriesQuestionTable;

    //**Eren Gok**



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

    //* MURAT *//

    @FindBy(xpath = "//div[@class='table-responsive']")
    public WebElement kullaniciTablosu;

    @FindBy(xpath = "//td//div//a[@title='Edit']")
    public List<WebElement> kullaniciTablosuEditButonlari;

    @FindBy(xpath = "(//a[@title='Change Password'])")
    public List<WebElement> sifreDegisButonlari;

    @FindBy(xpath = "//td//div//a[@title='Delete']")
    public List <WebElement> deleteButonlari;

    @FindBy(xpath = "//input[@name='is_active']")
    public List <WebElement> userActivityToggles;

    @FindBy(xpath = "//button[normalize-space()='Edit']")
    public WebElement editButonu;

    @FindBy(xpath = "//input[@id='userFirstName']")
    public WebElement firstNameInput;

    @FindBy(xpath = "//input[@id='userLastName']")
    public WebElement lastNameInput;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement emailInput;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement passwordInput;

    @FindBy(xpath = "//input[@id='cPassword']")
    public WebElement confirmPasswordInput;

    @FindBy(xpath = "//input[@value='Save']")
    public WebElement saveButonu;

    @FindBy(xpath = "//div[@role='alert']")
    public WebElement successfulMessage;

    @FindBy(xpath = "//div[@class='swal-text']")
    public WebElement deleteOnayMesaji;

    @FindBy(xpath = "(//input[@id='new_password'])[2]")
    public WebElement yeniSifreInput;

    @FindBy(xpath = "(//input[@id='confirm_password'])[2]")
    public WebElement yeniSifreOnayInput;

    @FindBy(xpath = "//button[@id='UserPasswordChangeBtn']")
    public WebElement yeniSifreOnayButonu;

    @FindBy(xpath = "//div[@class='toast-title']")
    public WebElement yeniSifreOnayMesaji;

    @FindBy(xpath = "//a[normalize-space()='Add User']")
    public WebElement addUserButonu;

    @FindBy(xpath = "//button[normalize-space()='Yes, Delete!']")
    public WebElement deleteOnayButonu;

    @FindBy(xpath = "//div[contains(@class, 'bg-primary')]/div[@class='text-end text-white']/h2")
    public WebElement activeUsersCountElement;

    //* MURAT *//

    //*RAMAZAN*//

    //Countries butonu
    @FindBy(xpath = "(//*[@*='nav-link d-flex align-items-center py-3'])[13]")
    public WebElement countriesButton;

    //Toplam ulke sayisi yazisi
    @FindBy(xpath = "//*[@*='text-muted ms-sm-3 pagination-record']")
    public WebElement toplamCountriesYazisi;

    //New Country butonu
    @FindBy(xpath = "//*[@*='btn btn-primary ms-auto']")
    public WebElement newCountryButton;

    //Ulke ekleme ulke isim kutusu
    @FindBy(xpath = "//*[@*='Name']")
    public WebElement ulkeIsimKutusu;

    //Ulke ekleme short code kutusu
    @FindBy(xpath = "//*[@*='Short Code']")
    public WebElement shortCodeKutusu;

    //Ulke eyalet sehir ekleme save butonu
    @FindBy(xpath = "//*[@*='btnSave']")
    public WebElement ulkeEklemeSaveButonu;

    //Tablo ilk sutun karesi
    @FindBy(xpath = "//tr[1]/td[1]")
    public WebElement countryTableIlkKare;

    //Ilk sıradaki ulkeyi silme butonu
    @FindBy(xpath = "(//*[@*='Delete'])[1]")
    public WebElement ilkSıradakiUlkeyiSilmeButonu;

    //Ilk sıradaki ulkeyi silme onay butonu
    @FindBy(xpath = "//*[@*='swal-button swal-button--confirm']")
    public WebElement ilkSıradakiUlkeyiSilmeOnayButonu;

    //Countries sayfasında states bolumune tiklama
    @FindBy(linkText = "States")
    public WebElement statesSayfasi;

    //Eyalet sayfasi toplam eyalet sonucu yazisi
    @FindBy(xpath = "//*[@*='text-muted ms-sm-3 pagination-record']")
    public WebElement toplamEyaletSonucYazisi;

    //New State butonu
    @FindBy(xpath = "//*[@*='btn btn-primary ms-auto']")
    public WebElement newStateButton;

    //Eyalet ve sehir ismi kutusu
    @FindBy(xpath = "(//*[@name='name'])[1]")
    public WebElement eyaletSehirIsmiKutusu;

    //Eyalet sayfasında oluşturulmak istenen eyaletin baglanacagi ulke
    @FindBy (xpath = "//*[@*='select2-countryState-container']")
    public WebElement eyaletinBaglanacagiUlkeKutusu;

    @FindBy(xpath = "//*[@*='select2-search__field']")
    public WebElement getEyaletinBaglanacagiUlkeninYazilacagiKutu;

    //Ilk siradaki eyaleti silme kutusu
    @FindBy(xpath = "(//*[@*='svg-inline--fa fa-trash'])[1]")
    public WebElement eyaletSehirSilmeKutusu;

    //Countries sayfasında Cities bolumune tiklama
    @FindBy(linkText = "Cities")
    public WebElement citiesSayfasi;

    //Toplam sehir sayisi sonuc yazisi
    @FindBy(xpath = "//*[@*='text-muted ms-sm-3 pagination-record']")
    public WebElement toplamSehirSonucYazisi;

    //New City butonu
    @FindBy(xpath = "//*[@*='newCityBtn']")
    public WebElement newCityButton;

    //Sehrin baglanacagi eyalet
    @FindBy(xpath = "(//*[@*='select2-StateCity-container'])[1]")
    public WebElement sehrinBaglanacagiEyaletKutusu;

    //Sehrin baglanacagi eyaleti secme
    @FindBy(xpath = "//*[@*='searchbox']")
    public WebElement getSehrinBaglanacagiEyaletiSecme;

    //Languages butonu
    @FindBy(xpath = "(//*[@*='nav-link d-flex align-items-center py-3'])[14]")
    public WebElement languagesButton;

    //Toplam dil sonuc yazisi
    @FindBy(xpath = "//*[@*='col-12 text-muted pagination-record ms-sm-3']")
    public WebElement toplamLanguageSayisiSonuc;

    //Front CMS butonu
    @FindBy(xpath = "(//*[@*='nav-link d-flex align-items-center py-3'])[16]")
    public WebElement frontCMSButton;

    //Front CMS Title yazisi
    @FindBy(xpath = "//*[@*='Title']")
    public WebElement frontCMSTitleYazisi;

    //Front CMS Sub-Text yazisi
    @FindBy(xpath = "//*[@*='Sub Text']")
    public WebElement frontCMSSubTextYazisi;

    //Features Linki
    @FindBy(linkText = "Features")
    public WebElement featuresLinki;

    //Features gorunur yazilar
    @FindBy(xpath = "//tr[1]/td[3]")
    public WebElement featuresTableYazi;

    //About Us linki
    @FindBy(linkText = "About Us")
    public WebElement aboutUsLinki;

    //About us gorunur yazilar
    @FindBy(xpath = "//*[@*='Description']")
    public WebElement aboutUsGorunurYazi;

    //*RAMAZAN*//

}

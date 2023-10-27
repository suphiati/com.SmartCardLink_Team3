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

}

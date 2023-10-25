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
}

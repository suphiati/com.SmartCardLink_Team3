package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CreateAnAccount {

    public CreateAnAccount(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    // Register sayfasında oldugumuzu doğrulama elementi
    @FindBy(tagName = "h1")
    public WebElement dogrulamaElementi;

    // Sign in Button
    @FindBy(xpath = "//a[@class='btn btn-white fs-18 ms-3 d-lg-block d-none']")
    public WebElement signInButtonElementi;

    //Create an Account button
    @FindBy(linkText = "Create an Account")
    public WebElement createAccountButtonElementi;

    //firstName box
    @FindBy(id = "first_name")
    public WebElement firstNameBox;

    //lastName box
    @FindBy(xpath = "//input[@id='last_name']")
    public WebElement lastNameBox;

    //e-mail box
    @FindBy(xpath = "//input[@id='email']")
    public WebElement emailBox;

    //password box
    @FindBy(xpath = "//input[@id='password']")
    public WebElement passwordBox;

    //confirm password box
    @FindBy(xpath = "//input[@id='password_confirmation']")
    public WebElement confirmPasswordBox;

    //privacy policy accept element
    @FindBy(xpath = "//*[@id='privacyPolicyCheckbox']")
    public WebElement privacyAcceptElementi;

    // Submit button elementi
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement submitButtonElementi;

    // kayıt başarılıdır mesajı
    @FindBy(xpath = "/html/body/div/div[2]/div[2]/div")
    public WebElement kayitBasariylaYapildiMesaji;


}

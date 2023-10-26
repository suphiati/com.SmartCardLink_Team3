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
}

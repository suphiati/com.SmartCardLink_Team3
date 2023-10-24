package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HomePage {
    public HomePage(){
        PageFactory.initElements(Driver.getDriver(),this);


    }
    //HomePage Features link
    @FindBy(xpath ="(//a[@class='nav-link mt-1'])[1]")
    public WebElement featuresLink;
}

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

}

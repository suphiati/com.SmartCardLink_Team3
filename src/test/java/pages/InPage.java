package pages;

import utilities.TestBaseRapor;

public class InPage extends TestBaseRapor {
    public AdminDashboard adminDashboard;
    public HomePage homePage;
    public UserDashboard userDashboard;

    public void initialize() {
        adminDashboard=new AdminDashboard();
        homePage=new HomePage();
        userDashboard=new UserDashboard();
    }
}

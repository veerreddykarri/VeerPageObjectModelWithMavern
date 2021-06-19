package testcases;

import base.ProjectSpecificMethods;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends ProjectSpecificMethods {
    @BeforeTest
    public void setFileName() {
        excelFileName = "LoginData";

    }
    @Test(dataProvider = "fetchData")
    public void loginTest(String username,String password)
    {
        new LoginPage(driver)
                .enterUserName(username)
                .enterPassword(password)
                .clickOnLoginButton()
                .verifyHomePage();
    }
}

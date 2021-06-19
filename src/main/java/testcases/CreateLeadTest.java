package testcases;

import base.ProjectSpecificMethods;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.LoginPage;

public class CreateLeadTest extends ProjectSpecificMethods {
    @BeforeTest
    public void setFileName() {
        excelFileName = "CreateLeadData";

    }
    @Test(dataProvider = "fetchData")
    public void createLead(String username,String password,String companyName, String firstName, String surname)
    {
        new LoginPage(driver)
                .enterUserName(username)
                .enterPassword(password)
                .clickOnLoginButton()
                .clickOnCrmSfaLink()
                .clickOnLeadsLink()
                .clickOnCreateLead()
                .enterFirstName(firstName)
                .enterSurnameName(surname)
                .enterCompanyName(companyName)
                .clickOnCreateLeadButton()
                .verifyFirstName();
    }
}

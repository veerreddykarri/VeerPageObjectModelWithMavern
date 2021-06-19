package pages;

import base.ProjectSpecificMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLeadPage extends ProjectSpecificMethods {
    public CreateLeadPage(ChromeDriver driver){
        this.driver = driver;
    }
    public CreateLeadPage enterFirstName(String firstname)
    {
        driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstname);
        return this;
    }
    public CreateLeadPage enterSurnameName(String surname)
    {
        driver.findElement(By.id("createLeadForm_lastName")).sendKeys(surname);
        return this;
    }
    public CreateLeadPage enterCompanyName(String companyName)
    {
        driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyName);
        return this;
    }
    public ViewLeadsPage clickOnCreateLeadButton()
    {
        driver.findElement(By.name("submitButton")).click();
        return new ViewLeadsPage(driver);
    }
}

package pages;

import base.ProjectSpecificMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyLeadsPage extends ProjectSpecificMethods {
    public MyLeadsPage(ChromeDriver driver){
        this.driver = driver;
    }
    public CreateLeadPage clickOnCreateLead()
    {
        driver.findElement(By.linkText("Create Lead")).click();
        return new CreateLeadPage(driver);
    }
}

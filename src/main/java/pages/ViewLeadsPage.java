package pages;

import base.ProjectSpecificMethods;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ViewLeadsPage extends ProjectSpecificMethods {
    public ViewLeadsPage(ChromeDriver driver){
        this.driver = driver;
    }
    public ViewLeadsPage verifyFirstName() {
        boolean displayed = driver.findElementById("viewLead_firstName_sp").isDisplayed();
        Assert.assertTrue(displayed);
        return this;
    }
}

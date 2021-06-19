package pages;

import base.ProjectSpecificMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class HomePage extends ProjectSpecificMethods {
    public HomePage(ChromeDriver driver){
        this.driver = driver;
    }
    public MyHomePage clickOnCrmSfaLink()
    {
        driver.findElement(By.linkText("CRM/SFA")).click();
        return new MyHomePage(driver);
    }
    public HomePage verifyHomePage() {
        boolean displayed = driver.findElementByLinkText("CRM/SFA").isDisplayed();
        Assert.assertTrue(displayed);
        return this;

    }
}

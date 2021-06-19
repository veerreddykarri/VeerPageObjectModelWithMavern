package pages;

import base.ProjectSpecificMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyHomePage extends ProjectSpecificMethods {
    public MyHomePage(ChromeDriver driver){
        this.driver = driver;
    }

    public MyLeadsPage clickOnLeadsLink()
    {
        driver.findElement(By.linkText("Leads")).click();
        return new MyLeadsPage(driver);
    }
}

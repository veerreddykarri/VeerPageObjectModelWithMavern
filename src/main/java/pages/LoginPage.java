package pages;

import base.ProjectSpecificMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage extends ProjectSpecificMethods {
    public LoginPage(ChromeDriver driver){
        this.driver = driver;
    }
    public LoginPage enterUserName(String userName)
    {
        driver.findElement(By.id("username")).sendKeys(userName);
        return this;
    }
    public LoginPage enterPassword(String password)
    {
        driver.findElement(By.id("password")).sendKeys(password);
        return this;
    }
    public HomePage clickOnLoginButton()
    {
        driver.findElement(By.className("decorativeSubmit")).click();
        return new HomePage(driver);
    }
}

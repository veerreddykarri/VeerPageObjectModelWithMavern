package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import utils.GetDataFromExcelDynamically;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class ProjectSpecificMethods {
    public ChromeDriver driver;
    public String excelFileName;
    @BeforeMethod
    public void preCondition(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://leaftaps.com/opentaps/control/main");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    @AfterMethod
    public void postCondition(){
        driver.close();
    }
    @DataProvider
    public Object[][] fetchData() throws IOException {
        return GetDataFromExcelDynamically.getDataFromExcel(excelFileName);

    }
}

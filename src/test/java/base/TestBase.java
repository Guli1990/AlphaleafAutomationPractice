package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class TestBase {
    protected ChromeDriver driver;
    @BeforeMethod
    protected void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @AfterMethod
    protected void cleanUp() {
        try {
            Thread.sleep(6000);
        } catch (InterruptedException ignore) {
            // DO NOTHING
        }
        driver.quit();
    }
    protected void pausefor(int second) {
        try{
            Thread.sleep(second * 1000L);
        }catch (InterruptedException ignore) {
            // DO NOTHING
        }
    }


}

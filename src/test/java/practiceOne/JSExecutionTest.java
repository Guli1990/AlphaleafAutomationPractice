package practiceOne;

import base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class JSExecutionTest extends TestBase {
    @Test
    public void highLightElement(){
        driver.get("https://trello.com");
        By loc_banner = By.xpath("//h1");
        WebElement bannerElement = driver.findElement(loc_banner);

        JavascriptExecutor jsExecutor = driver;
        driver.executeScript("arguments[0].setAttribute('style','border:3px solid red');", bannerElement);
        pausefor(3);
    }

    @Test
    public void testCaseTwo(){
        System.out.println("git branch is actually easy");
        System.out.println("branch is separate version of project files and folders");
    }
}

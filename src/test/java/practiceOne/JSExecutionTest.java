package practiceOne;

import base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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
    public void scrollDownUsingSeleniumMethod(){
        driver.get("https://trello.com");
        By loc_banner_text = By.xpath("//h2[text()='No-code automation']");
        WebElement bannerTextElement = driver.findElement(loc_banner_text);

        Actions actions = new Actions(driver);
        actions.moveToElement(bannerTextElement).perform();

        pausefor(2);

        JavascriptExecutor jsExecutor = driver;
        jsExecutor.executeScript("arguments[0].setAttribute('style','border:3px solid red');", bannerTextElement);

        pausefor(2);
    }

    @Test
    public void scrollDownUsingJSExecutor(){
        driver.get("https://trello.com");
        By loc_banner_text = By.xpath("//h2[text()='No-code automation']");
        WebElement bannerTextElement = driver.findElement(loc_banner_text);

        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        String jsCode = "arguments[0].scrollIntoView(false);";
        jsExecutor.executeScript(jsCode, bannerTextElement);

        jsExecutor.executeScript("arguments[0].setAttribute('style','border:3px solid red');", bannerTextElement);
        pausefor(3);
    }

    @Test
    public void scrollToTheFooter(){
        driver.get("https://trello.com");
        pausefor(3);

        String jsCode = "window.scrollTo(0,document.body.scrollHeight);";
        driver.executeScript(jsCode);

        pausefor(2);
    }
}

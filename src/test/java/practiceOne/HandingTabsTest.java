package practiceOne;

import base.TestBase;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Set;

public class HandingTabsTest extends TestBase {
    @Test
    public void openingNewTabWindow(){
        //how to execute js code using selenium
        driver.get("https://trello.com");  //first window

        // 1. create a js executor object
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;  //casting driver object into JavascriptExecutor
        jsExecutor.executeScript("window.open();");
        pausefor(2);              //second window

        //you can also just use driver.executeScript("xxxx"),but most of time this is just for chrome
        Set<String> handles = driver.getWindowHandles();
        ArrayList<String> tabs = new ArrayList<>(handles);
        driver.switchTo().window(tabs.get(0));
        pausefor(2);
        driver.switchTo().window(tabs.get(1));
        pausefor(2);
        driver.switchTo().window(tabs.get(0));



    }
}

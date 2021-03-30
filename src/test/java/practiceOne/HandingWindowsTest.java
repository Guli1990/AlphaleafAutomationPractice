package practiceOne;

import base.TestBase;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class HandingWindowsTest extends TestBase {
    @Test
    public void handingAlertPopUpAccept(){
        driver.get("http://demo.guru99.com/test/delete_customer.php");
        By loc_submit_button = By.cssSelector("input[name='submit']");
        WebElement submitButton = driver.findElement(loc_submit_button);
        submitButton.click();
        pausefor(2);

        Alert alert = driver.switchTo().alert();
        String text = alert.getText();
        System.out.println("POP UO Text: " +text);

        pausefor(2);
        alert.accept();
    }

    @Test
    public void handingAlertPopUpDismiss(){
        driver.get("http://demo.guru99.com/test/delete_customer.php");
        By loc_submit_button = By.cssSelector("input[name='submit']");
        WebElement submitButton = driver.findElement(loc_submit_button);
        submitButton.click();
        pausefor(2);

        driver.switchTo().alert().dismiss();
    }
}

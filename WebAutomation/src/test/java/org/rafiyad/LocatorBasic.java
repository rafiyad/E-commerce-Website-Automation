package org.rafiyad;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LocatorBasic extends BrowserSetup{
    //login priority should be high after that rest of the work should be done 

    @Test
    public void testElement() throws InterruptedException {
        browser.get("https://www.wafilife.com/");
        Thread.sleep(2000);
        /*WebElement regLoginButton= browser.findElement(By.linkText("লগইন / রেজিস্টার"));
        Thread.sleep(2000);
        regLoginButton.click();
        */
        WebElement partial = browser.findElement(By.partialLinkText("লগইন"));
        partial.click();

    }

    @Test
    public void testElementGoogle() throws InterruptedException {
        browser.get("https://www.google.com/");
        WebElement button = browser.findElement(By.id("APjFqb"));
        button.sendKeys("Hello world");
        Thread.sleep(2000);

    }


}

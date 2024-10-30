package org.rafiyad;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BrowserSetup {
    WebDriver browser;
    @BeforeMethod
    public WebDriver openBrowser(){
        browser= new FirefoxDriver();
        return browser;
    }
    @AfterMethod
    public void closeBrowser(){
        browser.close();
    }
}

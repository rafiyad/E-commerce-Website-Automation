package org.rafiyad;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BrowserSetup {
    WebDriver browser;
    @BeforeSuite
    public WebDriver openBrowser(){
        browser= new ChromeDriver();
        browser.manage().window().maximize();
        return browser;
    }
    @AfterSuite
    public void closeBrowser(){
        browser.quit();
    }

    public WebElement getWebElement(By locator){
        return browser.findElement(locator);
    }
}

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
        //WebElement partial = browser.findElement(By.partialLinkText("লগইন"));

        /*WebElement cssSelector = browser.findElement(By.cssSelector("div[class=\"visible-xs sign-in\"]"));
        System.out.println(cssSelector.getText());*/

        //By X-path
        //WebElement byXpath = browser.findElement(By.xpath("//div[@class='visible-xs sign-in']"));

        WebElement adXpath = browser.findElement(By.xpath("//a[@title='আমার অ্যাকাউন্ট']"));
        adXpath.click();

        WebElement registerBtn = browser.findElement(By.xpath("//input[@name='register']"));
        registerBtn.click();

        Thread.sleep(1000);

        WebElement userNameOrEmail = browser.findElement(By.xpath("//input[@id='username']"));
        userNameOrEmail.sendKeys("rafiyadtest");

        WebElement password = browser.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys("tT00998877@#");

        WebElement loginbtn = browser.findElement(By.xpath("//input[@name='login']"));
        loginbtn.click();

        Thread.sleep(1000);

        //tT00998877@#  01878045502

    }




    @Test
    public void testElementGoogle() throws InterruptedException {
        browser.get("https://rahulshettyacademy.com/AutomationPractice/");
        WebElement button = browser.findElement(By.xpath("//input[@id='autocomplete']"));
        button.sendKeys("Hello world");
        Thread.sleep(2000);

    }


}

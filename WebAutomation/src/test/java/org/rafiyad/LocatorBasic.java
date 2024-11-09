package org.rafiyad;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Random;

public class LocatorBasic extends BrowserSetup{
    //login priority should be high after that rest of the work should be done 

    @Test
    public void testElement() throws InterruptedException {
        browser.get("https://www.wafilife.com/");
        Thread.sleep(2000);

        /* Account details
        Name: rafiyadtest
        mobile: 01878045502
        email: rafiyadtest@gmail.com
        password: tT00998877@#
        */

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

        //Click on the writer from top menu bar
        browser.findElement(By.xpath("//span[contains(text(),'লেখক')]")).click();


        //Scroll down the page
        Actions scrollDown= new Actions(browser);
        scrollDown.scrollByAmount(0,850).build().perform();
        Thread.sleep(1000);


        //Click on the next page button
        browser.findElement(By.xpath("//a[contains(text(),'→')]")).click();
        Thread.sleep(1000);

        //collect all the writer from that page in a list of webelements
        List<WebElement> listOfWriters = browser.findElements(By.xpath("//ul[@class='archive-product-subcategories']/li"));
        Thread.sleep(1000);

        Random random = new Random();
        int randomWriterIndex = random.nextInt(listOfWriters.size());

        WebElement selectedWriter= listOfWriters.get(randomWriterIndex);

        System.out.println(selectedWriter);
        System.out.println(selectedWriter.getText());

        Thread.sleep(1000);
        //list.array.lenght(), Random select from the list
        // pick that particular writer

    }


        //Mahadi
        //Ajoy -> dissaapearing text
        //Adnan -> dissaapearing
        // Shaniur
        // shahinoor
        //


    @Test
    public void testElementGoogle() throws InterruptedException {
        browser.get("https://www.wafilife.com/cat/books/author/page/2");

        List<WebElement> listOfWriters = browser.findElements(By.xpath("//ul[@class='archive-product-subcategories']/li"));
        Thread.sleep(1000);

        Random random = new Random();
        int randomWriterIndex = random.nextInt(listOfWriters.size());

        WebElement selectedWriter= listOfWriters.get(randomWriterIndex);

        selectedWriter.click();

        Thread.sleep(5000);


    }


}

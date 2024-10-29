package org.rafiyad;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTest {
    @Test
    public void testPageTitle(){
        String targetTitle = "Buy Islamic Books - Online Book Shop in Bangladesh | Wafilife";

        //Loading browser for work
        WebDriver browser =new ChromeDriver();

        //Going to the target url
        browser.get("https://www.wafilife.com/");


        //String titleOfWebsite=browser.getTitle();
        //System.out.println(titleOfWebsite);

        Assert.assertEquals(browser.getTitle(),targetTitle);

        browser.close();

    }

    @Test
    public void testUrl(){
        String targetUrl = "https://www.wafilife.com/";

        //Loading browser for work
        WebDriver browser =new ChromeDriver();

        //Going to the target url
        browser.get("https://www.wafilife.com/");


        //String titleOfWebsite=browser.getTitle();
        //System.out.println(titleOfWebsite);

        Assert.assertEquals(browser.getCurrentUrl(),targetUrl);

        browser.close();

    }
}

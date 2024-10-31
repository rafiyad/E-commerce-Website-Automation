package org.rafiyad;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTest extends BrowserSetup {

    @Test
    public void testPageTitle(){
        String targetTitle = "Buy Islamic Books - Online Book Shop in Bangladesh | Wafilife";

        //Going to the target url
        browser.get("https://www.wafilife.com/");


        //String titleOfWebsite=browser.getTitle();
        //System.out.println(titleOfWebsite);


        Assert.assertEquals(browser.getTitle(),targetTitle);

    }

    @Test
    public void testUrl(){
        String targetUrl = "https://www.wafilife.com/";

        //Going to the target url
        browser.get("https://www.wafilife.com/");

        Assert.assertEquals(browser.getCurrentUrl(),targetUrl);
    }
}

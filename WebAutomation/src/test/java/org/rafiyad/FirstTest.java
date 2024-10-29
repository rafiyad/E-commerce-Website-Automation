package org.rafiyad;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstTest {
    public static void main(String[] args) throws InterruptedException {
        //open  a browser

        //test page title should be "Buy Islamic Books - Online Book Shop in Bangladesh | Wafilife"

        //close the browser
        String targetTitle = "Buy Islamic Books - Online Book Shop in Bangladesh | Wafilife";

        WebDriver browser =new ChromeDriver();
        browser.get("https://www.wafilife.com/");
        String titleOfWebsite=browser.getTitle();
        System.out.println(titleOfWebsite);
        
        browser.close();

    }
}

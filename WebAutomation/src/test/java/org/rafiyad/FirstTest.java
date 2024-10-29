package org.rafiyad;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {
    public static void main(String[] args) throws InterruptedException {
        //open  a browser

        //test page title should be "Buy Islamic Books - Online Book Shop in Bangladesh | Wafilife"

        //close the browser

        WebDriver driver =new ChromeDriver();

        Thread.sleep(2000);

        driver.close();

    }
}

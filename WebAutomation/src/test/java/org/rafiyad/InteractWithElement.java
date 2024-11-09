package org.rafiyad;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InteractWithElement extends BrowserSetup{




    @Test
    public void testElement() throws InterruptedException{
        browser.get("https://rahulshettyacademy.com/AutomationPractice/");
        WebElement radioButton= getWebElement(By.xpath("//input[@value='radio1']"));

        Thread.sleep(1000);
        radioButton.click();

        Assert.assertTrue(radioButton.isSelected());

        System.out.println(radioButton.isSelected());
        Thread.sleep(1000);

        WebElement placeHolder = getWebElement(By.xpath("//input[@id='name']"));
        placeHolder.sendKeys("Hello World!");


        Assert.assertEquals(placeHolder.getAttribute("value"),"Hello World!");

        browser.findElement(By.xpath("//select[@id='dropdown-class-example']")).click();
        WebElement selector =browser.findElement(By.xpath("//option[@value='option2']"));

        browser.findElement(By.xpath("//option[@value='option2']")).click();
        Thread.sleep(1000);
        Assert.assertTrue(selector.isSelected());

    }
}

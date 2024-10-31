package org.rafiyad;

import org.testng.annotations.*;

public class TestNGAnnotation {
    @Test(priority = 0) // low digit means highest priority
    public void testCase2(){
        System.out.println("This is the test case 2");
    }

    @Test(priority = 2)
    public void testCase1(){
        System.out.println("This is the test case 1");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("This execute before every method");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("This execute after every method");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("This execute before the class");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("This execute after the class");
    }

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("This execute before the test Suite");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("This execute after the test Suite");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("This execute before the Test");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("This execute after the Test");
    }

    /*
    * Before Suite-> Before Test-> Before Class-> Before Method -> Method->
    * After Method -> After Class -> After Test -> After Suite
    * */

}

package com.cybertek.tests.tekrar;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class multipleWindowss {



    WebDriver driver;

    @BeforeMethod
    public void setUpMethod() {

        driver = WebDriverFactory.getDriver("chrome");
    }

    @AfterMethod
    public void tearDownMethod() {
        // driver.quit();
    }


    @Test
    public void test1() {

        driver.get("http://practice.cybertekschool.com/windows");


        System.out.println("before clicking the link : "+ driver.getTitle());
        driver.findElement(By.linkText("Click Here")).click();

        System.out.println("after clicking the link : "+ driver.getTitle());







    }
    }

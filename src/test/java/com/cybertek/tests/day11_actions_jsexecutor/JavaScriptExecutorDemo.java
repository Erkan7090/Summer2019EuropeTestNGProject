package com.cybertek.tests.day11_actions_jsexecutor;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JavaScriptExecutorDemo {

    WebDriver driver;
    @BeforeMethod
    public void setUpMethod(){
        driver = WebDriverFactory.getDriver("chrome");
    }
    @AfterMethod
    public void tearDownMethod() throws InterruptedException {
        Thread.sleep(2000);
        // driver.quit();
    }
    @Test
    public void click(){
        driver.get("http://practice.cybertekschool.com/");
        WebElement link = driver.findElement(By.linkText("Dropdown"));
        //create jsexecutor object
        //run js code with that object
        //how to create jse object ?
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        //clicking using javascript
        jse.executeScript("arguments[0].click();",link);


    }

    @Test
        public void type(){
            driver.get("http://practice.cybertekschool.com/dynamic_controls");

            WebElement inputBox= driver.findElement(By.cssSelector("input[type='text']"));

            JavascriptExecutor jse= (JavascriptExecutor) driver;

        String str= "Hello Hello";

        jse.executeScript("arguments[0].setAttribute('value', '" + str +"')",inputBox);
    }

    @Test
    public  void Scroll() throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/infinite_scroll");

        JavascriptExecutor jse= (JavascriptExecutor) driver;

        for (int i = 0; i < 10; i++) {
             Thread.sleep(1000);
            jse.executeScript("window.scrollBy(0,250)");
        }

        for (int i = 0; i < 5; i++) {
            Thread.sleep(1000);
            //scrolling up
            jse.executeScript("window.scrollBy(0,-250)");
        }


    }
}

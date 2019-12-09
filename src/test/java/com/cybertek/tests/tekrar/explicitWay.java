package com.cybertek.tests.tekrar;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class explicitWay {

    WebDriver driver;

    @BeforeMethod
    public void setUpMethod() {
        driver = WebDriverFactory.getDriver("chrome");
    }

    @AfterMethod
    public void tearDownMethod() throws InterruptedException {
        Thread.sleep(2000);
        //driver.quit();
    }

    @Test
    public void test1() throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/dynamic_loading/1");

        driver.findElement(By.tagName("button")).click();

        WebElement username= driver.findElement(By.id("username"));

        WebDriverWait wait= new WebDriverWait(driver,10);

        wait.until(ExpectedConditions.visibilityOf(username));

        username.sendKeys("Erkan Sahin");

    }
    @Test
    public void test2(){

        driver.get("http://practice.cybertekschool.com/dynamic_controls");

        driver.findElement(By.cssSelector("button[onclick='swapInput()']")).click();

        WebElement inputBox= driver.findElement(By.cssSelector("input[type='text']"));
        WebDriverWait wait=new WebDriverWait(driver,10);

        wait.until(ExpectedConditions.elementToBeClickable(inputBox));



       inputBox.sendKeys("jhgdf");









    }

}
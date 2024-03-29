package com.cybertek.tests.day8_typesOfElement_2;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class DisplayedDemo {
    @Test
    public  void test1() throws InterruptedException {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dynamic_loading/1");

        WebElement usernameInput= driver.findElement(By.id("username"));

        // isDisplayed()--->  if the element is in the html code , but not displayed
        // it will return False ,
        System.out.println(usernameInput.isDisplayed());


        WebElement startbutton= driver.findElement(By.xpath("(//button)[1]"));
        startbutton.click();

        Thread.sleep(5000);
        System.out.println(usernameInput.isDisplayed());

    }







}

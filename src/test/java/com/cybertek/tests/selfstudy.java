package com.cybertek.tests;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class selfstudy {


    @Test
    public void test1() {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dropdown");

        //1. locate the dropdown element with unique locator
        WebElement dropdownElement = driver.findElement(By.id("state"));

        Select stateList = new Select(dropdownElement);

        List<WebElement> options = stateList.getOptions();
        System.out.println(options.size());

        for (WebElement option : options) {
            System.out.println(option.getText());
        }
    }

    @Test
    public void test2() {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dropdown");

        WebElement firstOption = driver.findElement(By.id("state"));
        Select stateList = new Select(firstOption);

        String expected = "Select a State";
        String actual = stateList.getFirstSelectedOption().getText();

        Assert.assertEquals(actual, expected, "verify");

        stateList.selectByVisibleText("Texas");
        actual = stateList.getFirstSelectedOption().getText();
        Assert.assertEquals(actual, "Texas", "verify");


        stateList.selectByIndex(51);
        actual=stateList.getFirstSelectedOption().getText();
        Assert.assertEquals(actual,"Wyoming");

        stateList.selectByValue("VA");
        actual=stateList.getFirstSelectedOption().getText();
        Assert.assertEquals(actual,"Wyoming");
    }

}








package com.cybertek.tests.day8_typesOfElement_2;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class SelectClassTest {

    @Test
    public void test1(){
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dropdown");

        //1. locate the dropdown element with unique locator

        WebElement dropdownElement= driver.findElement(By.id("state"));

        //create Select object by passing the element as a consructor
        Select stateList= new Select(dropdownElement);

        //getOptions  returns all the available options from the dropdown
        List<WebElement> options=stateList.getOptions();

        for (WebElement option : options) {
            System.out.println(option.getText());
        }
    }
    @Test
    public void test2() {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dropdown");

        //1. locate the dropdown element with unique locator
        WebElement dropdownElement = driver.findElement(By.id("state"));

        Select stateList = new Select(dropdownElement);
        // you can write different way
        // Select stateList = driver.findElement(By.id("state"));



        //verify that first option is "select a state

        String actual = stateList.getFirstSelectedOption().getText();
        String expect = "Select a State";

        Assert.assertEquals(actual, expect, "verify ");

        stateList.selectByVisibleText("Texas");
        actual = stateList.getFirstSelectedOption().getText();
        Assert.assertEquals(actual, "Texas", "verify");


        stateList.selectByIndex(51);
        actual=stateList.getFirstSelectedOption().getText();
        Assert.assertEquals(actual,"Wyoming");

        stateList.selectByValue("VA");
        actual=stateList.getFirstSelectedOption().getText();
        Assert.assertEquals(actual,"Virginia");

    }
}

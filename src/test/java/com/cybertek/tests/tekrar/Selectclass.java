package com.cybertek.tests.tekrar;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Selectclass {

    @Test
    public void test1(){

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dropdown");

        WebElement dropDownElement= driver.findElement(By.id("state"));

        Select stateList= new Select(dropDownElement);

        List<WebElement> options= stateList.getOptions();

        for (WebElement option : options) {
            System.out.println(option.getText());

        }


        String actual= stateList.getFirstSelectedOption().getText();
        String expected= "Select a State";

        Assert.assertEquals(actual,expected,"verify first option is Select a State");

        stateList.selectByVisibleText("Texas");

        actual= stateList.getFirstSelectedOption().getText();


        Assert.assertEquals(actual,"Texas", "verify");

        stateList.selectByIndex(51);

        stateList.selectByValue("VA");
    }
}

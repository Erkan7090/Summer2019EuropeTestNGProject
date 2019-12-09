package com.cybertek.tests.day8_typesOfElement_2;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class checkBoxDemo {

    @Test
    public void test1(){
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/checkboxes");

        WebElement checkBox1= driver.findElement(By.xpath("//input[1]"));
        WebElement checkBox2= driver.findElement(By.xpath("//input[2]"));

        // verify that checkbox 1 is unselected and 2 is selected

        Assert.assertFalse(checkBox1.isSelected(),"checkbox1 sould not be selected");
        Assert.assertTrue(checkBox2.isSelected(),"checkbox2 should be selected");

        // slect the first box
        checkBox1.click();

        Assert.assertTrue(checkBox1.isSelected(),"checkbox1 sould  be selected");
        Assert.assertTrue(checkBox2.isSelected(),"checkbox2 should be selected");
    }

}

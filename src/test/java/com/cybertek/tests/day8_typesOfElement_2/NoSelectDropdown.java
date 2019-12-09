package com.cybertek.tests.day8_typesOfElement_2;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class NoSelectDropdown {

    @Test
    public void test1(){
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dropdown");

        WebElement dropdownElement= driver.findElement(By.id("dropdownMenuLink"));

        //open the dropdown
        dropdownElement.click();

       List<WebElement> listOfLink= driver.findElements(By.className("dropdown-item"));

        System.out.println("Number of links= "+listOfLink.size());

        // print first element ... get(indexNumber) ile sadece istedigine print yapabilirsin.
        System.out.println(listOfLink.get(0).getText());

        //print text of each link
        for (WebElement webElement : listOfLink) {
            System.out.println(webElement.getText());
        }

        //how to click. there are 2 ways
        driver.findElement(By.linkText("Yahoo")).click();

        //second way
        // listOfLinks.get(3).click();

    }
}

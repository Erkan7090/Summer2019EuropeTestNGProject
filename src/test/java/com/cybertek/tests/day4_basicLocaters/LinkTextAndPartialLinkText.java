package com.cybertek.tests.day4_basicLocaters;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LinkTextAndPartialLinkText {
    public static void main(String[] args) {
        //open browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        //navigate to website
        driver.get("http://practice.cybertekschool.com/dynamic_loading");

        WebElement Link3= driver.findElement(By.linkText("Example 3: Element on page that is hidden and become visible after 5 seconds"));
        Link3.click();

        driver.findElement(By.linkText("Home")).click();


    }


}

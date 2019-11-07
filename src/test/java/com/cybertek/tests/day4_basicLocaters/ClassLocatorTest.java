package com.cybertek.tests.day4_basicLocaters;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ClassLocatorTest {
    public static void main(String[] args) {
        //open browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        //navigate to website
        driver.get("http://practice.cybertekschool.com/sign_up");

        WebElement homeButton= driver.findElement(By.className("nav-link"));

        homeButton.click();

        driver.get("http://practice.cybertekschool.com/multiple_buttons");
        WebElement multipleButtons= driver.findElement(By.className("h3"));

        String print = multipleButtons.getText();
        System.out.println(print);


    }

}

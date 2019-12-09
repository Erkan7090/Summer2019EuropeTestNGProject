package com.cybertek.tests.AsiaAssignment;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class vyassignment2 {

    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://qa1.vytrack.com/user/login");

        WebElement username = driver.findElement(By.xpath("//*[@id=\"prependedInput\"]"));

        username.sendKeys("user22");

        WebElement password = driver.findElement(By.xpath("//*[@id=\"prependedInput2\"]"));

        password.sendKeys("UserUser");

        WebElement button = driver.findElement(By.xpath("//*[@id=\"_submit\"]"));

        button.click();

        WebElement errorMessage= driver.findElement(By.xpath("//*[@id=\"login-form\"]/fieldset/div[1]/div"));

        System.out.println(errorMessage.getText());

        String expectedResult="Invalid user name or password.";

        if(expectedResult.contains(errorMessage.getText())){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }
        }
    }

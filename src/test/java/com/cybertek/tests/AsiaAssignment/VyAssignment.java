package com.cybertek.tests.AsiaAssignment;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VyAssignment {

    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://qa1.vytrack.com/user/login");

        WebElement username = driver.findElement(By.xpath("//*[@id=\"prependedInput\"]"));

        username.sendKeys("user22");

        WebElement password= driver.findElement(By.xpath("//*[@id=\"prependedInput2\"]"));

        password.sendKeys("UserUser123");

        WebElement button= driver.findElement(By.xpath("//*[@id=\"_submit\"]"));

        button.click();

        String expectedResult= "https://qa1.vytrack.com/";
        String actualResult=driver.getCurrentUrl();

        if(expectedResult.equals(actualResult)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println(expectedResult);
            System.out.println(actualResult);

        }
    }
}

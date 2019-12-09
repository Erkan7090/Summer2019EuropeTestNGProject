package com.cybertek.tests.tekrar;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class NoSelectDropdwnn {


    @Test
    public void test1() {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dropdown");

        WebElement dropdownElement= driver.findElement(By.id("dropdownMenuLink"));
        dropdownElement.click();

        List <WebElement> ListOfLinks= driver.findElements(By.className("dropdown-item"));
        System.out.println(ListOfLinks.size());

        System.out.println(ListOfLinks.get(0).getText());

        for (WebElement listOfLink : ListOfLinks) {
            System.out.println(listOfLink.getText());
        }

        driver.findElement(By.linkText("Yahoo")).click();
    }
}

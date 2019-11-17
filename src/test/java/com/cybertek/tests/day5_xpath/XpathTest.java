package com.cybertek.tests.day5_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class XpathTest {

    public static void main(String[] args) {

        /**
         * navigate to amazon.com
         * type selenium in the searchbox
         * click search button
         */



            WebDriver driver = WebDriverFactory.getDriver("chrome");

            driver.manage().window().maximize();

            driver.get("https://www.amazon.com");

            //locate searchbox
            WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
            //type selenium
            searchBox.sendKeys("Selenium");


            //locate searchButton
            WebElement searchButton = driver.findElement(By.xpath("//input[@value='Go']"));

            searchButton.click();

            String resultMessage = driver.findElement(By.xpath("//span[contains(text(),'results for')]")).getText();

            System.out.println(resultMessage);



    }


}

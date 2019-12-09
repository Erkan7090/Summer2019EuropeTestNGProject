package com.cybertek.tests.day9_popups_tabs_frames;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;

public class MultipleWindows {

    WebDriver driver;

    @BeforeMethod
    public void setUpMethod() {

        driver = WebDriverFactory.getDriver("chrome");
    }

    @AfterMethod
    public void tearDownMethod() {
        // driver.quit();
    }


    @Test
    public void test1() {

        driver.get("http://practice.cybertekschool.com/windows");

        System.out.println("before clicking the link "+ driver.getTitle());

        //clicking click here link
        driver.findElement(By.linkText("Click Here")).click();



        //  code for swiyching windows, we have to pass handle
        //  driver.switchTo().window()

        String currentWindowHandle= driver.getWindowHandle();
        System.out.println("currentWindowHandle = " + currentWindowHandle);
        // after this line, our purpose is switching to new window

        // Set is just like arraylist but without dublicate values
        Set<String> windowHandles= driver.getWindowHandles();

        // how many different handles it is keeping
        System.out.println(windowHandles.size());

        // our problem is how we can get new window handle from set of handles . there is no index

        for (String handle : windowHandles) {
            //checking handle is not equal to current page
            if(!currentWindowHandle.equals(handle)){
                System.out.println(handle);
                //switching to new window
                driver.switchTo().window(handle);
            }
        }


        System.out.println("after switching the link "+ driver.getTitle());

    }

    @Test
    public void test2() {

        driver.get("http://practice.cybertekschool.com/windows");

        String targetwindowTitle= "New Window";

        //clicking click here link
        driver.findElement(By.linkText("Click Here")).click();

        // check how many windows we have.
        System.out.println(driver.getWindowHandles().size() );

        Set<String> windowHandles= driver.getWindowHandles();

        // we will keep switching windows until our title equals to targetWindowTitle

        for (String handle : windowHandles) {

            // switch them one by one
            driver.switchTo().window(handle);

            //checking if the window title equals to my target window title
            if(driver.getTitle().equals(targetwindowTitle)){
                break;
            }
        }


        System.out.println("after loop title is :"+ driver.getTitle());











    }
}
package com.cybertek.tests.day9_popups_tabs_frames;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class iframes {

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
        driver.get("http://practice.cybertekschool.com/iframe");

        //how to switch frames
        driver.switchTo().frame("mce_0_ifr");

        driver.findElement(By.id("tinymce")).clear();
        driver.findElement(By.id("tinymce")).sendKeys("Test Test");

        //go back to first frame, useful whwn we have switched multiple frames

        driver.switchTo().defaultContent();

        //2.using index

        driver.switchTo().frame(0);
        driver.findElement(By.id("tinymce")).clear();

        //locate and send some text
        driver.findElement(By.id("tinymce")).sendKeys("ji use index");

        // go back first frame , only to parent
        driver.switchTo().parentFrame();

        //using webelement
        WebElement frameElement = driver.findElement(By.tagName("iframe"));

        driver.switchTo().frame(frameElement);

        driver.findElement(By.id("tinymce")).clear();
        //locate and send some text
        driver.findElement(By.id("tinymce")).sendKeys("i use webelemnt");


    }
@Test
    public void multipleFrames(){
driver.get("http://practice.cybertekschool.com/nested_frames");

        // switching to frame top
    driver.switchTo().frame("frame-top");

    //frame top has three children frame, left middle and right
    //switch the middle frame
    driver.switchTo().frame("frame-middle");

    // get the middle text and print it

    System.out.println(driver.findElement(By.id("content")).getText());

    // go back to parent (top-frame) to switch right
    driver.switchTo().parentFrame();

    //switch right-frame using index
    driver.switchTo().frame(2);

    //print right from right-frame
    System.out.println(driver.findElement(By.tagName("body")).getText());

    // go up to top level html directly
    driver.switchTo().defaultContent();

    driver.switchTo().frame("frame-bottom");

    System.out.println(driver.findElement(By.tagName("body")).getText());










    }

}

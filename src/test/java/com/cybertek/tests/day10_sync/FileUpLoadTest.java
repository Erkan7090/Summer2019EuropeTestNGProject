package com.cybertek.tests.day10_sync;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FileUpLoadTest {


    WebDriver driver;
    @BeforeMethod
    public void setUpMethod(){
        driver = WebDriverFactory.getDriver("chrome");
    }
    @AfterMethod
    public void tearDownMethod() throws InterruptedException {
        Thread.sleep(2000);
        //driver.quit();

    }
    @Test
    public  void  test1() {

        driver.get("http://practice.cybertekschool.com/upload");

        driver.findElement(By.name("file")).sendKeys("C:\\Users\\Meric\\Desktop\\file.txt");

        //click upload button
        driver.findElement(By.id("file-submit")).click();

        String actualResult= driver.findElement(By.id("uploaded-files")).getText();

        Assert.assertEquals(actualResult,"fille.txt","verify the name file");



    }
    @Test
    public  void  test2() {

        driver.get("http://practice.cybertekschool.com/upload");

        String projectPath=System.getProperty("user.dir");
        String relativePath= "src/test/resources/testfile.txt";

        String filePath= projectPath+ "/"+relativePath;

        driver.findElement(By.name("file")).sendKeys(filePath);

        //click upload button
        driver.findElement(By.id("file-submit")).click();

        String actualResult= driver.findElement(By.id("uploaded-files")).getText();

        Assert.assertEquals(actualResult,"testlfile.txt","verify the name file");



    }
}

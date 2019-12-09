package com.cybertek.tests.day10_sync;

import org.testng.annotations.Test;

public class FilePathExample {

    @Test

    public void test1(){
        System.out.println(System.getProperty("user.dir"));

        String projectPath= System.getProperty("user.dir");
        String relativePath="src/test/resources/testfile.txt";
        String filePath=projectPath+"/"+relativePath;

        System.out.println(filePath);


        // bu dersin tekrari ve ozeti source class ve icindeki dosya ..11.gunun 10-10. dakikalari

    }


}

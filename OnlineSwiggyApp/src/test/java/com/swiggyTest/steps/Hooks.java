package com.swiggyTest.steps;


import com.swiggyTest.SeleniumDriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import org.openqa.selenium.WebDriver;

public class Hooks {
   public static WebDriver testdriver=null;

    @Before
    public void beforeTest(){
        testdriver=new SeleniumDriverManager().getDriver();
         testdriver.manage().window().maximize();
    }

   @After
   public void AfterTest(){
       try {
           Thread.sleep(10000);
       } catch (InterruptedException e) {
           e.printStackTrace();
       }
       //testdriver.quit();

   }

}

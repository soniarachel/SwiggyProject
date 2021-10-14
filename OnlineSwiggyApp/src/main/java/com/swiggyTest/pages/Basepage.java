package com.swiggyTest.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Basepage {
    WebDriver driver;
    public void click(By byObject){
        driver.findElement(byObject).click();
    }
    public String getTitle(){
        return driver.getTitle();
    }
}

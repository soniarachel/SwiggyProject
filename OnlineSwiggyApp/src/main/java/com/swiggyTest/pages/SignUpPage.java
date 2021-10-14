package com.swiggyTest.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUpPage extends Basepage{
    By btn_search=By.xpath("//*[@id=\"root\"]/div[1]/header/div/div/ul/li[5]/div/a/span[2]");
    String HomePage_Url="https://www.swiggy.com/restaurants";

    public SignUpPage(WebDriver driver){

        this.driver=driver;
    }
    public void ClickSearch(){
        click(btn_search);
    }

    public void navigate()
    {

        driver.get(HomePage_Url);
    }
public void Sign(){
        driver.findElement(By.xpath("//*[text()=\"Sign up\"]")).click();

}

}

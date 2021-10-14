package com.swiggyTest.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import java.util.*;

public class LocationPage extends Basepage {

    By btn_search=By.xpath("//*[@id=\"root\"]/div[1]/header/div/div/ul/li[5]/div/a/span[2]");
    String HomePage_Url="https://www.swiggy.com/restaurants";

public LocationPage(WebDriver driver){

    this.driver=driver;
}
    public void ClickSearch(){

    click(btn_search);
    }

   public void navigate() {
     driver.get(HomePage_Url);
   }

   public void sendLocation(){
    driver.findElement(By.xpath("//*[@id=\"location\"]")).sendKeys("bangalore");
       try {
           Thread.sleep(3000);
       } catch (InterruptedException e) {
           e.printStackTrace();
       }
       driver.findElement(By.xpath("//*[text()=\"Bangalore, Karnataka, India\"]")).click();
       try {
           Thread.sleep(3000);
       } catch (InterruptedException e) {
           e.printStackTrace();
       }


       // Actions action=new Actions(driver);
       //WebElement optionsList=driver.findElement(By.className("_2W-T9"));
       //action.moveToElement(optionsList);

      // List<WebElement> options = driver.findElements(By.xpath("//*[@class='_1oLDb']//div[@tabindex='2']"));
       //for(WebElement option : options) {
         //  if (option.getText().equals("Bangalore, Karnataka, India")) {

           //    option.click();



   }

}


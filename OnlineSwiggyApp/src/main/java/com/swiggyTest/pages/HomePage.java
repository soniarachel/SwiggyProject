package com.swiggyTest.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class HomePage extends Basepage {

   // By btn_search=By.xpath("//*[@id=\"root\"]/div[1]/header/div/div/ul/li[5]/div/a/span[2]");
    String HomePage_Url="https://www.swiggy.com/restaurants";

public HomePage(WebDriver driver){

    this.driver=driver;
}

public void Search(){
   // driver.findElement(By.xpath("//span[.='Search']")).click();
    driver.findElement(By.xpath("//span[.='Search']")).click();
//(//*[text()=\"Search\"])[1]"
    //(//*[text()="Search"])
    try {
        Thread.sleep(3000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    driver.findElement(By.xpath("//*[@type='text']")).sendKeys("Pizza"+ Keys.ENTER);
    try {
        Thread.sleep(3000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

    driver.findElement(By.xpath(".//div[@class='efp8s']")).click();
    try {
        Thread.sleep(3000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

}
public void AddToCart(){
    driver.findElement(By.xpath("//div[@class='_1RPOp']")).click();
    try {
        Thread.sleep(3000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

    driver.findElement(By.xpath("//div[@class='uJZex']")).click();
      driver.findElement(By.xpath("//span[.='Step 2/2']")).click();
    try {
        Thread.sleep(3000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
      driver.findElement(By.xpath("//div[@class='_3coNr']")).click();
}
}

















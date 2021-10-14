package com.swiggyTest;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class SeleniumDriverManager {
WebDriver driver=null;
//static final String browserType="REMOTE";

public WebDriver getDriver() {
    if(driver==null){
        try {
            setupDriver();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
    return driver;
}
public void setupDriver() throws Throwable{
    String browserType= Configuration.getProperty("browserType");
    switch (browserType){
        case "CHROME":
            System.out.println("Running Chrome");
            driver=setupChromeDriver();
        case "FIREFOX":
           // driver=setupFFDriver();
            break;
        case "REMOTE":
            System.out.println("Running Remote");
            SetupRemoteWebDriver();
    }
}

    private void SetupRemoteWebDriver() {
        URL url= null;
        try {
            String server=Configuration.getProperty("hubIp");
            String port=Configuration.getProperty("hubport");
            url = new URL("http://"+server+":"+port+"/wd/hub");
        } catch (Throwable e) {
            e.printStackTrace();
        }
        DesiredCapabilities capabilities=DesiredCapabilities.chrome();
        capabilities.setBrowserName("chrome");
        capabilities.setPlatform(Platform.WINDOWS);
        driver=new RemoteWebDriver(url,capabilities);
    }

    private ChromeDriver setupChromeDriver(){
    String projectFolderPath=System.getProperty("user.dir");
    String chromeDriverPath=projectFolderPath + "/drivers/chromedriver.exe";
    System.setProperty("webdriver.chrome.driver",chromeDriverPath);


    return new ChromeDriver();
}
}











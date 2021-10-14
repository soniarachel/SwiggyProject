package com.swiggyTest;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;

public class SeleniumGridTest {
    public static void main(String[] args) throws Throwable {
        DesiredCapabilities capabilities=DesiredCapabilities.chrome();
        capabilities.setBrowserName("chrome");
        capabilities.setPlatform(Platform.WINDOWS);
        URL url=new URL("http://192.168.144.209:4444/wd/hub");
        WebDriver driver=new RemoteWebDriver(url,capabilities);
    driver.quit();
    }
}

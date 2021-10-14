package com.swiggyTest;

import com.relevantcodes.extentreports.ExtentReports;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

@CucumberOptions(
        features ="classpath:Features",
 glue = "com.swiggyTest.steps",
        plugin = {"pretty","html:target/cucumber-report.html" }



)
public class CucumberTestRunner extends AbstractTestNGCucumberTests {
    ExtentReports extentReportsObj;

    @BeforeSuite
    public void beforesuite(){
        System.out.println("----------before suite---------");
        String pathOfProject=System.getProperty("user.dir");
        extentReportsObj=new ExtentReports(pathOfProject+"/extentReports.html");
    }

    @org.testng.annotations.DataProvider
    @Override
    public Object[][] scenarios() {
        return super.scenarios();
    }

    @AfterSuite
    public void aftersuite(){
        System.out.println("----------after suite---------");
        extentReportsObj.flush();
    }
}

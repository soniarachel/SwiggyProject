package com.swiggyTest;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentReports {
    public static void main(String[] args) {
        String pathOfProject=System.getProperty("user.dir");
        com.relevantcodes.extentreports.ExtentReports extentReportsObj=new com.relevantcodes.extentreports.ExtentReports(pathOfProject+"/extentReports.html");
//start a test
        ExtentTest extentTestObj=extentReportsObj.startTest("Sample test1");
        //test logs
        extentTestObj.log(LogStatus.INFO,"this is an info step");
        extentTestObj.log(LogStatus.PASS,"this is a pass step");
// stop a test
        extentReportsObj.endTest(extentTestObj);

// start a new test
        ExtentTest extentTestObj2=extentReportsObj.startTest("Sample test2");
        extentTestObj2.log(LogStatus.INFO,"this is an info step for test2");
        extentTestObj2.log(LogStatus.PASS,"this is a pass step for test2");
        extentTestObj2.log(LogStatus.FAIL,"this is a fail step for test2");
//stop a new test
        extentReportsObj.endTest(extentTestObj2);


//flush reports
        extentReportsObj.flush();

    }
}

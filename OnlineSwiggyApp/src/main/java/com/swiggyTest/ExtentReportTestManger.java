package com.swiggyTest;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentReportTestManger {

static ExtentReports extentReportsObj=null;
   static ExtentTest extentTest;

public static void  setExtentReports(String path){
    if(extentReportsObj==null){
        extentReportsObj=new ExtentReports(path);

    }
}
public static ExtentReports getExtentReportsObj(){

    return extentReportsObj;
}
public static ExtentTest getTest(){
    return extentTest;
}
public static void flushReport(){
getExtentReportsObj().flush();
}
    public static void startTest(String nameOfTest){
       extentTest= getExtentReportsObj().startTest(nameOfTest);
    }
    public static void endTest(){
        getExtentReportsObj().endTest(extentTest);
    }

    public static void logInfo(String message){
    getTest().log(LogStatus.INFO,message);
    }

    public static void logSuccess(String message){
        getTest().log(LogStatus.PASS,message);
    }
    public static void logFailure(String message){
        getTest().log(LogStatus.FAIL,message);
    }
}



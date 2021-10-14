package com.swiggyTest.pages;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;

public class ExcelUtils {
    public static XSSFWorkbook OpenWorkbook(String excelFilePath)throws Throwable{
        File excelFile=new File(excelFilePath);
        FileInputStream excelFileStream=new FileInputStream(excelFile);
      return new  XSSFWorkbook(excelFileStream);
    }

    public static void main(String[] args) throws Throwable{
        String excelFilePath="C:/practice/ExcelTestdata.xlsx";
        XSSFWorkbook workbook=OpenWorkbook(excelFilePath);

       int NumberOfSheets= workbook.getNumberOfSheets();
        System.out.println("Total number ofNumberOfSheets"+NumberOfSheets);
       XSSFSheet sheet=  workbook.getSheetAt(0);

       int Lastrows=sheet.getLastRowNum();
        System.out.println("Total number of rows"+Lastrows);

        XSSFRow row=sheet.getRow(Lastrows);
      int lastcellNum = row.getLastCellNum();
        System.out.println("last cell number is"+lastcellNum);

       XSSFCell cell= row.getCell(1);
        String value=cell.getStringCellValue();
        System.out.println("the cell value at index 1 is"+value);
    }
}

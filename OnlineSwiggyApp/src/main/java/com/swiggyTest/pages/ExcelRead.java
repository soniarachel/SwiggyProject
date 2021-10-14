package com.swiggyTest.pages;


import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;

import static org.apache.poi.ss.usermodel.CellType.*;
import static org.apache.poi.ss.usermodel.CellType.STRING;

public class ExcelRead {
    public static XSSFWorkbook OpenWorkbook(String excelFilePath)throws Throwable{
        File excelFile=new File(excelFilePath);
        FileInputStream excelFileStream=new FileInputStream(excelFile);
      return new  XSSFWorkbook(excelFileStream);
    }
    public  static void PrintExcelFile(String excelFilePath,int sheetIndex) throws Throwable{
        XSSFWorkbook workbook=OpenWorkbook(excelFilePath);
        XSSFSheet sheet=  workbook.getSheetAt(sheetIndex);
        int LastrowIndex=sheet.getLastRowNum();

        for(int currRowIndex=0;currRowIndex<=LastrowIndex;currRowIndex++){
            XSSFRow row=sheet.getRow(currRowIndex);
            int lastcellNum = row.getLastCellNum();

            for (int currCellIndex=0;currCellIndex<lastcellNum;currCellIndex++){
                XSSFCell cell= row.getCell(currCellIndex);
                switch (cell.getCellType()){
                    case  STRING:
                        System.out.print(cell.getStringCellValue()); ;
                        break;
                    case NUMERIC:
                        System.out.print(cell.getNumericCellValue());
                        break;
                    default:
                        System.out.println(cell.getStringCellValue());
                }
                System.out.print("\t");
            }
            System.out.println("");
        }

    }

    public static void main(String[] args) throws Throwable{
        String excelFilePath="C:/practice/ExcelTestdata.xlsx";
      PrintExcelFile(excelFilePath,0);
    }
}

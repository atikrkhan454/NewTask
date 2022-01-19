package com.self_practice.read_excel_file;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ApachePoi {

    public void readExcel() throws IOException {
        String excelFilePath = ".\\datafiles\\countries.xlsx";
        FileInputStream inputstream = new FileInputStream(excelFilePath);
        XSSFWorkbook workbook = new XSSFWorkbook(inputstream);
        XSSFSheet sheet = workbook.getSheetAt(0 );
        //XSSFSheet sheet=workbook.getSheet("Sheet2");


        int rows = sheet.getLastRowNum();
        int cols = sheet.getRow(1).getLastCellNum();

        for (int r = 0; r <= rows; r++) {
            XSSFRow row = sheet.getRow(r);

            for (int c = 0; c < cols; c++) {
                XSSFCell cell = row.getCell(c);

                switch (cell.getCellType()) {
                    case STRING -> System.out.print(cell.getStringCellValue());
                    case NUMERIC -> System.out.print(cell.getNumericCellValue());
                    case BOOLEAN -> System.out.print(cell.getBooleanCellValue());
                }
                System.out.print(" | ");
            }
            System.out.println();
        }

    }
}

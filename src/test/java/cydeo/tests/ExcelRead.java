package cydeo.tests;

import io.cucumber.java.ja.*;
import org.apache.poi.xssf.usermodel.*;
import org.junit.*;

import java.io.*;

public class ExcelRead {

    @Test
    public void readExcel() throws IOException {
        String path = "sample.xlsx";
        File file = new File(path);

        FileInputStream fileInputStream = new FileInputStream(file);

        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);

        XSSFSheet sheet = workbook.getSheet("Finance");

        System.out.println(sheet.getRow(2).getCell(2));

        System.out.println(sheet.getPhysicalNumberOfRows());

        System.out.println(sheet.getLastRowNum());

        // when compare, don't forget cellvalue.toString() method
    }

}

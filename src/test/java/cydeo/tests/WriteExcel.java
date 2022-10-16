package cydeo.tests;

import org.apache.poi.xssf.usermodel.*;
import org.junit.*;

import java.io.*;

public class WriteExcel {

    @Test
    public void writeTest() throws IOException {
        String path = "sample.xlsx";
        File file = new File(path);

        FileInputStream fileInputStream = new FileInputStream(file);

        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);

        XSSFSheet sheet = workbook.getSheet("Finance");

        XSSFCell date = sheet.getRow(0).createCell(3);
        date.setCellValue("Date");

        XSSFCell date1 = sheet.getRow(1).createCell(3);
        date1.setCellValue("16/10");

        XSSFCell date2 = sheet.getRow(2).createCell(3);
        date2.setCellValue("18/10");

        XSSFCell date3 = sheet.getRow(3).createCell(3);
        date3.setCellValue("09/12");

        FileOutputStream fileOutputStream = new FileOutputStream(file);

        workbook.write(fileOutputStream);

        fileOutputStream.close();
        workbook.close();
        fileInputStream.close();


    }
}

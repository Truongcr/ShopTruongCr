package com.shoptruongcr.service;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.shoptruongcr.entity.product.Tutorial;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelHelper {
    public static String TYPE = "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet";
    static String HEADERs ="a,b";
    static String SHEET = "Tutorials";
    public static ByteArrayInputStream tutorialsToExcel(List<Tutorial> tutorials) {

        try (Workbook workbook = new XSSFWorkbook(); ByteArrayOutputStream out = new ByteArrayOutputStream();) {
            Sheet sheet = workbook.createSheet(SHEET);

            // Header
            Row headerRow = sheet.createRow(0);
            Set<String> xxx = new HashSet<>();
            for(Tutorial x : tutorials){
                xxx.add(x.getBudgetName());
            }
//            for(String a : xxx){
//                HEADERs.
//            }

            for (int col = 0; col < HEADERs.length(); col++) {
                Cell cell = headerRow.createCell(col);
                cell.setCellValue(HEADERs.charAt(col));
            }
            Set<Integer> titles = new HashSet<>();
            for(Tutorial tutorial : tutorials){
                titles.add(tutorial.getTitle());
            }
            int rowIdx = 1;
            int rowId =2;
            int x = 0 ;
            for(int title : titles) {
                Row rowt = sheet.createRow(rowIdx);
                rowt.createCell(0).setCellValue(title);
                for (Tutorial tutorial : tutorials) {
                        Row row = sheet.createRow(rowId++);
                        row.createCell(0).setCellValue(tutorial.getId());
                        row.createCell(1).setCellValue(tutorial.getTitle());
                        row.createCell(2).setCellValue(tutorial.getDescription());
                        row.createCell(3).setCellValue(tutorial.getPublished());

                        for(int i= 0;i<HEADERs.length();i++){
                            if(tutorial.getBudgetName().equals(HEADERs.charAt(i))){
                                row.createCell(i).setCellValue(tutorial.getBudget_value());
                            }
                        }
                        x = rowId;
                    rowId = x;
                  }
                rowIdx =  x++;
            }
            workbook.write(out);
            return new ByteArrayInputStream(out.toByteArray());
        } catch (IOException e) {
            throw new RuntimeException("fail to import data to Excel file: " + e.getMessage());
        }
    }
}

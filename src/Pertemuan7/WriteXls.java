/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan7;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author kartika
 */
public class WriteXls {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        XSSFWorkbook WB = new XSSFWorkbook();
        XSSFSheet sheet = WB.createSheet("sheet1");

        Object[][] pegawai = {
            {"Kartika Dewi", "Pebisnis", 23},
            {"Utrodus Said", "Programer", 21},
            {"Dimas Ibnu", "Marketing", 21},};
        int rowCount = 0;

        for (Object[] orang : pegawai) {
            Row row = sheet.createRow(++rowCount);

            int columnCount = 0;

            for (Object field : orang) {
                Cell cell = row.createCell(++columnCount);
                if (field instanceof String) {
                    cell.setCellValue((String) field);
                } else if (field instanceof Integer) {
                    cell.setCellValue((Integer) field);
                }
            }
        }
        try (FileOutputStream outputStream = new FileOutputStream("E:\\Pegawai.xls")) {
            WB.write(outputStream);
        }
    }
}

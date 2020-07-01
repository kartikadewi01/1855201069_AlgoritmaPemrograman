/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import org.apache.log4j.PropertyConfigurator;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

/**
 *
 * @author kartika
 */
public class WriteDocx {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        Properties prop = new Properties();
        prop.setProperty("log4j.rootLogger", "WARN");
        PropertyConfigurator.configure(prop);

        String teks = "Kartika Dewi \n 1855201069";
        XWPFDocument document = new XWPFDocument();

        String outDocxString = "E://writeDocx.docx";
        FileOutputStream FOS = new FileOutputStream(new File(outDocxString));

        XWPFParagraph paragraph = document.createParagraph();
        XWPFRun run = paragraph.createRun();
        run.setText(teks);

        document.write(FOS);
        FOS.close();
        run.setText(teks);
        System.out.println("Berhasil menyimpan DOCX");
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan5;

import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Properties;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

/**
 *
 * @author dell
 */
public class WriteDoc {

    public static void main(String[] args) {
        try {
            //Menyimpan pesan warning saat aplikasi dijalankan
            Properties prop = new Properties();
            prop.setProperty("log4j.rootLogger", "WARN");

            //Memberikan nilai String isi
            String teks = "Kartika Dewi \n 1855201069";
            
            //Direktori lokasi penyimpanan
            String endPath = "E://hasilDoc.doc";
            
            //Konstruktor untuk menyimpan dokumen
            XWPFDocument document = new XWPFDocument();
            
            //Menentukan lokasi Hasil Output
            FileOutputStream FOS = new FileOutputStream(new File(endPath));
            
            //Konstruktor untuk menulis dokumen
            XWPFParagraph paragraph = document.createParagraph();
            XWPFRun run = paragraph.createRun();
            run.setText(teks);
            
            //Menuliskan nilai teks kedalam dokumen
            document.write(FOS);
            FOS.close();
            System.out.println("Berhasil menyimpan DOC");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

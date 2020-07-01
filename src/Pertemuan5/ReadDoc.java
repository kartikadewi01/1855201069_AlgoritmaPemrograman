/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan5;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.hwpf.HWPFDocument;
import org.apache.poi.hwpf.extractor.WordExtractor;

/**
 *
 * @author kartika
 */
public class ReadDoc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Mengisi variabel file dengan Path file
        File file = new File("E:\\biodata.doc");
        
        //Mendklarasikan WordExtractor dengan nilai kosong
        WordExtractor extractor = null;
        
        //trycatch untuk meng handle error
        try {
            
            //mendapatkan lokasi file sebagai inputan file
            FileInputStream FIS = new FileInputStream(file.getAbsolutePath());
            
            //Constructor untuk membuka dokumen dari direktori tertentu
            HWPFDocument document = new HWPFDocument(FIS);
            
            //Meng ekstrakdokumen
            extractor = new WordExtractor(document);
            
            //Menyimpan nilai dari isi dokumen
            String texts = extractor.getText();
            
            //Mencetak nilai
            System.out.println(texts);
        } catch (Exception exep) {
            exep.printStackTrace();
        }
    }

}

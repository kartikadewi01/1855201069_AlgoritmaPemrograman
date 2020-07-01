/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan6;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import org.w3c.dom.Document;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.apache.log4j.PropertyConfigurator;
import org.w3c.dom.NodeList;

/**
 *
 * @author kartika
 */
public class ReadDocx {

    public static void main(String[] args) {

        try {

            Properties prop = new Properties();
            prop.setProperty("log4j.rootLogger", "WARN");
            PropertyConfigurator.configure(prop);

            File filenya = new File("E://readDocx.docx");
            FileInputStream file = new FileInputStream(filenya.getPath());

            ZipInputStream docxFile = new ZipInputStream(file);
            ZipEntry zipEntry;
            String xml = "";
            while ((zipEntry = docxFile.getNextEntry()) != null) {
                if (zipEntry.toString().equals("word/document.xml")) {
                    byte[] buffer = new byte[1024 * 4];
                    long count = 0;
                    int n = 0;
                    long size = zipEntry.getSize();

                    while (-1 != (n = docxFile.read(buffer)) && count < size) {
                        xml += new String(buffer, 0, n);
                        count += n;
                    }
                }
            }
            InputStream is = new ByteArrayInputStream(xml.getBytes("UTF-8"));
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder parser = factory.newDocumentBuilder();

            Document document = parser.parse(is);

            NodeList sections = document.getElementsByTagName("w:t");
            String isidocx = "";
            for (int i = 0; i < sections.getLength(); i++) {
                isidocx += sections.item(i).getFirstChild().getNodeValue();
            }
            System.out.println(isidocx);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

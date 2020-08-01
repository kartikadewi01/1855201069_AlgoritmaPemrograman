/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UAS_DataPegawai;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Z50C
 */
public class Koneksi {

    public static void main(String[] args) {
        Koneksi konek = new Koneksi();

        konek.koneksi();
    }

    Connection con = null;

    String statusKoneksi;

    public void koneksi() {
        try {
            String connectionURL = "jdbc:mysql://localhost/data";
            String username = "root";
            String password = "";
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(connectionURL, username, password);
            
           
            statusKoneksi = "Terhubung";
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Gagal Terhubung");

            statusKoneksi = "Gagal Terhubung";
            System.exit(0);
        }
    }

}

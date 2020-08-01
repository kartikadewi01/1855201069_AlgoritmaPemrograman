/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UAS_DataPegawai;

import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Z50C
 */
public class Insert {

    Koneksi konek = new Koneksi();

    public void insert(int id, String nama, String ttl,String jabatan, String alamat, int no, String ket) {

        try {

            konek.koneksi();
            Statement statement = konek.con.createStatement();

            String sql = "INSERT INTO `identitasdua`(`id_pegawai`, `nama`, `tempat_tanggal_lahir`, `jabatan`, `alamat`, `nomor_telpon`, `keterangan_aktif_nonreaktif`) VALUES ('" + id + "', '" + nama + "','" + ttl + "','" + jabatan + "','" + alamat + "','" + no + "','" + ket + "')";

            statement.executeUpdate(sql);
            statement.close();

// kemudian data yang disisipkan akan saya tampilkan lewat textArea 
//            menampilkan.setText(mah_nim.getText() + "\n" + mah_nama.getText() + "\n" + mah_alamat.getText() + "\n" + mah_fak_id.getText() + "\n" + jenis);
            JOptionPane.showMessageDialog(null, "Berhasil Disimpan");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

}

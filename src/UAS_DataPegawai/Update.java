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
 * @author z50c
 */
public class Update {
    Koneksi konek = new Koneksi();
    //
    public void update(int id, String nama, String ttl,String jabatan, String alamat, int no, String status) {
        try {
            konek.koneksi();
            Statement statement = konek.con.createStatement();
            String sql_id = "update identitasdua set id_pegawai='" + id + "'where id_pegawai='" + id + "'"; 
            String sql_nama = "update identitasdua set nama='" + nama + "'where id_pegawai='"+ id +"'";
            String sql_ttl = "update identitasdua set tempat_tanggal_lahir='" + ttl + "'where id_pegawai ='"+ id +"'";
            String sql_jabatan = "update identitasdua set jabatan='" + jabatan + "'where id_pegawai ='"+ id +"'";
            String sql_alamat= "update identitasdua set alamat='" + alamat + "'where id_pegawai ='"+ id +"'";
            String sql_no = "update identitasdua set nomor_telepon='" + no + "'where id_pegawai ='"+ id +"'";
            String sql_ket = "update identitasdua set keterangan='" + status + "'where id_pegawai ='"+ id +"'";
            
            statement.executeUpdate(sql_id);
            statement.executeUpdate(sql_nama);
            statement.executeUpdate(sql_ttl);
            statement.executeUpdate(sql_jabatan);
            statement.executeUpdate(sql_alamat);
            statement.executeUpdate(sql_no);
            statement.executeUpdate(sql_ket);

           
            statement.close();
            
            JOptionPane.showMessageDialog(null, "Berhasil Diubah");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
}

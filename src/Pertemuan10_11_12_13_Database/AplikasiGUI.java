/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan10_11_12_13_Database;

import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author z50c
 */
public class AplikasiGUI extends javax.swing.JFrame {

    /**
     * Creates new form KoneksiGUI
     */
    public AplikasiGUI() {
        initComponents();
        this.setTitle("Aplikasi Data Mahasiswa");
        this.setLocationRelativeTo(this);

        Koneksi konek = new Koneksi();
        konek.koneksi();
        statusKoneksi.setText(konek.statusKoneksi);
        ButtonGroup bG = new ButtonGroup();
        bG.add(in_lakilaki);
        bG.add(in_perempuan);

        table();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")

    Statement pst;
    ResultSet rs;

    public void table() {

        Koneksi konek = new Koneksi();
        konek.koneksi();

        try {
            String sql = "select * from identitas";
            pst = konek.con.prepareStatement(sql);
            rs = pst.executeQuery(sql);
            tabelIdentitas.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

    public void selectByNIM(int nim) {
        Koneksi konek = new Koneksi();
        konek.koneksi();
        try {
            String sql = "select * from identitas where nim like '%" + nim + "%'";
            pst = konek.con.prepareStatement(sql);
            rs = pst.executeQuery(sql);
            tabelIdentitas.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void selectByNama(String nama) {
        Koneksi konek = new Koneksi();
        konek.koneksi();
        try {
            String sql = "select * from identitas where nama like '%" + nama + "%'";
            pst = konek.con.prepareStatement(sql);
            rs = pst.executeQuery(sql);
            tabelIdentitas.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void selectByAlamat(String alamat) {
        Koneksi konek = new Koneksi();
        konek.koneksi();
        try {
            String sql = "select * from identitas where alamat like '%" + alamat + "%'";
            pst = konek.con.prepareStatement(sql);
            rs = pst.executeQuery(sql);
            tabelIdentitas.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void selectByjk(String jenisKelamin) {
        Koneksi konek = new Koneksi();
        konek.koneksi();
        try {
            String sql = "select * from identitas where jeniskelamin like '%" + jenisKelamin + "%'";
            pst = konek.con.prepareStatement(sql);
            rs = pst.executeQuery(sql);
            tabelIdentitas.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        in_nim = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        in_nama = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        in_alamat = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        in_lakilaki = new javax.swing.JRadioButton();
        in_perempuan = new javax.swing.JRadioButton();
        simpanData = new javax.swing.JButton();
        cariBerdasarkan = new javax.swing.JComboBox();
        cari = new javax.swing.JButton();
        hapusData = new javax.swing.JButton();
        updateData = new javax.swing.JButton();
        resetData = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        statusKoneksi = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelIdentitas = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 102));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("DATA MAHASISWA ILKOM UNU BLITAR");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Input Data Mahasiswa"));

        jLabel3.setText("NIM");

        in_nim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                in_nimActionPerformed(evt);
            }
        });

        jLabel4.setText("Nama");

        jLabel5.setText("Alamat");

        in_alamat.setColumns(20);
        in_alamat.setRows(5);
        jScrollPane1.setViewportView(in_alamat);

        jLabel6.setText("Jenis Kelamin");

        in_lakilaki.setText("Laki - Laki");
        in_lakilaki.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                in_lakilakiActionPerformed(evt);
            }
        });

        in_perempuan.setText("Perempuan");

        simpanData.setText("SIMPAN");
        simpanData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanDataActionPerformed(evt);
            }
        });

        cariBerdasarkan.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "- Cari Berdasarkan -", "NIM", "Nama", "Alamat", "Jenis Kelamin" }));

        cari.setText("CARI");
        cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cariActionPerformed(evt);
            }
        });

        hapusData.setText("HAPUS");
        hapusData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusDataActionPerformed(evt);
            }
        });

        updateData.setText("UBAH");
        updateData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateDataActionPerformed(evt);
            }
        });

        resetData.setText("RESET");
        resetData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetDataActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cari, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(hapusData, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(updateData, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cariBerdasarkan, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(simpanData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(resetData, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5))
                                .addGap(46, 46, 46)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1)
                                    .addComponent(in_nama)
                                    .addComponent(in_nim)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(in_lakilaki)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(in_perempuan)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(in_nim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(in_nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(in_lakilaki)
                    .addComponent(in_perempuan))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cari, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cariBerdasarkan)
                    .addComponent(resetData))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hapusData, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateData, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(simpanData))
                .addGap(17, 17, 17))
        );

        jLabel2.setText("Status Koneksi");

        statusKoneksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statusKoneksiActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Output Data Mahasiswa"));

        tabelIdentitas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "NIM", "Nama", "Alamat", "Jenis Kelamin"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabelIdentitas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelIdentitasMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabelIdentitas);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(statusKoneksi, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addComponent(jLabel1)))
                        .addGap(0, 89, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(statusKoneksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void statusKoneksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statusKoneksiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_statusKoneksiActionPerformed

    private void tabelIdentitasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelIdentitasMouseClicked
        // TODO add your handling code here:
        DefaultTableModel dtm = (DefaultTableModel) tabelIdentitas.getModel(); //create a model
        int selectedRowIndex = tabelIdentitas.getSelectedRow(); //get selected row
        int id = (int) dtm.getValueAt(selectedRowIndex, 0); //get the primary key to fetch data.

        Koneksi konek = new Koneksi();
        konek.koneksi();
        try {

            String sql = "select * from identitas where nim like '%" + id + "%'";
            pst = konek.con.prepareStatement(sql);

            ResultSet rs = rs = pst.executeQuery(sql);

            while (rs.next()) {    //u can use normal query
                in_nim.setText(rs.getString("nim"));
                in_nama.setText(rs.getString("nama"));
                in_alamat.setText(rs.getString("alamat"));

                String jenis = rs.getString("jeniskelamin");
                if (jenis.equals("L")) {
                    in_lakilaki.setSelected(true);
                } else {
                    in_perempuan.setSelected(true);
                }
            }
        } catch (Exception ex) {
//            Logger.getLogger(ExistingStock.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tabelIdentitasMouseClicked

    private void hapusDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusDataActionPerformed
        // TODO add your handling code here:
        Koneksi konek = new Koneksi();
        konek.koneksi();

        Delete delete = new Delete();
        delete.delete(Integer.parseInt(in_nim.getText()));

        table();
    }//GEN-LAST:event_hapusDataActionPerformed

    private void cariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cariActionPerformed
        // TODO add your handling code here:
        if (cariBerdasarkan.getSelectedIndex() == 1) {
            selectByNIM(Integer.parseInt(in_nim.getText()));
        } else if (cariBerdasarkan.getSelectedIndex() == 2) {
            selectByNama(in_nama.getText());
        } else if (cariBerdasarkan.getSelectedIndex() == 3) {
            selectByAlamat(in_alamat.getText());
        } else if (cariBerdasarkan.getSelectedIndex() == 4) {
            String jenis = "";
            if (in_lakilaki.isSelected()) {
                jenis = "L";
            } else if (in_perempuan.isSelected()) {
                jenis = "P";
            }
        }
    }//GEN-LAST:event_cariActionPerformed

    private void simpanDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanDataActionPerformed
        // TODO add your handpo0ling code here:

        String jenis = "";
        if (in_lakilaki.isSelected()) {
            jenis = "L";
        } else if (in_perempuan.isSelected()) {
            jenis = "P";
        }
        Insert in = new Insert();
        int nim = Integer.parseInt(in_nim.getText());
        String nama = in_nama.getText();
        String alamat = in_alamat.getText();
        in.insert(nim, nama, alamat, jenis);
        table();
    }//GEN-LAST:event_simpanDataActionPerformed

    private void in_lakilakiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_in_lakilakiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_in_lakilakiActionPerformed

    private void in_nimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_in_nimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_in_nimActionPerformed

    private void updateDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateDataActionPerformed
        // TODO add your handling code here:
        Koneksi konek = new Koneksi();
        konek.koneksi();

        Update update = new Update();
        String nama = in_nama.getText();
        String alamat = in_alamat.getText();
        String jenis = "";
        if (in_lakilaki.isSelected()) {
            jenis = "L";
        } else if (in_perempuan.isSelected()) {
            jenis = "P";
        }

        update.update(Integer.parseInt(in_nim.getText()), nama, alamat, jenis);

        table();
    }//GEN-LAST:event_updateDataActionPerformed

    private void resetDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetDataActionPerformed
        // TODO add your handling code here:
        in_nim.setText("");
        in_nama.setText("");
        in_alamat.setText("");
        
    }//GEN-LAST:event_resetDataActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Classic".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AplikasiGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AplikasiGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AplikasiGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AplikasiGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AplikasiGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cari;
    private javax.swing.JComboBox cariBerdasarkan;
    private javax.swing.JButton hapusData;
    private javax.swing.JTextArea in_alamat;
    private javax.swing.JRadioButton in_lakilaki;
    private javax.swing.JTextField in_nama;
    private javax.swing.JTextField in_nim;
    private javax.swing.JRadioButton in_perempuan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton resetData;
    private javax.swing.JButton simpanData;
    private javax.swing.JTextField statusKoneksi;
    private javax.swing.JTable tabelIdentitas;
    private javax.swing.JButton updateData;
    // End of variables declaration//GEN-END:variables
}

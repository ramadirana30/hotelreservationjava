/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelprojectgui;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
/**
 *
 * @author USER
 */
public class ReservasiHotelMilos extends javax.swing.JFrame {
String masuk;
String keluar; 
    /**
     * Creates new form ReservasiHotelMilos
     */
    public ReservasiHotelMilos() {
        initComponents();
     
         this.setLocationRelativeTo(null);
    }
    
    

    public void hitung(){
        try {
            long biayah;
        String tipek;
        tipek = cmbjeniskamar.getSelectedItem().toString();
        DateFormat format = new SimpleDateFormat("dd MMMM yyyy");
    Date tanggalmasuk = format.parse(masuk);
    Date tanggalkeluar = format.parse(keluar);
    long tanggalmasuk1 = tanggalmasuk.getTime();
    long tanggalkeluar1 = tanggalkeluar.getTime();
    long diff = tanggalkeluar1 - tanggalmasuk1;
    long lama = diff / (24 * 60 * 60 * 1000);
        switch (tipek) {
            case "Standard" :
                    biayah = 250000;
                    txtharga.setText(Long.toString(lama * biayah) + "");
                    break;
            case "Superior" :
                    biayah = 500000;
                    txtharga.setText(Long.toString(lama * biayah) + "");
                    break;
             case "Deluxe" :
                    biayah = 750000;
                    txtharga.setText(Long.toString(lama * biayah) + "");
                    break;
            case "Suite" :
                    biayah = 1000000;
                    txtharga.setText(Long.toString(lama * biayah) + "");
                    break;
        }
    
} catch (ParseException e) {
    System.out.println("" + e.getMessage());
} }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablerese = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        srcrese = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtnama = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        cmbjeniskamar = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        txtnokamar = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        tglout = new com.toedter.calendar.JDateChooser();
        tglin = new com.toedter.calendar.JDateChooser();
        jLabel17 = new javax.swing.JLabel();
        txtharga = new javax.swing.JTextField();
        btntambah = new javax.swing.JButton();
        btnubah = new javax.swing.JButton();
        btnhapus = new javax.swing.JButton();
        btnhitung = new javax.swing.JButton();
        btnhapusall = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotelpic/aweeu.png"))); // NOI18N
        jLabel10.setText("jLabel10");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 280, 280));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Halo, Admin!");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 490, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Selamat datang di sistem informasi Hotel Milos.");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 550, -1, 20));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotelpic/wqw.png"))); // NOI18N
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 40, -1, 60));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotelpic/LOGOUT.png"))); // NOI18N
        jButton5.setContentAreaFilled(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 600, -1, -1));

        tablerese.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Reservasi", "Nama", "Jenis Kamar", "No Kamar", "Tgl Checkin", "Tgl Checkout", "Harga"
            }
        ));
        jScrollPane1.setViewportView(tablerese);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 210, 450, 650));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("ID Reservasi  :");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 220, -1, -1));

        srcrese.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                srcreseKeyReleased(evt);
            }
        });
        jPanel1.add(srcrese, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 150, 220, 40));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Jenis Kamar :");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 340, -1, -1));
        jPanel1.add(txtnama, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 270, 220, 40));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("Nama :");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 280, -1, -1));

        cmbjeniskamar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Pilih Tipe Kamar-", "Standard", "Superior", "Deluxe", "Suite" }));
        cmbjeniskamar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbjeniskamarActionPerformed(evt);
            }
        });
        jPanel1.add(cmbjeniskamar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 330, 220, 50));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setText("Tgl Check Out  :");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 540, -1, -1));
        jPanel1.add(txtnokamar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 400, 220, 40));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel15.setText("No Kamar  :");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 410, -1, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setText("Tgl Check In  :");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 480, -1, -1));

        tglout.setDateFormatString("dd MMMM yyyy");
        tglout.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tgloutPropertyChange(evt);
            }
        });
        jPanel1.add(tglout, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 530, 220, 40));

        tglin.setDateFormatString("dd MMMM yyyy");
        tglin.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tglinPropertyChange(evt);
            }
        });
        jPanel1.add(tglin, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 470, 220, 40));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel17.setText("Harga :");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 610, -1, -1));
        jPanel1.add(txtharga, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 600, 220, 40));

        btntambah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotelpic/TAMBAH1.png"))); // NOI18N
        btntambah.setContentAreaFilled(false);
        btntambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntambahActionPerformed(evt);
            }
        });
        jPanel1.add(btntambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 670, 100, 60));

        btnubah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotelpic/ubah1.png"))); // NOI18N
        btnubah.setContentAreaFilled(false);
        btnubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnubahActionPerformed(evt);
            }
        });
        jPanel1.add(btnubah, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 670, 100, 60));

        btnhapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotelpic/hapus1.png"))); // NOI18N
        btnhapus.setContentAreaFilled(false);
        btnhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhapusActionPerformed(evt);
            }
        });
        jPanel1.add(btnhapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 670, 100, 60));

        btnhitung.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotelpic/hitung.png"))); // NOI18N
        btnhitung.setContentAreaFilled(false);
        btnhitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhitungActionPerformed(evt);
            }
        });
        jPanel1.add(btnhitung, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 740, 260, 60));

        btnhapusall.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotelpic/hapusall.png"))); // NOI18N
        btnhapusall.setContentAreaFilled(false);
        btnhapusall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhapusallActionPerformed(evt);
            }
        });
        jPanel1.add(btnhapusall, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 800, 260, 60));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel2.setText("RESERVASI HOTEL");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 40, -1, -1));
        jPanel1.add(txtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 210, 220, 40));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotelpic/111searc.png"))); // NOI18N
        jButton2.setContentAreaFilled(false);
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 140, 60, 60));

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("?? Adri, Rama, Teguh");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 870, -1, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotelpic/wadidwa.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1250, 900));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        LoginFormHotel lfh = new LoginFormHotel();
        lfh.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        MenuHotelMilos mhm = new MenuHotelMilos();
        mhm.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btntambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntambahActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)tablerese.getModel();
        model.addRow(new Object[]{txtid.getText(), txtnama.getText(),
                                  cmbjeniskamar.getSelectedItem().toString(), txtnokamar.getText(),
                                  tglin.getDate(),tglout.getDate(),txtharga.getText()});
    }//GEN-LAST:event_btntambahActionPerformed

    private void btnubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnubahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnubahActionPerformed

    private void btnhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhapusActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tablerese.getModel();
         int row = tablerese.getSelectedRow();
         if(row>=0){
         int ok=JOptionPane.showConfirmDialog(null, "Yakin Mau Hapus?","Konfirmasi",JOptionPane.YES_NO_OPTION);
         if(ok==0){
         model.removeRow(row);
         }
         }
    }//GEN-LAST:event_btnhapusActionPerformed

    private void btnhitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhitungActionPerformed
        // TODO add your handling code here:
        hitung();
    }//GEN-LAST:event_btnhitungActionPerformed

    private void btnhapusallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhapusallActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)tablerese.getModel();
       int ok=JOptionPane.showConfirmDialog(null, "Yakin Mau Hapus?","Konfirmasi",JOptionPane.YES_NO_OPTION);
       while (model.getRowCount() > 0){
       
        for (int i = 0; i < model.getRowCount(); ++i){
            model.removeRow(i);
        }
    }
    }//GEN-LAST:event_btnhapusallActionPerformed

    private void tglinPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tglinPropertyChange
        // TODO add your handling code here:
        if (tglin.getDate() != null) {
      SimpleDateFormat FormatTanggal = new SimpleDateFormat("dd MMMM yyyy");
      masuk = FormatTanggal.format(tglin.getDate());
}
    }//GEN-LAST:event_tglinPropertyChange

    private void tgloutPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tgloutPropertyChange
        // TODO add your handling code here:
         if (tglout.getDate() != null) {
     SimpleDateFormat FormatTanggal = new SimpleDateFormat("dd MMMM yyyy");
     keluar = FormatTanggal.format(tglout.getDate());
}
    }//GEN-LAST:event_tgloutPropertyChange

    private void cmbjeniskamarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbjeniskamarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbjeniskamarActionPerformed

    private void srcreseKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_srcreseKeyReleased
        DefaultTableModel model=(DefaultTableModel)tablerese.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
        tablerese.setRowSorter(tr);
            tr.setRowFilter(RowFilter.regexFilter(srcrese.getText().trim()));
        // TODO add your handling code here:
    }//GEN-LAST:event_srcreseKeyReleased

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ReservasiHotelMilos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReservasiHotelMilos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReservasiHotelMilos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReservasiHotelMilos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReservasiHotelMilos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnhapus;
    private javax.swing.JButton btnhapusall;
    private javax.swing.JButton btnhitung;
    private javax.swing.JButton btntambah;
    private javax.swing.JButton btnubah;
    private javax.swing.JComboBox<String> cmbjeniskamar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField srcrese;
    private javax.swing.JTable tablerese;
    private com.toedter.calendar.JDateChooser tglin;
    private com.toedter.calendar.JDateChooser tglout;
    private javax.swing.JTextField txtharga;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtnama;
    private javax.swing.JTextField txtnokamar;
    // End of variables declaration//GEN-END:variables
}

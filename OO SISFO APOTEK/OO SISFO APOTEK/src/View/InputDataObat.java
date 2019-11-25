/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.Button;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextArea;

/**
 *
 * @author PUTRI
 */
public class InputDataObat extends javax.swing.JFrame {

    /**
     * Creates new form Supplier
     */
    public InputDataObat() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pmsPnl = new javax.swing.JPanel();
        idSupLbl = new javax.swing.JLabel();
        jenisLbl = new javax.swing.JLabel();
        aturanPakaiLbl = new javax.swing.JLabel();
        dcPms = new datechooser.beans.DateChooserCombo();
        btnSimpan = new java.awt.Button();
        btnBatal = new java.awt.Button();
        tfDosis = new javax.swing.JTextField();
        idObatLbl = new javax.swing.JLabel();
        tfIdObat = new javax.swing.JTextField();
        tfIdSup = new javax.swing.JTextField();
        namaLbl = new javax.swing.JLabel();
        tfNama = new javax.swing.JTextField();
        tfJenis = new javax.swing.JTextField();
        tfAturanPakai = new javax.swing.JTextField();
        tfKomposisi = new javax.swing.JTextField();
        tfIndikasi = new javax.swing.JTextField();
        dosisLbl = new javax.swing.JLabel();
        expLbl = new javax.swing.JLabel();
        komposisiLbl = new javax.swing.JLabel();
        indikasiLbl = new javax.swing.JLabel();
        judulLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(240, 236, 236));
        setMinimumSize(new java.awt.Dimension(600, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pmsPnl.setBackground(new java.awt.Color(255, 255, 255));
        pmsPnl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        pmsPnl.setMinimumSize(new java.awt.Dimension(500, 400));
        pmsPnl.setPreferredSize(new java.awt.Dimension(500, 350));
        pmsPnl.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        idSupLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        idSupLbl.setText("Id_Suplier");
        pmsPnl.add(idSupLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));

        jenisLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jenisLbl.setText("Jenis");
        pmsPnl.add(jenisLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));

        aturanPakaiLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        aturanPakaiLbl.setText("Aturan Pakai");
        pmsPnl.add(aturanPakaiLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, -1, -1));
        pmsPnl.add(dcPms, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, 460, 30));

        btnSimpan.setBackground(new java.awt.Color(86, 204, 242));
        btnSimpan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSimpan.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSimpan.setLabel("Simpan");
        btnSimpan.setPreferredSize(new java.awt.Dimension(100, 30));
        pmsPnl.add(btnSimpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 500, -1, -1));

        btnBatal.setBackground(new java.awt.Color(86, 204, 242));
        btnBatal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnBatal.setLabel("Batal");
        btnBatal.setPreferredSize(new java.awt.Dimension(100, 30));
        pmsPnl.add(btnBatal, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 500, -1, -1));

        tfDosis.setMinimumSize(new java.awt.Dimension(6, 30));
        tfDosis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDosisActionPerformed(evt);
            }
        });
        pmsPnl.add(tfDosis, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, 460, 30));

        idObatLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        idObatLbl.setText("Id_Obat");
        pmsPnl.add(idObatLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));

        tfIdObat.setForeground(new java.awt.Color(204, 204, 204));
        tfIdObat.setText("Default");
        tfIdObat.setMinimumSize(new java.awt.Dimension(6, 30));
        tfIdObat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfIdObatActionPerformed(evt);
            }
        });
        pmsPnl.add(tfIdObat, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, 460, 30));

        tfIdSup.setForeground(new java.awt.Color(204, 204, 204));
        tfIdSup.setText("Default");
        tfIdSup.setMinimumSize(new java.awt.Dimension(6, 30));
        tfIdSup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfIdSupActionPerformed(evt);
            }
        });
        pmsPnl.add(tfIdSup, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, 460, 30));

        namaLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        namaLbl.setText("Nama");
        pmsPnl.add(namaLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, -1));

        tfNama.setMinimumSize(new java.awt.Dimension(6, 30));
        tfNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNamaActionPerformed(evt);
            }
        });
        pmsPnl.add(tfNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, 460, 30));

        tfJenis.setMinimumSize(new java.awt.Dimension(6, 30));
        tfJenis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfJenisActionPerformed(evt);
            }
        });
        pmsPnl.add(tfJenis, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, 460, 30));

        tfAturanPakai.setMinimumSize(new java.awt.Dimension(6, 30));
        tfAturanPakai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfAturanPakaiActionPerformed(evt);
            }
        });
        pmsPnl.add(tfAturanPakai, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 360, 460, 30));

        tfKomposisi.setMinimumSize(new java.awt.Dimension(6, 30));
        tfKomposisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfKomposisiActionPerformed(evt);
            }
        });
        pmsPnl.add(tfKomposisi, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 280, 460, 30));

        tfIndikasi.setMinimumSize(new java.awt.Dimension(6, 30));
        tfIndikasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfIndikasiActionPerformed(evt);
            }
        });
        pmsPnl.add(tfIndikasi, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 320, 460, 30));

        dosisLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        dosisLbl.setText("Dosis");
        pmsPnl.add(dosisLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, -1));

        expLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        expLbl.setText("Expired");
        pmsPnl.add(expLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, -1));

        komposisiLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        komposisiLbl.setText("Komposisi");
        pmsPnl.add(komposisiLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, -1, -1));

        indikasiLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        indikasiLbl.setText("Indikasi");
        pmsPnl.add(indikasiLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, -1, -1));

        getContentPane().add(pmsPnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 95, 780, 570));

        judulLbl.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        judulLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        judulLbl.setText("Edit Data Obat");
        getContentPane().add(judulLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, 290, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfDosisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDosisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfDosisActionPerformed

    private void tfIdObatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfIdObatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfIdObatActionPerformed

    private void tfIdSupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfIdSupActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfIdSupActionPerformed

    private void tfNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNamaActionPerformed

    private void tfJenisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfJenisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfJenisActionPerformed

    private void tfAturanPakaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfAturanPakaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfAturanPakaiActionPerformed

    private void tfKomposisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfKomposisiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfKomposisiActionPerformed

    private void tfIndikasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfIndikasiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfIndikasiActionPerformed
    
    public void setActionListener(ActionListener a){
        btnSimpan.addActionListener(a);
        btnBatal.addActionListener(a);
    }
    
    public Button getBtnSimpan(){
        return btnSimpan;
    }
    
    public Button getBtnBatal(){
        return btnBatal;
    }
    
    public String getIdObat(){
        return tfIdObat.getText();
    }
    
    public String getIdSup(){
        return tfIdSup.getText();
    }
    
    public String getNama(){
        return tfNama.getText();
    }
    
    public String getJenis(){
        return tfJenis.getText();
    }
    
    public String getDosis(){
        return tfDosis.getText();
    }

     public String getExpired(){
        java.text.SimpleDateFormat kal = new java.text.SimpleDateFormat ("yyyy-MM-dd");
        dcPms.setDateFormat(kal);
        return dcPms.getText();
    }
     
    public String getKomposisi(){
        return tfKomposisi.getText();
    }
    
    public String getIndikasi(){
        return tfIndikasi.getText();
    }
    
    public String getAturanPakai(){
        return tfAturanPakai.getText();
    }
     
//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(InputResepObat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(InputResepObat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(InputResepObat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(InputResepObat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new InputResepObat().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aturanPakaiLbl;
    private java.awt.Button btnBatal;
    private java.awt.Button btnSimpan;
    private datechooser.beans.DateChooserCombo dcPms;
    private javax.swing.JLabel dosisLbl;
    private javax.swing.JLabel expLbl;
    private javax.swing.JLabel idObatLbl;
    private javax.swing.JLabel idSupLbl;
    private javax.swing.JLabel indikasiLbl;
    private javax.swing.JLabel jenisLbl;
    private javax.swing.JLabel judulLbl;
    private javax.swing.JLabel komposisiLbl;
    private javax.swing.JLabel namaLbl;
    private javax.swing.JPanel pmsPnl;
    private javax.swing.JTextField tfAturanPakai;
    private javax.swing.JTextField tfDosis;
    private javax.swing.JTextField tfIdObat;
    private javax.swing.JTextField tfIdSup;
    private javax.swing.JTextField tfIndikasi;
    private javax.swing.JTextField tfJenis;
    private javax.swing.JTextField tfKomposisi;
    private javax.swing.JTextField tfNama;
    // End of variables declaration//GEN-END:variables
}
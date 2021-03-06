/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;

/**
 *
 * @author PUTRI
 */
public class ManagerNotifikasi extends javax.swing.JFrame {

    /**
     * Creates new form Supplier
     */
    public ManagerNotifikasi() {
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

        mngPnl = new javax.swing.JPanel();
        managerLbl = new javax.swing.JLabel();
        jbKeluar = new javax.swing.JButton();
        jbDashboard = new javax.swing.JButton();
        jbKaryawan = new javax.swing.JButton();
        jbPengadaan = new javax.swing.JButton();
        fotoLbl = new javax.swing.JLabel();
        jbKeuangan = new javax.swing.JButton();
        judulLbl = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        menuLbl = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        pesanLbl = new javax.swing.JLabel();
        notifLbl = new javax.swing.JLabel();
        headPnl = new javax.swing.JPanel();
        notif2Pnl = new javax.swing.JPanel();
        notif1Pnl = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(240, 236, 236));
        setIconImages(null);
        setMinimumSize(new java.awt.Dimension(600, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mngPnl.setBackground(new java.awt.Color(0, 204, 204));
        mngPnl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        mngPnl.setMinimumSize(new java.awt.Dimension(500, 400));
        mngPnl.setPreferredSize(new java.awt.Dimension(500, 350));
        mngPnl.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        managerLbl.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        managerLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        managerLbl.setText("MANAGER");
        mngPnl.add(managerLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 180, 220, -1));

        jbKeluar.setBackground(new java.awt.Color(255, 255, 255));
        jbKeluar.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jbKeluar.setText("Keluar");
        jbKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbKeluarActionPerformed(evt);
            }
        });
        mngPnl.add(jbKeluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 230, 50));

        jbDashboard.setBackground(new java.awt.Color(255, 255, 255));
        jbDashboard.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jbDashboard.setText("Dashboard");
        jbDashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbDashboardActionPerformed(evt);
            }
        });
        mngPnl.add(jbDashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 230, 50));

        jbKaryawan.setBackground(new java.awt.Color(255, 255, 255));
        jbKaryawan.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jbKaryawan.setText("Data Karyawan");
        jbKaryawan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbKaryawanActionPerformed(evt);
            }
        });
        mngPnl.add(jbKaryawan, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 230, 50));

        jbPengadaan.setBackground(new java.awt.Color(255, 255, 255));
        jbPengadaan.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jbPengadaan.setText("Laporan Pengadaan");
        jbPengadaan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPengadaanActionPerformed(evt);
            }
        });
        mngPnl.add(jbPengadaan, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 230, 50));

        fotoLbl.setIcon(new javax.swing.ImageIcon("E:\\files\\Teknik Informatika\\semester 5\\IMPAL\\OO SISFO APOTEK\\Aset\\girll.png")); // NOI18N
        mngPnl.add(fotoLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, -1, -1));

        jbKeuangan.setBackground(new java.awt.Color(255, 255, 255));
        jbKeuangan.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jbKeuangan.setText("Laporan Keuangan");
        jbKeuangan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbKeuanganActionPerformed(evt);
            }
        });
        mngPnl.add(jbKeuangan, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 230, 50));

        getContentPane().add(mngPnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 230, 780));

        judulLbl.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        judulLbl.setText("Pemberitahuan Anda");
        getContentPane().add(judulLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, 220, 30));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        menuLbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        menuLbl.setIcon(new javax.swing.ImageIcon("E:\\files\\Teknik Informatika\\semester 5\\IMPAL\\OO SISFO APOTEK\\Aset\\buttonn.png")); // NOI18N
        menuLbl.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        menuLbl.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel2.add(menuLbl);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 60, 60));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        pesanLbl.setIcon(new javax.swing.ImageIcon("E:\\files\\Teknik Informatika\\semester 5\\IMPAL\\OO SISFO APOTEK\\Aset\\Pesann.png")); // NOI18N
        jPanel1.add(pesanLbl);

        notifLbl.setIcon(new javax.swing.ImageIcon("E:\\files\\Teknik Informatika\\semester 5\\IMPAL\\OO SISFO APOTEK\\Aset\\Notifikasii.png")); // NOI18N
        notifLbl.setToolTipText("");
        notifLbl.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(notifLbl);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 10, 110, 60));

        headPnl.setBackground(new java.awt.Color(204, 204, 204));
        getContentPane().add(headPnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 660, 70));

        notif2Pnl.setBackground(new java.awt.Color(204, 204, 204));
        getContentPane().add(notif2Pnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, 620, 70));

        notif1Pnl.setBackground(new java.awt.Color(204, 204, 204));
        getContentPane().add(notif1Pnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, 620, 70));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbKeluarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbKeluarActionPerformed

    private void jbDashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDashboardActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbDashboardActionPerformed

    private void jbKaryawanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbKaryawanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbKaryawanActionPerformed

    private void jbPengadaanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPengadaanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbPengadaanActionPerformed

    private void jbKeuanganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbKeuanganActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbKeuanganActionPerformed

    public void setActionListener(ActionListener a){
        jbKeluar.addActionListener(a);
        jbKaryawan.addActionListener(a);
        jbKeuangan.addActionListener(a);
        jbPengadaan.addActionListener(a);
        jbDashboard.addActionListener(a);
    }
    
     public void addMouseAdapter(MouseAdapter e){
        pesanLbl.addMouseListener(e);
        notifLbl.addMouseListener(e);
        
    }
    
    public JPanel mngPnl() {
        return mngPnl;
    }
    
    public JLabel getManager() {
        return managerLbl;
    }
    
    public JLabel getPesan() {
        return pesanLbl;
    }
    
    public JLabel getNotif() {
        return notifLbl;
    }
    
    public JButton getBtnKeluar(){
        return jbKeluar;
    }
    
    public JButton getBtnDasboad(){
        return jbDashboard;
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
//            java.util.logging.Logger.getLogger(ManagerNotifikasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(ManagerNotifikasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(ManagerNotifikasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(ManagerNotifikasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new ManagerNotifikasi().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fotoLbl;
    private javax.swing.JPanel headPnl;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jbDashboard;
    private javax.swing.JButton jbKaryawan;
    private javax.swing.JButton jbKeluar;
    private javax.swing.JButton jbKeuangan;
    private javax.swing.JButton jbPengadaan;
    private javax.swing.JLabel judulLbl;
    private javax.swing.JLabel managerLbl;
    private javax.swing.JLabel menuLbl;
    private javax.swing.JPanel mngPnl;
    private javax.swing.JPanel notif1Pnl;
    private javax.swing.JPanel notif2Pnl;
    private javax.swing.JLabel notifLbl;
    private javax.swing.JLabel pesanLbl;
    // End of variables declaration//GEN-END:variables
}

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
import javax.swing.JTextField;

/**
 *
 * @author PUTRI
 */
public class ApotekerResepObat extends javax.swing.JFrame {

    /**
     * Creates new form Supplier
     */
    public ApotekerResepObat() {
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

        aptPnl = new javax.swing.JPanel();
        apotekerLbl = new javax.swing.JLabel();
        idLbl = new javax.swing.JLabel();
        jbKeluar = new javax.swing.JButton();
        jbDashboard = new javax.swing.JButton();
        jbResep = new javax.swing.JButton();
        fotoLbl = new javax.swing.JLabel();
        judulLbl = new javax.swing.JLabel();
        tfCari = new javax.swing.JTextField();
        tambahLbl = new javax.swing.JLabel();
        jdlTambahLbl = new javax.swing.JLabel();
        cariLbl = new javax.swing.JLabel();
        spTabel = new javax.swing.JScrollPane();
        tabResep = new javax.swing.JTable();
        jpMenu = new javax.swing.JPanel();
        menuLbl = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        pesanLbl = new javax.swing.JLabel();
        notifLbl = new javax.swing.JLabel();
        headPnl = new javax.swing.JPanel();
        jTextField4 = new javax.swing.JTextField();
        jbHapus = new javax.swing.JButton();
        jbEdit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(240, 236, 236));
        setIconImages(null);
        setMinimumSize(new java.awt.Dimension(600, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        aptPnl.setBackground(new java.awt.Color(0, 204, 204));
        aptPnl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        aptPnl.setMinimumSize(new java.awt.Dimension(500, 400));
        aptPnl.setPreferredSize(new java.awt.Dimension(500, 350));
        aptPnl.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        apotekerLbl.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        apotekerLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        apotekerLbl.setText("APOTEKER");
        aptPnl.add(apotekerLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 180, 220, -1));

        idLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        idLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        idLbl.setText("ID-APT001");
        aptPnl.add(idLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1, 220, 230, -1));

        jbKeluar.setBackground(new java.awt.Color(255, 255, 255));
        jbKeluar.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jbKeluar.setText("Keluar");
        aptPnl.add(jbKeluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 230, 50));

        jbDashboard.setBackground(new java.awt.Color(255, 255, 255));
        jbDashboard.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jbDashboard.setText("Dashboard");
        aptPnl.add(jbDashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 230, 50));

        jbResep.setBackground(new java.awt.Color(255, 255, 255));
        jbResep.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jbResep.setText("Resep Obat");
        aptPnl.add(jbResep, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 230, 50));

        fotoLbl.setIcon(new javax.swing.ImageIcon("E:\\files\\Teknik Informatika\\semester 5\\IMPAL\\OO SISFO APOTEK\\Aset\\girll.png")); // NOI18N
        aptPnl.add(fotoLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, -1, -1));

        getContentPane().add(aptPnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 230, 780));

        judulLbl.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        judulLbl.setText("Resep Obat");
        getContentPane().add(judulLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, 150, 30));

        tfCari.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfCari.setText("Pencarian...");
        getContentPane().add(tfCari, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 90, 190, 30));

        tambahLbl.setIcon(new javax.swing.ImageIcon("E:\\files\\Teknik Informatika\\semester 5\\IMPAL\\OO SISFO APOTEK\\Aset\\Tambahh.png")); // NOI18N
        getContentPane().add(tambahLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(845, 85, 30, 40));

        jdlTambahLbl.setText("Tambah");
        getContentPane().add(jdlTambahLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 100, -1, -1));

        cariLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/search (1).png"))); // NOI18N
        getContentPane().add(cariLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 90, 30, 30));

        tabResep.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id_resep", "Id_apoteker", "Tanggal resep", "Deskripsi"
            }
        ));
        spTabel.setViewportView(tabResep);

        getContentPane().add(spTabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, 620, 190));

        jpMenu.setBackground(new java.awt.Color(204, 204, 204));

        menuLbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        menuLbl.setIcon(new javax.swing.ImageIcon("E:\\files\\Teknik Informatika\\semester 5\\IMPAL\\OO SISFO APOTEK\\Aset\\buttonn.png")); // NOI18N
        menuLbl.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        menuLbl.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jpMenu.add(menuLbl);

        getContentPane().add(jpMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 60, 60));

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

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 130, -1));

        jbHapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Hapuss.png"))); // NOI18N
        jbHapus.setText("Hapus");
        jbHapus.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        getContentPane().add(jbHapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 400, 90, 40));

        jbEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/editt.png"))); // NOI18N
        jbEdit.setText("Edit");
        jbEdit.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        getContentPane().add(jbEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 400, 70, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    public void setActionListener(ActionListener a){
        jbDashboard.addActionListener(a);
        jbResep.addActionListener(a);
        jbKeluar.addActionListener(a);
        jbHapus.addActionListener(a);
        jbEdit.addActionListener(a);
    }

     public void addMouseAdapter(MouseAdapter e){
        cariLbl.addMouseListener(e);
        tambahLbl.addMouseListener(e);
        pesanLbl.addMouseListener(e);
        notifLbl.addMouseListener(e);
        
    }
    
    public JPanel aptPnl() {
        return aptPnl;
    }
    
    public JLabel getLblCari() {
        return cariLbl;
    }
//    
//    public JLabel getEdit() {
//        return editLbl;
//    }
    
    public JTextField getCari() {
        return tfCari;
    }
    
//    public JLabel getHapus() {
//        return hapusLbl;
//    }
    
    public JLabel getApoteker() {
        return apotekerLbl;
    }
    
    public JLabel getId() {
        return idLbl;
    }
    
    public JLabel getPesan() {
        return pesanLbl;
    }
    
    public JLabel getNotif() {
        return notifLbl;
    }
    
    public JTable getTableResep() {
        return tabResep;
    }
    
    public JButton getBtnKeluar(){
        return jbKeluar;
    }
    
    public JButton getBtnResep(){
        return jbResep;
    }
    
    public JButton getBtnDasboard(){
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
//            java.util.logging.Logger.getLogger(ApotekerResepObat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(ApotekerResepObat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(ApotekerResepObat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(ApotekerResepObat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new ApotekerResepObat().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel apotekerLbl;
    private javax.swing.JPanel aptPnl;
    private javax.swing.JLabel cariLbl;
    private javax.swing.JLabel fotoLbl;
    private javax.swing.JPanel headPnl;
    private javax.swing.JLabel idLbl;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JButton jbDashboard;
    private javax.swing.JButton jbEdit;
    private javax.swing.JButton jbHapus;
    private javax.swing.JButton jbKeluar;
    private javax.swing.JButton jbResep;
    private javax.swing.JLabel jdlTambahLbl;
    private javax.swing.JPanel jpMenu;
    private javax.swing.JLabel judulLbl;
    private javax.swing.JLabel menuLbl;
    private javax.swing.JLabel notifLbl;
    private javax.swing.JLabel pesanLbl;
    private javax.swing.JScrollPane spTabel;
    private javax.swing.JTable tabResep;
    private javax.swing.JLabel tambahLbl;
    private javax.swing.JTextField tfCari;
    // End of variables declaration//GEN-END:variables
}

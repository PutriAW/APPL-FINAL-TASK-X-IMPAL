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
public class PendataDataSuplier extends javax.swing.JFrame {

    /**
     * Creates new form Supplier
     */
    public PendataDataSuplier() {
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

        pdtPnl = new javax.swing.JPanel();
        pendataLbl = new javax.swing.JLabel();
        idLbl = new javax.swing.JLabel();
        jbKeluar = new javax.swing.JButton();
        jbDashboard = new javax.swing.JButton();
        jbObat = new javax.swing.JButton();
        jbSuplier = new javax.swing.JButton();
        fotoLbl = new javax.swing.JLabel();
        judulLbl = new javax.swing.JLabel();
        tfCari = new javax.swing.JTextField();
        tambahLbl = new javax.swing.JLabel();
        jdlTambahLbl = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabSuplier = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        menuLbl = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        pesanLbl = new javax.swing.JLabel();
        notifLbl = new javax.swing.JLabel();
        headPnl = new javax.swing.JPanel();
        cariLbl = new javax.swing.JLabel();
        jbEdit = new javax.swing.JButton();
        jbHapus = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(240, 236, 236));
        setIconImages(null);
        setMinimumSize(new java.awt.Dimension(600, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pdtPnl.setBackground(new java.awt.Color(0, 204, 204));
        pdtPnl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        pdtPnl.setMinimumSize(new java.awt.Dimension(500, 400));
        pdtPnl.setPreferredSize(new java.awt.Dimension(500, 350));
        pdtPnl.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pendataLbl.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        pendataLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pendataLbl.setText("PENDATA");
        pdtPnl.add(pendataLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 180, 220, -1));

        idLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        idLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        idLbl.setText("ID-PDT001");
        pdtPnl.add(idLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1, 220, 230, -1));

        jbKeluar.setBackground(new java.awt.Color(255, 255, 255));
        jbKeluar.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jbKeluar.setText("Keluar");
        jbKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbKeluarActionPerformed(evt);
            }
        });
        pdtPnl.add(jbKeluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 230, 50));

        jbDashboard.setBackground(new java.awt.Color(255, 255, 255));
        jbDashboard.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jbDashboard.setText("Dashboard");
        jbDashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbDashboardActionPerformed(evt);
            }
        });
        pdtPnl.add(jbDashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 230, 50));

        jbObat.setBackground(new java.awt.Color(255, 255, 255));
        jbObat.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jbObat.setText("Data Obat");
        jbObat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbObatActionPerformed(evt);
            }
        });
        pdtPnl.add(jbObat, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 230, 50));

        jbSuplier.setBackground(new java.awt.Color(255, 255, 255));
        jbSuplier.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jbSuplier.setText("Data Suplier");
        jbSuplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSuplierActionPerformed(evt);
            }
        });
        pdtPnl.add(jbSuplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 230, 50));

        fotoLbl.setIcon(new javax.swing.ImageIcon("E:\\files\\Teknik Informatika\\semester 5\\IMPAL\\OO SISFO APOTEK\\Aset\\girll.png")); // NOI18N
        pdtPnl.add(fotoLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, -1, -1));

        getContentPane().add(pdtPnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 230, 780));

        judulLbl.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        judulLbl.setText("Data Suplier");
        getContentPane().add(judulLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, 150, 30));

        tfCari.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfCari.setText("Pencarian...");
        tfCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCariActionPerformed(evt);
            }
        });
        getContentPane().add(tfCari, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 90, 190, 30));

        tambahLbl.setIcon(new javax.swing.ImageIcon("E:\\files\\Teknik Informatika\\semester 5\\IMPAL\\OO SISFO APOTEK\\Aset\\Tambahh.png")); // NOI18N
        getContentPane().add(tambahLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(845, 85, 30, 40));

        jdlTambahLbl.setText("Tambah");
        getContentPane().add(jdlTambahLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 100, -1, -1));

        tabSuplier.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id_Suplier", "Nama Suplier", "Alamat", "No_Telepon"
            }
        ));
        jScrollPane2.setViewportView(tabSuplier);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 620, 290));

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

        cariLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/search (1).png"))); // NOI18N
        getContentPane().add(cariLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 90, 30, 30));

        jbEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/editt.png"))); // NOI18N
        jbEdit.setText("Edit");
        jbEdit.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        getContentPane().add(jbEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 440, 70, 40));

        jbHapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Hapuss.png"))); // NOI18N
        jbHapus.setText("Hapus");
        jbHapus.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        getContentPane().add(jbHapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 440, 90, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbKeluarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbKeluarActionPerformed

    private void jbDashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDashboardActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbDashboardActionPerformed

    private void jbObatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbObatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbObatActionPerformed

    private void jbSuplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSuplierActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbSuplierActionPerformed

    private void tfCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCariActionPerformed
    
    public void setActionListener(ActionListener a){
        jbDashboard.addActionListener(a);
        jbObat.addActionListener(a);
        jbSuplier.addActionListener(a);
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
    
    public JPanel pdtPnl() {
        return pdtPnl;
    }
    
    public JLabel getLblCari() {
        return cariLbl;
    }
    
    public String getSearch() {
        return tfCari.getText();
    }
     
    public JLabel getPendata() {
        return pendataLbl;
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
    
    public JTable getTableSuplier() {
        return tabSuplier;
    }
    
    public JButton getBtnKeluar(){
        return jbKeluar;
    } 
    
    public JButton getBtnObat(){
        return jbObat;
    } 
    
    public JButton getBtnSuplier(){
        return jbSuplier;
    } 
    
    public JButton getBtnDasboard(){
        return jbDashboard;
    } 
    
//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String args[]) {
//        
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new PendataDataSuplier().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cariLbl;
    private javax.swing.JLabel fotoLbl;
    private javax.swing.JPanel headPnl;
    private javax.swing.JLabel idLbl;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbDashboard;
    private javax.swing.JButton jbEdit;
    private javax.swing.JButton jbHapus;
    private javax.swing.JButton jbKeluar;
    private javax.swing.JButton jbObat;
    private javax.swing.JButton jbSuplier;
    private javax.swing.JLabel jdlTambahLbl;
    private javax.swing.JLabel judulLbl;
    private javax.swing.JLabel menuLbl;
    private javax.swing.JLabel notifLbl;
    private javax.swing.JPanel pdtPnl;
    private javax.swing.JLabel pendataLbl;
    private javax.swing.JLabel pesanLbl;
    private javax.swing.JTable tabSuplier;
    private javax.swing.JLabel tambahLbl;
    private javax.swing.JTextField tfCari;
    // End of variables declaration//GEN-END:variables
}

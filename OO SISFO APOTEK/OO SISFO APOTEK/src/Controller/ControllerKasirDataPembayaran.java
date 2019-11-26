/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Database.Database;
import View.KasirDataPembayaran;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PUTRI
 */
public class ControllerKasirDataPembayaran extends MouseAdapter implements ActionListener{
    private KasirDataPembayaran view;
    private Database db;

    public ControllerKasirDataPembayaran( Database db) {
        this.view = new KasirDataPembayaran();
        view.setActionListener(this);
        view.addMouseAdapter(this);
        view.setVisible(true);
        view.setLocationRelativeTo(null);
        this.db = db;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //mengetahui button mana yang di click
        Object click = e.getSource();
        Database db = null;
        try {
            db = new Database();
        } catch (SQLException ex) {
            Logger.getLogger(ControllerKasirDataPembayaran.class.getName()).log(Level.SEVERE, null, ex);
        }
        //eksekusi button
        if (click.equals(view.getBtnKeluar())) {
           view.dispose();
        }else if (click.equals(view.getBtnPemesanan())) {
            view.dispose();
            new ControllerKasirDataPemesanan(db);
        }else if (click.equals(view.getBtnDasboard())){
            view.dispose();
            new ControllerDashboardKasir(db);
        }else if (click.equals(view.getBtnEdit())){
            view.dispose();
        }else if (click.equals(view.getBtnHapus())){
            view.dispose();
        }else{
            try {
                db.viewDataPembayaran(view);
            } catch (SQLException ex) {
                Logger.getLogger(ControllerKasirDataPemesanan.class.getName()).log(Level.SEVERE, null, ex);
            }
//            view.dispose();
//            new ControllerKasirDataPembayaran(db);
        }
    }
    
    @Override
    public void mouseClicked(MouseEvent me){
        Object click = me.getSource();
        
        if(click.equals(view.getLblCari())){
            try {
                db.cariDataPembayaran(view);
            } catch (SQLException ex) {
                Logger.getLogger(ControllerKasirDataPembayaran.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if(click.equals(view.getTambah())){
            view.dispose();
            new ControllerHapusDataPembayaran(db);
        }
            
    }
       
        
}
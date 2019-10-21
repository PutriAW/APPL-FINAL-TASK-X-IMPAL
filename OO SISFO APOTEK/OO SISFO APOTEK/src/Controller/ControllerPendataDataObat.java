/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Database.Database;
import View.PendataDataObat;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PUTRI
 */
public class ControllerPendataDataObat implements ActionListener, KeyListener{
    private PendataDataObat view;
    private Database db;

    public ControllerPendataDataObat( Database db) {
        this.view = new PendataDataObat();
        view.setActionListener(this);
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
            Logger.getLogger(ControllerPendataDataObat.class.getName()).log(Level.SEVERE, null, ex);
        }
        //eksekusi button
        if (click.equals(view.getBtnKeluar())) {
            view.dispose();
        } else {
            //    db.viewDataPemesanan(view);

        }
       
    }

    @Override
    public void keyPressed(KeyEvent k) {
        Database db = null;
        try {
            db = new Database();
        } catch (SQLException ex) {
            Logger.getLogger(ControllerPendataDataObat.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        // eksekusi key 
        if (k.getKeyCode()==KeyEvent.VK_ENTER){
            //     db.cariDataPemesanan(view);

        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyReleased(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

       
}
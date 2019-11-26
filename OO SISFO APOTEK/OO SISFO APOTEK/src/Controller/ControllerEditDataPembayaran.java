/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Database.Database;
import Model.PemesananModel;
import View.EditResepObat;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author PUTRI
 */
public class ControllerEditDataPembayaran implements ActionListener{
    private EditResepObat view;
    private Database db;

    public ControllerEditDataPembayaran( Database db) {
        this.view = new EditResepObat();
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
            Logger.getLogger(ControllerEditDataPembayaran.class.getName()).log(Level.SEVERE, null, ex);
        }
        //eksekusi button
        if (click.equals(view.getBtnSimpan())) {
           // PemesananModel p = new PemesananModel(view.getID(), view.getTotal(), view.getTglPesan());
            
            // db.saveDataPemesanan(p);
            new ControllerEditDataPembayaran(db);
            view.dispose();
        } else if (click.equals(view.getBtnBatal())){
            view.dispose(); 
        }
       
    }
    
}
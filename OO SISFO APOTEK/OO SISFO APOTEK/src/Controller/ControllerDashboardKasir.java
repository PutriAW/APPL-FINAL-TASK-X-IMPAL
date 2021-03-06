/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Database.Database;
import View.DashboardKasir;
import View.KasirDataPemesanan;
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
public class ControllerDashboardKasir extends MouseAdapter implements ActionListener{
    private DashboardKasir view;
    private Database db;

    public ControllerDashboardKasir( Database db) {
        this.view = new DashboardKasir();
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
            Logger.getLogger(ControllerDashboardKasir.class.getName()).log(Level.SEVERE, null, ex);
        }
        //eksekusi button
        if (click.equals(view.getBtnKeluar())) {
            view.dispose();
        }else if (click.equals(view.getBtnPembayaran())) {
            view.dispose();
            new ControllerKasirDataPembayaran(db);
        }else if (click.equals(view.getBtnPemesanan())) {
            view.dispose();
            new ControllerKasirDataPemesanan(db);
        }
       
       
    }
       
}
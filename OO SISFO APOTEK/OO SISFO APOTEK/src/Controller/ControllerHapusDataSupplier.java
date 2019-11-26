/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Database.Database;
import Model.PembayaranModel;
import Model.PemesananModel;
import View.InputDataPembayaran;
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
public class ControllerHapusDataSupplier implements ActionListener{
    private InputDataPembayaran view;
    private Database db;

    public ControllerHapusDataSupplier( Database db) {
        this.view = new InputDataPembayaran();
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
            Logger.getLogger(ControllerHapusDataSupplier.class.getName()).log(Level.SEVERE, null, ex);
        }
        //eksekusi button 
        try{
            if (click.equals(view.getBtnSimpan())){
                PembayaranModel p = new PembayaranModel(view.getIDPmb(),view.getIDPms(),view.getIDKsr(), view.getTglPembayaran(), view.getTotal());
                db.saveDataPembayaran(p);
                view.dispose(); 
                new ControllerKasirDataPembayaran(db);
            }else if (click.equals(view.getBtnBatal())){
                view.dispose(); 
                new ControllerKasirDataPembayaran(db);
            }
        }catch(SQLException ae){
            JOptionPane.showMessageDialog(view, "Error input","", JOptionPane.ERROR_MESSAGE); 
        }
       
    }
    
}
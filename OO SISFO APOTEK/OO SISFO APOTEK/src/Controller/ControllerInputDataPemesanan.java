/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Database.Database;
import Model.PemesananModel;
import View.InputDataPemesanan;
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
public class ControllerInputDataPemesanan implements ActionListener{
    private InputDataPemesanan view;
    private Database db;

    public ControllerInputDataPemesanan( Database db) {
        this.view = new InputDataPemesanan();
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
            Logger.getLogger(ControllerInputDataPemesanan.class.getName()).log(Level.SEVERE, null, ex);
        }
        //eksekusi button 
        try{
            if (click.equals(view.getBtnSimpan())){
                PemesananModel p = new PemesananModel(view.getID(), view.getTotal(), view.getTglPesan());
                
                db.saveDataPemesanan(p);
                view.dispose(); 
                new ControllerKasirDataPemesanan(db);
                
            }else if (click.equals(view.getBtnBatal())){
                view.dispose();  
                new ControllerKasirDataPemesanan(db);
            }
        }catch(SQLException ae){
            JOptionPane.showMessageDialog(view, "Error input","", JOptionPane.ERROR_MESSAGE); 
        }
       
    }
    
}
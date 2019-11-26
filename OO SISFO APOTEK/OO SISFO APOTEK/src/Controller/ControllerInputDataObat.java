/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Database.Database;
import Model.ObatModel;
import Model.SuplierModel;
import View.InputDataObat;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author PUTRI
 */
public class ControllerInputDataObat implements ActionListener{
    private InputDataObat view;
    private Database db;

    public ControllerInputDataObat( Database db) {
        this.view = new InputDataObat();
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
            Logger.getLogger(ControllerInputDataObat.class.getName()).log(Level.SEVERE, null, ex);
        }
        //eksekusi button 
        try{
            if (click.equals(view.getBtnSimpan())){
                ObatModel o = new ObatModel(view.getIdObat(), view.getNama(), view.getJenis(), view.getDosis(),
                view.getExpired(), view.getKomposisi(), view.getIndikasi(), view.getAturanPakai(), view.getIdSup());
                db.saveDataObat(o);
                view.dispose(); 
                new ControllerPendataDataObat(db);
            }else if (click.equals(view.getBtnBatal())){
                view.dispose(); 
                new ControllerPendataDataObat(db);
            }
        }catch(SQLException ae){
            JOptionPane.showMessageDialog(view, "Error input","", JOptionPane.ERROR_MESSAGE); 
        }
       
    }
    
}
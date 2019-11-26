/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Database.Database;
import Model.SuplierModel;
import View.InputDataSuplier;
import View.InputResepObat;
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
public class ControllerInputDataSupplier implements ActionListener{
    private InputDataSuplier view;
    private Database db;

    public ControllerInputDataSupplier( Database db) {
        this.view = new InputDataSuplier();
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
            Logger.getLogger(ControllerInputDataSupplier.class.getName()).log(Level.SEVERE, null, ex);
        }
        //eksekusi button 
        try{
            if (click.equals(view.getBtnSimpan())){
                SuplierModel p = new SuplierModel(view.getID(), view.getNama(), view.getAlamat(), view.getTelepon());
                db.saveDataSupplier(p);
                view.dispose(); 
                new ControllerPendataDataSuplier(db);
            }else if (click.equals(view.getBtnBatal())){
                view.dispose(); 
                new ControllerPendataDataSuplier(db);
            }
        }catch(SQLException ae){
            JOptionPane.showMessageDialog(view, "Error input","", JOptionPane.ERROR_MESSAGE); 
        }
    }
    
}
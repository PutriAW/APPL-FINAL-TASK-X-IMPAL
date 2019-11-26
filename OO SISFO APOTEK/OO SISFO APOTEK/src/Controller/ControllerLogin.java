/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Database.Database;
import Model.LoginModel;
import View.Login;
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
public class ControllerLogin implements ActionListener{
    private Login view;
    private Database db;

    public ControllerLogin( Database db) {
        this.view = new Login();
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
            Logger.getLogger(ControllerLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
        //eksekusi button
        if (click.equals(view.getBtnLogin())) {
           LoginModel l = new LoginModel(view.getUsername(), view.getPassword());
//            System.out.println(view.getUser());
            try {
                if (db.loginUser(l, view)){
                    if(view.getUser().equals("Kasir")){
                        view.dispose();
                        new ControllerDashboardKasir(db);
                    }else if(view.getUser().equals("Pendata")){
                        view.dispose();
                        new ControllerPendataDataObat(db);
                    }else if(view.getUser().equals("Apoteker")){
                        view.dispose();
                        new ControllerApotekerResepObat(db);
                    }else if(view.getUser().equals("Manager")){
                        view.dispose();   
                        new ControllerManagerDataKaryawan(db);
                    }
                }else{
                    JOptionPane.showMessageDialog(view, "Wrong username or Password!");
                }
            } catch (SQLException ex) {
                Logger.getLogger(ControllerLogin.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
       
    }
    
}
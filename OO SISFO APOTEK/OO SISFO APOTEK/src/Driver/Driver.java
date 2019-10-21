/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Driver;

import Controller.*;
import Database.Database;

/**
 *
 * @author PUTRI
 */
public class Driver {
    public static void main(String[] args) {
        Database apotek = null;
//        ControllerPemesanan cp = new ControllerPemesanan(apotek);
        ControllerLogin lg= new  ControllerLogin(apotek);
    }
}

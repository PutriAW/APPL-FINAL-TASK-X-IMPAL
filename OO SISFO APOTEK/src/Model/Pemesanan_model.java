/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;


/**
 *
 * @author PUTRI
 */
public class Pemesanan_model {
    private String id_pemesanan;
    private int total;
    private Date tgl;

    public Pemesanan_model(String id_pemesanan, int total, Date tgl) {
        this.id_pemesanan = id_pemesanan;
        this.total = total;
        this.tgl = tgl;
    }
    
    
    public void setId_pemesanan(String id_pemesanan) {
        this.id_pemesanan = id_pemesanan;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public void setTgl(Date tgl) {
        this.tgl = tgl;
    }

    public String getId_pemesanan() {
        return id_pemesanan;
    }

    public int getTotal() {
        return total;
    }

    public Date getTgl() {
        return tgl;
    }
    
    
    
    
    
    
}

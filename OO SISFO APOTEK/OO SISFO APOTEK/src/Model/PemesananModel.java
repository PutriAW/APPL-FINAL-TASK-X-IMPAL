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
public class PemesananModel {
    private String idPemesanan;
    private int total;
    private String tglPmsn;

    public PemesananModel(String idPemesanan, int total, String tglPmsn) {
        this.idPemesanan = idPemesanan;
        this.total = total;
        this.tglPmsn = tglPmsn;
    }


    public void setIdPemesanan(String idPemesanan) {
        this.idPemesanan = idPemesanan;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public void setTglPmsn(String tglPmsn) {
        this.tglPmsn = tglPmsn;
    }


    public String getIdPemesanan() {
        return idPemesanan;
    }

    public int getTotal() {
        return total;
    }

    public String getTglPmsn() {
        return tglPmsn;
    }
  
    
}

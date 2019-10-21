/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author PUTRI
 */
public class PembayaranModel {
    private String idPembayaran;
    private int total;
    private String tglPmbyr;
    
    public PembayaranModel(String idPembayaran, int total, String tglPmbyr) {
        this.idPembayaran = idPembayaran;
        this.total = total;
        this.tglPmbyr = tglPmbyr;
    }


    public void setIdPembayaran(String idPembayaran) {
        this.idPembayaran = idPembayaran;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public void setTglPmbyr(String tglPmbyr) {
        this.tglPmbyr = tglPmbyr;
    }


    public String getIdPembayaran() {
        return idPembayaran;
    }

    public int getTotal() {
        return total;
    }

    public String getTglPmbyr() {
        return tglPmbyr;
    }
    
}

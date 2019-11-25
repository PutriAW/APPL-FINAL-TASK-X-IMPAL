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
    private String idPemesanan;
    private String idKasir;
    private String tglPmbyr;
    private int total;

    public PembayaranModel(String idPembayaran, String idPemesanan, String idKasir, String tglPmbyr, int total) {
        this.idPembayaran = idPembayaran;
        this.idPemesanan = idPemesanan;
        this.idKasir = idKasir;
        this.tglPmbyr = tglPmbyr;
        this.total = total;
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

    public void setIdPemesanan(String idPemesanan) {
        this.idPemesanan = idPemesanan;
    }

    public void setIdKasir(String idKasir) {
        this.idKasir = idKasir;
    }

    
    
    public String getIdPembayaran() {
        return idPembayaran;
    }

    public String getIdPemesanan() {
        return idPemesanan;
    }

    public String getIdKasir() {
        return idKasir;
    }
    
    public int getTotal() {
        return total;
    }

    public String getTglPmbyr() {
        return tglPmbyr;
    }
    
}

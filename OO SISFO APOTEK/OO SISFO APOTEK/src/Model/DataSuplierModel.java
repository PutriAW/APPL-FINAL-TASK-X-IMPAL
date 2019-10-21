/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author MY PC
 */
public class DataSuplierModel {
    private String id_suplier;
    private String nama_suplier;
    private String alamat;
    private String no_telpon;

    public DataSuplierModel(String id_suplier, String nama_suplier, String alamat, String no_telpon) {
        this.id_suplier = id_suplier;
        this.nama_suplier = nama_suplier;
        this.alamat = alamat;
        this.no_telpon = no_telpon;
    }

    public String getId_suplier() {
        return id_suplier;
    }

    public String getNama_suplier() {
        return nama_suplier;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getNo_telpon() {
        return no_telpon;
    }

    public void setId_suplier(String id_suplier) {
        this.id_suplier = id_suplier;
    }

    public void setNama_suplier(String nama_suplier) {
        this.nama_suplier = nama_suplier;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setNo_telpon(String no_telpon) {
        this.no_telpon = no_telpon;
    }
    
    
}

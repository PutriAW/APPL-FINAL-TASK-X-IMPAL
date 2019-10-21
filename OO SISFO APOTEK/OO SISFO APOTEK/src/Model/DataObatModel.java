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
public class DataObatModel {
    private String id_obat;
    private String nama;
    private String jenis;
    private String dosis;
    private String exp;
    private String komposisi;
    private String indikasi;
    private String aturan_pakai;
    private String id_suplier;

    public DataObatModel(String id_obat, String nama, String jenis, String dosis, String exp, String komposisi, String indikasi, String aturan_pakai, String id_suplier) {
        this.id_obat = id_obat;
        this.nama = nama;
        this.jenis = jenis;
        this.dosis = dosis;
        this.exp = exp;
        this.komposisi = komposisi;
        this.indikasi = indikasi;
        this.aturan_pakai = aturan_pakai;
        this.id_suplier = id_suplier;
    }

    public String getId_obat() {
        return id_obat;
    }

    public String getNama() {
        return nama;
    }

    public String getJenis() {
        return jenis;
    }

    public String getDosis() {
        return dosis;
    }

    public String getExp() {
        return exp;
    }

    public String getKomposisi() {
        return komposisi;
    }

    public String getIndikasi() {
        return indikasi;
    }

    public String getAturan_pakai() {
        return aturan_pakai;
    }

    public String getId_suplier() {
        return id_suplier;
    }

    public void setId_obat(String id_obat) {
        this.id_obat = id_obat;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public void setDosis(String dosis) {
        this.dosis = dosis;
    }

    public void setExp(String exp) {
        this.exp = exp;
    }

    public void setKomposisi(String komposisi) {
        this.komposisi = komposisi;
    }

    public void setIndikasi(String indikasi) {
        this.indikasi = indikasi;
    }

    public void setAturan_pakai(String aturan_pakai) {
        this.aturan_pakai = aturan_pakai;
    }

    public void setId_suplier(String id_suplier) {
        this.id_suplier = id_suplier;
    }
    
    
}

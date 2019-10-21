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
public class ObatModel {
    private String id_resep;
    private String id_apoteker;
    private String tglrsp;
    private String deskripsi;
    
    public ObatModel(String id_resep, String id_apoteker, String tglrsp, String deskripsi) {
        this.id_resep = id_resep;
        this.id_apoteker = id_apoteker;
        this.tglrsp = tglrsp;
        this.deskripsi = deskripsi;
    }
    
        public void setId_resep(String id_resep) {
        this.id_resep = id_resep;
    }

    public String getId_resep() {
        return id_resep;
    }

    public void setId_apoteker(String id_apoteker) {
        this.id_apoteker = id_apoteker;
    }

    public String getId_apoteker() {
        return id_apoteker;
    }

    public void setTglrsp(String tglrsp) {
        this.tglrsp = tglrsp;
    }
        
    public String getTglrsp() {
        return tglrsp;
    }
    
    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }
        
    public String getDeskripsi() {
        return deskripsi;
    }
}

    
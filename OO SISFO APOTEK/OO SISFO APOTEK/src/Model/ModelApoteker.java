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
public class ModelApoteker extends Karyawan{
    private String id_apoteker;

    public ModelApoteker(String id_apoteker, String nama, String jenis_kelamin, String tempat_lahir, String tanggal_lahir, String alamat, String no_hp) {
        super(nama, jenis_kelamin, tempat_lahir, tanggal_lahir, alamat, no_hp);
        this.id_apoteker = id_apoteker;
    }

    public String getId_apoteker() {
        return id_apoteker;
    }

    public void setId_apoteker(String id_apoteker) {
        this.id_apoteker = id_apoteker;
    }
    
    
}

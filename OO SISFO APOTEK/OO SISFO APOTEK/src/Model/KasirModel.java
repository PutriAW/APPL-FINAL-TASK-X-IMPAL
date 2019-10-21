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
public class KasirModel extends Karyawan{
    private String id_kasir;

    public KasirModel(String id_kasir, String nama, String jenis_kelamin, String tempat_lahir, String tanggal_lahir, String alamat, String no_hp) {
        super(nama, jenis_kelamin, tempat_lahir, tanggal_lahir, alamat, no_hp);
        this.id_kasir = id_kasir;
    }

    public String getId_kasir() {
        return id_kasir;
    }

    public void setId_kasir(String id_kasir) {
        this.id_kasir = id_kasir;
    }
    
    
}

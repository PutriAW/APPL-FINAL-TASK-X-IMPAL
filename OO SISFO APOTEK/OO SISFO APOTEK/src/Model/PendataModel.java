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
public class PendataModel extends Karyawan{
    private String id_pendata;

    public PendataModel(String id_pendata, String nama, String jenis_kelamin, String tempat_lahir, String tanggal_lahir, String alamat, String no_hp) {
        super(nama, jenis_kelamin, tempat_lahir, tanggal_lahir, alamat, no_hp);
        this.id_pendata = id_pendata;
    }
    
    public String getId_pendata() {
        return id_pendata;
    }

    public void setId_pendata(String id_pendata) {
        this.id_pendata = id_pendata;
    }
    
}

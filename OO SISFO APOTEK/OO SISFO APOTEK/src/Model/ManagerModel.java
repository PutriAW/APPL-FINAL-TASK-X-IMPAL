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
public class ManagerModel extends Karyawan{
    
    private String id_manager;

    public ManagerModel(String id_manager, String nama, String jenis_kelamin, String tempat_lahir, String tanggal_lahir, String alamat, String no_hp) {
        super(nama, jenis_kelamin, tempat_lahir, tanggal_lahir, alamat, no_hp);
        this.id_manager = id_manager;
    }

    public String getId_manager() {
        return id_manager;
    }

    public void setId_manager(String id_manager) {
        this.id_manager = id_manager;
    }
    
}

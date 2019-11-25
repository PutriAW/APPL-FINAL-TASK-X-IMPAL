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
public class RegisterModel extends Karyawan{
    private String id_karyawan;
    private String username;
    private String password;

    public RegisterModel(String id_karyawan, String username, String password, String nama, String jenis_kelamin, String tempat_lahir, String tanggal_lahir, String alamat, String no_hp) {
        super(nama, jenis_kelamin, tempat_lahir, tanggal_lahir, alamat, no_hp);
        this.id_karyawan = id_karyawan;
        this.username = username;
        this.password = password;
    }

    public String getId_karyawan() {
        return id_karyawan;
    }

    public void setId_karyawan(String id_karyawan) {
        this.id_karyawan = id_karyawan;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    

   
    
    
}
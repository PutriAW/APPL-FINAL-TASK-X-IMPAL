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
public class RegisterModel {
    private String id_karyawan;
    private String nama;
    private String jenis_kelamin;
    private String date;
    private String alamat;
    private String telpon;
    private String username;
    private String password;

    public RegisterModel(String id_karyawan, String nama, String jenis_kelamin, String date, String alamat, String telpon, String username, String password) {
        this.id_karyawan = id_karyawan;
        this.nama = nama;
        this.jenis_kelamin = jenis_kelamin;
        this.date = date;
        this.alamat = alamat;
        this.telpon = telpon;
        this.username = username;
        this.password = password;
    }

    public String getId_karyawan() {
        return id_karyawan;
    }

    public String getNama() {
        return nama;
    }

    public String getJenis_kelamin() {
        return jenis_kelamin;
    }

    public String getDate() {
        return date;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getTelpon() {
        return telpon;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setId_karyawan(String id_karyawan) {
        this.id_karyawan = id_karyawan;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setJenis_kelamin(String jenis_kelamin) {
        this.jenis_kelamin = jenis_kelamin;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setTelpon(String telpon) {
        this.telpon = telpon;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
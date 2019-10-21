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
public abstract class Karyawan {
    private String nama;
    private String jenis_kelamin;
    private String tempat_lahir;
    private String tanggal_lahir;
    private String alamat;
    private String no_hp;

    public Karyawan(String nama, String jenis_kelamin, String tempat_lahir, String tanggal_lahir, String alamat, String no_hp) {
        this.nama = nama;
        this.jenis_kelamin = jenis_kelamin;
        this.tempat_lahir = tempat_lahir;
        this.tanggal_lahir = tanggal_lahir;
        this.alamat = alamat;
        this.no_hp = no_hp;
    }

    public String getNama() {
        return nama;
    }

    public String getJenis_kelamin() {
        return jenis_kelamin;
    }

    public String getTempat_lahir() {
        return tempat_lahir;
    }

    public String getTanggal_lahir() {
        return tanggal_lahir;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getNo_hp() {
        return no_hp;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setJenis_kelamin(String jenis_kelamin) {
        this.jenis_kelamin = jenis_kelamin;
    }

    public void setTempat_lahir(String tempat_lahir) {
        this.tempat_lahir = tempat_lahir;
    }

    public void setTanggal_lahir(String tanggal_lahir) {
        this.tanggal_lahir = tanggal_lahir;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setNo_hp(String no_hp) {
        this.no_hp = no_hp;
    }

    
}

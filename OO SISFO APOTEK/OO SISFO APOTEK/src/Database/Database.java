/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;
import Model.*;
import View.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author PUTRI
 */
public class Database {
    private String dbuser = "root";
    private String dbpasswd = "";
    private Statement stmt = null;
    private Connection con = null;
    public ResultSet rs = null;

    public Database() throws SQLException {
        try {
            Class.forName("org.gjt.mm.mysql.Driver");
        }catch(ClassNotFoundException e){
            JOptionPane.showMessageDialog(null,""+ e.getMessage(),"JDBC Driver Error",JOptionPane.WARNING_MESSAGE);
        }
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/apotek",dbuser,dbpasswd);
            stmt = con.createStatement();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,""+ e.getMessage(),"JDBC Driver Error",JOptionPane.WARNING_MESSAGE);
        }
    }
    
    public ResultSet getData(String SQLString){
        try{
            rs = stmt.executeQuery(SQLString);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,""+ e.getMessage(),"Communication Error",JOptionPane.WARNING_MESSAGE);
        }
        return rs;
    }
    
    public void query(String SQLString){
        try{
            stmt.executeUpdate(SQLString);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,""+ e.getMessage(),"Communication Error",JOptionPane.WARNING_MESSAGE);
        }
    }  
    
    //======================= LOGIN ==============================    
    public boolean loginUser(LoginModel lg, Login log) throws SQLException{
        boolean cek = false;
        Database db = new Database();
        String s ;
        ResultSet rs = null;
        if(lg.getUsername() != null && lg.getPassword() != null ){
//            System.out.println(log.getUser());
            if(log.getUser() == "Kasir"){           
                s = "Select * from kasir where username='"+lg.getUsername()+"' and password='"+lg.getPassword()+"'";
                rs = db.getData(s);
//                System.out.println(log.getUser());
            }else if(log.getUser().equals("Pendata")){
                s = "Select * from pendata where username='"+lg.getUsername()+"' and password='"+lg.getPassword()+"'";
                rs = db.getData(s);
//                System.out.println(rs.getRow());
            }else if(log.getUser().equals("Apoteker")){
                s = "Select * from apoteker where username='"+lg.getUsername()+"' and password='"+lg.getPassword()+"'";
                rs = db.getData(s);
//                System.out.println(rs.getRow());
            }else if(log.getUser().equals("Manager")){
                s = "Select * from manager where username='"+lg.getUsername()+"' and password='"+lg.getPassword()+"'";
                rs = db.getData(s);
//                System.out.println(rs.getRow());
            }
            
             if (rs.last()){
                    javax.swing.JOptionPane.showMessageDialog(null, "Selamat Anda Berhasil Login");
                    cek = true;
            }    
        }
        return cek;
    }

    
    //======================= INSERT==============================    
    public void saveDataPemesanan(PemesananModel p) throws SQLException{
        Database db = new Database();
        if (p.getIdPemesanan() != null && p.getIdPemesanan().length() == 7){
            String s = "Insert into pemesanan values('"+p.getIdPemesanan()+"','"+p.getTglPmsn()+"','"+p.getTotal()
                    +"')";
            db.query(s);
            javax.swing.JOptionPane.showMessageDialog(null, "Selamat Insert Berhasil");
        }else{
            javax.swing.JOptionPane.showMessageDialog(null, "Panjang Id Pemesanan Tidak Sesuai");
        }       
    }
    
    public void saveDataPembayaran(PembayaranModel p) throws SQLException{
        Database db = new Database();
        if (p.getIdPembayaran() != null && p.getIdPembayaran().length() == 7){
            String s = "Insert into pembayaran values('"+p.getIdPembayaran()+"','"+p.getIdPemesanan()+"',"
                    + "'"+p.getIdKasir()+"','"+p.getTglPmbyr()+"','"+p.getTotal()+"')";
            db.query(s);
            javax.swing.JOptionPane.showMessageDialog(null, "Selamat Insert Berhasil");
        }else{
            javax.swing.JOptionPane.showMessageDialog(null, "Panjang Id Pembayaran Tidak Sesuai");
        }       
    }
    
    public void saveDataObat(ObatModel o) throws SQLException{
        Database db = new Database();
        if (o.getId_obat()!= null && o.getId_obat().length() == 7){
            String s = "Insert into obat values('"+o.getId_obat()+"','"+o.getNama()+"',"
                    + "'"+o.getJenis()+"','"+o.getDosis()+"','"+o.getExp()+"','"+o.getKomposisi()+"'"
                    + "'"+o.getIndikasi()+"','"+o.getAturan_pakai()+"','"+o.getId_suplier()+"')";
            db.query(s);
            javax.swing.JOptionPane.showMessageDialog(null, "Selamat Insert Berhasil");
        }else{
            javax.swing.JOptionPane.showMessageDialog(null, "Panjang Id Obat Tidak Sesuai");
        }       
    }
    
    public void saveDataSupplier(SuplierModel sp) throws SQLException{
        Database db = new Database();
        if (sp.getId_suplier() != null && sp.getId_suplier().length() == 7){
            String s = "Insert into supplier values('"+sp.getId_suplier()+"','"+sp.getNama_suplier()+"',"
                    + "'"+sp.getAlamat()+"','"+sp.getNo_telpon()+"')";
            db.query(s);
            javax.swing.JOptionPane.showMessageDialog(null, "Selamat Insert Berhasil");
        }else{
            javax.swing.JOptionPane.showMessageDialog(null, "Panjang Id Supplier Tidak Sesuai");
        }       
    }
    
    
    
    //================== VIEW DATA===============================
    public void viewDataPemesanan(KasirDataPemesanan k) throws SQLException{
        Database db = new Database();
        int i = 0;
        ResultSet rs = null;
        try{
            rs = db.getData("Select * from pemesanan");
            while (rs.next()){
                k.getTablePemesanan().setValueAt(rs.getString("id_pemesanan"), i, 0);
                k.getTablePemesanan().setValueAt(rs.getString("tgl_pemesanan"), i, 1);
                k.getTablePemesanan().setValueAt(rs.getString("total_pemesanan"), i, 2);
                i++;
            }
            rs.close();
        }catch(Exception e){
            javax.swing.JOptionPane.showMessageDialog(null, "Error:"+e.getMessage());
        }
    }
    
    public void viewDataPembayaran(KasirDataPembayaran k) throws SQLException{
        Database db = new Database();
        int i = 0;
        ResultSet rs = null;
        try{
            rs = db.getData("Select * from pembayaran");
            while (rs.next()){
                k.getTablePembayaran().setValueAt(rs.getString("id_pembayaran"), i, 0);
                k.getTablePembayaran().setValueAt(rs.getString("id_pemesanan"), i, 1);
                k.getTablePembayaran().setValueAt(rs.getString("id_kasir"), i, 2);
                k.getTablePembayaran().setValueAt(rs.getString("tgl_pembayaran"), i, 3);
                k.getTablePembayaran().setValueAt(rs.getString("total"), i, 4);
                i++;
            }
            rs.close();
        }catch(Exception e){
            javax.swing.JOptionPane.showMessageDialog(null, "Error:"+e.getMessage());
        }
    }
    
    public void viewDataObat(PendataDataObat o) throws SQLException{
        Database db = new Database();
        int i = 0;
        ResultSet rs = null;
        try{
            rs = db.getData("Select * from obat");
            while (rs.next()){
                o.getTableObat().setValueAt(rs.getString("id_obat"), i, 0);
                o.getTableObat().setValueAt(rs.getString("nama_obat"), i, 1);
                o.getTableObat().setValueAt(rs.getString("jenis"), i, 2);
                o.getTableObat().setValueAt(rs.getString("dosis"), i, 3);
                o.getTableObat().setValueAt(rs.getString("expire_date"), i, 4);
                o.getTableObat().setValueAt(rs.getString("komposisi"), i, 5);
                o.getTableObat().setValueAt(rs.getString("indikasi"), i, 6);
                o.getTableObat().setValueAt(rs.getString("aturan_pakai"), i, 7);
                o.getTableObat().setValueAt(rs.getString("id_supplier"), i, 8);
                i++;
            }
            rs.close();
        }catch(Exception e){
            javax.swing.JOptionPane.showMessageDialog(null, "Error:"+e.getMessage());
        }
    }
    
    public void viewDataSupplier(PendataDataSuplier s) throws SQLException{
        Database db = new Database();
        int i = 0;
        ResultSet rs = null;
        try{
            rs = db.getData("Select * from supplier");
            while (rs.next()){
                s.getTableSuplier().setValueAt(rs.getString("id_supplier"), i, 0);
                s.getTableSuplier().setValueAt(rs.getString("nama_supplier"), i, 1);
                s.getTableSuplier().setValueAt(rs.getString("alamat"), i, 2);
                s.getTableSuplier().setValueAt(rs.getString("no_telp"), i, 3);
                i++;
            }
            rs.close();
        }catch(Exception e){
            javax.swing.JOptionPane.showMessageDialog(null, "Error:"+e.getMessage());
        }
    }
    

    
    //================== CARI DATA===============================
    public void cariDataPemesanan(KasirDataPemesanan k) throws SQLException{
        Database db = new Database();
        int i = 0;
        int j = 0;
        ResultSet rs = null;
        while(j < 20){
            k.getTablePemesanan().setValueAt("", j, 0);
            k.getTablePemesanan().setValueAt("", j, 1);
            k.getTablePemesanan().setValueAt("", j, 2);
            j++;  
        }
        try{
            rs = db.getData("Select * from pemesanan where id_pemesanan='"+k.getSearch()+"'");
            while (rs.next()){
                k.getTablePemesanan().setValueAt(rs.getString("id_pemesanan"), i, 0);
                k.getTablePemesanan().setValueAt(rs.getString("tgl_pemesanan"), i, 1);
                k.getTablePemesanan().setValueAt(rs.getString("total_pemesanan"), i, 2);
                i++;
            }
            rs.close();
        }catch(Exception e){
            javax.swing.JOptionPane.showMessageDialog(null, "Error:"+e.getMessage());
        }
    }
    
    public void cariDataPembayaran(KasirDataPembayaran k) throws SQLException{
        Database db = new Database();
        int i = 0;
        int j = 0;
        ResultSet rs = null;
        while(j < 20){
            k.getTablePembayaran().setValueAt("", j, 0);
            k.getTablePembayaran().setValueAt("", j, 1);
            k.getTablePembayaran().setValueAt("", j, 2);
            k.getTablePembayaran().setValueAt("", j, 3);
            k.getTablePembayaran().setValueAt("", j, 4);
            j++;
        }
        try{
            rs = db.getData("Select * from pembayaran where id_pembayaran='"+k.getSearch()+"'");
            while (rs.next()){
                k.getTablePembayaran().setValueAt(rs.getString("id_pembayaran"), i, 0);
                k.getTablePembayaran().setValueAt(rs.getString("id_pemesanan"), i, 1);
                k.getTablePembayaran().setValueAt(rs.getString("id_kasir"), i, 2);
                k.getTablePembayaran().setValueAt(rs.getString("tgl_pembayaran"), i, 3);
                k.getTablePembayaran().setValueAt(rs.getString("total"), i, 4);
                i++;
            }
            rs.close();
        }catch(Exception e){
            javax.swing.JOptionPane.showMessageDialog(null, "Error:"+e.getMessage());
        }
    }
    
    public void cariDataObat(PendataDataObat o) throws SQLException{
        Database db = new Database();
        int i = 0;
        int j = 0;
        ResultSet rs = null;
        while(j < 20){
            o.getTableObat().setValueAt("", j, 0);
            o.getTableObat().setValueAt("", j, 1);
            o.getTableObat().setValueAt("", j, 2);
            o.getTableObat().setValueAt("", j, 3);
            o.getTableObat().setValueAt("", j, 4);
            o.getTableObat().setValueAt("", j, 5);
            o.getTableObat().setValueAt("", j, 6);
            o.getTableObat().setValueAt("", j, 7);
            o.getTableObat().setValueAt("", j, 8);
            
            j++;
        }
        try{
            rs = db.getData("Select * from obat where nama_obat like '"+o.getSearch()+"'");
            while (rs.next()){
                o.getTableObat().setValueAt(rs.getString("id_obat"), i, 0);
                o.getTableObat().setValueAt(rs.getString("nama_obat"), i, 1);
                o.getTableObat().setValueAt(rs.getString("jenis"), i, 2);
                o.getTableObat().setValueAt(rs.getString("dosis"), i, 3);
                o.getTableObat().setValueAt(rs.getString("expire_date"), i, 4);
                o.getTableObat().setValueAt(rs.getString("komposisi"), i, 5);
                o.getTableObat().setValueAt(rs.getString("indikasi"), i, 6);
                o.getTableObat().setValueAt(rs.getString("aturan_pakai"), i, 7);
                o.getTableObat().setValueAt(rs.getString("id_supplier"), i, 8);
                i++;
            }
            rs.close();
        }catch(Exception e){
            javax.swing.JOptionPane.showMessageDialog(null, "Error:"+e.getMessage());
        }
    }
    
    public void cariDataSupplier(PendataDataSuplier s) throws SQLException{
        Database db = new Database();
        int i = 0;
        int j = 0;
        ResultSet rs = null;
        while(j < 20){
            s.getTableSuplier().setValueAt("", j, 0);
            s.getTableSuplier().setValueAt("", j, 1);
            s.getTableSuplier().setValueAt("", j, 2);
            s.getTableSuplier().setValueAt("", j, 3);
            s.getTableSuplier().setValueAt("", j, 4); 
            j++;
        }
        try{
            rs = db.getData("Select * from supplier where nama_supplier like '"+s.getSearch()+"'");
            while (rs.next()){
                s.getTableSuplier().setValueAt(rs.getString("id_supplier"), i, 0);
                s.getTableSuplier().setValueAt(rs.getString("nama_supplier"), i, 1);
                s.getTableSuplier().setValueAt(rs.getString("alamat"), i, 2);
                s.getTableSuplier().setValueAt(rs.getString("no_telp"), i, 3);
                i++;
            }
            rs.close();
        }catch(Exception e){
            javax.swing.JOptionPane.showMessageDialog(null, "Error:"+e.getMessage());
        }
    }
    
    
}

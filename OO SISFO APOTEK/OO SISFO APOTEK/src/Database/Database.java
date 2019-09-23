/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;
import Model.PemesananModel;
import View.Pemesanan;
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
    
    //======================= INSERT==============================    
    public void saveDataPemesanan(PemesananModel p) throws SQLException{
        Database db = new Database();
        if (p.getIdPemesanan() != null){
            String s = "Insert into pemesanan values('"+p.getIdPemesanan()+"','"+p.getTglPmsn()+"','"+p.getTotal()
                    +"')";
            db.query(s);
            javax.swing.JOptionPane.showMessageDialog(null, "Selamat Insert Berhasil");
        }else{
            JOptionPane.showMessageDialog(null, "Id tidak boleh null");
        }       
    }
    
}

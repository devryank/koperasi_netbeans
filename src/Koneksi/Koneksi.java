/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Koneksi;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Lenovo
 */
public class Koneksi {
    
    private Connection koneksi;
    public Connection getConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
//            System.out.println("Berhasil connect");
        }
        catch(ClassNotFoundException ex) {
            System.out.println("gagal koneksi" + ex);
        }
        String url = "jdbc:mysql://localhost/netbeans_koperasi";
        try {
            koneksi = DriverManager.getConnection(url, "root", "");
//            System.out.println("Berhasil koneksi ke database");
        }
        catch(SQLException ex) {
            System.out.println("gagal koneksi ke database"+ ex);
        }
        return koneksi;
    }
}

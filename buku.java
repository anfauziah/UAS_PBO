package uas_pbo;


import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;




public class buku {
    
    
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/dataBuku\";
    static final String USER = "root";
    static final String PASS = "";

    
    static Connection conn;
    static Statement stmt;
    static ResultSet rs;

    public static void main(String[] args) {
        
        
        try {
            
            Class.forName(JDBC_DRIVER);
            
            
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            
            
            stmt = conn.createStatement();
            
            
            String sql = "SELECT * FROM dataBuku";
            
            // eksekusi query dan simpan hasilnya di obj ResultSet
            rs = stmt.executeQuery(sql);
            
            // tampilkan hasil query
            while(rs.next()){
                System.out.println("ID Buku: " + rs.getInt("id_buku"));
                System.out.println("Judul: " + rs.getString("judul"));
                System.out.println("Penulis: " + rs.getString("penulis"));
            }
            
            stmt.close();
            conn.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    
}

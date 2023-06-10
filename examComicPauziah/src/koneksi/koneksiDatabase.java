/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package koneksi;

/**
 *
 * @author 5470
 */
import java.sql.*;
import javax.swing.JOptionPane;
public class koneksiDatabase {
    
    Connection cn;

    public static Connection BukaKoneksi() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/comiczonedb", "root", "");
            return cn;
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
    
}

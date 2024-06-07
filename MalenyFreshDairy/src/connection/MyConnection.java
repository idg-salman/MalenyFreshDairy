/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connection;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author ROG STRIX
 */
public class MyConnection {
    public static final String username =""; //Set mySQL username here
    public static final String password =""; //Set mySQL password here
    public static final String url ="jdbc:mysql://localhost:3306/MalenyFreshDairy"; //Set mySQL password here
    public static Connection con= null;
    
    
    public static Connection getConnection() throws SQLException{
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, username, password);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ""+ex,"", JOptionPane.WARNING_MESSAGE);
        }
        return con;
    }
}

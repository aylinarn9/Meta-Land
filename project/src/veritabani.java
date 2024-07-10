
import com.sun.jdi.connect.spi.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.DriverManager;
import java.sql.SQLException;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aylin
 */
public class veritabani {
   /* public static void main(String[] args) throws SQLException {
        Connection con=null;
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                con= (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/sys","root","684217");
                 System.out.print(con);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(veritabani.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            catch (SQLException ex) {
                Logger.getLogger(veritabani.class.getName()).log(Level.SEVERE, null, ex);
            }
      
    }*/
    static String username="root";
    static String passvord="684217";
    static String dbUrl="jdbc:mysql://localhost:3306/new_proje";
    public Connection getConnection() throws SQLException{
        return (Connection) DriverManager.getConnection(dbUrl,username,passvord);
    }
    
    public void ShowError(SQLException exception){
        System.out.println("error:"+exception.getMessage());
        System.out.println("error code:"+exception.getErrorCode());
        
        
    }
    
}

 
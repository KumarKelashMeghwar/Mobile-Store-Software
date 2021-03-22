
package Database;
import java.sql.*;
import javax.swing.JOptionPane;

public class DbConnect {
    public static Connection con;
    public static Statement st;

    static{
        try{
            String dbUrl = "jdbc:oracle:thin:@localhost:1521:xe";
            String username = "system";
            String password = "chemicalBond";
            
            con = DriverManager.getConnection(dbUrl, username, password);
             
            st = con.createStatement();

        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }
}

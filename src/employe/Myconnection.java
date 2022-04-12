package employe;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;



public class Myconnection {
    public static Connection getConnexion() throws ClassNotFoundException
    {
         Connection connexion=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
        
            connexion =DriverManager.getConnection("jdbc:mysql://localhost/db_cuam?&characterEncoding=UTF-8","root","");
            return connexion;
           
        } catch (SQLException ex) {
            System.out.print(ex.getMessage());
        }
        return connexion;
    }
                      
}

package newpackage;
import java.sql.*;

public class ConnectionPro {
    private static Connection con;
    
    public static Connection getConnection(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3307/jsp_project","root","");
            
        }catch(ClassNotFoundException e){
        } catch (SQLException e) {
        }
        return con;
    }
    
}

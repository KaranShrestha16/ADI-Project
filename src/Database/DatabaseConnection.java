
package Database;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {
    
    private Connection con;
    private String url;
    private String username;
    private String password;
    
    public DatabaseConnection(){
        url = "jdbc:mysql://localhost:3306/adi";
        username = "root";
        password = "";    
    }  
    public Connection getConnection() {
        try {
            Class.forName("com.mysql.jdbc");
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }  
        try {
           con = DriverManager.getConnection(url, username, password); 
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }   
        return con;
    }   
}

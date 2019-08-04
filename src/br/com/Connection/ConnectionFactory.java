package br.com.Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Kauai Guarilha
 */
public class ConnectionFactory {
    
//    private static final String DRIVER = "com.mysql.jdbc.Driver";
//    private static final String URL = "jdbc:mysql://localhost:3306/db_wise_down";
//    private static final String USER = "root";
//    private static final String PASS = "123456";
    
    private static final String DRIVER = "org.postgresql.Driver";
    private static final String URL = "jdbc:postgresql://localhost:5432/DB_WISE_DOWN";
    private static final String USER = "wisedown";
    private static final String PASS = "123456";
    
    public static Connection getConnection(){
        try{
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL, USER, PASS);
        
        }catch(ClassNotFoundException | SQLException ex){
            throw new RuntimeException("Erro na Conexão !", ex);
        }       
    }
    
    public static void closeConnection(Connection con){
        if(con != null){
            try{
                con.close();
                
            }catch(SQLException ex){
                System.err.println("Erro: " + ex);
                
            }
        }
    }
    
    public static void closeConnection(Connection con, PreparedStatement stmt){
        if(stmt != null){
            try{
                stmt.close();
                
            }catch(SQLException ex){
                System.err.println("Erro: " + ex);
                
            }
        }
        closeConnection(con);
    }
    
    public static void closeConnection(Connection con, PreparedStatement stmt, ResultSet rs){
        if(rs != null){
            try{
                rs.close();
                
            }catch(SQLException ex){
                System.err.println("Erro: " + ex);
                
            }          
        }
        closeConnection(con, stmt);        
    } 
}

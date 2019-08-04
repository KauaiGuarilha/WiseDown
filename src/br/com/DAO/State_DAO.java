package br.com.DAO;

import br.com.Connection.ConnectionFactory;
import br.com.model.E_state;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Kauai Guarilha
 */
public class State_DAO {
    
    private Connection con = null;
    
    public State_DAO(){
        
        con = ConnectionFactory.getConnection();
    }
    
    // Create CRUD
    
    public boolean insert(E_state estate){
        
        String sqlInsert = "INSERT INTO estado(descricao) VALUES (?)";
        
        PreparedStatement stmt = null;
        
        try{
            stmt = con.prepareCall(sqlInsert);
            
            stmt.setString(1, estate.getDescricao());
            
            return true;
            
        }catch(SQLException ex){
            System.err.println("Erro ao Inserir: " + ex);
            return false;
            
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }     
    }
    
    public List<E_state> read(){
        
        String sqlread = "SELECT * FROM estado";
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<E_state> estates = new ArrayList<>();
        
        try{            
            stmt = con.prepareCall(sqlread);
            rs = stmt.executeQuery();          
            
            while(rs.next()){            
                E_state estate = new E_state();
                
                estate.setDescricao(rs.getString("descricao"));
                
                estates.add(estate);
                
            }
            
        }catch(SQLException ex){
            System.err.println("Erro ao Buscar: " + ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return estates;             
    }
}

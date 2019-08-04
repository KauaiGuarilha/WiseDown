package br.com.DAO;

import br.com.Connection.ConnectionFactory;
import br.com.model.Teacher;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Kauai Guarilha
 */
public class Teacher_DAO {
    
    public Teacher_DAO(){
        
    }
    
    //Create CRUD
    
    
    public void insert(Teacher teacher){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try{
            stmt = con.prepareStatement("INSERT INTO professor (nome, email, cpf, telefone, cidade, endereco, complemento, logradouro, numero, estado) VALUES (?,?,?,?,?,?,?,?,?,?)");
            
            stmt.setString(1, teacher.getNome());
            stmt.setString(2, teacher.getEmail());
            stmt.setString(3, teacher.getCpf());
            stmt.setString(4, teacher.getTelefone());
            stmt.setString(5, teacher.getCidade());
            stmt.setString(6, teacher.getEndereco());
            stmt.setString(7, teacher.getComplemento());
            stmt.setString(8, teacher.getLogradouro());
            stmt.setInt(9, teacher.getNumero());
            stmt.setString(10, teacher.getEstado());
            
            stmt.executeUpdate();
            
             
            JOptionPane.showMessageDialog(null,"Incluído com Sucesso","Inclusão", JOptionPane.INFORMATION_MESSAGE);
            
        }catch(SQLException ex){
            JOptionPane.showConfirmDialog(null, "Erro ao Salvar! " + ex);
            
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public List<Teacher> read(){
        
        String sqlRead = "SELECT * FROM professor";
        
        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Teacher> teachers = new ArrayList<>();
        
        try{
            stmt = con.prepareStatement(sqlRead);
            rs = stmt.executeQuery();           
            
            while(rs.next()){
            
                Teacher teacher = new Teacher();

                teacher.setId(rs.getInt("id"));
                teacher.setNome(rs.getString("nome"));
                teacher.setEmail(rs.getString("email"));
                teacher.setCpf(rs.getString("cpf"));
                teacher.setTelefone(rs.getString("telefone"));
                teacher.setCidade(rs.getString("cidade"));
                teacher.setEndereco(rs.getString("endereco"));
                teacher.setComplemento(rs.getString("complemento"));
                teacher.setLogradouro(rs.getString("logradouro"));
                teacher.setNumero(rs.getInt("numero"));
                teacher.setEstado(rs.getString("estado"));
                           
                teachers.add(teacher);
            }             
            
        }catch(SQLException ex){
            System.err.println("Erro ao Buscar: " + ex);           
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }      
        
        return teachers;
    }
    
    public boolean update(Teacher teacher){
        String sqlUpdate = "UPDATE aluno SET nome = ?, email = ?, cpf = ?, telefone = ?, cidade = ?, endereco = ?, complemento = ?, logradouro = ?, numero = ?, estado = ? WHERE id = ?";
        
        PreparedStatement stmt = null;
        Connection con = ConnectionFactory.getConnection();
        
        try{
            stmt = con.prepareStatement(sqlUpdate);
            
            stmt.setString(1, teacher.getNome());
            stmt.setString(2, teacher.getEmail());
            stmt.setString(3, teacher.getCpf());
            stmt.setString(4, teacher.getTelefone());
            stmt.setString(5, teacher.getCidade());
            stmt.setString(6, teacher.getEndereco());
            stmt.setString(7, teacher.getComplemento());
            stmt.setString(8, teacher.getLogradouro());
            stmt.setInt(9, teacher.getNumero());
            stmt.setString(10, teacher.getEstado());
            
            stmt.setInt(11, teacher.getId());
            
            return true;
            
        }catch(SQLException ex){
            System.err.println("Erro ao Atualizar: " + ex);
            return false;
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }      
    }
    
    public void delete(Teacher teacher){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try{
            stmt = con.prepareCall("DELETE FROM professor where id = ?");
            stmt.setInt(1, teacher.getId());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Excluído com Sucesso !","Inclusão", JOptionPane.INFORMATION_MESSAGE);
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao Exluir: " + ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
}

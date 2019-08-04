package br.com.DAO;

import br.com.Connection.ConnectionFactory;
import br.com.model.Student;
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
public class Student_DAO {   
    
    public Student_DAO(){       
        
    }
    
    //Create CRUD
    
    public void insert(Student student){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO aluno (nome, email, cpf, telefone, cidade, endereco, complemento, logradouro, numero, estado) VALUES (?,?,?,?,?,?,?,?,?,?)");
            
            stmt.setString(1, student.getNome());
            stmt.setString(2, student.getEmail());
            stmt.setString(3, student.getCpf());
            stmt.setString(4, student.getTelefone());
            stmt.setString(5, student.getCidade());
            stmt.setString(6, student.getEndereco());
            stmt.setString(7, student.getComplemento());
            stmt.setString(8, student.getLogradouro());
            stmt.setInt(9, student.getNumero());
            stmt.setString(10, student.getEstado());
            
            stmt.executeUpdate();
            
            //JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Salvar! " + ex);
            
        }finally{ // Se por acasou executar o código ou der erro, ele vai fechar a conexão
            // Classe e método criado para fechar a conexão
            ConnectionFactory.closeConnection(con, stmt);  // Fechamento de conexão
        }       
    }
   
    
    
    public List<Student> read(){
        
        String sqlRead = "SELECT * FROM aluno";
        
        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Student> students = new ArrayList<>();
        
        try{
            stmt = con.prepareStatement(sqlRead);
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Student student = new Student();
                
                student.setId(rs.getInt("id"));
                student.setNome(rs.getString("nome"));
                student.setEmail(rs.getString("email"));
                student.setCpf(rs.getString("cpf"));
                student.setTelefone(rs.getString("telefone"));
                student.setCidade(rs.getString("cidade"));
                student.setEndereco(rs.getString("endereco"));
                student.setComplemento(rs.getString("complemento"));
                student.setLogradouro(rs.getString("logradouro"));                
                student.setNumero(rs.getInt("numero"));
                student.setEstado(rs.getString("estado"));
                
                
                students.add(student);
            }
        
        }catch(SQLException ex){
            System.err.println("Erro ao Buscar: " + ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return students;        
    }
    
    public boolean update(Student student){
        
        String sqlUpdate = "UPDATE aluno SET nome = ?, email = ?, cpf = ?, telefone = ?, cidade = ?, endereco = ?, complemento = ?, logradouro = ?, numero = ?, estado = ? WHERE id = ?";
        
        PreparedStatement stmt = null;
        Connection con = ConnectionFactory.getConnection();
        
        try{
            stmt = con.prepareCall(sqlUpdate);
            
            stmt.setString(1, student.getNome());
            stmt.setString(2, student.getEmail());
            stmt.setString(3, student.getCpf());
            stmt.setString(4, student.getTelefone());
            stmt.setString(5, student.getCidade());
            stmt.setString(6, student.getEndereco());
            stmt.setString(7, student.getComplemento());
            stmt.setString(8, student.getLogradouro());
            stmt.setInt(9, student.getNumero());
            stmt.setString(10, student.getEstado());
            
            stmt.setInt(11, student.getId());
            
            return true;
        
        }catch(SQLException ex){
            System.err.println("Erro ao Atualizar: " + ex);
            return false;
        
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }      
    }
    
    public void delete(Student student){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try{
            stmt = con.prepareStatement("DELETE FROM aluno where id = ?");
            stmt.setInt(1, student.getId());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Excluído com sucesso!");
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao Excluir!");
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }       
}
        
     
        
        
        
    
        
        
    
//    public boolean delete(Student student){
//        
//        String sqlDelete = "DELETE FROM aluno where id = ?";
//        
//        PreparedStatement stmt = null;
//        Connection con = ConnectionFactory.getConnection();
//        
//        try{
//            stmt = con.prepareCall(sqlDelete);
//            
//            stmt.setInt(1, student.getId());
//            stmt.executeUpdate();
//            
//            return true;
//            
//        }catch(SQLException ex){
//            System.err.println("Erro ao Deletar: " + ex);
//            return false;
//            
//        }finally{
//            ConnectionFactory.closeConnection(con, stmt);
//        }       
//    
//    }
}

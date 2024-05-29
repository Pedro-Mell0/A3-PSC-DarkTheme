/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import beans.AlunoV4;
import com.mycompany.db.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author pedro
 */
public class AlunoV4DAO {
private ConnectionFactory conexao;
        private Connection conn;    


 public AlunoV4DAO() throws SQLException{
            this.conexao = new ConnectionFactory();
            this.conn = this.conexao.obtemConexao();
        }
 
  public int inserir(AlunoV4 aluno) {
            String sql = "INSERT INTO AlunoV4(nome_aluno, data_nascimento_aluno, nome_responsavel_aluno, "
                    + "telefone_aluno, email_aluno, endereco_aluno) VALUES (?, ?, ?, ?, ?, ?)";
             int RA = -1; // Valor padrão para indicar falha na inserção
            try {
                
        PreparedStatement stmt = this.conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
       stmt.setString(1, aluno.getNome_aluno());
       stmt.setString(2, aluno.getData_nascimento_aluno());
       stmt.setString(3, aluno.getNome_responsavel_aluno());
       stmt.setString(4, aluno.getTelefone_aluno());
       stmt.setString(5, aluno.getEmail_aluno());
       stmt.setString(6, aluno.getEndereco_aluno());
       stmt.executeUpdate();
       
       ResultSet rs = stmt.getGeneratedKeys();
       if (rs.next()) {
           RA = rs.getInt(1); // Obtém o ID gerado pelo banco de dados
        }
       
       } catch(Exception e) {
        JOptionPane.showMessageDialog(null, "Erro ao inserir aluno: " + e.getMessage());
       }
            
        return RA;
    }
  
  public void atualizar(AlunoV4 aluno) {
            String sql = "UPDATE INTO AlunoV4(nome_aluno, data_nascimento_aluno, nome_responsavel_aluno, telefone_aluno, email_aluno, endereco_aluno) VALUES (?, ?, ?, ?, ?, ?)";
            try {
                PreparedStatement stmt = this.conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
       stmt.setString(1, aluno.getNome_aluno());
       stmt.setString(2, aluno.getData_nascimento_aluno());
       stmt.setString(3, aluno.getNome_responsavel_aluno());
       stmt.setString(4, aluno.getTelefone_aluno());
       stmt.setString(5, aluno.getEmail_aluno());
       stmt.setString(6, aluno.getEndereco_aluno());
       stmt.executeUpdate();
            } catch(Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao atualizar aluno: " + e.getMessage());
            }
        }

    public void deletar(int RA) {
        String sql = "DELETE FROM AlunoV4 WHERE RA = ?";
        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setInt(1, RA);
            stmt.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao deletar aluno: " + e.getMessage());
        }
    }
}
  
  
  
       
       
            
       
   
 

 



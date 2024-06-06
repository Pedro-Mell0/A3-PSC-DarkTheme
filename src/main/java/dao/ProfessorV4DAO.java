/*
     * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
     * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import com.mycompany.db.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import beans.ProfessorV4;
import beans.AlunoV4;

/**
 *
 * @author pedro
 */
public class ProfessorV4DAO {

    private ConnectionFactory conexao;
    private Connection conn;

    public ProfessorV4DAO() throws SQLException {
        this.conexao = new ConnectionFactory();
        this.conn = this.conexao.obtemConexao();
    }

    public int inserir(ProfessorV4 professor, int id_curso) {
        String sql = "INSERT INTO ProfessorV4(nome_professor, email_professor, telefone_professor, endereco_professor, id_curso, senha_professor) VALUES (?, ?, ?, ?, ?, ?)";
        int ID = -1;
        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            stmt.setString(1, professor.getNome_professor());
            stmt.setString(2, professor.getEmail_professor());
            stmt.setString(3, professor.getTelefone_professor());
            stmt.setString(4, professor.getEndereco_professor());
            stmt.setInt(5, id_curso);
            stmt.setString(6, professor.getSenha_professor());
            stmt.executeUpdate();

            ResultSet rs = stmt.getGeneratedKeys();
            if (rs.next()) {
                ID = rs.getInt(1);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir professor: " + e.getMessage());
        }

        return ID;
    }

    public ProfessorV4 buscarPorId(int idProfessor) throws SQLException {
        String sql = "SELECT * FROM ProfessorV4 WHERE ID = ?";
        PreparedStatement stmt = this.conn.prepareStatement(sql);
        stmt.setInt(1, idProfessor);
        ResultSet rs = stmt.executeQuery();

        if (rs.next()) {
            ProfessorV4 professor = new ProfessorV4();
            professor.setID(rs.getInt("ID"));
            professor.setNome_professor(rs.getString("nome_professor"));
            professor.setTelefone_professor(rs.getString("telefone_professor"));
            professor.setEmail_professor(rs.getString("email_professor"));
            professor.setEndereco_professor(rs.getString("endereco_professor"));
            professor.setSenha_professor(rs.getString("senha_professor"));
            return professor;
        }

        return null;
    }

    public void atualizar(ProfessorV4 professor, int id_curso) {
        String sql = "UPDATE ProfessorV4 SET nome_professor = ?, "
                + "telefone_professor = ?, email_professor = ?, endereco_professor = ?, senha_professor = ?, id_curso = ? WHERE ID = ?";
        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setString(1, professor.getNome_professor());
            stmt.setString(2, professor.getTelefone_professor());
            stmt.setString(3, professor.getEmail_professor());
            stmt.setString(4, professor.getEndereco_professor());
            stmt.setInt(5, professor.getID());
            stmt.setInt(6, id_curso);
            stmt.setString(7, professor.getSenha_professor());
            stmt.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar professor: " + e.getMessage());
        }
    }

    public void deletar(int ID) {
        String sql = "DELETE FROM ProfessorV4 WHERE ID = ?";
        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setInt(1, ID);
            stmt.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao deletar professor: " + e.getMessage());
        }
    }
}

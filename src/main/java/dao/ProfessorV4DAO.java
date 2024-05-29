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

    public int inserir(ProfessorV4 professor) {
        String sql = "INSERT INTO ProfessorV4(nome_professor,"
                + " telefone_professor, email_professor, endereco_professor) VALUES (?, ?, ?, ?)";
        int ID = -1;
        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            stmt.setString(1, professor.getNome_professor());
            stmt.setString(2, professor.getEmail_professor());
            stmt.setString(3, professor.getTelefone_professor());
            stmt.setString(4, professor.getEndereco_professor());
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

    public void atualizar(ProfessorV4 professor) {
        String sql = "UPDATE INTO ProfessorV4(nome_professor,"
                + " telefone, email_professor, endereco_professor) VALUES (?, ?, ?, ?)";
        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            stmt.setString(1, professor.getNome_professor());
            stmt.setString(2, professor.getEmail_professor());
            stmt.setString(3, professor.getTelefone_professor());
            stmt.setString(4, professor.getEndereco_professor());
            stmt.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar Professor: " + e.getMessage());
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

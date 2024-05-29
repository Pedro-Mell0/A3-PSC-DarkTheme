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
import beans.MatriculaV4;

/**
 *
 * @author pedro
 */
public class MatriculaV4DAO {

    private ConnectionFactory conexao;
    private Connection conn;

    public MatriculaV4DAO() throws SQLException {
        this.conexao = new ConnectionFactory();
        this.conn = this.conexao.obtemConexao();
    }

    public int inserir(MatriculaV4 matricula) {
        String sql = "INSERT INTO MatriculaV4(data_efetivacao,"
                + " data_termino) VALUES (?, ?)";
        int id_matricula = -1;
        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            stmt.setString(1, matricula.getData_efetivacao());
            stmt.setString(2, matricula.getData_termino());
            stmt.executeUpdate();

            ResultSet rs = stmt.getGeneratedKeys();
            if (rs.next()) {
                id_matricula = rs.getInt(1);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir matricula: " + e.getMessage());
        }

        return id_matricula;
    }

    public void atualizar(MatriculaV4 matricula) {
        String sql = "INSERT INTO MatriculaV4(data_efetivacao,"
                + " data_termino) VALUES (?, ?)";
        int id_matricula = -1;
        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            stmt.setString(1, matricula.getData_efetivacao());
            stmt.setString(2, matricula.getData_termino());
            stmt.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar matrícula: " + e.getMessage());
        }
    }

    public void deletar(int id_matricula) {
        String sql = "DELETE FROM MatriculaV4 WHERE id_matricula = ?";
        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setInt(1, id_matricula);
            stmt.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao deletar matrícula: " + e.getMessage());
        }

    }

}

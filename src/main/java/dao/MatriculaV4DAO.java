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

    public int inserir(MatriculaV4 matricula, int id_curso, int RA) {
        String sql = "INSERT INTO MatriculaV4(data_efetivacao,"
                + " data_termino, id_curso, RA) VALUES (?, ?, ?, ?)";
        int id_matricula = -1;
        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            stmt.setString(1, matricula.getData_efetivacao());
            stmt.setString(2, matricula.getData_termino());
            stmt.setInt(3, id_curso);
            stmt.setInt(4, RA);
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
    
    
      public MatriculaV4 buscarPorId(int idMatricula) throws SQLException {
        String sql = "SELECT * FROM MatriculaV4 WHERE id_matricula = ?";
        PreparedStatement stmt = this.conn.prepareStatement(sql);
        stmt.setInt(1, idMatricula);
        ResultSet rs = stmt.executeQuery();

        if (rs.next()) {
            MatriculaV4 matricula = new MatriculaV4();
            matricula.setId_matricula(rs.getInt("id_matricula"));
            matricula.setData_efetivacao(rs.getString("data_efetivacao"));
            matricula.setData_termino(rs.getString("data_termino"));
            return matricula;
        }

        return null;
    }

    public void atualizar(MatriculaV4 matricula, int id_curso, int RA) {
         String sql = "UPDATE MatriculaV4 SET data_efetivacao = ?,"
                 + " data_termino = ?, id_curso = ?, RA = ? WHERE id_matricula = ?";
        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setString(1, matricula.getData_efetivacao());
            stmt.setString(2, matricula.getData_termino());
            stmt.setInt(3, id_curso);
            stmt.setInt(4, RA);
            stmt.setInt(5, matricula.getId_matricula());
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

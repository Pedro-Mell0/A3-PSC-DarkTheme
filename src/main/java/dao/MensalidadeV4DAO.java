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
import beans.MensalidadeV4;

/**
 *
 * @author pedro
 */
public class MensalidadeV4DAO {
    
    private ConnectionFactory conexao;
    private Connection conn;
    
    public MensalidadeV4DAO() throws SQLException {
        this.conexao = new ConnectionFactory();
        this.conn = this.conexao.obtemConexao();
    }
    
     public int inserir(MensalidadeV4 mensalidade) {
        String sql = "INSERT INTO MensalidadeV4(data_emissao,"
                + " data_vencimento, data_pagamento, valor) VALUES (?, ?, ?, ?)";
        int id_mensalidade = -1;
        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            stmt.setString(1, mensalidade.getData_emissao());
            stmt.setString(2, mensalidade.getData_vencimento());
            stmt.setString(3, mensalidade.getData_pagamento());
            stmt.setString(4, mensalidade.getValor());
            stmt.executeUpdate();

            ResultSet rs = stmt.getGeneratedKeys();
            if (rs.next()) {
                id_mensalidade = rs.getInt(1);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir mensalidade: " + e.getMessage());
        }

        return id_mensalidade;
    }
     
     
     public void atualizar(MensalidadeV4 mensalidade) {
        String sql = "INSERT INTO MatriculaV4(data_efetivacao,"
                + " data_termino) VALUES (?, ?)";
        int id_matricula = -1;
        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            stmt.setString(1, mensalidade.getData_emissao());
            stmt.setString(2, mensalidade.getData_vencimento());
            stmt.setString(3, mensalidade.getData_pagamento());
            stmt.setString(4, mensalidade.getValor());
            stmt.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar mensalidade: " + e.getMessage());
        }
    }
     
     
     
     public void deletar(int id_mensalidade) {
        String sql = "DELETE FROM MensalidadeV4 WHERE id_mensalidade = ?";
        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setInt(1, id_mensalidade);
            stmt.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao deletar mensalidade: " + e.getMessage());
        }

    }
     
     
     
     
    
    
    
}

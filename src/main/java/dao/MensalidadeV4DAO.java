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
    
     public int inserir(MensalidadeV4 mensalidade, int RA) {
        String sql = "INSERT INTO MensalidadeV4(data_emissao,"
                + " data_vencimento, data_pagamento, valor, RA) VALUES (?, ?, ?, ?, ?)";
        int id_mensalidade = -1;
        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            stmt.setString(1, mensalidade.getData_emissao());
            stmt.setString(2, mensalidade.getData_vencimento());
            stmt.setString(3, mensalidade.getData_pagamento());
            stmt.setString(4, mensalidade.getValor());
            stmt.setInt(5, RA);
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
     
     public void atualizar(MensalidadeV4 mensalidade, int RA) {
      String sql = "UPDATE MensalidadeV4 SET data_emissao = ?, data_vencimento = ?, data_pagamento = ?, valor = ?, RA = ? WHERE id_mensalidade = ?"; 
      try{
          PreparedStatement stmt = this.conn.prepareStatement(sql);
          stmt.setString(1, mensalidade.getData_emissao());     
          stmt.setString(3, mensalidade.getData_vencimento());
          stmt.setString(2, mensalidade.getData_pagamento());
          stmt.setString(4, mensalidade.getValor());
          stmt.setInt(5, RA);
          stmt.setInt(6, mensalidade.getId_mensalidade());
          stmt.executeUpdate();
      
     }catch (Exception e) {
         JOptionPane.showMessageDialog(null, "Erro ao atualizar mensalidade " + e.getMessage());
     }
}
     
     public MensalidadeV4 buscarPorId(int idMensalidade) throws SQLException {
        String sql = "SELECT * FROM MensalidadeV4 WHERE id_mensalidade = ?";
        PreparedStatement stmt = this.conn.prepareStatement(sql);
        stmt.setInt(1, idMensalidade);
        ResultSet rs = stmt.executeQuery();

        if (rs.next()) {
            MensalidadeV4 mensalidade = new MensalidadeV4();
            mensalidade.setId_mensalidade(rs.getInt("id_mensalidade"));
            mensalidade.setData_emissao(rs.getString("data_emissao"));
            mensalidade.setData_vencimento(rs.getString("data_vencimento"));
            mensalidade.setData_pagamento(rs.getString("data_pagamento"));
            mensalidade.setValor(rs.getString("valor"));
            return mensalidade;
        }

        return null;
    }
    
     
     
     public void deletar(int id_mensalidade) {
        String sql = "DELETE FROM MensalidadeV4 WHERE id_mensalidade = ?";
        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setInt(1, id_mensalidade);
            stmt.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao deletar mensalidade: " + ex.getMessage());
        }

    }
     
     
     
     
    
    
    
}

package com.mycompany.db;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    private String usuario = "root";
    private String senha = "Admin5972";
    private String host = "localhost";
    private String porta = "3306";
    private String timezone = "America/Sao_Paulo";
    private String bd = "FundacaoArteCulturaV4";

    public Connection obtemConexao() throws SQLException {
        try {
            String url = "jdbc:mysql://" + host + ":" + porta + "/" + bd + "?serverTimezone=" + timezone;
            Connection conectar = DriverManager.getConnection(url, usuario, senha);

            if (conectar != null) {
                JOptionPane.showMessageDialog(null, "Conexão estabelecida com sucesso");
            }
            return conectar;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar estaelecer a conexão com o banco de dados");
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) throws SQLException {
        ConnectionFactory connectionFactory = new ConnectionFactory();
        Connection connection = connectionFactory.obtemConexao();

        if (connection != null) {
            JOptionPane.showMessageDialog(null, "Coenexão testada e aprovada");
        } else {
            JOptionPane.showMessageDialog(null, "Falha na conexão");

        }
    }
}

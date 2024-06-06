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

/**
 *
 * @author pedro
 */
public class TelaMenuDAO {

    private ConnectionFactory conexao;
    private Connection conn;

    public TelaMenuDAO() throws SQLException {
        this.conexao = new ConnectionFactory();
        this.conn = this.conexao.obtemConexao();
    }

    public String verificarEmail(String email) {
        String tipoUsuario = null; // Usaremos esta variável para armazenar o tipo de usuário
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            // Verificar email na tabela de alunos
            String sqlAluno = "SELECT email_aluno FROM AlunoV4 WHERE email_aluno = ?";
            stmt = conn.prepareStatement(sqlAluno);
            stmt.setString(1, email);
            rs = stmt.executeQuery();

            if (rs.next()) {
                tipoUsuario = "aluno";
            } else {
                // Verificar email na tabela de professores
                String sqlProfessor = "SELECT email_professor FROM ProfessorV4 WHERE email_professor = ?";
                stmt = conn.prepareStatement(sqlProfessor);
                stmt.setString(1, email);
                rs = stmt.executeQuery();

                if (rs.next()) {
                    tipoUsuario = "professor";
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                if (stmt != null) {
                    stmt.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return tipoUsuario; // Retornar o tipo de usuário
    }

    public boolean verificarSenha(String email, String senha, String tipoUsuario) {
        boolean senhaCorreta = false;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            if ("aluno".equals(tipoUsuario)) {
                // Verificar senha na tabela de alunos
                String sqlAluno = "SELECT senha_aluno FROM AlunoV4 WHERE email_aluno = ?";
                stmt = conn.prepareStatement(sqlAluno);
                stmt.setString(1, email);
            } else if ("professor".equals(tipoUsuario)) {
                // Verificar senha na tabela de professores
                String sqlProfessor = "SELECT senha_professor FROM ProfessorV4 WHERE email_professor = ?";
                stmt = conn.prepareStatement(sqlProfessor);
                stmt.setString(1, email);
            }
            rs = stmt.executeQuery();

            if (rs.next() && rs.getString(1).equals(senha)) {
                senhaCorreta = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                if (stmt != null) {
                    stmt.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return senhaCorreta;
    }

}

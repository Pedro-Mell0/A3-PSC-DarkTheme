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
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author pedro
 */
public class AlunoV4DAO {

    private ConnectionFactory conexao;
    private Connection conn;

    public AlunoV4DAO() throws SQLException {
        this.conexao = new ConnectionFactory();
        this.conn = this.conexao.obtemConexao();
    }

    public ArrayList<AlunoV4> listarRA() {
        try {
            ArrayList<AlunoV4> lista = new ArrayList<>();
            String sql = "SELECT * FROM alunov4"; // Corrigi o nome da tabela para cursov4
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                AlunoV4 aluno = new AlunoV4();
                aluno.setRA(rs.getInt("RA"));
                aluno.setNome_aluno(rs.getString("nome_aluno"));
                aluno.setEmail_aluno(rs.getString("email_aluno"));
                aluno.setTelefone_aluno(rs.getString("telefone_aluno"));
                aluno.setData_nascimento_aluno(rs.getString("data_nascimento_aluno"));
                aluno.setEndereco_aluno(rs.getString("endereco_aluno"));
                aluno.setNome_responsavel_aluno(rs.getString("nome_responsavel_aluno"));
                aluno.setSenha_aluno(rs.getString("senha_aluno"));
                aluno.setNota_A1("nota_a1");
                aluno.setNota_A2("nota_a2");
                aluno.setNota_A3("nota_a3");
                aluno.setPresenca("presenca");
                lista.add(aluno);

            }
            return lista;
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro: " + erro);
            return null;
        }
    }

    public AlunoV4 buscarNotasPorRA(int RA) throws SQLException {
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            con = new ConnectionFactory().obtemConexao();
            String sql = "SELECT Nota_A1, Nota_A2, Nota_A3 FROM AlunoV4 WHERE RA = ?";
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, RA);
            rs = stmt.executeQuery();

            if (rs.next()) {
                AlunoV4 aluno = new AlunoV4();
                aluno.setNota_A1(rs.getString("Nota_A1"));
                aluno.setNota_A2(rs.getString("Nota_A2"));
                aluno.setNota_A3(rs.getString("Nota_A3"));
                return aluno;
            } else {
                return null;
            }
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (stmt != null) {
                stmt.close();
            }
            if (con != null) {
                con.close();
            }
        }
    }

    public AlunoV4 buscarPresencaPorRA(int RA) throws SQLException {
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            con = new ConnectionFactory().obtemConexao();
            String sql = "SELECT Presenca FROM AlunoV4 WHERE RA = ?";
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, RA);
            rs = stmt.executeQuery();

            if (rs.next()) {
                AlunoV4 aluno = new AlunoV4();
                aluno.setPresenca(rs.getString("Presenca"));
                return aluno;
            } else {
                return null;
            }
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (stmt != null) {
                stmt.close();
            }
            if (con != null) {
                con.close();
            }
        }
    }

    public int inserir(AlunoV4 aluno, int id_curso) {
        String sql = "INSERT INTO AlunoV4(nome_aluno, data_nascimento_aluno, nome_responsavel_aluno, "
                + "telefone_aluno, email_aluno, endereco_aluno, senha_aluno, id_curso) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        int RA = -1; // Valor padrão para indicar falha na inserção
        try {

            PreparedStatement stmt = this.conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            stmt.setString(1, aluno.getNome_aluno());
            stmt.setString(2, aluno.getData_nascimento_aluno());
            stmt.setString(3, aluno.getNome_responsavel_aluno());
            stmt.setString(4, aluno.getTelefone_aluno());
            stmt.setString(5, aluno.getEmail_aluno());
            stmt.setString(6, aluno.getEndereco_aluno());
            stmt.setString(7, aluno.getSenha_aluno());
            stmt.setInt(8, id_curso); // Certifique-se de que este valor seja um inteiro
            stmt.executeUpdate();
            ResultSet rs = stmt.getGeneratedKeys();
            if (rs.next()) {
                RA = rs.getInt(1); // Obtém o ID gerado pelo banco de dados
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir aluno: " + e.getMessage());
        }

        return RA;
    }

    public AlunoV4 buscarPorRA(int ra) throws SQLException {
        String sql = "SELECT * FROM AlunoV4 WHERE RA = ?";
        PreparedStatement stmt = this.conn.prepareStatement(sql);
        stmt.setInt(1, ra);
        ResultSet rs = stmt.executeQuery();

        if (rs.next()) {
            AlunoV4 aluno = new AlunoV4();
            aluno.setRA(rs.getInt("RA"));
            aluno.setNome_aluno(rs.getString("nome_aluno"));
            aluno.setEmail_aluno(rs.getString("email_aluno"));
            aluno.setTelefone_aluno(rs.getString("telefone_aluno"));
            aluno.setData_nascimento_aluno(rs.getString("data_nascimento_aluno"));
            aluno.setEndereco_aluno(rs.getString("endereco_aluno"));
            aluno.setNome_responsavel_aluno(rs.getString("nome_responsavel_aluno"));
            aluno.setSenha_aluno(rs.getString("Senha"));
            aluno.setPresenca("presenca");
            aluno.setNota_A1("nota_a1");
            aluno.setNota_A2("nota_a2");
            aluno.setNota_A3("nota_a3");
            return aluno;
        }

        return null;
    }

    public void atualizar(AlunoV4 aluno, int id_curso) {
        String sql = "UPDATE AlunoV4 SET nome_aluno = ?, data_nascimento_aluno = ?, nome_responsavel_aluno = ?, telefone_aluno = ?, email_aluno = ?, senha_aluno = ?, endereco_aluno = ?, id_curso = ? WHERE RA = ?";
        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setString(1, aluno.getNome_aluno());
            stmt.setString(2, aluno.getData_nascimento_aluno());
            stmt.setString(3, aluno.getNome_responsavel_aluno());
            stmt.setString(4, aluno.getTelefone_aluno());
            stmt.setString(5, aluno.getEmail_aluno());
            stmt.setString(6, aluno.getEndereco_aluno());
            stmt.setInt(7, id_curso);
            stmt.setInt(8, aluno.getRA());
            stmt.setString(9, aluno.getSenha_aluno());
            stmt.executeUpdate();
        } catch (Exception e) {
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

    public void atribuirNotas(AlunoV4 aluno) throws SQLException {
        String sql = "UPDATE AlunoV4 SET Nota_A1 = ?, Nota_A2 = ?, Nota_A3 = ?, Presenca = ?  WHERE RA = ?";
        try (PreparedStatement stmt = this.conn.prepareStatement(sql)) {
            stmt.setString(1, aluno.getNota_A1());
            stmt.setString(2, aluno.getNota_A2());
            stmt.setString(3, aluno.getNota_A3());
            stmt.setString(4, aluno.getPresenca());
            stmt.setInt(5, aluno.getRA());
            stmt.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar notas: " + e.getMessage());
            throw e;
        }
    }
}

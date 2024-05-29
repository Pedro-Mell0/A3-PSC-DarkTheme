
    package dao;
    //DATA ACCESS OBJECTS



    import javax.swing.JOptionPane;
    import beans.CursoV4;
    import com.mycompany.db.ConnectionFactory;
    import java.sql.Connection;
    import java.sql.SQLException;
    import java.sql.PreparedStatement;
    import java.sql.ResultSet;
    import java.sql.Statement;


    public class CursoV4DAO {
        private ConnectionFactory conexao;
        private Connection conn;

        public CursoV4DAO() throws SQLException{
            this.conexao = new ConnectionFactory();
            this.conn = this.conexao.obtemConexao();
        }

        public int inserir(CursoV4 curso) {
            String sql = "INSERT INTO CursoV4(nome_curso, carga_horaria_curso) VALUES (?, ?)";
    int idCurso = -1; // Valor padrão para indicar falha na inserção

    try {
        PreparedStatement stmt = this.conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        stmt.setString(1, curso.getNome_curso());
        stmt.setString(2, curso.getCarga_horaria_curso());
        stmt.executeUpdate();
        
        ResultSet rs = stmt.getGeneratedKeys();
        if (rs.next()) {
            idCurso = rs.getInt(1); // Obtém o ID gerado pelo banco de dados
        }
    } catch(Exception e) {
        JOptionPane.showMessageDialog(null, "Erro ao inserir curso: " + e.getMessage());
    }
    
    return idCurso;
        }

        public void atualizar(CursoV4 curso) {
            String sql = "UPDATE CursoV4 SET carga_horaria_curso = ? WHERE nome_curso = ?";
            try {
                PreparedStatement stmt = this.conn.prepareStatement(sql);
                stmt.setString(1, curso.getCarga_horaria_curso());
                stmt.setString(2, curso.getNome_curso());
                stmt.executeUpdate();
            } catch(Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao atualizar curso: " + e.getMessage());
            }
        }

        public void deletar(String nome_curso) {
            String sql = "DELETE FROM CursoV4 WHERE nome_curso = ?";
            try {
                PreparedStatement stmt = this.conn.prepareStatement(sql);
                stmt.setString(1, nome_curso);
                stmt.executeUpdate();
            } catch(Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao deletar curso: " + e.getMessage());
            }
        }
    }

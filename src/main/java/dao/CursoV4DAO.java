
    package dao;
    //DATA ACCESS OBJECTS



    import javax.swing.JOptionPane;
    import beans.CursoV4;
    import com.mycompany.db.ConnectionFactory;
    import java.awt.List;
    import java.sql.Connection;
    import java.sql.SQLException;
    import java.sql.PreparedStatement;
    import java.sql.ResultSet;
    import java.sql.Statement;
    import java.util.ArrayList;


    public class CursoV4DAO {
        private ConnectionFactory conexao;
        private Connection conn;

        public CursoV4DAO() throws SQLException{
            this.conexao = new ConnectionFactory();
            this.conn = this.conexao.obtemConexao();
        }
        
        
        public ArrayList<CursoV4> listarCursos(){
        try {
            ArrayList<CursoV4> lista = new ArrayList<>();
            String sql = "SELECT * FROM cursov4"; // Corrigi o nome da tabela para cursov4
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()) {
                CursoV4 curso = new CursoV4();
                curso.setId_curso(rs.getInt("id_curso"));
                curso.setNome_curso(rs.getString("nome_curso"));
                curso.setCarga_horaria_curso(rs.getString("carga_horaria_curso"));
                lista.add(curso);
            }
            return lista;
        } catch (SQLException erro){
            JOptionPane.showMessageDialog(null, "Erro: " + erro);
            return null;
        }
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

        public CursoV4 buscarPorId(int idCurso) throws SQLException {
        String sql = "SELECT * FROM CursoV4 WHERE id_curso = ?";
        PreparedStatement stmt = this.conn.prepareStatement(sql);
        stmt.setInt(1, idCurso);
        ResultSet rs = stmt.executeQuery();

        if (rs.next()) {
            CursoV4 curso = new CursoV4();
            curso.setId_curso(rs.getInt("id_curso"));
            curso.setNome_curso(rs.getString("nome_curso"));
            curso.setCarga_horaria_curso(rs.getString("carga_horaria_curso"));
            return curso;
        }

        return null;
    }
        
        
        public void atualizar(CursoV4 curso) {
            String sql = "UPDATE CursoV4 SET nome_curso = ?, carga_horaria_curso = ? WHERE id_curso = ?";
        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setString(1, curso.getNome_curso());
            stmt.setString(2, curso.getCarga_horaria_curso());
            stmt.setInt(3, curso.getId_curso());
            stmt.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar curso: " + e.getMessage());
        }
        }

        public void deletar(String id_curso) {
            String sql = "DELETE FROM CursoV4 WHERE id_curso = ?";
            try {
                PreparedStatement stmt = this.conn.prepareStatement(sql);
                stmt.setString(1, id_curso);
                stmt.executeUpdate();
            } catch(Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao deletar curso: " + e.getMessage());
            }
        }
    }

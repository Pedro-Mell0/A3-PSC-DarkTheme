package Forms;

import beans.CursoV4;
import com.mycompany.db.ConnectionFactory;
import dao.CursoV4DAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author pedro
 */
public class FormCursoV4 extends javax.swing.JFrame {

    /**
     * Creates new form FormCursoV4
     */
    public FormCursoV4() {
        initComponents();
           this.setSize(960, 600);
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_Deletar = new javax.swing.JToggleButton();
        btn_Inserir = new javax.swing.JToggleButton();
        btn_voltar = new javax.swing.JToggleButton();
        btn_Atualizar = new javax.swing.JToggleButton();
        txt_Carga_Horaria_Curso = new javax.swing.JTextField();
        txt_Nome_Do_Curso = new javax.swing.JTextField();
        Label_Valor = new javax.swing.JLabel();
        Label_Valor1 = new javax.swing.JLabel();
        Label_Valor2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cursos Fundação Arte&Cultura");
        setMinimumSize(new java.awt.Dimension(750, 500));
        getContentPane().setLayout(null);

        btn_Deletar.setFont(new java.awt.Font("Century Schoolbook", 1, 18)); // NOI18N
        btn_Deletar.setForeground(new java.awt.Color(204, 204, 204));
        btn_Deletar.setText("DELETAR");
        btn_Deletar.setBorder(null);
        btn_Deletar.setContentAreaFilled(false);
        btn_Deletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DeletarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Deletar);
        btn_Deletar.setBounds(30, 420, 157, 34);

        btn_Inserir.setFont(new java.awt.Font("Century Schoolbook", 1, 18)); // NOI18N
        btn_Inserir.setForeground(new java.awt.Color(204, 204, 204));
        btn_Inserir.setText("INSERIR");
        btn_Inserir.setBorder(null);
        btn_Inserir.setContentAreaFilled(false);
        btn_Inserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_InserirActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Inserir);
        btn_Inserir.setBounds(27, 480, 160, 34);

        btn_voltar.setFont(new java.awt.Font("Century Schoolbook", 1, 18)); // NOI18N
        btn_voltar.setForeground(new java.awt.Color(204, 204, 204));
        btn_voltar.setText("< VOLTAR");
        btn_voltar.setBorder(null);
        btn_voltar.setContentAreaFilled(false);
        btn_voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_voltarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_voltar);
        btn_voltar.setBounds(210, 420, 157, 34);

        btn_Atualizar.setFont(new java.awt.Font("Century Schoolbook", 1, 18)); // NOI18N
        btn_Atualizar.setForeground(new java.awt.Color(204, 204, 204));
        btn_Atualizar.setText("ATUALIZAR");
        btn_Atualizar.setBorder(null);
        btn_Atualizar.setContentAreaFilled(false);
        btn_Atualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AtualizarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Atualizar);
        btn_Atualizar.setBounds(210, 480, 160, 34);

        txt_Carga_Horaria_Curso.setBackground(new java.awt.Color(3, 16, 50));
        txt_Carga_Horaria_Curso.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txt_Carga_Horaria_Curso.setForeground(new java.awt.Color(204, 204, 204));
        txt_Carga_Horaria_Curso.setBorder(null);
        getContentPane().add(txt_Carga_Horaria_Curso);
        txt_Carga_Horaria_Curso.setBounds(170, 234, 160, 34);

        txt_Nome_Do_Curso.setBackground(new java.awt.Color(3, 16, 50));
        txt_Nome_Do_Curso.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txt_Nome_Do_Curso.setForeground(new java.awt.Color(204, 204, 204));
        txt_Nome_Do_Curso.setBorder(null);
        txt_Nome_Do_Curso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Nome_Do_CursoActionPerformed(evt);
            }
        });
        getContentPane().add(txt_Nome_Do_Curso);
        txt_Nome_Do_Curso.setBounds(170, 308, 160, 34);

        Label_Valor.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 15)); // NOI18N
        Label_Valor.setForeground(new java.awt.Color(204, 204, 204));
        Label_Valor.setText("do Curso:");
        getContentPane().add(Label_Valor);
        Label_Valor.setBounds(50, 300, 110, 20);

        Label_Valor1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 15)); // NOI18N
        Label_Valor1.setForeground(new java.awt.Color(204, 204, 204));
        Label_Valor1.setText("Nome do curso:");
        getContentPane().add(Label_Valor1);
        Label_Valor1.setBounds(43, 218, 120, 20);

        Label_Valor2.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 15)); // NOI18N
        Label_Valor2.setForeground(new java.awt.Color(204, 204, 204));
        Label_Valor2.setText("Carga Horária");
        getContentPane().add(Label_Valor2);
        Label_Valor2.setBounds(50, 285, 110, 20);

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(23, 27, 80));
        jTextField1.setFont(new java.awt.Font("Century Schoolbook", 1, 36)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(140, 82, 255));
        jTextField1.setText("Cursos");
        jTextField1.setToolTipText("");
        jTextField1.setBorder(null);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(130, 120, 140, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\pedro\\Desktop\\DesignNovo\\CursosDark2.png")); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 960, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_Nome_Do_CursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Nome_Do_CursoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Nome_Do_CursoActionPerformed

    private void btn_InserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_InserirActionPerformed
        // TODO add your handling code here:
        String nomeCurso = txt_Nome_Do_Curso.getText();
        String cargaHoraria = txt_Carga_Horaria_Curso.getText();

        CursoV4 curso = new CursoV4();
        curso.setNome_curso(nomeCurso);
        curso.setCarga_horaria_curso(cargaHoraria);

        try {
            CursoV4DAO dao = new CursoV4DAO();
            dao.inserir(curso);
            JOptionPane.showMessageDialog(this, "Curso inserido com sucesso!");
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Erro ao inserir curso.");
        }
    }//GEN-LAST:event_btn_InserirActionPerformed

    private void btn_DeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DeletarActionPerformed
        // TODO add your handling code here:
        String idCurso = JOptionPane.showInputDialog(this, "Insira o ID do curso a ser deletado:");

        if (idCurso != null && !idCurso.trim().isEmpty()) {
            try {
                CursoV4DAO dao = new CursoV4DAO();
                int ra = Integer.parseInt(idCurso.trim()); // Converte o ID para inteiro
                dao.deletar(idCurso); // Assume que o método deletar no DAO aceita um ID como inteiro
                JOptionPane.showMessageDialog(this, "Curso deletado com sucesso!");
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "ID inválido. Insira um número válido.");
            } catch (SQLException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(this, "Erro ao deletar curso.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "ID não inserido.");
        }
    }//GEN-LAST:event_btn_DeletarActionPerformed

    private void btn_AtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AtualizarActionPerformed
        // TODO add your handling code here:
        String idCursoStr = JOptionPane.showInputDialog(this, "Informe o ID do curso a ser atualizado:");
        if (idCursoStr == null || idCursoStr.isEmpty()) {
            return; // Se o usuário cancelar ou não fornecer o ID, interromper a operação
        }

        try {
            int idCurso = Integer.parseInt(idCursoStr);
            CursoV4DAO dao = new CursoV4DAO();
            CursoV4 curso = dao.buscarPorId(idCurso);

            if (curso == null) {
                JOptionPane.showMessageDialog(this, "Curso não encontrado.");
                return;
            }

            // Solicitar novas informações
            String nomeCurso = JOptionPane.showInputDialog(this, "Nome do curso:", curso.getNome_curso());
            String cargaHoraria = JOptionPane.showInputDialog(this, "Carga Horária do curso:", curso.getCarga_horaria_curso());

            // Atualizar o objeto curso com novas informações
            curso.setNome_curso(nomeCurso);
            curso.setCarga_horaria_curso(cargaHoraria);

            // Atualizar no banco de dados
            dao.atualizar(curso);
            JOptionPane.showMessageDialog(this, "Curso atualizado com sucesso!");

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "ID do curso inválido.");
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Erro ao atualizar curso.");
        }

    }//GEN-LAST:event_btn_AtualizarActionPerformed

    private void btn_voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_voltarActionPerformed
        // TODO add your handling code here:
        FormEditor Editor = new FormEditor();
        Editor.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_voltarActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    
    
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormCursoV4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormCursoV4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormCursoV4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormCursoV4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormCursoV4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Label_Valor;
    private javax.swing.JLabel Label_Valor1;
    private javax.swing.JLabel Label_Valor2;
    private javax.swing.JToggleButton btn_Atualizar;
    private javax.swing.JToggleButton btn_Deletar;
    private javax.swing.JToggleButton btn_Inserir;
    private javax.swing.JToggleButton btn_voltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField txt_Carga_Horaria_Curso;
    private javax.swing.JTextField txt_Nome_Do_Curso;
    // End of variables declaration//GEN-END:variables
}

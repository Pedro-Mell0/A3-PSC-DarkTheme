
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
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Main_Frame = new javax.swing.JPanel();
        txt_AttCursos = new javax.swing.JTextField();
        txt_Carga_Horaria = new javax.swing.JTextField();
        txt_Nome_Curso = new javax.swing.JTextField();
        btn_Atualizar = new javax.swing.JToggleButton();
        btn_Deletar = new javax.swing.JToggleButton();
        btn_Inserir = new javax.swing.JToggleButton();
        txt_Nome_Do_Curso = new javax.swing.JTextField();
        txt_Carga_Horaria_Curso = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cursos Fundação Arte&Cultura");
        setMinimumSize(new java.awt.Dimension(750, 500));
        getContentPane().setLayout(null);

        Main_Frame.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txt_AttCursos.setEditable(false);
        txt_AttCursos.setBackground(new java.awt.Color(230, 230, 230));
        txt_AttCursos.setFont(new java.awt.Font("Century Schoolbook", 1, 36)); // NOI18N
        txt_AttCursos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_AttCursos.setText("CURSOS");
        txt_AttCursos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txt_AttCursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_AttCursosActionPerformed(evt);
            }
        });

        txt_Carga_Horaria.setEditable(false);
        txt_Carga_Horaria.setBackground(new java.awt.Color(230, 230, 230));
        txt_Carga_Horaria.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txt_Carga_Horaria.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Carga_Horaria.setText("Carga horária");
        txt_Carga_Horaria.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txt_Nome_Curso.setEditable(false);
        txt_Nome_Curso.setBackground(new java.awt.Color(230, 230, 230));
        txt_Nome_Curso.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txt_Nome_Curso.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Nome_Curso.setText("Nome do curso");
        txt_Nome_Curso.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btn_Atualizar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_Atualizar.setText("ATUALIZAR");
        btn_Atualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AtualizarActionPerformed(evt);
            }
        });

        btn_Deletar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_Deletar.setText("DELETAR");
        btn_Deletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DeletarActionPerformed(evt);
            }
        });

        btn_Inserir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_Inserir.setText("INSERIR");
        btn_Inserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_InserirActionPerformed(evt);
            }
        });

        txt_Nome_Do_Curso.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txt_Nome_Do_Curso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Nome_Do_CursoActionPerformed(evt);
            }
        });

        txt_Carga_Horaria_Curso.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout Main_FrameLayout = new javax.swing.GroupLayout(Main_Frame);
        Main_Frame.setLayout(Main_FrameLayout);
        Main_FrameLayout.setHorizontalGroup(
            Main_FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Main_FrameLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(Main_FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Main_FrameLayout.createSequentialGroup()
                        .addComponent(txt_Nome_Do_Curso, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_Carga_Horaria_Curso))
                    .addGroup(Main_FrameLayout.createSequentialGroup()
                        .addComponent(txt_Nome_Curso)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_Carga_Horaria, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Main_FrameLayout.createSequentialGroup()
                        .addComponent(btn_Atualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Inserir, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_Deletar, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txt_AttCursos))
                .addGap(37, 37, 37))
        );
        Main_FrameLayout.setVerticalGroup(
            Main_FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Main_FrameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt_AttCursos, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Main_FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_Carga_Horaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Nome_Curso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(Main_FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_Nome_Do_Curso, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Carga_Horaria_Curso, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Main_FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Atualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Inserir, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Deletar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(73, 73, 73))
        );

        getContentPane().add(Main_Frame);
        Main_Frame.setBounds(90, 60, 563, 351);

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
        String nomeCurso = txt_Nome_Do_Curso.getText();

        try {
            CursoV4DAO dao = new CursoV4DAO();
            dao.deletar(nomeCurso);
            JOptionPane.showMessageDialog(this, "Curso deletado com sucesso!");
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Erro ao deletar curso.");
        }
    }//GEN-LAST:event_btn_DeletarActionPerformed

    private void btn_AtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AtualizarActionPerformed
        // TODO add your handling code here:
        String nomeCurso = txt_Nome_Do_Curso.getText();
        String cargaHoraria = txt_Carga_Horaria_Curso.getText();

        CursoV4 curso = new CursoV4();
        curso.setNome_curso(nomeCurso);
        curso.setCarga_horaria_curso(cargaHoraria);

        try {
            CursoV4DAO dao = new CursoV4DAO();
            dao.atualizar(curso);
            JOptionPane.showMessageDialog(this, "Curso atualizado com sucesso!");
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Erro ao atualizar curso.");
        }

    }//GEN-LAST:event_btn_AtualizarActionPerformed

    private void txt_AttCursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_AttCursosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_AttCursosActionPerformed

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
    private javax.swing.JPanel Main_Frame;
    private javax.swing.JToggleButton btn_Atualizar;
    private javax.swing.JToggleButton btn_Deletar;
    private javax.swing.JToggleButton btn_Inserir;
    private javax.swing.JTextField txt_AttCursos;
    private javax.swing.JTextField txt_Carga_Horaria;
    private javax.swing.JTextField txt_Carga_Horaria_Curso;
    private javax.swing.JTextField txt_Nome_Curso;
    private javax.swing.JTextField txt_Nome_Do_Curso;
    // End of variables declaration//GEN-END:variables
}

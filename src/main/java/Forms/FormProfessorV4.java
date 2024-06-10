/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Forms;

import beans.CursoV4;
import beans.ProfessorV4;
import dao.CursoV4DAO;
import dao.ProfessorV4DAO;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author pedro
 */
public class FormProfessorV4 extends javax.swing.JFrame {

    /**
     * Creates new form FormProfessorV4
     */
    public FormProfessorV4() {
        initComponents();
        this.setSize(960, 600);
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_Atualizar = new javax.swing.JToggleButton();
        btn_Inserir = new javax.swing.JToggleButton();
        btn_voltar = new javax.swing.JToggleButton();
        Label_Nome = new javax.swing.JLabel();
        txt_Nome = new javax.swing.JTextField();
        Label_Email = new javax.swing.JLabel();
        Label_Telefone = new javax.swing.JLabel();
        Label_Endereco1 = new javax.swing.JLabel();
        Label_Senha = new javax.swing.JLabel();
        Label_Curso = new javax.swing.JLabel();
        txt_email = new javax.swing.JTextField();
        txt_Telefone = new javax.swing.JTextField();
        txt_Endereco = new javax.swing.JTextField();
        txt_Senha = new javax.swing.JTextField();
        ComboBox_Curso = new javax.swing.JComboBox();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        btn_Atualizar.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
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
        btn_Atualizar.setBounds(40, 428, 130, 30);

        btn_Inserir.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
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
        btn_Inserir.setBounds(230, 428, 120, 30);

        btn_voltar.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        btn_voltar.setForeground(new java.awt.Color(204, 204, 204));
        btn_voltar.setText(" VOLTAR");
        btn_voltar.setBorder(null);
        btn_voltar.setContentAreaFilled(false);
        btn_voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_voltarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_voltar);
        btn_voltar.setBounds(120, 474, 150, 30);

        Label_Nome.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 15)); // NOI18N
        Label_Nome.setForeground(new java.awt.Color(204, 204, 204));
        Label_Nome.setText("Nome:");
        getContentPane().add(Label_Nome);
        Label_Nome.setBounds(50, 60, 60, 40);

        txt_Nome.setBackground(new java.awt.Color(3, 16, 50));
        txt_Nome.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt_Nome.setForeground(new java.awt.Color(204, 204, 204));
        txt_Nome.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txt_Nome.setMinimumSize(new java.awt.Dimension(30, 40));
        txt_Nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_NomeActionPerformed(evt);
            }
        });
        getContentPane().add(txt_Nome);
        txt_Nome.setBounds(170, 72, 180, 30);

        Label_Email.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 15)); // NOI18N
        Label_Email.setForeground(new java.awt.Color(204, 204, 204));
        Label_Email.setText("Email:");
        getContentPane().add(Label_Email);
        Label_Email.setBounds(50, 118, 50, 40);

        Label_Telefone.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 15)); // NOI18N
        Label_Telefone.setForeground(new java.awt.Color(204, 204, 204));
        Label_Telefone.setText("Telefone:");
        getContentPane().add(Label_Telefone);
        Label_Telefone.setBounds(50, 172, 90, 40);

        Label_Endereco1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 15)); // NOI18N
        Label_Endereco1.setForeground(new java.awt.Color(204, 204, 204));
        Label_Endereco1.setText("Endereço:");
        getContentPane().add(Label_Endereco1);
        Label_Endereco1.setBounds(50, 230, 80, 40);

        Label_Senha.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 15)); // NOI18N
        Label_Senha.setForeground(new java.awt.Color(204, 204, 204));
        Label_Senha.setText("Senha:");
        getContentPane().add(Label_Senha);
        Label_Senha.setBounds(50, 288, 70, 40);

        Label_Curso.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 15)); // NOI18N
        Label_Curso.setForeground(new java.awt.Color(204, 204, 204));
        Label_Curso.setText("Curso:");
        getContentPane().add(Label_Curso);
        Label_Curso.setBounds(50, 343, 70, 40);

        txt_email.setBackground(new java.awt.Color(3, 16, 50));
        txt_email.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt_email.setForeground(new java.awt.Color(204, 204, 204));
        txt_email.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txt_email.setMinimumSize(new java.awt.Dimension(30, 40));
        txt_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_emailActionPerformed(evt);
            }
        });
        getContentPane().add(txt_email);
        txt_email.setBounds(170, 128, 180, 30);

        txt_Telefone.setBackground(new java.awt.Color(3, 16, 50));
        txt_Telefone.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt_Telefone.setForeground(new java.awt.Color(204, 204, 204));
        txt_Telefone.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txt_Telefone.setMinimumSize(new java.awt.Dimension(30, 40));
        txt_Telefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_TelefoneActionPerformed(evt);
            }
        });
        getContentPane().add(txt_Telefone);
        txt_Telefone.setBounds(170, 185, 180, 30);

        txt_Endereco.setBackground(new java.awt.Color(3, 16, 50));
        txt_Endereco.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt_Endereco.setForeground(new java.awt.Color(204, 204, 204));
        txt_Endereco.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txt_Endereco.setMinimumSize(new java.awt.Dimension(30, 40));
        txt_Endereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_EnderecoActionPerformed(evt);
            }
        });
        getContentPane().add(txt_Endereco);
        txt_Endereco.setBounds(170, 242, 180, 30);

        txt_Senha.setBackground(new java.awt.Color(3, 16, 50));
        txt_Senha.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt_Senha.setForeground(new java.awt.Color(204, 204, 204));
        txt_Senha.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txt_Senha.setMinimumSize(new java.awt.Dimension(30, 40));
        txt_Senha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_SenhaActionPerformed(evt);
            }
        });
        getContentPane().add(txt_Senha);
        txt_Senha.setBounds(170, 300, 180, 30);

        ComboBox_Curso.setBackground(new java.awt.Color(3, 16, 50));
        ComboBox_Curso.setForeground(new java.awt.Color(204, 204, 204));
        ComboBox_Curso.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ComboBox_Curso.setMinimumSize(new java.awt.Dimension(62, 30));
        ComboBox_Curso.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                ComboBox_CursoAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        ComboBox_Curso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBox_CursoActionPerformed(evt);
            }
        });
        getContentPane().add(ComboBox_Curso);
        ComboBox_Curso.setBounds(170, 355, 180, 30);

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(23, 27, 80));
        jTextField1.setFont(new java.awt.Font("Century Schoolbook", 1, 36)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(140, 82, 255));
        jTextField1.setText("Bem-vindo Professor");
        jTextField1.setToolTipText("");
        jTextField1.setBorder(null);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(490, 0, 420, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\pedro\\Desktop\\DesignNovo\\Professor.png")); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 950, 560);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_AtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AtualizarActionPerformed
        // TODO add your handling code here:
        String idProfessorStr = JOptionPane.showInputDialog(this, "Informe o ID do professor a ser atualizado:");
        if (idProfessorStr == null || idProfessorStr.isEmpty()) {
            return; // Se o usuário cancelar ou não fornecer o ID, interromper a operação
        }

        try {
            int idProfessor = Integer.parseInt(idProfessorStr);
            ProfessorV4DAO dao = new ProfessorV4DAO();
            ProfessorV4 professor = dao.buscarPorId(idProfessor);

            if (professor == null) {
                JOptionPane.showMessageDialog(this, "Professor não encontrado.");
                return;
            }

            // Solicitar novas informações
            String nomeProfessor = JOptionPane.showInputDialog(this, "Nome do Professor:", professor.getNome_professor());
            String telefoneProfessor = JOptionPane.showInputDialog(this, "Telefone do Professor:", professor.getTelefone_professor());
            String emailProfessor = JOptionPane.showInputDialog(this, "Email do Professor:", professor.getEmail_professor());
            String enderecoProfessor = JOptionPane.showInputDialog(this, "Endereço do Professor:", professor.getEndereco_professor());
            String senhaProfessor = JOptionPane.showInputDialog(this, "Senha:", professor.getSenha_professor());

            // Obtendo o ID do curso selecionado na Combo Box
            int idCursoSelecionado = ComboBox_Curso.getSelectedIndex() + 1;

            // Atualizar o objeto professor com novas informações
            professor.setNome_professor(nomeProfessor);
            professor.setTelefone_professor(telefoneProfessor);
            professor.setEmail_professor(emailProfessor);
            professor.setEndereco_professor(enderecoProfessor);
            professor.setSenha_professor(senhaProfessor);

            // Atualizar no banco de dados
            dao.atualizar(professor, idCursoSelecionado);
            JOptionPane.showMessageDialog(this, "Professor atualizado com sucesso!");

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "ID do professor inválido.");
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Erro ao atualizar professor.");
        }
    }//GEN-LAST:event_btn_AtualizarActionPerformed

    private void btn_InserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_InserirActionPerformed
        // TODO add your handling code here:
        String nomeProfessor = txt_Nome.getText();
        String emailProfessor = txt_email.getText();
        String enderecoProfessor = txt_Endereco.getText();
        String telefoneProfessor = txt_Telefone.getText();
        String senhaProfessor = txt_Senha.getText();

        // Obtendo o ID do curso selecionado na Combo Box
        int idCursoSelecionado = ComboBox_Curso.getSelectedIndex() + 1;

        ProfessorV4 professor = new ProfessorV4();
        professor.setNome_professor(nomeProfessor);
        professor.setEmail_professor(emailProfessor);
        professor.setTelefone_professor(telefoneProfessor);
        professor.setEndereco_professor(enderecoProfessor);
        professor.setSenha_professor(senhaProfessor);

        try {
            ProfessorV4DAO dao = new ProfessorV4DAO();
            dao.inserir(professor, idCursoSelecionado);
            JOptionPane.showMessageDialog(this, "Professor inserido com sucesso!");
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Erro ao inserir Professor.");
        }
    }//GEN-LAST:event_btn_InserirActionPerformed

    private void txt_NomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_NomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_NomeActionPerformed

    private void txt_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_emailActionPerformed

    private void txt_TelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_TelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_TelefoneActionPerformed

    private void txt_EnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_EnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_EnderecoActionPerformed

    private void ComboBox_CursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBox_CursoActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_ComboBox_CursoActionPerformed

    private void ComboBox_CursoAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_ComboBox_CursoAncestorAdded
        // TODO add your handling code here:

        try {
            CursoV4DAO dao = new CursoV4DAO();
            ArrayList<CursoV4> lista = dao.listarCursos();

            ComboBox_Curso.removeAllItems();

            for (CursoV4 c : lista) {
                ComboBox_Curso.addItem(c.getNome_curso());
            }
        } catch (SQLException ex) {
            ex.printStackTrace(); // Print the stack trace to see the details of the exception
            // Handle the exception as per your application's requirements
        }


    }//GEN-LAST:event_ComboBox_CursoAncestorAdded

    private void txt_SenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_SenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_SenhaActionPerformed

    private void btn_voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_voltarActionPerformed
        // TODO add your handling code here:
        FormRegistrar registro = new FormRegistrar();
        registro.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_voltarActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormProfessorV4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormProfessorV4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormProfessorV4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormProfessorV4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormProfessorV4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox ComboBox_Curso;
    private javax.swing.JLabel Label_Curso;
    private javax.swing.JLabel Label_Email;
    private javax.swing.JLabel Label_Endereco1;
    private javax.swing.JLabel Label_Nome;
    private javax.swing.JLabel Label_Senha;
    private javax.swing.JLabel Label_Telefone;
    private javax.swing.JToggleButton btn_Atualizar;
    private javax.swing.JToggleButton btn_Inserir;
    private javax.swing.JToggleButton btn_voltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField txt_Endereco;
    private javax.swing.JTextField txt_Nome;
    private javax.swing.JTextField txt_Senha;
    private javax.swing.JTextField txt_Telefone;
    private javax.swing.JTextField txt_email;
    // End of variables declaration//GEN-END:variables
}

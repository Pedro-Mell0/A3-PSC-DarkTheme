/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Forms;

import beans.CursoV4;
import dao.CursoV4DAO;
import beans.AlunoV4;
import dao.AlunoV4DAO;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.util.ArrayList;

/**
 *
 * @author pedro
 */
public class FormAlunoV4 extends javax.swing.JFrame {

    /**
     * Creates new form AlunoV4
     */
    public FormAlunoV4() {
        initComponents();
        this.setSize(960, 638);
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

        Label_Nome = new javax.swing.JLabel();
        txt_Nome = new javax.swing.JTextField();
        txt_email = new javax.swing.JTextField();
        Label_Email = new javax.swing.JLabel();
        txt_Telefone = new javax.swing.JTextField();
        Label_Telefone = new javax.swing.JLabel();
        txt_Endereco = new javax.swing.JTextField();
        Label_Endereco = new javax.swing.JLabel();
        txt_Data_nascimento = new javax.swing.JTextField();
        Label_DataNasc = new javax.swing.JLabel();
        txt_Nome_responsavel = new javax.swing.JTextField();
        Label_NomeResp = new javax.swing.JLabel();
        txt_Senha = new javax.swing.JTextField();
        Label_Senha = new javax.swing.JLabel();
        Label_Curso = new javax.swing.JLabel();
        ComboBox_Curso = new javax.swing.JComboBox<>();
        btn_Inserir = new javax.swing.JToggleButton();
        btn_Atualizar = new javax.swing.JToggleButton();
        btn_Voltar = new javax.swing.JToggleButton();
        Label_DataNasc1 = new javax.swing.JLabel();
        Label_NomeResp1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        Label_Nome.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 15)); // NOI18N
        Label_Nome.setForeground(new java.awt.Color(204, 204, 204));
        Label_Nome.setText("Nome:");
        getContentPane().add(Label_Nome);
        Label_Nome.setBounds(40, 48, 60, 30);

        txt_Nome.setBackground(new java.awt.Color(3, 16, 50));
        txt_Nome.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt_Nome.setForeground(new java.awt.Color(204, 204, 204));
        txt_Nome.setBorder(null);
        txt_Nome.setMinimumSize(new java.awt.Dimension(30, 40));
        txt_Nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_NomeActionPerformed(evt);
            }
        });
        getContentPane().add(txt_Nome);
        txt_Nome.setBounds(160, 60, 180, 30);

        txt_email.setBackground(new java.awt.Color(3, 16, 50));
        txt_email.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt_email.setForeground(new java.awt.Color(204, 204, 204));
        txt_email.setBorder(null);
        txt_email.setMinimumSize(new java.awt.Dimension(30, 40));
        txt_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_emailActionPerformed(evt);
            }
        });
        getContentPane().add(txt_email);
        txt_email.setBounds(160, 117, 180, 30);

        Label_Email.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 15)); // NOI18N
        Label_Email.setForeground(new java.awt.Color(204, 204, 204));
        Label_Email.setText("Email:");
        getContentPane().add(Label_Email);
        Label_Email.setBounds(40, 105, 60, 30);

        txt_Telefone.setBackground(new java.awt.Color(3, 16, 50));
        txt_Telefone.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt_Telefone.setForeground(new java.awt.Color(204, 204, 204));
        txt_Telefone.setBorder(null);
        txt_Telefone.setMinimumSize(new java.awt.Dimension(30, 40));
        txt_Telefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_TelefoneActionPerformed(evt);
            }
        });
        getContentPane().add(txt_Telefone);
        txt_Telefone.setBounds(160, 173, 180, 30);

        Label_Telefone.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 15)); // NOI18N
        Label_Telefone.setForeground(new java.awt.Color(204, 204, 204));
        Label_Telefone.setText("Telefone:");
        getContentPane().add(Label_Telefone);
        Label_Telefone.setBounds(40, 157, 80, 40);

        txt_Endereco.setBackground(new java.awt.Color(3, 16, 50));
        txt_Endereco.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt_Endereco.setForeground(new java.awt.Color(204, 204, 204));
        txt_Endereco.setBorder(null);
        txt_Endereco.setMinimumSize(new java.awt.Dimension(30, 40));
        txt_Endereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_EnderecoActionPerformed(evt);
            }
        });
        getContentPane().add(txt_Endereco);
        txt_Endereco.setBounds(160, 230, 180, 30);

        Label_Endereco.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 15)); // NOI18N
        Label_Endereco.setForeground(new java.awt.Color(204, 204, 204));
        Label_Endereco.setText("Endereço");
        getContentPane().add(Label_Endereco);
        Label_Endereco.setBounds(40, 218, 90, 30);

        txt_Data_nascimento.setBackground(new java.awt.Color(3, 16, 50));
        txt_Data_nascimento.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt_Data_nascimento.setForeground(new java.awt.Color(204, 204, 204));
        txt_Data_nascimento.setBorder(null);
        txt_Data_nascimento.setMinimumSize(new java.awt.Dimension(30, 40));
        txt_Data_nascimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Data_nascimentoActionPerformed(evt);
            }
        });
        getContentPane().add(txt_Data_nascimento);
        txt_Data_nascimento.setBounds(160, 287, 180, 30);

        Label_DataNasc.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 15)); // NOI18N
        Label_DataNasc.setForeground(new java.awt.Color(204, 204, 204));
        Label_DataNasc.setText("Nascimento:");
        getContentPane().add(Label_DataNasc);
        Label_DataNasc.setBounds(40, 285, 110, 20);

        txt_Nome_responsavel.setBackground(new java.awt.Color(3, 16, 50));
        txt_Nome_responsavel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt_Nome_responsavel.setForeground(new java.awt.Color(204, 204, 204));
        txt_Nome_responsavel.setBorder(null);
        txt_Nome_responsavel.setMinimumSize(new java.awt.Dimension(30, 40));
        txt_Nome_responsavel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Nome_responsavelActionPerformed(evt);
            }
        });
        getContentPane().add(txt_Nome_responsavel);
        txt_Nome_responsavel.setBounds(160, 345, 180, 30);

        Label_NomeResp.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 15)); // NOI18N
        Label_NomeResp.setForeground(new java.awt.Color(204, 204, 204));
        Label_NomeResp.setText("Responsável:");
        getContentPane().add(Label_NomeResp);
        Label_NomeResp.setBounds(40, 343, 110, 20);

        txt_Senha.setBackground(new java.awt.Color(3, 16, 50));
        txt_Senha.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt_Senha.setForeground(new java.awt.Color(204, 204, 204));
        txt_Senha.setBorder(null);
        txt_Senha.setMinimumSize(new java.awt.Dimension(30, 40));
        txt_Senha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_SenhaActionPerformed(evt);
            }
        });
        getContentPane().add(txt_Senha);
        txt_Senha.setBounds(160, 400, 180, 30);

        Label_Senha.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 15)); // NOI18N
        Label_Senha.setForeground(new java.awt.Color(204, 204, 204));
        Label_Senha.setText("Senha:");
        getContentPane().add(Label_Senha);
        Label_Senha.setBounds(40, 393, 60, 20);

        Label_Curso.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 15)); // NOI18N
        Label_Curso.setForeground(new java.awt.Color(204, 204, 204));
        Label_Curso.setText("Curso:");
        getContentPane().add(Label_Curso);
        Label_Curso.setBounds(40, 450, 60, 20);

        ComboBox_Curso.setBackground(new java.awt.Color(3, 16, 50));
        ComboBox_Curso.setForeground(new java.awt.Color(204, 204, 204));
        ComboBox_Curso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
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
        ComboBox_Curso.setBounds(160, 457, 180, 30);

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
        btn_Inserir.setBounds(210, 512, 130, 30);

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
        btn_Atualizar.setBounds(30, 512, 130, 30);

        btn_Voltar.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        btn_Voltar.setForeground(new java.awt.Color(204, 204, 204));
        btn_Voltar.setText("< Voltar");
        btn_Voltar.setBorder(null);
        btn_Voltar.setContentAreaFilled(false);
        btn_Voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_VoltarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Voltar);
        btn_Voltar.setBounds(110, 559, 150, 30);

        Label_DataNasc1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 15)); // NOI18N
        Label_DataNasc1.setForeground(new java.awt.Color(204, 204, 204));
        Label_DataNasc1.setText("Data de");
        getContentPane().add(Label_DataNasc1);
        Label_DataNasc1.setBounds(40, 272, 70, 20);

        Label_NomeResp1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 15)); // NOI18N
        Label_NomeResp1.setForeground(new java.awt.Color(204, 204, 204));
        Label_NomeResp1.setText("Nome do ");
        getContentPane().add(Label_NomeResp1);
        Label_NomeResp1.setBounds(40, 330, 80, 20);

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(23, 27, 80));
        jTextField1.setFont(new java.awt.Font("Century Schoolbook", 1, 36)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(140, 82, 255));
        jTextField1.setText("Bem-vindo Aluno");
        jTextField1.setBorder(null);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(530, 5, 330, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\pedro\\Desktop\\DesignNovo\\FormAlunoDark.png")); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 960, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_NomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_NomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_NomeActionPerformed

    private void txt_TelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_TelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_TelefoneActionPerformed

    private void txt_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_emailActionPerformed

    private void txt_EnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_EnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_EnderecoActionPerformed

    private void txt_Nome_responsavelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Nome_responsavelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Nome_responsavelActionPerformed

    private void txt_Data_nascimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Data_nascimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Data_nascimentoActionPerformed

    private void btn_InserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_InserirActionPerformed
        // TODO add your handling code here:
        String nomeAluno = txt_Nome.getText();
        String email = txt_email.getText();
        String endereco = txt_Endereco.getText();
        String telefone = txt_Telefone.getText();
        String nomeResp = txt_Nome_responsavel.getText();
        String dataNascimento = txt_Data_nascimento.getText();
        String senhaAluno = txt_Senha.getText();
        // Obtendo o ID do curso selecionado na Combo Box
        int idCursoSelecionado = ComboBox_Curso.getSelectedIndex() + 1;

        AlunoV4 aluno = new AlunoV4();
        aluno.setNome_aluno(nomeAluno);
        aluno.setEmail_aluno(email);
        aluno.setNome_responsavel_aluno(nomeResp);
        aluno.setData_nascimento_aluno(dataNascimento);
        aluno.setTelefone_aluno(telefone);
        aluno.setEndereco_aluno(endereco);
        aluno.setSenha_aluno(senhaAluno);

        try {
            AlunoV4DAO dao = new AlunoV4DAO();
            dao.inserir(aluno, idCursoSelecionado);
            JOptionPane.showMessageDialog(this, "Aluno inserido com sucesso!");
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Erro ao inserir Aluno.");
        }
    }//GEN-LAST:event_btn_InserirActionPerformed

    private void btn_AtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AtualizarActionPerformed
        // TODO add your handling code here:
        String raStr = JOptionPane.showInputDialog(this, "Informe o RA do aluno a ser atualizado:");
        if (raStr == null || raStr.isEmpty()) {
            return; // Se o usuário cancelar ou não fornecer o RA, interromper a operação
        }

        try {
            int ra = Integer.parseInt(raStr);
            AlunoV4DAO dao = new AlunoV4DAO();
            AlunoV4 aluno = dao.buscarPorRA(ra);

            if (aluno == null) {
                JOptionPane.showMessageDialog(this, "Aluno não encontrado.");
                return;
            }

            // Solicitar novas informações
            String nomeAluno = JOptionPane.showInputDialog(this, "Nome do aluno:", aluno.getNome_aluno());
            String email = JOptionPane.showInputDialog(this, "Email do aluno:", aluno.getEmail_aluno());
            String telefone = JOptionPane.showInputDialog(this, "Telefone do aluno:", aluno.getTelefone_aluno());
            String dataNascimento = JOptionPane.showInputDialog(this, "Data de Nascimento do aluno:", aluno.getData_nascimento_aluno());
            String endereco = JOptionPane.showInputDialog(this, "Endereço do aluno:", aluno.getEndereco_aluno());
            String nomeResp = JOptionPane.showInputDialog(this, "Nome do responsável:", aluno.getNome_responsavel_aluno());
            String senhaAluno = JOptionPane.showInputDialog(this, "Senha:", aluno.getSenha_aluno());

            // Obtendo o ID do curso selecionado na Combo Box
            int idCursoSelecionado = ComboBox_Curso.getSelectedIndex() + 1;

            // Atualizar o objeto aluno com novas informações
            aluno.setNome_aluno(nomeAluno);
            aluno.setEmail_aluno(email);
            aluno.setTelefone_aluno(telefone);
            aluno.setData_nascimento_aluno(dataNascimento);
            aluno.setEndereco_aluno(endereco);
            aluno.setNome_responsavel_aluno(nomeResp);
            aluno.setSenha_aluno(senhaAluno);

            // Atualizar no banco de dados
            dao.atualizar(aluno, idCursoSelecionado);
            JOptionPane.showMessageDialog(this, "Aluno atualizado com sucesso!");

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "RA inválido.");
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Erro ao atualizar Aluno.");
        }
    }//GEN-LAST:event_btn_AtualizarActionPerformed

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

    private void btn_VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_VoltarActionPerformed
        // TODO add your handling code here:
        FormRegistrar registro = new FormRegistrar();
        registro.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_btn_VoltarActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormAlunoV4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormAlunoV4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormAlunoV4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormAlunoV4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormAlunoV4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBox_Curso;
    private javax.swing.JLabel Label_Curso;
    private javax.swing.JLabel Label_DataNasc;
    private javax.swing.JLabel Label_DataNasc1;
    private javax.swing.JLabel Label_Email;
    private javax.swing.JLabel Label_Endereco;
    private javax.swing.JLabel Label_Nome;
    private javax.swing.JLabel Label_NomeResp;
    private javax.swing.JLabel Label_NomeResp1;
    private javax.swing.JLabel Label_Senha;
    private javax.swing.JLabel Label_Telefone;
    private javax.swing.JToggleButton btn_Atualizar;
    private javax.swing.JToggleButton btn_Inserir;
    private javax.swing.JToggleButton btn_Voltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField txt_Data_nascimento;
    private javax.swing.JTextField txt_Endereco;
    private javax.swing.JTextField txt_Nome;
    private javax.swing.JTextField txt_Nome_responsavel;
    private javax.swing.JTextField txt_Senha;
    private javax.swing.JTextField txt_Telefone;
    private javax.swing.JTextField txt_email;
    // End of variables declaration//GEN-END:variables
}

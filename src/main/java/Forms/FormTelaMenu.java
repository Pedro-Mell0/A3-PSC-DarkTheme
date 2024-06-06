/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Forms;

import Forms.FormADM;
import Forms.FormRegistrar;
import dao.TelaMenuDAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author pedro
 */
public class FormTelaMenu extends javax.swing.JFrame {

    /**
     * Creates new form TelaMenu
     */
    public FormTelaMenu() {
        initComponents();
        this.setTitle("Menu");
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btn_Administrar = new javax.swing.JToggleButton();
        btn_Registrar = new javax.swing.JToggleButton();
        btn_Ok = new javax.swing.JToggleButton();
        txt_email = new javax.swing.JTextField();
        Label_Nome1 = new javax.swing.JLabel();
        Label_Nome2 = new javax.swing.JLabel();
        txt_Senha = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Century Schoolbook", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(140, 82, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Fundação ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(60, 80, 206, 44);

        jLabel2.setFont(new java.awt.Font("Century Schoolbook", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(66, 135, 156));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Arte & Cultura");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 120, 280, 52);

        btn_Administrar.setBackground(new java.awt.Color(94, 23, 235));
        btn_Administrar.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        btn_Administrar.setText("Administrar");
        btn_Administrar.setBorder(null);
        btn_Administrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AdministrarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Administrar);
        btn_Administrar.setBounds(70, 460, 180, 34);

        btn_Registrar.setBackground(new java.awt.Color(94, 23, 235));
        btn_Registrar.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        btn_Registrar.setText("Registrar-se");
        btn_Registrar.setBorder(null);
        btn_Registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Registrar);
        btn_Registrar.setBounds(70, 405, 180, 34);

        btn_Ok.setBackground(new java.awt.Color(94, 23, 235));
        btn_Ok.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        btn_Ok.setText("OK");
        btn_Ok.setBorder(null);
        btn_Ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_OkActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Ok);
        btn_Ok.setBounds(70, 350, 180, 34);

        txt_email.setBackground(new java.awt.Color(255, 255, 255));
        txt_email.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt_email.setBorder(null);
        txt_email.setMinimumSize(new java.awt.Dimension(30, 40));
        txt_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_emailActionPerformed(evt);
            }
        });
        getContentPane().add(txt_email);
        txt_email.setBounds(60, 214, 200, 30);

        Label_Nome1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        Label_Nome1.setText("Email:");
        getContentPane().add(Label_Nome1);
        Label_Nome1.setBounds(60, 180, 70, 20);

        Label_Nome2.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        Label_Nome2.setText("Senha:");
        getContentPane().add(Label_Nome2);
        Label_Nome2.setBounds(60, 260, 70, 21);

        txt_Senha.setBackground(new java.awt.Color(255, 255, 255));
        txt_Senha.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt_Senha.setBorder(null);
        txt_Senha.setMinimumSize(new java.awt.Dimension(30, 40));
        txt_Senha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_SenhaActionPerformed(evt);
            }
        });
        getContentPane().add(txt_Senha);
        txt_Senha.setBounds(60, 293, 200, 30);

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\pedro\\Desktop\\wave Fundação.png")); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 960, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_OkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_OkActionPerformed
        String email = txt_email.getText();
        String senha = txt_Senha.getText(); // Assumindo que você tenha um campo de senha no formulário

        try {
            TelaMenuDAO dao = new TelaMenuDAO();
            String tipoUsuario = dao.verificarEmail(email);

            if (tipoUsuario != null) {
                // Verificar a senha
                boolean senhaCorreta = dao.verificarSenha(email, senha, tipoUsuario);
                if (senhaCorreta) {
                    JOptionPane.showMessageDialog(this, "Login bem-sucedido!");

                    // Abrir a JFrame correta
                    if ("aluno".equals(tipoUsuario)) {
                        // Abra a JFrame específica para alunos
                        FormChecarAluno checar = new FormChecarAluno();
                        checar.setVisible(true);
                    } else if ("professor".equals(tipoUsuario)) {
                        // Abra a JFrame específica para professores

                        FormAtribuirAlunos checar = new FormAtribuirAlunos();
                        checar.setVisible(true);
                    }

                    // Fechar a JFrame atual
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(this, "Senha incorreta. Por favor, tente novamente.");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Email não encontrado. Por favor, verifique e tente novamente.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Erro ao conectar ao banco de dados.");

        }
    }//GEN-LAST:event_btn_OkActionPerformed

    private void btn_RegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RegistrarActionPerformed
        // TODO add your handling code here:
        FormRegistrar registrar = new FormRegistrar();
        registrar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_RegistrarActionPerformed

    private void btn_AdministrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AdministrarActionPerformed
        // TODO add your handling code here:
        FormADM Administrar = new FormADM();
        Administrar.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_btn_AdministrarActionPerformed

    private void txt_SenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_SenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_SenhaActionPerformed

    private void txt_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_emailActionPerformed

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
            java.util.logging.Logger.getLogger(FormTelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormTelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormTelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormTelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormTelaMenu().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Label_Nome1;
    private javax.swing.JLabel Label_Nome2;
    private javax.swing.JToggleButton btn_Administrar;
    private javax.swing.JToggleButton btn_Ok;
    private javax.swing.JToggleButton btn_Registrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txt_Senha;
    private javax.swing.JTextField txt_email;
    // End of variables declaration//GEN-END:variables
}

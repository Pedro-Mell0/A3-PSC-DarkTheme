/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Forms;

import beans.AlunoV4;
import dao.AlunoV4DAO;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author pedro
 */
public class FormPresenca extends javax.swing.JFrame {

    /**
     * Creates new form FormPresenca
     */
    public FormPresenca() {
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

        btn_buscar = new javax.swing.JButton();
        txt_RA = new javax.swing.JTextField();
        Label_RA = new javax.swing.JLabel();
        txt_presenca = new javax.swing.JTextField();
        Label_RA1 = new javax.swing.JLabel();
        btn_Voltar = new javax.swing.JButton();
        Presenças = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        btn_buscar.setFont(new java.awt.Font("Century Schoolbook", 1, 18)); // NOI18N
        btn_buscar.setForeground(new java.awt.Color(204, 204, 204));
        btn_buscar.setText("Buscar");
        btn_buscar.setBorder(null);
        btn_buscar.setContentAreaFilled(false);
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_buscar);
        btn_buscar.setBounds(208, 367, 130, 30);

        txt_RA.setBackground(new java.awt.Color(3, 16, 50));
        txt_RA.setFont(new java.awt.Font("Century Schoolbook", 1, 24)); // NOI18N
        txt_RA.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_RA.setBorder(null);
        getContentPane().add(txt_RA);
        txt_RA.setBounds(170, 230, 160, 30);

        Label_RA.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 15)); // NOI18N
        Label_RA.setForeground(new java.awt.Color(204, 204, 204));
        Label_RA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_RA.setText("RA:");
        getContentPane().add(Label_RA);
        Label_RA.setBounds(50, 203, 106, 40);

        txt_presenca.setEditable(false);
        txt_presenca.setBackground(new java.awt.Color(3, 16, 50));
        txt_presenca.setFont(new java.awt.Font("Century Schoolbook", 1, 24)); // NOI18N
        txt_presenca.setForeground(new java.awt.Color(204, 204, 204));
        txt_presenca.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_presenca.setBorder(null);
        getContentPane().add(txt_presenca);
        txt_presenca.setBounds(170, 303, 160, 30);

        Label_RA1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 15)); // NOI18N
        Label_RA1.setForeground(new java.awt.Color(204, 204, 204));
        Label_RA1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_RA1.setText("Presença:");
        getContentPane().add(Label_RA1);
        Label_RA1.setBounds(50, 274, 106, 40);

        btn_Voltar.setFont(new java.awt.Font("Century Schoolbook", 1, 18)); // NOI18N
        btn_Voltar.setForeground(new java.awt.Color(204, 204, 204));
        btn_Voltar.setText("< VOLTAR");
        btn_Voltar.setBorder(null);
        btn_Voltar.setContentAreaFilled(false);
        btn_Voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_VoltarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Voltar);
        btn_Voltar.setBounds(45, 367, 130, 30);

        Presenças.setEditable(false);
        Presenças.setBackground(new java.awt.Color(23, 27, 80));
        Presenças.setFont(new java.awt.Font("Century Schoolbook", 1, 36)); // NOI18N
        Presenças.setForeground(new java.awt.Color(140, 82, 255));
        Presenças.setText("Presença");
        Presenças.setBorder(null);
        Presenças.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PresençasActionPerformed(evt);
            }
        });
        getContentPane().add(Presenças);
        Presenças.setBounds(115, 110, 180, 50);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\pedro\\Desktop\\DesignNovo\\Presença.png")); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 960, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buscarPresenca(int RA) {
        try {
            AlunoV4DAO dao = new AlunoV4DAO();
            AlunoV4 aluno = dao.buscarPresencaPorRA(RA);

            if (aluno != null) {
                txt_presenca.setText(aluno.getPresenca());
            } else {
                JOptionPane.showMessageDialog(this, "Presença não encontrada para o RA: " + RA);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Erro ao buscar presença: " + ex.getMessage());
        }
    }


    private void btn_VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_VoltarActionPerformed
        // TODO add your handling code here:
        FormChecarAluno checar = new FormChecarAluno();
        checar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_VoltarActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        // TODO add your handling code here:
        String raText = txt_RA.getText().trim();
        if (!raText.isEmpty()) {
            try {
                int ra = Integer.parseInt(raText);
                buscarPresenca(ra);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "RA deve ser um número válido.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, insira um RA.");
        }
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void PresençasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PresençasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PresençasActionPerformed

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
            java.util.logging.Logger.getLogger(FormPresenca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPresenca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPresenca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPresenca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPresenca().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Label_RA;
    private javax.swing.JLabel Label_RA1;
    private javax.swing.JTextField Presenças;
    private javax.swing.JButton btn_Voltar;
    private javax.swing.JButton btn_buscar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txt_RA;
    private javax.swing.JTextField txt_presenca;
    // End of variables declaration//GEN-END:variables
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Forms;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import com.mycompany.db.ConnectionFactory;
import beans.MensalidadeV4;
import dao.MensalidadeV4DAO;


/**
 *
 * @author pedro
 */
public class FormsMensalidadeV4 extends javax.swing.JFrame {

    /**
     * Creates new form MensalidadeV4
     */
    public FormsMensalidadeV4() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_ALUNO = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        txt_Valor = new javax.swing.JTextField();
        txt_DataVencimento = new javax.swing.JTextField();
        txt_DataPagamento = new javax.swing.JTextField();
        txt_DataEmissao = new javax.swing.JTextField();
        Label_Valor = new javax.swing.JLabel();
        Label_DataVencimento = new javax.swing.JLabel();
        Label_DataPagamento = new javax.swing.JLabel();
        Label_DataEmissao = new javax.swing.JLabel();
        txt_MENSALIDADE = new javax.swing.JTextField();
        btn_Atualizar = new javax.swing.JToggleButton();
        btn_Inserir = new javax.swing.JToggleButton();
        btn_Deletar = new javax.swing.JToggleButton();

        txt_ALUNO.setEditable(false);
        txt_ALUNO.setBackground(new java.awt.Color(230, 230, 230));
        txt_ALUNO.setFont(new java.awt.Font("Century Schoolbook", 1, 36)); // NOI18N
        txt_ALUNO.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_ALUNO.setText("ALUNO");
        txt_ALUNO.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txt_ALUNO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ALUNOActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txt_Valor.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt_Valor.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txt_Valor.setMinimumSize(new java.awt.Dimension(30, 40));
        txt_Valor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ValorActionPerformed(evt);
            }
        });

        txt_DataVencimento.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt_DataVencimento.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txt_DataVencimento.setMinimumSize(new java.awt.Dimension(30, 40));
        txt_DataVencimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_DataVencimentoActionPerformed(evt);
            }
        });

        txt_DataPagamento.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt_DataPagamento.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txt_DataPagamento.setMinimumSize(new java.awt.Dimension(30, 40));
        txt_DataPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_DataPagamentoActionPerformed(evt);
            }
        });

        txt_DataEmissao.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt_DataEmissao.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txt_DataEmissao.setMinimumSize(new java.awt.Dimension(30, 40));
        txt_DataEmissao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_DataEmissaoActionPerformed(evt);
            }
        });

        Label_Valor.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Label_Valor.setText("Valor:");
        Label_Valor.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        Label_DataVencimento.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Label_DataVencimento.setText("Data de Vencimento:");
        Label_DataVencimento.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        Label_DataPagamento.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Label_DataPagamento.setText("Data de Pagamento:");
        Label_DataPagamento.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        Label_DataEmissao.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Label_DataEmissao.setText("Data de Emissão:");
        Label_DataEmissao.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Label_Valor, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_Valor, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Label_DataVencimento, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_DataVencimento, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Label_DataPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_DataPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Label_DataEmissao, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_DataEmissao, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_Valor, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Label_Valor, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_DataVencimento, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Label_DataVencimento, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_DataPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Label_DataPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_DataEmissao, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Label_DataEmissao, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        txt_MENSALIDADE.setEditable(false);
        txt_MENSALIDADE.setBackground(new java.awt.Color(230, 230, 230));
        txt_MENSALIDADE.setFont(new java.awt.Font("Century Schoolbook", 1, 36)); // NOI18N
        txt_MENSALIDADE.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_MENSALIDADE.setText("MENSALIDADE");
        txt_MENSALIDADE.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txt_MENSALIDADE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_MENSALIDADEActionPerformed(evt);
            }
        });

        btn_Atualizar.setText("ATUALIZAR");
        btn_Atualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AtualizarActionPerformed(evt);
            }
        });

        btn_Inserir.setText("INSERIR");
        btn_Inserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_InserirActionPerformed(evt);
            }
        });

        btn_Deletar.setText("DELETAR");
        btn_Deletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DeletarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(71, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btn_Atualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(btn_Inserir, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(btn_Deletar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(157, 157, 157))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txt_MENSALIDADE, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(213, 213, 213))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(txt_MENSALIDADE, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Atualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Inserir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Deletar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_ValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ValorActionPerformed

    private void txt_DataVencimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_DataVencimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_DataVencimentoActionPerformed

    private void txt_DataPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_DataPagamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_DataPagamentoActionPerformed

    private void txt_DataEmissaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_DataEmissaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_DataEmissaoActionPerformed

    private void txt_ALUNOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ALUNOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ALUNOActionPerformed

    private void txt_MENSALIDADEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_MENSALIDADEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_MENSALIDADEActionPerformed

    private void btn_AtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AtualizarActionPerformed
        // TODO add your handling code here:
        String Valor = txt_Valor.getText();
        String dataVencimento = txt_DataVencimento.getText();
        String dataEmissao = txt_DataEmissao.getText();
        String dataPagamento = txt_DataPagamento.getText();
       

        MensalidadeV4 mensalidade = new MensalidadeV4();
        mensalidade.setData_emissao(dataEmissao);
        mensalidade.setData_pagamento(dataPagamento);
        mensalidade.setData_vencimento(dataVencimento);
        mensalidade.setValor(Valor);

        try {
            MensalidadeV4DAO dao = new MensalidadeV4DAO();
            dao.atualizar(mensalidade);
            JOptionPane.showMessageDialog(this, "Mensalidade atualizado com sucesso!");
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Erro ao atualizar Mensalidade.");
        }

    }//GEN-LAST:event_btn_AtualizarActionPerformed

    private void btn_InserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_InserirActionPerformed
        // TODO add your handling code here:
        String Valor = txt_Valor.getText();
        String dataVencimento = txt_DataVencimento.getText();
        String dataEmissao = txt_DataEmissao.getText();
        String dataPagamento = txt_DataPagamento.getText();

        MensalidadeV4 mensalidade = new MensalidadeV4();
        
        mensalidade.setData_emissao(dataEmissao);
        mensalidade.setData_pagamento(dataPagamento);
        mensalidade.setData_vencimento(dataVencimento);
        mensalidade.setValor(Valor);

        try {
            MensalidadeV4DAO dao = new MensalidadeV4DAO();
            dao.inserir(mensalidade);
            JOptionPane.showMessageDialog(this, "Mensalidade inserido com sucesso!");
        }catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Erro ao inserir Mensalidade.");
        }
    }//GEN-LAST:event_btn_InserirActionPerformed

    private void btn_DeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DeletarActionPerformed
        // TODO add your handling code here:
        String idMensalidade = JOptionPane.showInputDialog(this, "Insira o id da mensalidade a ser deletado:");

        // Verifica se um valor foi inserido
        if (idMensalidade != null && !idMensalidade.trim().isEmpty()) {
            try {
                MensalidadeV4DAO dao = new MensalidadeV4DAO();
                int id_mensalidade = Integer.parseInt(idMensalidade.trim()); // Converte o RA para inteiro
                dao.deletar(id_mensalidade); // Assume que o método deletar no DAO aceita um RA como inteiro
                JOptionPane.showMessageDialog(this, "Mensalidade deletado com sucesso!");
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Mensalidade inválido. Insira um ID válido.");
            } catch (SQLException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(this, "Erro ao deletar mensalidade.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "ID não inserido.");
        }
    }//GEN-LAST:event_btn_DeletarActionPerformed

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
            java.util.logging.Logger.getLogger(MensalidadeV4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MensalidadeV4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MensalidadeV4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MensalidadeV4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormsMensalidadeV4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Label_DataEmissao;
    private javax.swing.JLabel Label_DataPagamento;
    private javax.swing.JLabel Label_DataVencimento;
    private javax.swing.JLabel Label_Valor;
    private javax.swing.JToggleButton btn_Atualizar;
    private javax.swing.JToggleButton btn_Deletar;
    private javax.swing.JToggleButton btn_Inserir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_ALUNO;
    private javax.swing.JTextField txt_DataEmissao;
    private javax.swing.JTextField txt_DataPagamento;
    private javax.swing.JTextField txt_DataVencimento;
    private javax.swing.JTextField txt_MENSALIDADE;
    private javax.swing.JTextField txt_Valor;
    // End of variables declaration//GEN-END:variables
}

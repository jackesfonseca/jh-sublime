/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.DataBaseControl;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import model.TableModel;

/**
 *
 * @author jackes
 */
public class StateView extends javax.swing.JFrame {

    DataBaseControl dataBaseControl = new DataBaseControl();

    /**
     * Creates new form stateRegister
     */
    public StateView() {
        initComponents();
        dataBaseControl.dataBaseConnect();
        fillTable("select * from state order by id_state");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jRadioButton1 = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldCod = new javax.swing.JTextField();
        jTextFieldName = new javax.swing.JTextField();
        jTextFieldFU = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableState = new javax.swing.JTable();
        jButtonSave = new javax.swing.JButton();
        jButtonNew = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();
        jButtonEdit = new javax.swing.JButton();
        jButtonExit = new javax.swing.JButton();
        jButtonFirst = new javax.swing.JButton();
        jButtonPrevious = new javax.swing.JButton();
        jButtonNext = new javax.swing.JButton();
        jButtonLast = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("JH Sublime");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel2.setText("Código");

        jLabel3.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel3.setText("Estado");

        jLabel4.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel4.setText("Sigla");

        jTextFieldCod.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jTextFieldCod.setEnabled(false);

        jTextFieldName.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jTextFieldName.setEnabled(false);

        jTextFieldFU.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jTextFieldFU.setEnabled(false);

        jTableState.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jTableState.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTableState);

        jButtonSave.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jButtonSave.setText("Salvar");
        jButtonSave.setToolTipText("Salvar o novo estado");
        jButtonSave.setEnabled(false);
        jButtonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveActionPerformed(evt);
            }
        });

        jButtonNew.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jButtonNew.setText("Novo");
        jButtonNew.setToolTipText("Cadastar novo estado");
        jButtonNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNewActionPerformed(evt);
            }
        });

        jButtonDelete.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jButtonDelete.setText("Excluir");
        jButtonDelete.setToolTipText("Excluir cadastro");
        jButtonDelete.setEnabled(false);
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });

        jButtonEdit.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jButtonEdit.setText("Editar");
        jButtonEdit.setToolTipText("Salvar edição feita no cadastro");
        jButtonEdit.setEnabled(false);
        jButtonEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditActionPerformed(evt);
            }
        });

        jButtonExit.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jButtonExit.setText("Sair");
        jButtonExit.setToolTipText("Sair do formulário");
        jButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExitActionPerformed(evt);
            }
        });

        jButtonFirst.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jButtonFirst.setText("<<");
        jButtonFirst.setToolTipText("Exibir primeiro estado cadastrado");
        jButtonFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFirstActionPerformed(evt);
            }
        });

        jButtonPrevious.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jButtonPrevious.setText("<");
        jButtonPrevious.setToolTipText("Exibir estado anterior cadastrado");
        jButtonPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPreviousActionPerformed(evt);
            }
        });

        jButtonNext.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jButtonNext.setText(">");
        jButtonNext.setToolTipText("Exibir próximo estado cadastrado");
        jButtonNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNextActionPerformed(evt);
            }
        });

        jButtonLast.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jButtonLast.setText(">>");
        jButtonLast.setToolTipText("Exibir último estado cadastrado");
        jButtonLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLastActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldCod, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(193, 193, 193)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldFU, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonNew, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonSave, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonPrevious, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonNext, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonLast, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addComponent(jButtonExit, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldCod, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonSave)
                            .addComponent(jButtonNew)
                            .addComponent(jButtonDelete)
                            .addComponent(jButtonEdit)
                            .addComponent(jButtonFirst)
                            .addComponent(jButtonPrevious)
                            .addComponent(jButtonNext)
                            .addComponent(jButtonLast)
                            .addComponent(jButtonExit))
                        .addGap(54, 54, 54)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextFieldFU, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jLabel1.setFont(new java.awt.Font("Ubuntu", 0, 22)); // NOI18N
        jLabel1.setText("Cadastro de Estados");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(329, 329, 329)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(437, 437, 437))
        );

        setSize(new java.awt.Dimension(880, 515));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            PreparedStatement pst = dataBaseControl.conn.prepareStatement("update state set name_state=?, fu_state=? where id_state=?"); //passing sql to insert data
            pst.setString(1, jTextFieldName.getText()); //passing parameters to insert data
            pst.setString(2, jTextFieldFU.getText());
            pst.setInt(3, Integer.parseInt(jTextFieldCod.getText()));
            pst.executeUpdate(); // execute insert
            JOptionPane.showMessageDialog(null, "Alterado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível realizar a alteração!\n ERRO: " + ex.getMessage());
        }
        fillTable("select * from state order by id_state");
    }//GEN-LAST:event_jButtonEditActionPerformed

    private void jButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveActionPerformed
        try {
            // TODO add your handling code here:
            PreparedStatement pst = dataBaseControl.conn.prepareStatement("insert into state (name_state, fu_state)values(?,?)"); //passing sql to insert data
            pst.setString(1, jTextFieldName.getText()); //passing parameters to insert data
            pst.setString(2, jTextFieldFU.getText());
            pst.executeUpdate(); // execute insert
            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível realizar um novo cadastro!\n ERRO: " + ex.getMessage());
        }

        jTextFieldCod.setText("");
        jTextFieldFU.setText("");
        jTextFieldName.setText("");
        jTextFieldName.setEnabled(false);
        jTextFieldFU.setEnabled(false);
        jButtonSave.setEnabled(false);
        jButtonEdit.setEnabled(false);
        jButtonDelete.setEnabled(false);
        jButtonNew.setEnabled(true);
        
        fillTable("select * from state order by id_state");
    }//GEN-LAST:event_jButtonSaveActionPerformed

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        // TODO add your handling code here:
        dataBaseControl.executeSQL("delete from state where fu_state='" + jTextFieldFU.getText() + "'"); //method call to delete data
        JOptionPane.showMessageDialog(null, "Excluído com sucesso!");

        jTextFieldCod.setText("");
        jTextFieldFU.setText("");
        jTextFieldName.setText("");
        jTextFieldName.setEnabled(false);
        jTextFieldFU.setEnabled(false);
        jButtonSave.setEnabled(false);
        jButtonEdit.setEnabled(false);
        jButtonDelete.setEnabled(false);
        jButtonNew.setEnabled(true);
        
        fillTable("select * from state order by id_state");
    }//GEN-LAST:event_jButtonDeleteActionPerformed

    private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButtonExitActionPerformed

    private void jButtonNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNewActionPerformed
        // TODO add your handling code here:
        jTextFieldCod.setText("");
        jTextFieldFU.setText("");
        jTextFieldName.setText("");
        jTextFieldName.setEnabled(true);
        jTextFieldFU.setEnabled(true);
        jButtonSave.setEnabled(true);
        jButtonEdit.setEnabled(true);
        jButtonDelete.setEnabled(true);
        jButtonNew.setEnabled(false);
    }//GEN-LAST:event_jButtonNewActionPerformed

    private void jButtonFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFirstActionPerformed
        // TODO add your handling code here:
        jButtonEdit.setEnabled(true);
        jButtonDelete.setEnabled(true);
        jTextFieldName.setEnabled(true);
        jTextFieldFU.setEnabled(true);

        try {
            dataBaseControl.executeSQL("select * from state");
            dataBaseControl.rs.first();
            jTextFieldCod.setText(String.valueOf(dataBaseControl.rs.getInt("id_state")));
            jTextFieldFU.setText(dataBaseControl.rs.getString("fu_state"));
            jTextFieldName.setText(dataBaseControl.rs.getString("name_state"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível buscar dados!\n ERRO: " + ex.getMessage());
        }
    }//GEN-LAST:event_jButtonFirstActionPerformed

    private void jButtonLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLastActionPerformed
        // TODO add your handling code here:
        jButtonEdit.setEnabled(true);
        jButtonDelete.setEnabled(true);
        jTextFieldName.setEnabled(true);
        jTextFieldFU.setEnabled(true);

        try {
            dataBaseControl.executeSQL("select * from state");
            dataBaseControl.rs.last();
            jTextFieldCod.setText(String.valueOf(dataBaseControl.rs.getInt("id_state")));
            jTextFieldFU.setText(dataBaseControl.rs.getString("fu_state"));
            jTextFieldName.setText(dataBaseControl.rs.getString("name_state"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível buscar dados!\n ERRO: " + ex.getMessage());
        }
    }//GEN-LAST:event_jButtonLastActionPerformed

    private void jButtonPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPreviousActionPerformed
        // TODO add your handling code here:
        jButtonEdit.setEnabled(true);
        jButtonDelete.setEnabled(true);
        jTextFieldName.setEnabled(true);
        jTextFieldFU.setEnabled(true);

        try {
            dataBaseControl.rs.previous();
            jTextFieldCod.setText(String.valueOf(dataBaseControl.rs.getInt("id_state")));
            jTextFieldFU.setText(dataBaseControl.rs.getString("fu_state"));
            jTextFieldName.setText(dataBaseControl.rs.getString("name_state"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível buscar dados!\n ERRO: " + ex.getMessage());
        }
    }//GEN-LAST:event_jButtonPreviousActionPerformed

    private void jButtonNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNextActionPerformed
        // TODO add your handling code here:
        jButtonEdit.setEnabled(true);
        jButtonDelete.setEnabled(true);
        jTextFieldName.setEnabled(true);
        jTextFieldFU.setEnabled(true);

        try {
            dataBaseControl.rs.next();
            jTextFieldCod.setText(String.valueOf(dataBaseControl.rs.getInt("id_state")));
            jTextFieldFU.setText(dataBaseControl.rs.getString("fu_state"));
            jTextFieldName.setText(dataBaseControl.rs.getString("name_state"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível buscar dados!\n ERRO: " + ex.getMessage());
        }
    }//GEN-LAST:event_jButtonNextActionPerformed

    public void fillTable(String SQL) {
        ArrayList data = new ArrayList();

        String[] columns = new String[]{"ID", "Nome", "Sigla"};

        dataBaseControl.executeSQL(SQL);
        try {
            dataBaseControl.rs.first();
            do {
                data.add(new Object[]{dataBaseControl.rs.getInt("id_state"), dataBaseControl.rs.getString("name_state"), dataBaseControl.rs.getString("fu_state")});
            } while (dataBaseControl.rs.next());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível preencher o ArrayList!\n ERRO: " + ex.getMessage());
        }
        
        TableModel tableModel = new TableModel(data, columns);
        jTableState.setModel(tableModel);
        jTableState.getColumnModel().getColumn(0).setPreferredWidth(249);
        jTableState.getColumnModel().getColumn(0).setResizable(false);
        jTableState.getColumnModel().getColumn(1).setPreferredWidth(350);
        jTableState.getColumnModel().getColumn(1).setResizable(false);
        jTableState.getColumnModel().getColumn(2).setPreferredWidth(250);
        jTableState.getColumnModel().getColumn(2).setResizable(false);
        jTableState.getTableHeader().setReorderingAllowed(false);
        jTableState.setAutoResizeMode(jTableState.AUTO_RESIZE_OFF);
        jTableState.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        //jTableState.put("TableHeader.font",new Font("Arial", Font.BOLD, 18) );
   }

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
            java.util.logging.Logger.getLogger(StateView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StateView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StateView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StateView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StateView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonEdit;
    private javax.swing.JButton jButtonExit;
    private javax.swing.JButton jButtonFirst;
    private javax.swing.JButton jButtonLast;
    private javax.swing.JButton jButtonNew;
    private javax.swing.JButton jButtonNext;
    private javax.swing.JButton jButtonPrevious;
    private javax.swing.JButton jButtonSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableState;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextFieldCod;
    private javax.swing.JTextField jTextFieldFU;
    private javax.swing.JTextField jTextFieldName;
    // End of variables declaration//GEN-END:variables
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.CityControl;
import controller.DataBaseControl;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import model.CityModel;
import model.TableModel;

/**
 *
 * @author jackes
 */
public class CityView extends javax.swing.JFrame {
    DataBaseControl dataBaseControlState = new DataBaseControl();
    DataBaseControl dataBaseControlCity = new DataBaseControl(); 
    CityModel city = new CityModel();
    CityControl cityControl = new CityControl();
    DistrictView districtView = new DistrictView();
    Boolean enableEditAction = false;
    
    /**
     * Creates new form CityRegister
     */
    public CityView() {
        initComponents();
        dataBaseControlState.dataBaseConnect();
        dataBaseControlCity.dataBaseConnect();
        dataBaseControlState.executeSQL("select * from state order by name_state");
        fillTable("select * from city inner join state on city.id_state = state.id_state");
        updateComboBox();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCity = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldCod = new javax.swing.JTextField();
        jTextFieldName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jComboBoxState = new javax.swing.JComboBox<>();
        jButtonNew = new javax.swing.JButton();
        jButtonSave = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();
        jButtonEdit = new javax.swing.JButton();
        jButtonFirst = new javax.swing.JButton();
        jButtonPrevious = new javax.swing.JButton();
        jButtonNext = new javax.swing.JButton();
        jButtonLast = new javax.swing.JButton();
        jButtonExit = new javax.swing.JButton();
        jButtonAdd = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTableCity.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jTableCity.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTableCity);

        jLabel2.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel2.setText("C??digo");

        jLabel3.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel3.setText("Cidade");

        jTextFieldCod.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jTextFieldCod.setEnabled(false);

        jTextFieldName.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jTextFieldName.setEnabled(false);

        jLabel4.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel4.setText("Estado");

        jComboBoxState.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jComboBoxState.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxState.setEnabled(false);

        jButtonNew.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jButtonNew.setText("Novo");
        jButtonNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNewActionPerformed(evt);
            }
        });

        jButtonSave.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jButtonSave.setText("Salvar");
        jButtonSave.setEnabled(false);
        jButtonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveActionPerformed(evt);
            }
        });

        jButtonDelete.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jButtonDelete.setText("Excluir");
        jButtonDelete.setEnabled(false);
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });

        jButtonEdit.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jButtonEdit.setText("Editar");
        jButtonEdit.setEnabled(false);
        jButtonEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditActionPerformed(evt);
            }
        });

        jButtonFirst.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jButtonFirst.setText("<<");
        jButtonFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFirstActionPerformed(evt);
            }
        });

        jButtonPrevious.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jButtonPrevious.setText("<");
        jButtonPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPreviousActionPerformed(evt);
            }
        });

        jButtonNext.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jButtonNext.setText(">");
        jButtonNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNextActionPerformed(evt);
            }
        });

        jButtonLast.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jButtonLast.setText(">>");
        jButtonLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLastActionPerformed(evt);
            }
        });

        jButtonExit.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jButtonExit.setText("Sair");
        jButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExitActionPerformed(evt);
            }
        });

        jButtonAdd.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jButtonAdd.setText("+");
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonNew, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jButtonSave, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonPrevious, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonNext, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxState, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonLast, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonExit, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldCod, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(651, 651, 651)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldCod, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBoxState, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAdd))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNew)
                    .addComponent(jButtonSave)
                    .addComponent(jButtonDelete)
                    .addComponent(jButtonEdit)
                    .addComponent(jButtonFirst)
                    .addComponent(jButtonPrevious)
                    .addComponent(jButtonNext)
                    .addComponent(jButtonLast)
                    .addComponent(jButtonExit))
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Ubuntu", 0, 22)); // NOI18N
        jLabel1.setText("Cadastro de Cidades");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(336, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(331, 331, 331))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(880, 515));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNewActionPerformed
        // TODO add your handling code here:
        jTextFieldCod.setText("");
        jTextFieldName.setText("");
        jTextFieldName.setEnabled(true);
        jButtonNew.setEnabled(false);
        jButtonSave.setEnabled(true);
        jButtonDelete.setEnabled(false);
        jButtonEdit.setEnabled(false);
        jComboBoxState.setEnabled(true);
    }//GEN-LAST:event_jButtonNewActionPerformed

    private void jButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveActionPerformed

        if(!enableEditAction){
            try {
                city.setName(jTextFieldName.getText());
                dataBaseControlState.executeSQL("select * from state where name_state='" + jComboBoxState.getSelectedItem() + "'");
                dataBaseControlState.rs.first();
                city.setCodState(dataBaseControlState.rs.getInt("id_state"));
            
                cityControl.insert(city);      
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "N??o foi poss??vel realizar um novo cadastro!\n ERRO: " + ex.getMessage());
            }
        } else {
            try{
            city.setCod(Integer.parseInt(jTextFieldCod.getText()));
            city.setName(jTextFieldName.getText());
            dataBaseControlCity.executeSQL("select * from state where name_state='" + jComboBoxState.getSelectedItem() + "'");
            dataBaseControlCity.rs.first();
            city.setCodState(dataBaseControlCity.rs.getInt("id_state"));
            
            cityControl.edit(city);
            
            enableEditAction = false;
            
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "N??o foi poss??vel realizar a altera????o!\n ERRO: " + ex.getMessage());
            }   
          
        }
        
        jTextFieldCod.setText("");
        jTextFieldName.setText("");
        jTextFieldName.setEnabled(false);
        jButtonNew.setEnabled(true);
        jButtonSave.setEnabled(false);
        jButtonDelete.setEnabled(false);
        jButtonEdit.setEnabled(false);
        jComboBoxState.setEnabled(false);
        
        districtView.updateComboBox();
        fillTable("select * from city inner join state on city.id_state = state.id_state");
    }//GEN-LAST:event_jButtonSaveActionPerformed

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
         try {
            city.setCod(Integer.parseInt(jTextFieldCod.getText()));
            city.setName(jTextFieldName.getText());
            dataBaseControlCity.rs.getInt("id_state");
            
            cityControl.delete(city);
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "N??o foi poss??vel excluir o cadastro!\n ERRO: " + ex.getMessage());
        }
        
        
        jTextFieldCod.setText("");
        jTextFieldName.setText("");
        jTextFieldName.setEnabled(false);
        jButtonNew.setEnabled(true);
        jButtonSave.setEnabled(false);
        jButtonDelete.setEnabled(false);
        jButtonEdit.setEnabled(false);
        jComboBoxState.setEnabled(false);
        
        fillTable("select * from city inner join state on city.id_state = state.id_state");
    }//GEN-LAST:event_jButtonDeleteActionPerformed

    private void jButtonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditActionPerformed
        // TODO add your handling code here:
        enableEditAction = true;
        
        jButtonSave.setEnabled(true);
        jButtonEdit.setEnabled(false);
        jButtonNew.setEnabled(true);
        jTextFieldName.setEnabled(true);
        jComboBoxState.setEnabled(true);
    }//GEN-LAST:event_jButtonEditActionPerformed

    private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButtonExitActionPerformed

    private void jButtonFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFirstActionPerformed
        try {
            // TODO add your handling code here:
            dataBaseControlCity.executeSQL("select * from city order by id_city");
            dataBaseControlCity.rs.first();
            jTextFieldCod.setText(String.valueOf(dataBaseControlCity.rs.getInt("id_city")));
            jTextFieldName.setText(dataBaseControlCity.rs.getString("name_city"));
            dataBaseControlState.executeSQL("select * from state where id_state=" + dataBaseControlCity.rs.getInt("id_state"));
            dataBaseControlState.rs.first();
            jComboBoxState.setSelectedItem(dataBaseControlState.rs.getString("name_state"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "N??o foi poss??vel buscar dados!\n ERRO: " + ex.getMessage());
        }
       
        jTextFieldName.setEnabled(false);
        jButtonNew.setEnabled(true);
        jButtonDelete.setEnabled(true);
        jButtonEdit.setEnabled(true);
        jButtonSave.setEnabled(false);
        jComboBoxState.setEnabled(false);
    }//GEN-LAST:event_jButtonFirstActionPerformed

    private void jButtonPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPreviousActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            //dataBaseControlCity.executeSQL("select * from city order by id_city");
            dataBaseControlCity.rs.previous();
            jTextFieldCod.setText(String.valueOf(dataBaseControlCity.rs.getInt("id_city")));
            jTextFieldName.setText(dataBaseControlCity.rs.getString("name_city"));
            dataBaseControlState.executeSQL("select * from state where id_state=" + dataBaseControlCity.rs.getInt("id_state"));
            dataBaseControlState.rs.first();
            jComboBoxState.setSelectedItem(dataBaseControlState.rs.getString("name_state"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "N??o foi poss??vel buscar dados!\n ERRO: " + ex.getMessage());
        }
       
        jTextFieldName.setEnabled(false);
        jButtonNew.setEnabled(true);
        jButtonDelete.setEnabled(true);
        jButtonEdit.setEnabled(true);
        jButtonSave.setEnabled(false);
        jComboBoxState.setEnabled(false);
    }//GEN-LAST:event_jButtonPreviousActionPerformed

    private void jButtonNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNextActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            //dataBaseControlCity.executeSQL("select * from city order by id_city");
            dataBaseControlCity.rs.next();
            jTextFieldCod.setText(String.valueOf(dataBaseControlCity.rs.getInt("id_city")));
            jTextFieldName.setText(dataBaseControlCity.rs.getString("name_city"));
            dataBaseControlState.executeSQL("select * from state where id_state=" + dataBaseControlCity.rs.getInt("id_state"));
            dataBaseControlState.rs.first();
            jComboBoxState.setSelectedItem(dataBaseControlState.rs.getString("name_state"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "N??o foi poss??vel buscar dados!\n ERRO: " + ex.getMessage());
        }
       
        jTextFieldName.setEnabled(false);
        jButtonNew.setEnabled(true);
        jButtonDelete.setEnabled(true);
        jButtonEdit.setEnabled(true);
        jButtonSave.setEnabled(false);
        jComboBoxState.setEnabled(false);
    }//GEN-LAST:event_jButtonNextActionPerformed

    private void jButtonLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLastActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            dataBaseControlCity.executeSQL("select * from city order by id_city");
            dataBaseControlCity.rs.last();
            jTextFieldCod.setText(String.valueOf(dataBaseControlCity.rs.getInt("id_city")));
            jTextFieldName.setText(dataBaseControlCity.rs.getString("name_city"));
            dataBaseControlState.executeSQL("select * from state where id_state=" + dataBaseControlCity.rs.getInt("id_state"));
            dataBaseControlState.rs.first();
            jComboBoxState.setSelectedItem(dataBaseControlState.rs.getString("name_state"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "N??o foi poss??vel buscar dados!\n ERRO: " + ex.getMessage());
        }
       
        jTextFieldName.setEnabled(false);
        jButtonNew.setEnabled(true);
        jButtonDelete.setEnabled(true);
        jButtonEdit.setEnabled(true);
        jButtonSave.setEnabled(false);
        jComboBoxState.setEnabled(false);
    }//GEN-LAST:event_jButtonLastActionPerformed

    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed
        // TODO add your handling code here:
        StateView stateView = new StateView();
        stateView.setVisible(true);
        updateComboBox();
    }//GEN-LAST:event_jButtonAddActionPerformed

    public void fillTable(String SQL) {
        //DataBaseControl dataBaseControl = new DataBaseControl();
        
        ArrayList data = new ArrayList();

        String[] columns = new String[]{"ID", "Cidade", "Estado"};

        dataBaseControlCity.executeSQL(SQL);
        try {
            dataBaseControlCity.rs.first();
            do {
                data.add(new Object[]{dataBaseControlCity.rs.getInt("id_city"), dataBaseControlCity.rs.getString("name_city"), dataBaseControlCity.rs.getString("fu_state")});
            } while (dataBaseControlCity.rs.next());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "N??o foi poss??vel preencher o ArrayList!\n ERRO: " + ex.getMessage());
        }
        
        TableModel tableModel = new TableModel(data, columns);
        jTableCity.setModel(tableModel);
        jTableCity.getColumnModel().getColumn(0).setPreferredWidth(240);
        jTableCity.getColumnModel().getColumn(0).setResizable(false);
        jTableCity.getColumnModel().getColumn(1).setPreferredWidth(345);
        jTableCity.getColumnModel().getColumn(1).setResizable(false);
        jTableCity.getColumnModel().getColumn(2).setPreferredWidth(240);
        jTableCity.getColumnModel().getColumn(2).setResizable(false);
        jTableCity.getTableHeader().setReorderingAllowed(false);
        jTableCity.setAutoResizeMode(jTableCity.AUTO_RESIZE_OFF);
        jTableCity.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        //jTableState.put("TableHeader.font",new Font("Arial", Font.BOLD, 18) );
   }
    
   public void updateComboBox() {
        jComboBoxState.removeAllItems();
        try {
            dataBaseControlState.rs.first();
            do {
                jComboBoxState.addItem(dataBaseControlState.rs.getString("name_state"));
            } while(dataBaseControlState.rs.next());
        } catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, "N??o foi poss??vel preencher comboBox estado!\n ERRO: " + ex.getMessage());
        } 
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
            java.util.logging.Logger.getLogger(CityView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CityView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CityView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CityView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CityView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonEdit;
    private javax.swing.JButton jButtonExit;
    private javax.swing.JButton jButtonFirst;
    private javax.swing.JButton jButtonLast;
    private javax.swing.JButton jButtonNew;
    private javax.swing.JButton jButtonNext;
    private javax.swing.JButton jButtonPrevious;
    private javax.swing.JButton jButtonSave;
    private javax.swing.JComboBox<String> jComboBoxState;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableCity;
    private javax.swing.JTextField jTextFieldCod;
    private javax.swing.JTextField jTextFieldName;
    // End of variables declaration//GEN-END:variables
}

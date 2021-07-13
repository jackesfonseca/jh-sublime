/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.DataBaseControl;
import controller.DistrictControl;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import model.DistrictModel;
import model.TableModel;

/**
 *
 * @author jackes
 */
public class DistrictView extends javax.swing.JFrame {
    DataBaseControl dataBaseControlDistrict = new DataBaseControl();
    DataBaseControl dataBaseControlCity = new DataBaseControl();
    DistrictModel district = new DistrictModel();
    DistrictControl districtControl = new DistrictControl();
    
    
    
    /**
     * Creates new form DistrictView
     */
    public DistrictView() {
        initComponents();
        dataBaseControlDistrict.dataBaseConnect();
        dataBaseControlCity.dataBaseConnect();
        dataBaseControlCity.executeSQL("select * from city order by name_city");
        fillTable("select * from district inner join city on district.id_city = city.id_city");
        jComboBoxCity.removeAllItems();
        try {
            dataBaseControlCity.rs.first();
            do {
                jComboBoxCity.addItem(dataBaseControlCity.rs.getString("name_city"));
            } while(dataBaseControlCity.rs.next());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível preencher comboBox estado!\n ERRO: " + ex.getMessage());
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldCod = new javax.swing.JTextField();
        jTextFieldName = new javax.swing.JTextField();
        jComboBoxCity = new javax.swing.JComboBox<>();
        jButtonNew = new javax.swing.JButton();
        jButtonSave = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();
        jButtonEdit = new javax.swing.JButton();
        jButtonFirst = new javax.swing.JButton();
        jButtonPrevious = new javax.swing.JButton();
        jButtonNext = new javax.swing.JButton();
        jButtonLast = new javax.swing.JButton();
        jButtonExit = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableDistrict = new javax.swing.JTable();
        jButtonAdd = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel2.setText("Código");

        jLabel3.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel3.setText("Bairro");

        jLabel4.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel4.setText("Cidade");

        jTextFieldCod.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jTextFieldCod.setEnabled(false);

        jTextFieldName.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jTextFieldName.setEnabled(false);

        jComboBoxCity.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jComboBoxCity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxCity.setEnabled(false);

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

        jTableDistrict.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jTableDistrict.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jTableDistrict);

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
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jComboBoxCity, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jButtonNew, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jButtonSave, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jButtonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jButtonEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jButtonFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jButtonPrevious, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jButtonNext, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldCod, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonLast, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonExit, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldCod, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBoxCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAdd))
                .addGap(39, 39, 39)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel1.setFont(new java.awt.Font("Ubuntu", 0, 22)); // NOI18N
        jLabel1.setText("Cadastro de bairro");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(326, 326, 326)
                .addComponent(jLabel1)
                .addContainerGap(361, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(8, 8, 8)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(880, 529));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNewActionPerformed
        // TODO add your handling code here:
        jTextFieldCod.setText("");
        jTextFieldName.setText("");
        jTextFieldName.setEnabled(true);
        jButtonNew.setEnabled(false);
        jButtonSave.setEnabled(true);
        jComboBoxCity.setEnabled(true);
    }//GEN-LAST:event_jButtonNewActionPerformed

    private void jButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveActionPerformed
        // TODO add your handling code here:
        try {
            district.setName(jTextFieldName.getText());
            dataBaseControlCity.executeSQL("select * from city where name_city='" + jComboBoxCity.getSelectedItem() + "'");
            dataBaseControlCity.rs.first();
            district.setCodCity(dataBaseControlCity.rs.getInt("id_city"));
            
            districtControl.insert(district);      
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível realizar um novo cadastro!\n ERRO: " + ex.getMessage());
        }
        
        jTextFieldCod.setText("");
        jTextFieldName.setText("");
        jTextFieldName.setEnabled(false);
        jButtonNew.setEnabled(true);
        jButtonSave.setEnabled(false);
        jButtonDelete.setEnabled(false);
        jButtonEdit.setEnabled(false);
        jComboBoxCity.setEnabled(false);
        
        fillTable("select * from district inner join city on district.id_city = city.id_city");
    }//GEN-LAST:event_jButtonSaveActionPerformed

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        // TODO add your handling code here:
        try {
            dataBaseControlDistrict.rs.getInt("id_city");
            district.setCod(Integer.parseInt(jTextFieldCod.getText()));
            district.setName(jTextFieldName.getText());
            
            districtControl.delete(district);
            
            } catch (SQLException ex) {     
            JOptionPane.showMessageDialog(null, "Não foi possível excluir o cadastro!\n ERRO: " + ex.getMessage());
        }
        
        jTextFieldCod.setText("");
        jTextFieldName.setText("");
        jTextFieldName.setEnabled(false);
        jButtonNew.setEnabled(true);
        jButtonSave.setEnabled(false);
        jButtonDelete.setEnabled(false);
        jButtonEdit.setEnabled(false);
        jComboBoxCity.setEnabled(false);
        
        fillTable("select * from district inner join city on district.id_city = city.id_city");
    }//GEN-LAST:event_jButtonDeleteActionPerformed

    private void jButtonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditActionPerformed
        // TODO add your handling code here:
        try{
            district.setCod(Integer.parseInt(jTextFieldCod.getText()));
            district.setName(jTextFieldName.getText());
            dataBaseControlDistrict.executeSQL("select * from city where name_city='" + jComboBoxCity.getSelectedItem() + "'");
            dataBaseControlDistrict.rs.first();
            district.setCodCity(dataBaseControlDistrict.rs.getInt("id_city"));
            
            districtControl.edit(district);
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível realizar a alteração!\n ERRO: " + ex.getMessage());
        }
        
        fillTable("select * from district inner join city on district.id_city = city.id_city");    
    }//GEN-LAST:event_jButtonEditActionPerformed

    private void jButtonFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFirstActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            dataBaseControlDistrict.executeSQL("select * from district order by id_district");
            dataBaseControlDistrict.rs.first();
            jTextFieldCod.setText(String.valueOf(dataBaseControlDistrict.rs.getInt("id_district")));
            jTextFieldName.setText(dataBaseControlDistrict.rs.getString("name_district"));
            dataBaseControlCity.executeSQL("select * from city where id_city=" + dataBaseControlDistrict.rs.getInt("id_city"));
            dataBaseControlCity.rs.first();
            jComboBoxCity.setSelectedItem(dataBaseControlCity.rs.getString("name_city"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível buscar dados!\n ERRO: " + ex.getMessage());
        }
       
        jTextFieldName.setEnabled(true);
        jButtonNew.setEnabled(true);
        jButtonDelete.setEnabled(true);
        jButtonEdit.setEnabled(true);
        jButtonSave.setEnabled(false);
        jComboBoxCity.setEnabled(true);
    }//GEN-LAST:event_jButtonFirstActionPerformed

    private void jButtonPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPreviousActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            //dataBaseControlDistrict.executeSQL("select * from district order by id_district");
            dataBaseControlDistrict.rs.previous();
            jTextFieldCod.setText(String.valueOf(dataBaseControlDistrict.rs.getInt("id_district")));
            jTextFieldName.setText(dataBaseControlDistrict.rs.getString("name_district"));
            dataBaseControlCity.executeSQL("select * from city where id_city=" + dataBaseControlDistrict.rs.getInt("id_city"));
            dataBaseControlCity.rs.first();
            jComboBoxCity.setSelectedItem(dataBaseControlCity.rs.getString("name_city"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível buscar dados!\n ERRO: " + ex.getMessage());
        }
       
        jTextFieldName.setEnabled(true);
        jButtonNew.setEnabled(true);
        jButtonDelete.setEnabled(true);
        jButtonEdit.setEnabled(true);
        jButtonSave.setEnabled(false);
        jComboBoxCity.setEnabled(true);
    }//GEN-LAST:event_jButtonPreviousActionPerformed

    private void jButtonNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNextActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            //dataBaseControlDistrict.executeSQL("select * from district order by id_district");
            dataBaseControlDistrict.rs.next();
            jTextFieldCod.setText(String.valueOf(dataBaseControlDistrict.rs.getInt("id_district")));
            jTextFieldName.setText(dataBaseControlDistrict.rs.getString("name_district"));
            dataBaseControlCity.executeSQL("select * from city where id_city=" + dataBaseControlDistrict.rs.getInt("id_city"));
            dataBaseControlCity.rs.first();
            jComboBoxCity.setSelectedItem(dataBaseControlCity.rs.getString("name_city"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível buscar dados!\n ERRO: " + ex.getMessage());
        }
       
        jTextFieldName.setEnabled(true);
        jButtonNew.setEnabled(true);
        jButtonDelete.setEnabled(true);
        jButtonEdit.setEnabled(true);
        jButtonSave.setEnabled(false);
        jComboBoxCity.setEnabled(true);
    }//GEN-LAST:event_jButtonNextActionPerformed

    private void jButtonLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLastActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            dataBaseControlDistrict.executeSQL("select * from district order by id_district");
            dataBaseControlDistrict.rs.last();
            jTextFieldCod.setText(String.valueOf(dataBaseControlDistrict.rs.getInt("id_district")));
            jTextFieldName.setText(dataBaseControlDistrict.rs.getString("name_district"));
            dataBaseControlCity.executeSQL("select * from city where id_city=" + dataBaseControlDistrict.rs.getInt("id_city"));
            dataBaseControlCity.rs.first();
            jComboBoxCity.setSelectedItem(dataBaseControlCity.rs.getString("name_city"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível buscar dados!\n ERRO: " + ex.getMessage());
        }
       
        jTextFieldName.setEnabled(true);
        jButtonNew.setEnabled(true);
        jButtonDelete.setEnabled(true);
        jButtonEdit.setEnabled(true);
        jButtonSave.setEnabled(false);
        jComboBoxCity.setEnabled(true);
    }//GEN-LAST:event_jButtonLastActionPerformed

    private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButtonExitActionPerformed

    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed
        // TODO add your handling code here:
        CityView cityView = new CityView();  
        cityView.setVisible(true);
    }//GEN-LAST:event_jButtonAddActionPerformed

    public void fillTable(String SQL) {
        //DataBaseControl dataBaseControl = new DataBaseControl();
        
        ArrayList data = new ArrayList();

        String[] columns = new String[]{"ID", "Bairro", "Cidade"};

        dataBaseControlDistrict.executeSQL(SQL);
        try {
            dataBaseControlDistrict.rs.first();
            do {
                data.add(new Object[]{dataBaseControlDistrict.rs.getInt("id_district"), dataBaseControlDistrict.rs.getString("name_district"), dataBaseControlDistrict.rs.getString("name_city")});
            } while (dataBaseControlDistrict.rs.next());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível preencher o ArrayList!\n ERRO: " + ex.getMessage());
        }
        
        TableModel tableModel = new TableModel(data, columns);
        jTableDistrict.setModel(tableModel);
        jTableDistrict.getColumnModel().getColumn(0).setPreferredWidth(240);
        jTableDistrict.getColumnModel().getColumn(0).setResizable(false);
        jTableDistrict.getColumnModel().getColumn(1).setPreferredWidth(345);
        jTableDistrict.getColumnModel().getColumn(1).setResizable(false);
        jTableDistrict.getColumnModel().getColumn(2).setPreferredWidth(240);
        jTableDistrict.getColumnModel().getColumn(2).setResizable(false);
        jTableDistrict.getTableHeader().setReorderingAllowed(false);
        jTableDistrict.setAutoResizeMode(jTableDistrict.AUTO_RESIZE_OFF);
        jTableDistrict.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
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
            java.util.logging.Logger.getLogger(DistrictView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DistrictView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DistrictView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DistrictView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DistrictView().setVisible(true);
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
    private javax.swing.JComboBox<String> jComboBoxCity;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTableDistrict;
    private javax.swing.JTextField jTextFieldCod;
    private javax.swing.JTextField jTextFieldName;
    // End of variables declaration//GEN-END:variables
}

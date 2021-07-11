/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.StateModel;

/**
 *
 * @author jackes
 */
public class StateControl {
    DataBaseControl dataBaseControl = new DataBaseControl();
    
    public void insert(StateModel state) {
        dataBaseControl.dataBaseConnect();
        
        try {
            // TODO add your handling code here:
            PreparedStatement pst = dataBaseControl.conn.prepareStatement("insert into state (name_state, fu_state)values(?,?)"); //passing sql to insert data
            pst.setString(1, state.getName()); //passing parameters to insert data
            pst.setString(2, state.getFU());
            pst.executeUpdate(); // execute insert
            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível realizar um novo cadastro!\n" + ex.getMessage());
        }
    }
    
    public void delete(StateModel state) {
        dataBaseControl.dataBaseConnect();
        
        dataBaseControl.executeSQL("delete from state where fu_state='" + state.getFU() + "'"); //method call to delete data
        JOptionPane.showMessageDialog(null, "Excluído com sucesso!");
        
        dataBaseControl.dataBaseDisconnect();
    }
    
    public void edit(StateModel state) {
        dataBaseControl.dataBaseConnect();
        
        try {
            // TODO add your handling code here:
            PreparedStatement pst = dataBaseControl.conn.prepareStatement("update state set name_state=?, fu_state=? where id_state=?"); //passing sql to insert data
            pst.setString(1, state.getName()); //passing parameters to insert data
            pst.setString(2, state.getFU());
            pst.setInt(3, state.getCod());
            pst.executeUpdate(); // execute insert
            JOptionPane.showMessageDialog(null, "Alterado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível realizar a alteração!\n ERRO: " + ex.getMessage());
        }
    }
    
}

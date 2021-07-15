/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.TelephoneModel;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author jackes
 */
public class TelephoneControl {
    DataBaseControl dataBaseControl = new DataBaseControl();
    
    public void insert(TelephoneModel telephone) {
        dataBaseControl.dataBaseConnect();
        
        try {
            PreparedStatement pst = dataBaseControl.conn.prepareStatement("insert into telephone(number_telephone) values(?)");
            pst.setString(1, telephone.getTelephoneNumber());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível realizar um novo cadastro!\n ERRO: " + ex.getMessage());
        }
        
        dataBaseControl.dataBaseDisconnect();
    }
    
    public void delete(TelephoneModel telephone) {
        dataBaseControl.dataBaseConnect();
        
        try {
            PreparedStatement pst = dataBaseControl.conn.prepareStatement("delete from telephone where id_telephone=?");
            pst.setInt(1, telephone.getCod());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Excluído com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível excluir o cadastro!\n ERRO: " + ex.getMessage());
        }
        
        dataBaseControl.dataBaseDisconnect();
    }
    
    public void edit(TelephoneModel telephone) {
        dataBaseControl.dataBaseConnect();
        
        try {
            PreparedStatement pst = dataBaseControl.conn.prepareStatement("update telephone set number_telephone=? where id_telephone=?");
            pst.setString(1, telephone.getTelephoneNumber());
            pst.setInt(2, telephone.getCod());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Alterado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível realizar a alteração!\n ERRO: " + ex.getMessage());
        }
        
        dataBaseControl.dataBaseDisconnect();
    }
}

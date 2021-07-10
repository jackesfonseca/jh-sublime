/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.CityModel;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author jackes
 */
public class CityControl {
    DataBaseControl dataBaseControl = new DataBaseControl();
    
    public void insert(CityModel city) {
        try {
            dataBaseControl.dataBaseConnect();
            PreparedStatement pst = dataBaseControl.conn.prepareStatement("insert into city(name_city, id_state) values(?,?)");
            pst.setString(1, city.getName());
            pst.setInt(2, city.getCodState());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível realizar um novo cadastro!\n ERRO: " + ex.getMessage());
        }
       
    }
}

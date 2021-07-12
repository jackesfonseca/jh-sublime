/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.DistrictModel;

/**
 *
 * @author jackes
 */
public class DistrictControl {
    DataBaseControl dataBaseControl = new DataBaseControl();
    
    public void insert(DistrictModel district) {
        dataBaseControl.dataBaseConnect();
        try {
            
            PreparedStatement pst = dataBaseControl.conn.prepareStatement("insert into district(name_district, id_city) values(?,?)");
            pst.setString(1, district.getName());
            pst.setInt(2, district.getCodCity());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível realizar um novo cadastro!\n ERRO: " + ex.getMessage());
        }
       dataBaseControl.dataBaseDisconnect();
    }
}

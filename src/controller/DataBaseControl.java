/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author jackes
 */

public class DataBaseControl {
    public Statement stm;  // Prepare and research on DataBase
    public ResultSet rs;   // Storage the research result
    private String driver = "org.postgresql.Driver";    // Identify what DataBase is being used
    private String path = "jdbc:postgresql://localhost:5432/jh-sublime";    // Path where is located the connection with the DataBase
    private String user = "postgres";
    private String password = "pzus1717";
    public Connection conn; // Establish the connection with DataBase
    
    public void dataBaseConnect() {
        try {
            System.setProperty("jdbc.Drivers", driver); // Sets the driver connection property
            conn = DriverManager.getConnection(path, user, password);   // Establish the connection with Database
            //JOptionPane.showMessageDialog(null, "Conectado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Falha ao conectar com o banco de dados!\n Erro: " + ex.getMessage());
        }
        
    }
    
    public void dataBaseDisconnect() {
        try {
            conn.close();
            JOptionPane.showMessageDialog(null, "Desconectado com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Falha ao desconectar com o banco de dados!\n Erro: " + ex.getMessage());
        }
    }
    
}

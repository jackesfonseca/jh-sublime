/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.swing.JOptionPane;
import model.CityModel;

/**
 *
 * @author jackes
 */
public class CityControl {
    public void insert(CityModel city) {
        JOptionPane.showMessageDialog(null, city.getName());
    }
}

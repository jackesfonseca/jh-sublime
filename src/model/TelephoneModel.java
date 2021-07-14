/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author jackes
 */
public class TelephoneModel {
    private int cod;
    private String telephoneNumber;
    
    /**
     * 
     * @return 
     */
    public int getCod() {
        return cod;
    }
    
    /**
     * 
     * @param cod 
     */
    public void setCod(int cod) {
        this.cod  = cod;
    }
    
    /**
     * 
     * @return 
     */
    public String getTelephoneNumber() {
        return telephoneNumber;
    }
    
    /**
     * 
     * @param telephoneNumber 
     */
    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }
}

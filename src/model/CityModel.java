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
public class CityModel {
    private int cod;
    private String name;
    private int codState;
    
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
        this.cod = cod;
    }
    
    
    /**
     * 
     * @return 
     */
    public String getName() {
        return name;
    }
    
    /**
     * 
     * @param name 
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * 
     * @return 
     */
    public int getCodState() {
        return codState;
    }
    
    /**
     * 
     * @param codState 
     */
    public void setCodState(int codState) {
        this.codState = codState;
    }
}

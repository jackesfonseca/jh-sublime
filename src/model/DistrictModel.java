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
public class DistrictModel {
    
    private String name;
    private int cod;
    private int codCity;
    
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
    public int getCodCity() {
        return codCity;
    }
    
    /**
     * 
     * @param codState 
     */
    public void setCodCity(int codCity) {
        this.codCity = codCity;
    }
}

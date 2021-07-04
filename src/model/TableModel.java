/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author jackes
 */
public class TableModel extends AbstractTableModel{
    private ArrayList lines = null;
    private String[] columns;
    
    //set the amount of line and columns 
    public TableModel(ArrayList lin, String[] col) {
        setLines(lin);
        setColumns(col);
    }
    
    public ArrayList getLines() {
        return lines;
    }
    
    public void setLines(ArrayList data) {
        lines = data;
    }
    
    public String[] getColumns() {
        return columns;
    }
    
    public void setColumns(String[] names) {
        columns = names;
    }
    
    //number of characters tha will have in column
    public int getColumnCount() {
        return columns.length;
    }
    
    //number of elements in array
    public int getRowCount() {
        return lines.size();
    }
    
    public String getColumnName(int numCol) {
        return columns[numCol];
    }
    
    public Object getValueAt(int numLin, int numCol) {
        Object[] line = (Object[])getLines().get(numLin);
        return line[numCol];
    }
}

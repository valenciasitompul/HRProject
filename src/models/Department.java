/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import javafx.scene.layout.Region;

/**
 *
 * @author Zincostan
 */
    public class Department {
    private String dptId;
    private String dptName;
    private int mgrId;
    private int locId;
    
    /**
     * Constructor
     */
    public Department(){
        
    }
    
    /**
     * Consturctor empat parameter (department id, departmen name, manager id
     * , dan location id)
     *
     * @param dptId bertipe string
     * @param dptName bertipe string
     * @param mgid bertipe integer
     * @param locId bertipe integer
     */
    public Department(String dptId, String dptName, int mgrId, int locId){
        this.dptId = dptId;
        this.dptName = dptName;
        this.mgrId = mgrId;
        this.locId = locId;
        
    }
    
    /**
     * fungsi untuk mendapatkan department id
     *
     * @return nilai kembalian berupa string
     */
    public String getdptId(){
        return dptId;
    }
    
     /**
     * fungsi untuk mendapatkan department name
     *
     * @return nilai kembalian berupa string
     */
    public String getdptName(){
        return dptName;
    }
    
     /**
     * fungsi untuk mendapatkan manager id
     *
     * @return nilai kembalian berupa string
     */
    public int getmgrId(){
        return mgrId;
    }
    
     /**
     * fungsi untuk mendapatkan location id
     *
     * @return nilai kembalian berupa string
     */
    public int getlocId(){
        return locId;
    }
    
    /**
     * fungsi untuk mengatur department id
     *
     * @param dptId bertipe string
     */
    public void setdptId(String dptId){
        this.dptId = dptId;
    }
    
    /**
     * fungsi untuk mengatur department name
     *
     * @param id bertipe string
     */
    public void setdptName(String dptName){
        this.dptName = dptName;
    }
    
    /**
     * fungsi untuk mengatur manager id
     *
     * @param id bertipe string
     */
    public void setmgrId(int mgrId){
        this.mgrId = mgrId;
    }
    
    /**
     * fungsi untuk mengatur location id
     *
     * @param id bertipe string
     */
    public void setlocId(int locId){
        this.locId = locId;
    }
}

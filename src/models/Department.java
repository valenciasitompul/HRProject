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
    private String dptid;
    private String dptname;
    private int mgrid;
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
     * @param dptid bertipe string
     * @param dptname bertipe string
     * @param mgid bertipe integer
     * @param locId bertipe integer
     */
    public Department(String dptid, String dptname, int mgrid, int locId){
        this.dptid = dptid;
        this.dptname = dptname;
        this.mgrid = mgrid;
        this.locId = locId;
        
    }
    
    /**
     * fungsi untuk mendapatkan department id
     *
     * @return nilai kembalian berupa string
     */
    public String getdptid(){
        return dptid;
    }
    
     /**
     * fungsi untuk mendapatkan department name
     *
     * @return nilai kembalian berupa string
     */
    public String getdptname(){
        return dptname;
    }
    
     /**
     * fungsi untuk mendapatkan manager id
     *
     * @return nilai kembalian berupa string
     */
    public int getmgrid(){
        return mgrid;
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
     * @param dptid bertipe string
     */
    public void setdptid(String dptid){
        this.dptid = dptid;
    }
    
    /**
     * fungsi untuk mengatur department name
     *
     * @param id bertipe string
     */
    public void setdptname(String dptname){
        this.dptname = dptname;
    }
    
    /**
     * fungsi untuk mengatur manager id
     *
     * @param id bertipe string
     */
    public void setmgrid(int mgrid){
        this.mgrid = mgrid;
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

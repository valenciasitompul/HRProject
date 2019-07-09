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
    private int dptid;
    private String dptname;
    private int mgrid;
    private int locid;
    public Department(){
        
    }
    
    public Department(int dptid, String dptname, int mgrid, int locid){
        this.dptid = dptid;
        this.dptname = dptname;
        this.mgrid = mgrid;
        this.locid = locid;
        
    }
    
    public int getdptid(){
        return dptid;
    }
    
    public String getdptname(){
        return dptname;
    }
    
    public int getmgrid(){
        return mgrid;
    }
    
    public int getlocid(){
        return locid;
    }
    
    public void setdptid(int dptid){
        this.dptid = dptid;
    }
    
    public void setdptname(String dptname){
        this.dptname = dptname;
    }
    
    public void setmgrid(int mgrid){
        this.mgrid = mgrid;
    }
    
    public void setlocid(int locid){
        this.locid = locid;
    }
}

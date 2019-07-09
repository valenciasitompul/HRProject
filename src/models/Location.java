/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author Fachrurrozy
 */
public class Location {
    private int locid;
    private String stradd;
    private int poscode;
    private String city;
    private String staprov;
    private String counid;
    
    public Location(){
        
    }
    
    
    public Location(int locid, String stradd, int poscode, String city, String staprov, String counid){
        this.locid = locid;
        this.stradd = stradd;
        this.poscode = poscode;
        this.city = city;
        this.staprov = staprov;
        this.counid= counid;
    }
    
    public int getLocid(){
        return locid;
    }
    
    public String getStradd(){
        return stradd;
    }
    
    public int getPoscode(){
        return poscode;
    }
    
    public String getCity(){
        return city;
    }
    
    public String getStaprov(){
        return staprov;
    }
    
    public String getCounid(){
        return counid;
    }
    
    public void setLocid(int locid){
        this.locid = locid;
    }
    
    public void setStradd(String stradd){
        this.stradd = stradd;
    }
    
    public void setPoscode(int poscode){
        this.poscode = poscode;
    }
    
    public void setCity(String city){
        this.city = city;
    }
    
    public void setStaprov(String staprov){
        this.staprov = staprov;
    }
    
    public void setCounid(String counid){
        this.counid = counid;
    }

}

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
    private String Stradd;
    private String poscode;
    private String city;
    private String staprov;
    private String counid;
    
    public Location(){
        
    }
    
    /**
     * constructor dari Location
     * @param locid berupa tipe integer
     * @param Stradd berupa tipe string
     * @param poscode berupa tipe string
     * @param city berupa tipe string
     * @param staprov berupa tipe string
     * @param counid berupa tipe string
     */
    public Location(int locid, String Stradd, String poscode, String city, String staprov, String counid){
        this.locid = locid;
        this.Stradd = Stradd;
        this.poscode = poscode;
        this.city = city;
        this.staprov = staprov;
        this.counid= counid;
    }
    
    /**
     * enkapsulasi getter pada location id
     * @return nilai kembalian berupa integer
     */
    public int getLocid(){
        return locid;
    }
    
    /**
     * enkapsulasi getter pada street address
     * @return nilai kembalian berupa string
     */
    public String getStradd(){
        return Stradd;
    }
    
    /**
     * enkapsulasi getter pada postal code
     * @return nilai kembalian berupa string
     */
    public String getPoscode(){
        return poscode;
    }
    
    /**
     * enkapsulasi getter pada city
     * @return nilai kembalian berupa string
     */
    public String getCity(){
        return city;
    }
    
    /**
     * enkapsulasi getter pada  state province
     * @return nilai kembalian berupa string
     */
    public String getStaprov(){
        return staprov;
    }
    
    /**
     * enkapsulasi getter pada country id
     * @return nilai kembalian berupa string
     */
    public String getCounid(){
        return counid;
    }
    
    /**
     * enkapsulasi setter pada location id
     * @param locid berupa tipe integer
     */
    public void setLocid(int locid){
        this.locid = locid;
    }
    
    /**
     * enkapsulasi setter pada street address
     * @param Stradd berupa tipe string
     */
    public void setStradd(String Stradd){
        this.Stradd = Stradd;
    }
    
    /**
     * enkapsulasi setter pada postal code
     * @param poscode berupa tipe string
     */
    public void setPoscode(String poscode){
        this.poscode = poscode;
    }
    
    /**
     * enkapsulasi setter pada city
     * @param city berupa tipe string
     */
    public void setCity(String city){
        this.city = city;
    }
    
    /**
     * enkapsulasi setter pada state province
     * @param staprov berupa tipe string
     */
    public void setStaprov(String staprov){
        this.staprov = staprov;
    }
    
    /**
     * enkapsulasi setter pada country id
     * @param counid berupa tipe string
     */
    public void setCounid(String counid){
        this.counid = counid;
    }

    
}

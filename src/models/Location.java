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
    private int locId;
    private String strAdd;
    private String posCode;
    private String city;
    private String staProv;
    private String counId;
    
    public Location(){
        
    }
    
    /**
     * constructor dari Location
     * @param locId berupa tipe integer
     * @param strAdd berupa tipe string
     * @param posCode berupa tipe string
     * @param city berupa tipe string
     * @param staProv berupa tipe string
     * @param counId berupa tipe string
     */
    public Location(int locId, String strAdd, String posCode, String city, String staProv, String counId){
        this.locId = locId;
        this.strAdd = strAdd;
        this.posCode = posCode;
        this.city = city;
        this.staProv = staProv;
        this.counId= counId;
    }
    
    /**
     * enkapsulasi getter pada location id
     * @return nilai kembalian berupa integer
     */
    public int getlocId(){
        return locId;
    }
    
    /**
     * enkapsulasi getter pada street address
     * @return nilai kembalian berupa string
     */
    public String getstrAdd(){
        return strAdd;
    }
    
    /**
     * enkapsulasi getter pada postal code
     * @return nilai kembalian berupa string
     */
    public String getposCode(){
        return posCode;
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
    public String getstaProv(){
        return staProv;
    }
    
    /**
     * enkapsulasi getter pada country id
     * @return nilai kembalian berupa string
     */
    public String getcounId(){
        return counId;
    }
    
    /**
     * enkapsulasi setter pada location id
     * @param locId berupa tipe integer
     */
    public void setlocId(int locId){
        this.locId = locId;
    }
    
    /**
     * enkapsulasi setter pada street address
     * @param strAdd berupa tipe string
     */
    public void setstrAdd(String strAdd){
        this.strAdd = strAdd;
    }
    
    /**
     * enkapsulasi setter pada postal code
     * @param posCode berupa tipe string
     */
    public void setposCode(String posCode){
        this.posCode = posCode;
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
     * @param staProv berupa tipe string
     */
    public void setstaProv(String staProv){
        this.staProv = staProv;
    }
    
    /**
     * enkapsulasi setter pada country id
     * @param counId berupa tipe string
     */
    public void setcounId(String counId){
        this.counId = counId;
    }

    
}

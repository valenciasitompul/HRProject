/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author HARRY-PC
 */
public class Country {
    private String id;
    private String name;
    private int region_id;
    
    public Country(){
        
    }
    
    public Country(String id,String name,int region_id){
        this.id = id;
        this.name = name;
        this.region_id = region_id;
    }
    
    public String getId(){
        return id;
    }
    
    public String getName(){
        return name;
    }
    
    public int getRegion_id(){
        return region_id;
    }
    
    public void setId(String id){
        this.id = id;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setRegion_id(int region_id){
        this.region_id = this.region_id;
    }
}
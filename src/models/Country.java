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
    
/**
 * constructor dari country
 * @param id berupa string
 * @param name berupa string
 * @param region_id berupa integer
 */
    public Country(String id,String name,int region_id){
        this.id = id;
        this.name = name;
        this.region_id = region_id;
    }
    
    public Country(String id){
        this.id = id;
    }
    
/**
 * enkapsulasi getter dari Id
 * @return kembalian berupa id
 */
    public String getId(){
        return id;
    }
    
/**
 * enkapsulasi getter dari Name
 * @return kembalian berupa name
 */
    public String getName(){
        return name;
    }
    
/**
 * enkapsulasi getter dari Region_id
 * @return kembalian berupa kolom region_id
 */    
    public int getRegion_id(){
        return region_id;
    }
    
/**
 * enkapsulasi setter dari id
 * @param id berupa integer
 */
    public void setId(String id){
        this.id = id;
    }
    
/**
 * enkapsulasi setter dari name
 * @param name berupa string
 */
    public void setName(String name){
        this.name = name;
    }
    
/**
 * enkapsulasi setter dari region_id
 * @param region_id berupa integer
 */
    public void setRegion_id(int region_id){
        this.region_id = this.region_id;
    }
}
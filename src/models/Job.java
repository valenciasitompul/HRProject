/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author Bella
 */
public class Job {
    private String id;
    private String title;
    private int min, max;
    
    public Job(){
        
    }
    
    public Job(String id, String title, int min, int max){
        this.id = id;
        this.title = title;
        this.min = min;
        this.max = max;       
    }
    
    public Job(String id){
        this.id = id;
    }

    
    public String getId(){
        return id;
    }
    
    
    public String getTitle(){
        return title;
    }
    
    public int getMin(){
        return min;
    }
    
    public int getMax(){
        return max;
    }
    
    public void setId(String id){
        this.id = id;
    }
    
    public void setTitle(String title){
        this.title = title;
    }
    
    public void setMin(int min){
        this.min = min;
    }
    
    public void setMax(int max){
        this.max = max;
    }
}

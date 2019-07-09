/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icontrollers;

import idaos.ILocationDAO;
import java.util.List;
import models.Location;

/**
 *
 * @author Fachrurrozy
 */
public interface ILocationController {
   
    public List<Location> getAll();
   
    public List<Location> getLocid (String locid);
   
    public List<Location> search(String key);
   
    public String insert(String locid, String stradd, String poscode,String city, String staprov, String counid);
    
    public String update (String locid, String stradd, String poscode,String city, String staprov, String counid);
   
    public String delete(String locid);
    
}
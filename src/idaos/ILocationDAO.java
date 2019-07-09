/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idaos;

import java.util.List;
import models.Location;

/**
 *
 * @author Fachrurrozy
 */
public interface ILocationDAO {
    /**
     * 
     * @return 
     */
    public List<Location> getAll();
    
    public List<Location> getLocid(int locid);
    
    public List<Location> search(String key);
    
    public boolean insert(Location l);
    
    public boolean update(Location l);
    
    public boolean delete(int locid);
    
}

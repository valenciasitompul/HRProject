/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icontrollers;

import java.util.List;
import models.Region;

/**
 *
 * @author USER
 */
public interface IRegionController {
    
    public List<Region> getAll();
    
    public List<Region> getById(String id);
    
    public List<Region> getByName(String name);
    
    public String insert(String id, String name);
    
    public String update(String id, String name);
    
    public String delete(String id);
    
}

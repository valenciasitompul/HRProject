/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idaos;

import models.Department;
import java.util.List;

/**
 *
 * @author Zincostan
 */
public interface IDepartmentDao {
    
    public List<Department> getAll();
        
    public List<Department> getById(int dptid);
    
    public List<Department> search(String key);
    
    public boolean insertupdate(Department d,boolean isUpdate);
  
    public boolean delete(String del);
    
    public List<Department> getByName(String dptname);
}

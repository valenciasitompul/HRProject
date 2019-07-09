/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icontrollers;
import java.util.List;
import models.Department;
/**
 *
 * @author Zincostan
 */
public interface IDepartmentController {
   public List<Department> getAll();
    public List<Department> getById(int dptid);
    public List<Department> getByName(String dptname);
    public List<Department> search(String key);
    public String insert(String dptid, String dptname, int mgrid, int locid);
    public String update(String dptid, String dptname, int mgrid, int locid);
    public String delete(String id); 
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icontrollers;

import java.util.List;
import models.Employees;

/**
 *
 * @author HARRY-PC
 */
public interface IEmployeesController {
    public List<Employees> getAll();
    public List<Employees> getById(String id);
    public List<Employees> getByName(String name);
    public List<Employees> search(String key);
    public String insert(String id, String fname, String lname, String email, String pNumber, String hireDate, String jobId, String salary, String commissionPct, String managerId, String departmentId);
    public String update(String id, String salary);
    public String delete(String id);
}

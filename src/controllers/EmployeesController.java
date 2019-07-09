/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import daos.EmployeesDAO;
import icontrollers.IEmployeesController;
import idaos.IEmployeesDAO;
import java.sql.Connection;
import java.util.List;
import models.Employees;

/**
 *
 * @author HARRY-PC
 */
public class EmployeesController implements IEmployeesController{
    
    private IEmployeesDAO iemdao;
    
    public EmployeesController(Connection connection){
        iemdao = new EmployeesDAO(connection);
    }

    @Override
    public List<Employees> getAll() {
        return iemdao.getAll();
    }

    @Override
    public List<Employees> getById(String id) {
        return iemdao.getById(Integer.parseInt(id));
    }
    
    public List<Employees> getByName(String name) {
        return iemdao.getByName(name);
    }
    
    @Override
    public List<Employees> search(String key) {
        return iemdao.search(key);
    }

    @Override
    public String insert(String id, String fname, String lname, String email, String pNumber, String hireDate, String jobId, String salary, String commissionPct, String managerId, String departmentId) {
        String result = "";
        Employees emp = new Employees(Integer.parseInt(id),fname, lname, email, pNumber, hireDate, jobId, Integer.parseInt(salary), Integer.parseInt(commissionPct), Integer.parseInt(managerId), Integer.parseInt(departmentId));
        if(iemdao.insert(emp)){
            result = "Data berhasil disimpan";
        }else{
            result = "Maaf Data gagal disimpan";
        }
        return result;
    }

    @Override
    public String update(String id, String salary) {
        String result = "";
        Employees emp = new Employees(Integer.parseInt(id), Integer.parseInt(salary));
        if(iemdao.update(emp)){
            result = "Data berhasil diupdate";
        }else{
            result = "Maaf Data gagal diupdate";
        }
        return result;
    }

    @Override
    public String delete(String id) {
        String result = "";
        if(iemdao.delete(Integer.parseInt(id))){
            result = "Data berhasil dihapus";
        }else{
            result = "maaf data gagal dihapus";
        }
        return result;
    }
    
}

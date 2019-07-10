/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;
import daos.DepartmentDao;
import idaos.IDepartmentDao;
import icontrollers.IDepartmentController;
import models.Department;
import java.sql.Connection;
import java.util.List;
/**
 *
 * @author Zincostan
 */
public class DepartmentController implements icontrollers.IDepartmentController{
    
    private IDepartmentDao idc;
    
    public DepartmentController(Connection connection){
        idc = new DepartmentDao(connection);
    }

    @Override
    public List<Department> getAll() {
        return idc.getAll();
//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Department> getById(String dptid) {
        return idc.getByName(dptid);
    }

//    @Override
//    public List<Department> getByName(String dptname) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

    @Override
    public List<Department> search(String key) {
        return idc.search(key);
    }

    @Override
    public String insert(String dptid, String dptname, int mgrid, int locid) {
        String result;
        Department d = new Department(dptid, dptname, mgrid, locid);
        if(idc.insertupdate(d, false)){
            result = "data tersimpan";
        }else{
            result = "gagal tersimpan";
        }
        return result;
    }

    @Override
    public String update(String dptid, String dptname, int mgrid, int locid) {
        String result;
        Department d = new Department(dptid, dptname, mgrid, locid);
        if(idc.insertupdate(d, true)){
            result = "data terupdate";
        }else{
            result = "gagal terupdate";
        }
        return result;
    }

    @Override
    public String delete(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Department> getByName(String dptname) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

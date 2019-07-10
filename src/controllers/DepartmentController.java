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
 * mengimplementasi class DepartmentController
 * @author Zincostan
 */
public class DepartmentController implements icontrollers.IDepartmentController{
    
    private IDepartmentDao idc;
    
    /**
     * Constructor dengan satu parameter 
     * @param connection bertipe Connection
     */
    public DepartmentController(Connection connection){
        idc = new DepartmentDao(connection);
    }

    
    /**
     * fungsi untuk mendapatkan/menampilkan semua data dari tabel Departmnet
     * @return nilai kembalian berupa list
     */
    @Override
    public List<Department> getAll() {
        return idc.getAll();
    }

    /**
     * fungsi untuk mendapatkan/menampilkan data Department berdasarkan department id
     * @param id bertipe string
     * @return nilai kembalian berupa list
     */
    @Override
    public List<Department> getById(String dptid) {
        return idc.getById(dptid);
    }


    /**
     * fungsi untuk mendapatkan/menampilkan data Department berdasarkan yang diinputkan
     * @param inputan bertipe string
     * @return nilai kembalian berupa list
     */
    @Override
    public List<Department> search(String key) {
        return idc.search(key);
    }

    /**
     * fungsi untuk menambahkan data baru pada tabel Department
     * @param dptid bertipe string
     * @param dptname bertipe string
     * @param mgrid bertipe int
     * @param locid bertipe int
     * @return nilai kembalian berupa string
     */
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
    
    /**
     * fungsi untuk mengupdate data baru pada tabel Department
     * @param dptid bertipe string
     * @param dptname bertipe string
     * @param mgrid bertipe int
     * @param locid bertipe int
     * @return nilai kembalian berupa string
     */
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
    
    /**
     * fungsi untuk menghapus data pada tabel department berdasarkan department id
     * @param id bertipe string
     * @return nilai kebalian berupa string
     */
    @Override
    public String delete(String id) {
        String result = "";
        if(idc.delete(id)){
            result = "Data berhasil dihapus";
        }else{
            result = "maaf data gagal dihapus";
        }
        return result; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Department> getByName(String dptname) {
        return idc.getByName(dptname);
    }
    
}

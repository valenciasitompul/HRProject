/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import models.Department;
import idaos.IDepartmentDao;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


/**
 * mengimplementasi class IDepartmentDAO
 * @author Zincostan
 */
public class DepartmentDao implements IDepartmentDao{
    private Connection connection;
    
    /**
     * Constructor dengan satu parameter
     *
     * @param connection bertipe connection
     */
    public DepartmentDao(Connection connection){
        this.connection = connection;
    }

   
    /**
     * fungsi untuk mendapatkan/menampilkan semua data pada yaitu department id, 
     * department name, manager id dan location id dari tabel Department
     *
     * @return nilai kembalian berupa list
     */
    @Override
    public List<Department> getAll() {
        List<Department> listdepartment = new ArrayList<Department>();
        String query = "SELECT * FROM DEPARTMENTS ORDER BY DEPARTMENT_ID";
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Department d = new Department(resultSet.getString(1),resultSet.getString(2),resultSet.getInt(3),resultSet.getInt(4));
                d.setdptid(resultSet.getString(1));
                d.setdptname(resultSet.getString(2));
                d.setmgrid(resultSet.getInt(3));
                d.setlocId(resultSet.getInt(4));
                listdepartment.add(d);
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return listdepartment;
    }

    
    /**
     * fungsi untuk mendapatkan/menampilkan semua data yaitu department id, 
     * department name, manager id dan location id dari tabel 
     * Department berdasarkan departmen id
     *
     * @param dptid bertipe string
     * @return nilai kembalian berupa list
     */
    @Override
    public List<Department> getById(String dptid) {
      List<Department> listdepartment = new ArrayList<Department>();
      String query = "SELECT * FROM DEPARTMENTS WHERE DEPARTMENT_ID = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, dptid);
            ResultSet rs = preparedStatement.executeQuery();
            while(rs.next()){
                Department department = new Department(rs.getString(1),rs.getString(2),rs.getInt(3),rs.getInt(4));
                listdepartment.add(department);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return listdepartment;
    }

    /**
     * fungsi untuk mendapatkan/menampilkan semua data yang sesuai dngan inputan pada
     * tabel Department berdasarkan inputan
     *
     * @param key bertipe string
     * @return nilai kembalian berupa list
     */
    @Override
    public List<Department> search(String key) {
        List<Department> listdepartment = new ArrayList<Department>();
        String query = "SELECT * FROM DEPARTMENTS WHERE REGEXP_LIKE(DEPARTMENT_ID, (?), 'i') OR REGEXP_LIKE(DEPARTMENT_NAME, (?), 'i') ORDER BY DEPARTMENT_ID";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1,key);
            preparedStatement.setString(2,key);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                Department department = new Department(rs.getString(1),rs.getString(2),rs.getInt(3),rs.getInt(4));
                listdepartment.add(department);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return listdepartment;
    }

    /**
     * fungsi untuk menambahkan data baru yaitu department id, 
     * department name, manager id dan location id pada tabel Department atau untuk mengubah data department id, 
     * department name, manager id dan location id pada tabel Department pada saat
     * mengubah data, department id tidak dapat diubah
     *
     * @param d bertipe Department
     * @param isUpdate bertipe boolean
     * @return nilai kembalian berupa boolean
     */
    @Override
    public boolean insertupdate(Department d, boolean isUpdate) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        boolean result = false;
        String query = "INSERT INTO DEPARTMENTS (DEPARTMENT_NAME, MANAGER_ID, LOCATION_ID, DEPARTMENT_ID) VALUES (?,?,?,?) ";
        if(isUpdate){
            query = "UPDATE DEPARTMENTS SET DEPARTMENT_NAME = ?, MANAGER_ID = ?, LOCATION_ID = ? WHERE DEPARTMENT_ID = ?";
        }
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            
            preparedStatement.setString(1, d.getdptname());
            preparedStatement.setInt(2, d.getmgrid());
            preparedStatement.setInt(3, d.getlocId());
            preparedStatement.setString(4, d.getdptid());
            preparedStatement.executeQuery();
            result = true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return result;
    }

     /**
     * fungsi untuk menghapus data pada tabel Department berdasarkan department id
     *
     * @param del bertipe string
     * @return nilai kembalian berupa boolean
     */
    @Override
    public boolean delete(String del) {
        boolean result = false;
        String query = "DELETE FROM DEPARTMENTS WHERE DEPARTMENT_ID = ? ";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, del);
            preparedStatement.execute();
            result = true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return result;
    }

    /**
     * fungsi untuk mendapatkan/menampilkan semua data yaitu department id, 
     * department name, manager id dan location id dari tabel department 
     * berdasarkan departmen nama
     *
     * @param dptname bertipe string
     * @return nilai kembalian berupa list
     */
    @Override
    public List<Department> getByName(String dptname) {
        List<Department> listdepartment = new ArrayList<Department>();
      String query = "SELECT * FROM DEPARTMENTS WHERE DEPARTMENT_NAME = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, dptname);
            ResultSet rs = preparedStatement.executeQuery();
            while(rs.next()){
                Department department = new Department(rs.getString(1),rs.getString(2),rs.getInt(3),rs.getInt(4));
                listdepartment.add(department);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return listdepartment;
    }
    
    
}

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
 *
 * @author Zincostan
 */
public class DepartmentDao implements IDepartmentDao{
    private Connection connection;
    
    public DepartmentDao(Connection connection){
        this.connection = connection;
    }

   

    @Override
    public List<Department> getAll() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
                d.setlocid(resultSet.getInt(4));
                listdepartment.add(d);
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return listdepartment;
    }

    @Override
    public List<Department> getById(String dptid) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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

    @Override
    public List<Department> search(String key) {
        //throw new UnsupportedOperationException("Not supported yet.");
        //To change body of generated methods, choose Tools | Templates.
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
            preparedStatement.setInt(3, d.getlocid());
            preparedStatement.setString(4, d.getdptid());
            preparedStatement.executeQuery();
            result = true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public boolean delete(String del) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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

    @Override
    public List<Department> getByName(String dptname) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import idaos.IEmployeesDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import models.Employees;

/**
 *
 * @author HARRY-PC
 */
public class EmployeesDAO implements IEmployeesDAO{
    
    private Connection connection;
    
    /**
     * Memanggil fungsi koneksi
     * @param connection 
     */
    public EmployeesDAO(Connection connection){
        this.connection = connection;
    }

    /**
     * Fungsi yang digunakan untuk menampilkan data tabel emp dari database berupa list dengan nama getAll
     * data yang ditampilkan berupa emp_id dan emp_name
     * @return listEmployees
     */
    @Override
    public List<Employees> getAll() {
        List<Employees> listEmployees = new  ArrayList<Employees>();
        String query = "SELECT * FROM EMPLOYEES ORDER BY EMPLOYEE_ID ASC";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Employees e = new  Employees(resultSet.getInt(1),resultSet.getString(2),resultSet.getString(3),resultSet.getString(4),resultSet.getString(5),resultSet.getString(6),resultSet.getString(7),resultSet.getInt(8),resultSet.getInt(9),resultSet.getInt(10),resultSet.getInt(11));
                e.setId(resultSet.getInt(1));
                e.setFName(resultSet.getString(2));
                e.setLName(resultSet.getString(3));
                e.setEmail(resultSet.getString(4));
                e.setPNumber(resultSet.getString(5));
                e.setHiredate(resultSet.getString(6));
                e.setJobid(resultSet.getString(7));
                e.setSalary(resultSet.getInt(8));
                e.setCommissionpct(resultSet.getInt(9));
                e.setManagerid(resultSet.getInt(10));
                e.setDepartmentid(resultSet.getInt(11));
                
                listEmployees.add(e);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return listEmployees;
    }
   

    /**
     * Fungsi yang digunakan untuk menampilkan data tabel emp dari database berupa list dengan nama getById
     * data ditampilkan sesuai dengan id / emp_id yang diminta atau diinput
     * data yang ditampilkan berupa emp_id dan emp_name
     * digunakan pada proses pencarian berdasarkan id / emp_id
     * @param id berupa integer
     * @return emps
     */
    @Override
    public List<Employees> getById(int id) {
        List<Employees> emps = new ArrayList<Employees>();
        String query = "SELECT * FROM EMPLOYEES WHERE REGEXP_LIKE(EMPLOYEE_ID, (?), 'i')";
        try {
            //penamaan preparedstatemnet di samakan saja dari awal sampai akhir
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1,id);
            ResultSet resultSet = preparedStatement.executeQuery();
            //rs.next = menampung data dari statement diatas sampai mendapatkan nilai yang diinginkan
            while (resultSet.next()) {
                Employees emp = new Employees(resultSet.getInt(1),resultSet.getString(2),resultSet.getString(3),resultSet.getString(4),resultSet.getString(5),resultSet.getString(6),resultSet.getString(7),resultSet.getInt(8),resultSet.getInt(9),resultSet.getInt(10),resultSet.getInt(11));
                emps.add(emp);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return emps;
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Fungsi yang digunakan untuk menampilkan data tabel emp dari database berupa list dengan nama search
     * data ditampilkan sesuai dengan key yang diminta atau diinput
     * key dapat berupa emp_id atau emp_name
     * data yang ditampilkan berupa emp_id dan emp_name
     * digunakan pada proses pencarian
     * @param key berupa String
     * @return emps
     */
    @Override
    public List<Employees> search(String key) {
        List<Employees> emps = new ArrayList<Employees>();
        String query = "SELECT * FROM EMPLOYEES WHERE REGEXP_LIKE(EMPLOYEE_ID, (?), 'i') OR REGEXP_LIKE(LAST_NAME, (?), 'i') ORDER BY EMPLOYEE_ID ASC";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1,key);
            preparedStatement.setString(2,key);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Employees e = new  Employees(resultSet.getInt(1),resultSet.getString(2),resultSet.getString(3),resultSet.getString(4),resultSet.getString(5),resultSet.getString(6),resultSet.getString(7),resultSet.getInt(8),resultSet.getInt(9),resultSet.getInt(10),resultSet.getInt(11));
                emps.add(e);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return emps;
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * fungsi untuk melakukan insert ke dalam database
     * @param r berupa instansiasi dari emp
     * @return result
     */
    public boolean insert(Employees emp) {
        boolean result = false;
        String query = "INSERT INTO EMPLOYEES (EMPLOYEE_ID, FIRST_NAME, LAST_NAME, EMAIL, PHONE_NUMBER, HIRE_DATE, JOB_ID, SALARY, COMMISSION_PCT, MANAGER_ID, DEPARTMENT_ID) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, emp.getId());
            preparedStatement.setString(2, emp.getFName());
            preparedStatement.setString(3, emp.getLName());
            preparedStatement.setString(4, emp.getEmail());
            preparedStatement.setString(5, emp.getPNumber());
            preparedStatement.setString(6, emp.getHiredate());
            preparedStatement.setString(7, emp.getJobid());
            preparedStatement.setInt(8, emp.getSalary());
            preparedStatement.setInt(9, emp.getCommissionpct());
            preparedStatement.setInt(10, emp.getManagerid());
            preparedStatement.setInt(11, emp.getDepartmentid());
            
            preparedStatement.executeQuery();
            result = true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return result;
    }
    
    /**
     * fungsi untuk melakukan insert dan update dalam satu fungsi yang sama
     * @param r berupa instansiasi dari emp
     * @param isUpdate berupa boolean
     * @return result
     */
//    @Override
//    public boolean insertupdate(Employees r, boolean isUpdate) {
//        boolean result = false;
//        String query = "INSERT INTO EMPLOYEES (EMPLOYEE_ID, FIRST_NAME, LAST_NAME, EMAIL, PHONE_NUMBER, HIRE_DATE, JOB_ID, SALARY, COMMISSION_PCT, MANAGER_ID, DEPARTMENT_ID) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
//        if(isUpdate){
//            query = "UPDATE EMPLOYEES SET COMMISSION_PCT = ? WHERE EMPLOYEE_ID = ?";
//        }
//        try {
//            PreparedStatement preparedStatement = connection.prepareStatement(query);
//            preparedStatement.setString(1, r.getName());
//            preparedStatement.setInt(2, r.getId());
//            preparedStatement.executeQuery();
//            result = true;
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//            e.printStackTrace();
//        }
//        return result;
//    }

    @Override
    public boolean update(Employees emp) {
        boolean result = false;
        String query = "UPDATE EMPLOYEES SET SALARY = ? WHERE EMPLOYEE_ID = ?";
        try {
            PreparedStatement ps = connection.prepareStatement(query);
//            ps.setString(1, emp.getFName());
//            ps.setString(2, emp.getLName());
//            ps.setString(3, emp.getEmail());
//            ps.setString(4, emp.getPNumber());
//            ps.setString(5, emp.getHiredate());
//            ps.setString(6, emp.getJobid());
//            ps.setInt(7, emp.getSalary());
//            ps.setInt(8, emp.getCommissionpct());
//            ps.setInt(9, emp.getManagerid());
//            ps.setInt(10, emp.getDepartmentid());
//            ps.setInt(11, emp.getId());
              ps.setInt(1, emp.getSalary());
              ps.setInt(2, emp.getId());
              
            
            ps.executeQuery();
            result = true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return result;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * fungsi untuk menghapus data by Id
     * @param d berupa integer
     * @return kembalian berupa boolean
     */
    @Override
    public boolean delete(int d) {
        boolean result = false;
        String query = "DELETE FROM EMPLOYEES WHERE EMPLOYEE_ID = ? ";
        try {
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, d);
            statement.execute();
            result = true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return result;
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Fungsi yang digunakan untuk menampilkan data tabel emp dari database berupa list dengan nama getByName
     * data ditampilkan sesuai dengan name / emp_name yang diminta atau diinput
     * data yang ditampilkan berupa emp_id dan emp_name
     * digunakan pada proses pencarian berdasarkan name / emp_name
     * @param name berupa String
     * @return emps
     */
    @Override
    public List<Employees> getByName(String name) {
        List<Employees> emps = new ArrayList<Employees>();
        String query = "SELECT * FROM REGIONS WHERE REGEXP_LIKE(REGION_NAME, (?), 'i')";
        try {
            //penamaan preparedstatemnet di samakan saja dari awal sampai akhir
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1,name);
            ResultSet resultSet = preparedStatement.executeQuery();
            //rs.next = menampung data dari statement diatas sampai mendapatkan nilai yang diinginkan
            while (resultSet.next()) {
                Employees emp = new Employees(resultSet.getInt(1),resultSet.getString(2),resultSet.getString(3),resultSet.getString(4),resultSet.getString(5),resultSet.getString(6),resultSet.getString(7),resultSet.getInt(8),resultSet.getInt(9),resultSet.getInt(10),resultSet.getInt(11));
                emps.add(emp);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return emps;
    }
    
}

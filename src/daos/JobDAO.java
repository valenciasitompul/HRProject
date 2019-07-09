/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import idaos.IJobDAO;
import models.Job;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Bella
 */
public class JobDAO implements IJobDAO{
    private Connection connection;
    
    public JobDAO(Connection connection){
        this.connection = connection;
    }
    
    public List<Job> getAll() {
        List<Job> listJob = new ArrayList<Job>();
        String query = "SELECT * FROM JOBS ORDER BY JOB_ID ASC";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Job j = new Job(resultSet.getString(1), resultSet.getString(2), resultSet.getInt(3), resultSet.getInt(4));
                j.setId(resultSet.getString(1));
                j.setTitle(resultSet.getString(2));
                j.setMin(resultSet.getInt(3));
                j.setMax(resultSet.getInt(4));
                listJob.add(j);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return listJob;
    }
    
    public List<Job> getById(String id) {
        List<Job> listJobId = new ArrayList<Job>();
        String query = "SELECT * FROM JOBS WHERE REGEXP_LIKE(JOB_ID, (?), 'i')";
        try {
            //penamaan preparedstatemnet di samakan saja dari awal sampai akhir
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1,id);
            ResultSet resultSet = preparedStatement.executeQuery();
            //rs.next = menampung data dari statement diatas sampai mendapatkan nilai yang diinginkan
            while (resultSet.next()) {
                Job j = new Job(resultSet.getString(1),resultSet.getString(2),resultSet.getInt(3),resultSet.getInt(4));
                listJobId.add(j);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return listJobId;
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public List<Job> getByTitle(String title) {
        List<Job> listJobTitle = new ArrayList<Job>();
        String query = "SELECT * FROM JOBS WHERE REGEXP_LIKE(JOB_TITLE, (?), 'i')";
        try {
            //penamaan preparedstatemnet di samakan saja dari awal sampai akhir
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1,title);
            ResultSet  resultSet = preparedStatement.executeQuery();
            //rs.next = menampung data dari statement diatas sampai mendapatkan nilai yang diinginkan
            while (resultSet.next()) {
                Job j = new Job(resultSet.getString(1),resultSet.getString(2),resultSet.getInt(3),resultSet.getInt(4));
                listJobTitle.add(j);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return listJobTitle;
    }
    
        public boolean insertupdate(Job j, boolean isUpdate) {
        boolean result = false;
        String query = "INSERT INTO JOBS (JOB_TITLE, MIN_SALARY, MAX_SALARY, JOB_ID) VALUES (?,?,?,?) ";
        if(isUpdate){
            query = "UPDATE JOBS SET JOB_TITLE = ?, MIN_SALARY = ?, MAX_SALARY = ? WHERE JOB_ID = ?";
        }
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, j.getTitle());
            preparedStatement.setInt(2, j.getMin());
            preparedStatement.setInt(3, j.getMax());
            preparedStatement.setString(4, j.getId());
            preparedStatement.executeQuery();
            result = true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return result;
    }
    
        public boolean delete(String d) {
        boolean result = false;
        String query = "DELETE FROM JOBS WHERE JOB_ID = ? ";
        try {
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, d);
            statement.execute();
            result = true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return result;
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Job> getAllById() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Job> getAllByTitle() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Job> search(String key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Job> getAllById(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Job> getAllByTitle(String title) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

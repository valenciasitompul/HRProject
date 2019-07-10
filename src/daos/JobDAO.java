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
 * mengimplementasi class IJobDAO
 *
 * @author Bella
 */
public class JobDAO implements IJobDAO {

    private Connection connection;

    /**
     * Constructor dengan satu parameter
     *
     * @param connection bertipe connection
     */
    public JobDAO(Connection connection) {
        this.connection = connection;
    }

    /**
     * fungsi untuk mendapatkan/menampilkan semua data pada yaitu job id, job
     * title, minimal salary dan maksimal salary dari tabel JOBS
     *
     * @return nilai kembalian berupa list
     */
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

    /**
     * fungsi untuk menambahkan data baru yaitu job id, job title, minimal
     * salary dan maksimal salary pada tabel JOBS atau untuk mengubah data job
     * title, minimal salary dan maksimal salary pada tabel JOBS pada saat
     * mengubah data, job id tidak dapat diubah
     *
     * @param j bertipe Job
     * @param isUpdate bertipe boolean
     * @return nilai kembalian berupa boolean
     */
    public boolean insertupdate(Job j, boolean isUpdate) {
        boolean result = false;
        String query = "INSERT INTO JOBS (JOB_TITLE, MIN_SALARY, MAX_SALARY, JOB_ID) VALUES (?,?,?,?) ";
        if (isUpdate) {
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

    /**
     * fungsi untuk menghapus data pada tabel JOBS berdasarkan job id
     *
     * @param d bertipe string
     * @return nilai kembalian berupa boolean
     */
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
    }

    /**
     * fungsi untuk mendapatkan/menampilkan semua data yaitu job id, job title,
     * minimal salary dan maksimal salary dari tabel JOBS berdasarkan job id
     *
     * @param id bertipe string
     * @return nilai kembalian berupa list
     */
    @Override
    public List<Job> getById(String id) {
        List<Job> listJobId = new ArrayList<Job>();
        String query = "SELECT * FROM JOBS WHERE REGEXP_LIKE(JOB_ID, (?), 'i')";
        try {
            //penamaan preparedstatemnet di samakan saja dari awal sampai akhir
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            //rs.next = menampung data dari statement diatas sampai mendapatkan nilai yang diinginkan
            while (resultSet.next()) {
                Job j = new Job(resultSet.getString(1), resultSet.getString(2), resultSet.getInt(3), resultSet.getInt(4));
                listJobId.add(j);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return listJobId;
    }

    /**
     * fungsi untuk mendapatkan/menampilkan semua data yaitu job id, job title,
     * minimal salary dan maksimal salary dari tabel JOBS berdasarkan job title
     *
     * @param title bertipe string
     * @return nilai kembalian berupa list
     */
    @Override
    public List<Job> getByTitle(String title) {
        List<Job> listJobTitle = new ArrayList<Job>();
        String query = "SELECT * FROM JOBS WHERE REGEXP_LIKE(JOB_TITLE, (?), 'i')";
        try {
            //penamaan preparedstatemnet di samakan saja dari awal sampai akhir
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, title);
            ResultSet resultSet = preparedStatement.executeQuery();
            //rs.next = menampung data dari statement diatas sampai mendapatkan nilai yang diinginkan
            while (resultSet.next()) {
                Job j = new Job(resultSet.getString(1), resultSet.getString(2), resultSet.getInt(3), resultSet.getInt(4));
                listJobTitle.add(j);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return listJobTitle;
    }

    /**
     * fungsi untuk melakukan pencarian pada tabel JOBS
     *
     * @param key bertipe string
     * @return nilai kembalian berupa string
     */
    @Override
    public List<Job> search(String key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

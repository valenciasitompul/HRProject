/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import daos.JobDAO;
import icontrollers.IJobController;
import idaos.IJobDAO;
import java.sql.Connection;
import java.util.List;
import models.Job;

/**
 * mengimplementasi class IJobController
 * @author Bella
 */
public class JobController implements IJobController{
    
    private IJobDAO ijdao;
    
    /**
     * Constructor dengan satu parameter 
     * @param connection bertipe Connection
     */
    public JobController(Connection connection){
        ijdao = new JobDAO(connection);
    }
    
    /**
     * fungsi untuk mendapatkan/menampilkan semua data yaitu job id, job title, minimal salary dan maksimal salary dari tabel JOBS
     * @return nilai kembalian berupa list
     */
    @Override
    public List<Job> getAll(){
        return ijdao.getAll();
    }
    
    /**
     * fungsi untuk mendapatkan/menampilkan semua data yaitu job id, job title, minimal salary dan maksimal salary dari tabel JOBS berdasarkan job id
     * @param id bertipe string
     * @return nilai kembalian berupa list
     */
    @Override
    public List<Job> getById(String id){
        return ijdao.getById(id);
    }
    
    /**
     * fungsi untuk mendapatkan/menampilkan semua data yaitu job id, job title, minimal salary dan maksimal salary dari tabel JOBS berdasarkan job title
     * @param title bertipe string
     * @return nilai kembalian berupa list
     */
    @Override
    public List<Job> getByTitle(String title){
        return ijdao.getByTitle(title);
    }
    
    /**
     * fungsi untuk menambahkan data baru yaitu job id, job title, minimal salary dan maksimal salary pada tabel JOBS
     * @param id bertipe string
     * @param title bertipe string
     * @param min bertipe string
     * @param max bertipe string
     * @return nilai kembalian berupa string
     */
    @Override
    public String insert(String id,String title, String min, String max) {
        String result = "";
        Job job = new Job(id, title, Integer.parseInt(min), Integer.parseInt(max));
        if(ijdao.insertupdate(job, false)){
            result = "Data berhasil disimpan";
        }else{
            result = "Maaf Data gagal disimpan";
        }
        return result;
    }
    
    /**
     * fungsi untuk mengubah data job title, minimal salary dan maksimal salary pada tabel JOBS
     * pada saat mengubah data, job title tidak dapat diubah
     * @param id bertipe string
     * @param title bertipe string
     * @param min bertipe string
     * @param max bertipe string
     * @return nilai kembalian berupa string
     */
    @Override
    public String update(String id, String title, String min, String max) {
        String result = "";
        Job job = new Job(id, title, Integer.parseInt(min), Integer.parseInt(max));
        if(ijdao.insertupdate(job, true)){
            result = "Data berhasil diupdate";
        }else{
            result = "Maaf Data gagal diupdate";
        }
        return result;
    }
    
    /**
     * fungsi untuk menghapus data pada tabel JOBS berdasarkan job id
     * @param id bertipe string
     * @return nilai kebalian berupa string
     */
    @Override
    public String delete(String id) {
        String result = "";
        if(ijdao.delete(id)){
            result = "Data berhasil dihapus";
        }else{
            result = "maaf data gagal dihapus";
        }
        return result;
    }

}

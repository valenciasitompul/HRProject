/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import daos.JobDAO;
import daos.JobDAO;
import idaos.IJobDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;
import models.Job;

/**
 *
 * @author Bella
 */
public class JobController {
    private IJobDAO ijdao;
    
    public JobController(Connection connection){
        ijdao = new JobDAO(connection);
    }

    
    public List<Job> getAll(){
        return ijdao.getAll();
    }
    
    public List<Job> getById(String id){
        return ijdao.getAllById(id);
    }
    
    public List<Job> getByTitle(String title){
        return ijdao.getAllByTitle(title);
    }
    
    public String insert(String title, int min, int max, String id) {
        String result = "";
        Job job = new Job (title, min, min, id);
        if(ijdao.insertupdate(job, false)){
            result = "Data berhasil disimpan";
        }else{
            result = "Maaf Data gagal disimpan";
        }
        return result;
    }
    
    public String update(String title, int min, int max, String id) {
        String result = "";
        Job job = new Job (title, min, min, id);
        if(ijdao.insertupdate(job, true)){
            result = "Data berhasil diupdate";
        }else{
            result = "Maaf Data gagal diupdate";
        }
        return result;
    }
    
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

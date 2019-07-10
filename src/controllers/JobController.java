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
 *
 * @author Bella
 */
public class JobController implements IJobController{
    private IJobDAO ijdao;
    
    public JobController(Connection connection){
        ijdao = new JobDAO(connection);
    }



    
    public List<Job> getAll(){
        return ijdao.getAll();
    }
    
    public List<Job> getById(String id){
        return ijdao.getById(id);
    }
    
    public List<Job> getByTitle(String title){
        return ijdao.getByTitle(title);
    }
    
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
    
    public String update(String id,String title, String min, String max) {
        String result = "";
        Job job = new Job(id, title, Integer.parseInt(min), Integer.parseInt(max));
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

    @Override
    public List<Job> search(String key) {
        return ijdao.search(key);
    }

}

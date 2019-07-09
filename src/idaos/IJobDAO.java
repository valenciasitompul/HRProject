/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idaos;

import java.util.List;
import models.Job;

/**
 *
 * @author Bella
 */
public interface IJobDAO {
    
    public List<Job> getAll();
    
    public List<Job> getAllById();
    
    public List<Job> getAllByTitle();
    
    public List<Job> search(String key);
    
    public boolean insertupdate(Job j, boolean isUpdate);
   
    public boolean delete(String id);

    public List<Job> getAllById(String id);

    public List<Job> getAllByTitle(String title);
    
    
}

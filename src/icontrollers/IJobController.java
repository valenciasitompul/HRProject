/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icontrollers;

import java.util.List;
import models.Job;

/**
 *
 * @author Bella
 */
public interface IJobController {

    public List<Job> getAll();
    public List<Job> getById(String id);
    public List<Job> getByTitle(String title);
    public List<Job> search(String key);
    public String insert(String id, String name);
    public String update(String id, String name);
    public String delete(String id);

    public void insert(String text, String text0, int parseInt);

    public void insert(String text, String text0, String text1, String text2);

    public void update(String text, String text0, String text1, String text2);
}

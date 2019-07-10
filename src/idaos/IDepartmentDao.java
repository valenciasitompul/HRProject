/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idaos;

import models.Department;
import java.util.List;

/**
 *
 * @author Zincostan
 */
public interface IDepartmentDao {
    
    /**
     * fungsi untuk mendapatkan/menampilakan semua data dari tabel Department
     *
     * @return nilai kembalian berupa list
     */
    public List<Department> getAll();
        
    public List<Department> getById(String dptid);
    
    public List<Department> search(String key);
    
    /**
     * fungsi untuk menambahkan data baru atau untuk mengubah data
     * pada tabel department pada saat
     * mengubah data, job id tidak dapat diubah
     *
     * @param j bertipe Job
     * @param isUpdate bertipe boolean
     * @return nilai kembalian berupa boolean
     */
    public boolean insertupdate(Department d,boolean isUpdate);
  
    public boolean delete(String del);
    
    public List<Department> getByName(String dptname);
}

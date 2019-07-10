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
        
    /**
     * fungsi untuk mendapatkan/menampilkan data
     * dari tabel Departmnet berdasarkan department id
     *
     * @param dptId bertipe string
     * @return nilai kembalian berupa list
     */
    public List<Department> getById(String dptId);
    
    /**
     * fungsi untuk mendapatkan/menampilkan data
     * dari tabel Departmenet berdasarkan inputan
     *
     * @param key bertipe string
     * @return nilai kembalian berupa list
     */
    public List<Department> search(String key);
    
    /**
     * fungsi untuk menambahkan data baru atau untuk mengubah data
     * pada tabel department pada saat
     * mengubah data, departmen id tidak dapat diubah
     *
     * @param j bertipe Job
     * @param isUpdate bertipe boolean
     * @return nilai kembalian berupa boolean
     */
    public boolean insertupdate(Department d,boolean isUpdate);
  
    /**
     * fungsi untuk menghapus data pada tabel Department berdasarkan department id
     *
     * @param del bertipe string
     * @return nilai kembalian berupa boolean
     */
    public boolean delete(String del);
    
    /**
     * fungsi untuk mendapatkan/menampilkan data
     * dari tabel Departmnet berdasarkan department name
     *
     * @param dptName bertipe string
     * @return nilai kembalian berupa list
     */
    public List<Department> getByName(String dptName);
}

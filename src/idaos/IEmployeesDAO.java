/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idaos;

import java.util.List;
import models.Employees;

/**
 *
 * @author ASUS
 */
public interface IEmployeesDAO {
    /**
     * getAll method untuk menngambil semua data pada tabel regions
     * @return 
     */
    public List<Employees> getAll();
    
    /**
     * method ini digunakan untuk mendapatkan dan menyeleksi data dari table regions
     * @param id
     * @return 
     */
    public List<Employees> getById(int id);
    
    /**
     * method ini digunakan untuk mendapatkan dan menyeleksi data dari table regions
     * @param key
     * @return 
     */
    public List<Employees> search(String key);
    
    /**
     * method ini digunakan untuk memasukkan data ke dalam table regions
     * @param r
     * @return 
     */
    public boolean insert(Employees emp);
    
//    public boolean insertupdate(Employees e, boolean isUpdate);
    
    /**
     * method ini digunakan untuk mengganti nilai data di dalam tabel regions
     * @param r
     * @return 
     */
    public boolean update(Employees emp);
    
    /**
     * method ini digunakan untuk menghapus satu baris data sesuai id masukan
     * @param r
     * @return 
     */
    public boolean delete(int d);

    /**
     * method ini digunakan untuk mendapatkan dan menyeleksi data dari table regions
     * @param name
     * @return 
     */
    public List<Employees> getByName(String name);
    
}


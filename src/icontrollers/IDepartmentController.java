/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icontrollers;
import java.util.List;
import models.Department;
/**
 *
 * @author Zincostan
 */
public interface IDepartmentController {
    /**
     * fungsi untuk mendapatkan/menampilkan semua data dari tabel Department
     *
     * @return nilai kembalian berupa list
     */
    public List<Department> getAll();
    /**
     * fungsi untuk mendapatkan/menampilkan semua data
     * dari tabel Department berdasarkan Department id
     *
     * @param dptid bertipe string
     * @return nilai kembalian berupa list
     */
    public List<Department> getById(String dptid);
    
    /**
     * fungsi untuk mendapatkan/menampilkan semua data
     * dari tabel Department berdasarkan nama
     *
     * @param dptname bertipe string
     * @return nilai kembalian berupa list
     */
    public List<Department> getByName(String dptname);
    
    /**
     * fungsi untuk mendapatkan/menampilkan semua data
     * dari tabel Department berdasarkan inputan
     *
     * @param key bertipe string
     * @return nilai kembalian berupa list
     */
    public List<Department> search(String key);
    
    /**
     * fungsi untuk menambahkan data baru yaitu department id, departmen name, management id
     * dan location id pada tabel department
     *
     * @param dptid bertipe string
     * @param dptname bertipe string
     * @param mgid bertipe int
     * @param locid bertipe int
     * @return nilai kembalian berupa string
     */
    public String insert(String dptid, String dptname, int mgrid, int locid);
    
    /**
     * fungsi untuk merubah data baru yaitu department id, departmen name, management id
     * dan location id pada tabel department
     *
     * @param dptid bertipe string
     * @param dptname bertipe string
     * @param mgid bertipe int
     * @param locid bertipe int
     * @return nilai kembalian berupa string
     */
    public String update(String dptid, String dptname, int mgrid, int locid);
    
    /**
     * fungsi untuk menghapus data pada tabel Department berdasarkan id
     *
     * @param id bertipe string
     * @return nilai kembalian berupa string
     */
    public String delete(String id); 
}

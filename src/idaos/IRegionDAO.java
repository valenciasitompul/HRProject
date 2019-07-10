/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idaos;

import java.util.List;
import models.Region;

/**
 *
 * @author HARRY-PC
 */
public interface IRegionDAO {
    /**
     * getAll method untuk menngambil semua data pada tabel regions
     * @return 
     */
    public List<Region> getAll();
    
    /**
     * method ini digunakan untuk mendapatkan dan menyeleksi data dari table regions
     * @param id
     * @return 
     */
    public List<Region> getById(int id);
    
    
    public List<Region> getByName(String name);
    

    /**
     * method ini digunakan untuk memasukkan data ke dalam table regions
     * @param r
     * @return 
     */
//    public boolean insert(Region r);
    
    public boolean insertupdate(Region r, boolean isUpdate);
    
    /**
     * method ini digunakan untuk mengganti nilai data di dalam tabel regions
     * @param r
     * @return 
     */
//    public boolean update(Region r);
    
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
    
}

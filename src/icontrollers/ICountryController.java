/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icontrollers;

import java.util.List;
import javax.swing.JComboBox;
import models.Country;
import models.Region;

/**
 *
 * @author alzena
 */
public interface ICountryController {
    
    /**
     * fungsi untuk mendapatkan/menampilkan semua data yaitu country id, country name dan region id
     * 
     * @return nilai kembalian berupa list
     */
    public List<Country> getAll();
    
    /**
     * fungsi untuk menampilkan semua data yaitu country id, country name dan region id berdasarkan country id
     * @param id berupa string
     * 
     * @return nilai kembalian berupa list
     */
    public List<Country> getById(String id);
    
    /**
     * fungsi untuk mengambil kolom region id dari tabel REGIONS
     * 
     * @return nilai kembalian berupa list
     */
    public List<Region> getRegionId();
    
    /**
     * fungsi untuk mencari data dari tabel REGIONS
     * @param key berupa string
     * @return nilai kembalian berupa list
     */
    public List<Country> search(String key);
    
    /**
     * fungsi untuk menambah data dari tabel COUNTRIES
     * @param id berupa string
     * @param name berupa string
     * @param region_id berupa string
     * @return nilai kembalian berupa string
     */
    public String insert(String id, String name, String region_id);
    
    /**
     * fungsi untuk memperbarui/mengedit data dari tabel COUNTRIES
     * @param id berupa string
     * @param name berupa string
     * @param region_id berupa string
     * @return nilai kembalian berupa string
     */
    public String update(String id, String name, String region_id);
    
    /**
     * fungsi untuk menghapus data dari tabel COUNTRIES
     * @param id berupa string
     * @return nilai kembalian berupa string
     */
    public String delete(String id);

    public Iterable<Country> getJustId(JComboBox<String> cbRegion_id);
}

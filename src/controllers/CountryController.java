/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import daos.CountryDAO;
import icontrollers.ICountryController;
import idaos.ICountryDAO;
import java.sql.Connection;
import java.util.List;
import javax.swing.JComboBox;
import models.Country;
import models.Region;

/**
 *mengimplementasi class ICoountryController
 * @author alzena
 */
public class CountryController implements ICountryController {
    
    private ICountryDAO icdao;
    
    /**
     * constructor dengan satu parameter
     * @param connection berupa connection 
     */
    public CountryController (Connection connection){
        icdao = new CountryDAO(connection);
    }

    /**
     * fungsi untuk mendapatkan/menampilkan semua data yaitu country id, country name, dan region id dari tabel COUNTRIES
     * @return nilai kembalian berupa list
     */
    @Override
    public List<Country> getAll() {
         return icdao.getAll();
    }

    /**
     * fungsi untuk mendapatkan/menampilkan semua data yaitu country id, country name, dan region id dari tabel COUNTRIES berdasarkan country id
     * @param id berupa string
     * @return nilai kembalian berupa list
     */
    @Override
    public List<Country> getById(String id) {
        return icdao.getAllById(id);
    }
    
    /**
     * fungsi untuk mengambil kolom region id dari tabel REGIONS
     * @return nilai kembalian berupa list
     */
    @Override
    public List<Region> getRegionId() {
        return icdao.getRegionId();
    }
    
    /**
     * fungsi untuk mencari data inputan dari tabel COUNTRIES
     * @param key berupa string
     * @return nilai kembalian berupa list
     */
    @Override
    public List<Country> search(String key) {
        return icdao.search(key);
    }

    /**
     * fungsi untuk menambahkan data pada tabel COUNTRIES
     * @param id berupa string
     * @param name berupa string
     * @param region_id berupa string
     * @return nilai kembalian berupa string
     */
    @Override
    public String insert(String id, String name, String region_id) {
        String result = "";
        Country country = new Country(id, name, Integer.parseInt(region_id));
        if(icdao.insertupdate(country, false)){
            result = "Data berhasil disimpan";
        }else{
            result = "Maaf Data gagal disimpan";
        }
        return result;
    }

    /**
     * fungsi untuk mengedit data yang sudah ada pada tabel COUNTRIES
     * @param id berupa string
     * @param name berupa string
     * @param region_id berupa string
     * @return nilai kembalian berupa string
     */
    @Override
    public String update(String id, String name, String region_id) {
        String result = "";
        Country country = new Country(id, name, Integer.parseInt(region_id));
        if(icdao.insertupdate(country, true)){
            result = "Data berhasil diperbarui";
        }else{
            result = "Maaf Data gagal diperbarui";
        }
        return result;
    }

    /**
     * fungsi untuk menghapus data yang sudah ada yang telah dipilih pada tabel COUNTRIES
     * @param id berupa string
     * @return nilai kembalian berupa string
     */
    @Override
    public String delete(String id) {
         String result = "";
        if(icdao.delete(id)){
            result = "Data berhasil dihapus";
        }else{
            result = "maaf data gagal dihapus";
        }
        return result;
    }

    @Override
    public Iterable<Country> getJustId(JComboBox<String> cbRegion_id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

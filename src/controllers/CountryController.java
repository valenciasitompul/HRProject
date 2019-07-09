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
import models.Country;

/**
 *
 * @author alzena
 */
public class CountryController implements ICountryController {
    
    private ICountryDAO icdao;
    
    public CountryController (Connection connection){
        icdao = new CountryDAO(connection);
    }

    @Override
    public List<Country> getAll() {
         return icdao.getAll();
    }

    @Override
    public List<Country> getById(String id) {
        return icdao.getAllById(id);
    }

    @Override
    public List<Country> search(String key) {
        return icdao.search(key);
    }

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
    
}

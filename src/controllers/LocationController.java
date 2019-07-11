package controllers;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import daos.LocationDAO;
import icontrollers.ILocationController;
import idaos.ILocationDAO;
import java.sql.Connection;
import java.util.List;
import models.Location;

/**
 *implementasi class IlocationController
 * @author Fachrurrozy
 */
public class LocationController implements ILocationController{
    
    private ILocationDAO ildao;
    
    /**
     * constructor dengan satu parameter
     * @param connection beripe Connection
     */
    public LocationController(Connection connection){
      ildao = new LocationDAO(connection);  
    }
    
    /**
     * fungsi untuk mendapatkan/menampilkan semua data pada tabel location
     * @return nilai kembalian berupa list
     */
    @Override
    public List<Location> getAll() {
        return ildao.getAll();
    }

    /**
     * fungsi untuk mendapatkan/menampilak semua data pada tabel location berdasarkan location id
     * @param locId bertipe string
     * @return nilai kembalian berupa list
     */
    @Override
    public List<Location> getLocById(String locId) {
        return ildao.getLocById(Integer.parseInt(locId));
    }
/**
 * fungsi untuk melakukan pencarian pada tabel location
 * @param key bertipe string
 * @return nilai kembalian berupa list
 */
    @Override
    public List<Location> search(String key) {
        return ildao.search(key);
    }
    
    /**
     * fungsi untuk menambahkan data baru pada tabel location
     * @param locId bertipe int
     * @param strAdd bertipe string
     * @param posCode bertipe string
     * @param city bertipe string
     * @param staProv bertipe string
     * @param counId bertipe string
     * @return nilai kembalian berupa string
     */
    @Override
    public String insert(String locId, String strAdd, String posCode,String city, String staProv, String counId) {
      String result = "";
        Location location = new Location(Integer.parseInt(locId), strAdd, posCode, city, staProv, counId);
        if (ildao.insertupdate(location, true)) {
            result = "Data berhasil disimpan";
        } else {
            result = "Maaf data gagal disimpan";
        }
        return result;
    }
    /**
     * fungsi untuk memperbarui data baru pada tabel location
     * @param locId bertipe int
     * @param strAdd bertipe string
     * @param posCode bertipe string
     * @param city bertipe string
     * @param staProv bertipe string
     * @param counId bertipe string
     * @return nilai kembalian berupa string
     */
    @Override
    public String update(String locId, String strAdd, String posCode,String city, String staProv, String counId) {
        String result = "";
        Location location = new Location(Integer.parseInt(locId), strAdd, posCode, city, staProv, counId);
        if (ildao.insertupdate(location, true)) {
            result = "Data berhasil diupdate";
        } else {
            result = "Maaf data gagal diupdate";
        }
        return result;
    }
    
    /**
     * fungsi untuk menghapus data pada tabel location berdasarkan location id
     * @param locId bertipe string
     * @return nilai kembalian berupa string
     */
    @Override
    public String delete(String locId) {
         String result = "";
        if (ildao.delete(Integer.parseInt(locId))) {
            result = "Data berhasil dihapus";
        } else {
            result = "Maaf data gagal dihapus";
        }
        return result;
    }
/**
 * fungsi untuk mendapatkan/menampilak semua data pada tabel location berdasarkan city
 * @param city bertipe string
 * @return nilai kembalian berupa string
 */
    @Override
    public List<Location> getByCity(String city) {
        return ildao.getByCity(city);
    }

   
    
}

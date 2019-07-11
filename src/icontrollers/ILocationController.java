package icontrollers;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import idaos.ILocationDAO;
import java.util.List;
import models.Location;

/**
 *
 * @author Fachrurrozy
 */
public interface ILocationController {
   
    /**
     * fungsi untuk mendapatkan/menampilkan semua data pada tabel location
     * @return nilai kembalian berupa list
     */
    public List<Location> getAll();
   
    /**
     * fungsi untuk mendapatkan/menampilkan semua data pada tabel location berdasarkan location id
     * @param locId bertipe int
     * @return nilai kembalian berupa list
     */
    public List<Location> getLocById (String locId);
    
    /**
     * fungsi untuk mendapatkan/menampilkan semua data tabel location berdasarkan city
     *
     * @param city bertipe string
     * @return nilai kembalian berupa list
     */
    public List<Location> getByCity(String city);
    
    /**
     * fungsi untuk melakukan pencarian pada tabel location
     * @param key nilai kembalian berupa list
     * @return nilai kembalian berupa list
     */
    public List<Location> search(String key);
    
    /**
     * fungsi untuk menambahkan data baru pada tabel location
     * @param locId bertipe string
     * @param strAdd bertipe string
     * @param posCode bertipe string
     * @param city bertipe string
     * @param staProv bertipe string
     * @param counId bertipe string
     * @return  nilai kembalian berupa string
     */
   
    public String insert(String locId, String strAdd, String posCode,String city, String staProv, String counId);
    
    /**
     * fungsi untuk mengupdate data baru pada tabel location
     * @param locId bertipe string
     * @param strAdd bertipe string
     * @param posCode bertipe string
     * @param city bertipe string
     * @param staProv bertipe string
     * @param counId bertipe string
     * @return  nilai kembalian berupa string
     */
    public String update (String locId, String strAdd, String posCode,String city, String staProv, String counId);
   
    /**
     * fungsi untuk menghapus data pada tabel location berdasarkan location id
     * @param locId bertipe string
     * @return  nilai kembalian berupa string
     */
    public String delete(String locId);

    

   
    
}

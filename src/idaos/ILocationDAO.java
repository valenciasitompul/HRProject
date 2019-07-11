package idaos;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.List;
import models.Location;

/**
 *
 * @author Fachrurrozy
 */
public interface ILocationDAO {
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
    public List<Location> getLocById(int locId);
    /**
     * fungsi untuk mendapatkan/menampilkan semua data pada tabel location berdasarkan city
     * @param locId bertipe string
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
 * @param l bertipe int dan string
 * @return kembalian bertipe boolean
 */
    public boolean insert(Location l);
    /**
 * fungsi untuk mengupdate data baru pada tabel location
 * @param l bertipe int dan string
 * @return kembalian bertipe boolean
 */
    public boolean update(Location l);
    /**
 * fungsi untuk menambahkan data baru pada tabel location berdasarkan location id
 * @param l bertipe int 
 * @return kembalian bertipe boolean
 */
    public boolean delete(int locId);
    
}

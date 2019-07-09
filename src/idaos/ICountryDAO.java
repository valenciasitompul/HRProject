/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idaos;

import java.util.List;
import models.Country;

/**
 *
 * @author HARRY-PC
 */
public interface ICountryDAO {
    /**
     * getAll method untuk menngambil semua data pada tabel regions
     * @return kembalian berupa list data
     */
    public List<Country> getAll();
    
    /**
     * method ini digunakan untuk mendapatkan dan menyeleksi data dari table regions berdasarkan id
     * @param id berupa tipe data char
     * @return kembalian berupa list data berdasar id
     */
    public List<Country> getAllById(String id);
    
    /**
     * method ini digunakan untuk mendapatkan data dari kolom Country ID berdasarkan id
     * @param id berupa parameter dengan tipe data String
     * @return kembalian berupa list data kolom country id dari tabel countries
     */
    public List<Country> getJustId(String id);
    
    /**
     * method ini digunakan untuk mendapatkan dan menyeleksi data dari table regions
     * @param key berupa type data String
     * @return kembalian nilai berupa list hasil pencarian
     */
    public List<Country> search(String key);
    
    /**
     * method yang digunakan untuk memasukkan data atau mengganti nilai data di dalam tabel country
     * @param c berupa instasiasi objek dari Country
     * @param isUpdate beriupa tipe data booleam
     * @return kembalian berupa boolean
     */
    public boolean insertupdate(Country c, boolean isUpdate);
    
    /**
     * method yang digunakan untuk menghapus satu data table sesuai id masukan pada tabel country
     * @param id berupa tipe data char
     * @return kembalian berupa boolean
     */
    public boolean delete(String id);
}

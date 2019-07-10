/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import idaos.ICountryDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javafx.scene.layout.Region;
import models.Country;

/**
 *
 * @author HARRY-PC
 */
public class CountryDAO implements ICountryDAO{
    private Connection connection;
    
    public CountryDAO(Connection connection){
        this.connection = connection;
    }
    
    /**
     * method fungsi untuk meilhat semuda data dari tabel country
     * @return kembalian berupa list data tabel country
     */
    @Override
    public List<Country> getAll() {
        List<Country> listCountry = new ArrayList<Country>();
        String query = "SELECT * FROM COUNTRIES ORDER BY COUNTRY_ID ASC";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Country c = new Country(resultSet.getString(1), resultSet.getString(2), resultSet.getInt(3));
                c.setId(resultSet.getString(1));
                c.setName(resultSet.getString(2));
                c.setRegion_id(resultSet.getInt(3));
                listCountry.add(c);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return listCountry;
    }
    /**
     * method fungsi untuk melihat data dari tabel country berdasarkan id
     * @param id berupa tipe data String
     * @return kembalian berupa list data tabel country
     */
    @Override
    public List<Country> getAllById(String id) {
        List<Country> listCountry = new ArrayList<Country>();
        String query = "SELECT * FROM COUNTRIES WHERE COUNTRY_ID = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, id);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
               Country c = new Country(rs.getString(1), rs.getString(2), rs.getInt(3));
               listCountry.add(c);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return listCountry;
    }
    /**
     * method ini digunakan untuk mendapatkan data dari kolom Country ID berdasarkan id
     * @param id berupa parameter dengan tipe data String
     * @return kembalian berupa list data kolom country id dari tabel countries
     */
    @Override
    public List<models.Region> getRegionId() {
        List<models.Region> listRegion =  new ArrayList<models.Region>();
        String query = "SELECT REGION_ID FROM REGIONS ORDER BY REGION_ID ASC";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
               models.Region r = new models.Region(rs.getInt(1));
               listRegion.add(r);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return listRegion;
    }
    /**
     * method fungsi untuk mencari data pada tabel country
     * @param key berupa tipe data String
     * @return kembalian berupa hasil list pencarian dari tabel country
     */
    @Override
    public List<Country> search(String key) {
        List<Country> listCountry = new ArrayList<Country>();
        String query = "SELECT * FROM COUNTRIES WHERE REGEXP_LIKE(COUNTRY_ID, (?), 'i') OR REGEXP_LIKE(COUNTRY_NAME, (?), 'i') OR REGEXP_LIKE(REGION_ID, (?), 'i') ORDER BY COUNTRY_ID ASC";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, key);
            preparedStatement.setString(2, key);
            preparedStatement.setString(3, key);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Country c = new Country(resultSet.getString(1), resultSet.getString(2), resultSet.getInt(3));
                listCountry.add(c);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return listCountry;
    }
    /**
     * method fungsi untuk menambahkan 1 baris data pada tabel country
     * @param c berupa instansiasi dari object class model country
     * @param isUpdate berupa tipe data boolean
     * @return kembalian berupa boolean
     */
    @Override
    public boolean insertupdate(Country c, boolean isUpdate) {
        boolean result = false;
        String query = "INSERT INTO COUNTRIES (COUNTRY_NAME, REGION_ID, COUNTRY_ID) VALUES (?,?,?) ";
        if(isUpdate){
            query = "UPDATE COUNTRIES SET COUNTRY_NAME = ?, REGION_ID = ? WHERE COUNTRY_ID = ?";
        }
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, c.getName());
            preparedStatement.setInt(2, c.getRegion_id());
            preparedStatement.setString(3, c.getId());
            preparedStatement.executeQuery();
            result = true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return result;
    }
    /**
     * method fungsi untuk menghapus satu baris data pada tabel country
     * @param id berupa tipe data String
     * @return kembalian berupa boolean
     */
    @Override
    public boolean delete(String id) {
        boolean result = false;
        String query = "DELETE FROM COUNTRIES WHERE COUNTRY_ID = ? ";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, id);
            preparedStatement.execute();
            result = true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return result;
    }
}

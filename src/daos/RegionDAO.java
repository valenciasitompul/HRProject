/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import idaos.IRegionDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import models.Region;

/**
 *
 * @author HARRY-PC
 */
public class RegionDAO implements IRegionDAO{
    
    private Connection connection;
    
    /**
     * Memanggil fungsi koneksi
     * @param connection 
     */
    public RegionDAO(Connection connection){
        this.connection = connection;
    }

    /**
     * Fungsi yang digunakan untuk menampilkan data tabel region dari database berupa list dengan nama getAll
     * data yang ditampilkan berupa region_id dan region_name
     * @return listRegion
     */
    @Override
    public List<Region> getAll() {
        List<Region> listRegion = new  ArrayList<Region>();
        String query = "SELECT * FROM REGIONS ORDER BY REGION_ID ASC";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Region r = new  Region(resultSet.getInt(1),resultSet.getString(2));
                r.setId(resultSet.getInt(1));
                r.setName(resultSet.getString(2));
                listRegion.add(r);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return listRegion;
    }
   

    /**
     * Fungsi yang digunakan untuk menampilkan data tabel region dari database berupa list dengan nama getById
     * data ditampilkan sesuai dengan id / region_id yang diminta atau diinput
     * data yang ditampilkan berupa region_id dan region_name
     * digunakan pada proses pencarian berdasarkan id / region_id
     * @param id berupa integer
     * @return regions
     */
    @Override
    public List<Region> getById(int id) {
        List<Region> regions = new ArrayList<Region>();
        String query = "SELECT * FROM REGIONS WHERE REGEXP_LIKE(REGION_ID, (?), 'i')";
        try {
            //penamaan preparedstatemnet di samakan saja dari awal sampai akhir
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1,id);
            ResultSet rs = preparedStatement.executeQuery();
            //rs.next = menampung data dari statement diatas sampai mendapatkan nilai yang diinginkan
            while (rs.next()) {
                Region region = new Region(rs.getInt(1),rs.getString(2));
                regions.add(region);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return regions;
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Fungsi yang digunakan untuk menampilkan data tabel region dari database berupa list dengan nama search
     * data ditampilkan sesuai dengan key yang diminta atau diinput
     * key dapat berupa region_id atau region_name
     * data yang ditampilkan berupa region_id dan region_name
     * digunakan pada proses pencarian
     * @param key berupa String
     * @return regions
     */


    /**
     * fungsi untuk melakukan insert ke dalam database
     * @param r berupa instansiasi dari region
     * @return result
     */
    public boolean insert(Region r) {
        boolean result = false;
        String query = "INSERT INTO REGIONS (REGION_ID, REGION_NAME) VALUES (?,?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, r.getId());
            preparedStatement.setString(2, r.getName());
            preparedStatement.executeQuery();
            result = true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return result;
    }
    
    /**
     * fungsi untuk melakukan insert dan update dalam satu fungsi yang sama
     * @param r berupa instansiasi dari region
     * @param isUpdate berupa boolean
     * @return result
     */
    @Override
    public boolean insertupdate(Region r, boolean isUpdate) {
        boolean result = false;
        String query = "INSERT INTO REGIONS (REGION_NAME, REGION_ID) VALUES (?,?) ";
        if(isUpdate){
            query = "UPDATE REGIONS SET REGION_NAME = ? WHERE REGION_ID = ?";
        }
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, r.getName());
            preparedStatement.setInt(2, r.getId());
            preparedStatement.executeQuery();
            result = true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return result;
    }

//    @Override
//    public boolean update(Region r) {
//        boolean result = false;
//        String query = "UPDATE REGIONS SET REGION_NAME = ? WHERE REGION_ID = ?";
//        try {
//            PreparedStatement ps = connection.prepareStatement(query);
//            ps.setInt(2, r.getId());
//            ps.setString(1, r.getName());
//            ps.executeQuery();
//            result = true;
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//            e.printStackTrace();
//        }
//        return result;
//        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

    /**
     * fungsi untuk menghapus data by Id
     * @param d berupa integer
     * @return kembalian berupa boolean
     */
    @Override
    public boolean delete(int d) {
        boolean result = false;
        String query = "DELETE FROM REGIONS WHERE REGION_ID = ? ";
        try {
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, d);
            statement.execute();
            result = true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return result;
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Fungsi yang digunakan untuk menampilkan data tabel region dari database berupa list dengan nama getByName
     * data ditampilkan sesuai dengan name / region_name yang diminta atau diinput
     * data yang ditampilkan berupa region_id dan region_name
     * digunakan pada proses pencarian berdasarkan name / region_name
     * @param name berupa String
     * @return regions
     */
    @Override
    public List<Region> getByName(String name) {
        List<Region> regions = new ArrayList<Region>();
        String query = "SELECT * FROM REGIONS WHERE REGEXP_LIKE(REGION_NAME, (?), 'i')";
        try {
            //penamaan preparedstatemnet di samakan saja dari awal sampai akhir
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1,name);
            ResultSet rs = preparedStatement.executeQuery();
            //rs.next = menampung data dari statement diatas sampai mendapatkan nilai yang diinginkan
            while (rs.next()) {
                Region region = new Region(rs.getInt(1),rs.getString(2));
                regions.add(region);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return regions;
    }
    
}

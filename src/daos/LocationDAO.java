/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import idaos.ILocationDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import models.Location;

/**
 *
 * @author Fachrurrozy
 */
public class LocationDAO implements ILocationDAO{
    private Connection connection ;
    
    public LocationDAO(Connection connection){
        this.connection = connection ;
    }

    @Override
    public List<Location> getAll() {
        List<Location> listLocation = new ArrayList<Location>();
        String query = "SELECT * FROM LOCATIONS ORDER BY LOCATION_ID ASC";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Location l = new Location(resultSet.getInt(1), resultSet.getString(2), resultSet.getInt(3), resultSet.getString(4), resultSet.getString(5), resultSet.getString(6)); 
                l.setLocid(resultSet.getInt(1));
                l.setStradd(resultSet.getString(2));
                l.setPoscode(resultSet.getInt(3));
                l.setCity(resultSet.getString(4));
                l.setStaprov(resultSet.getString(5));
                l.setCounid(resultSet.getString(6));
                listLocation.add(l);
                
            }
       } catch (Exception e) {
           e.getStackTrace();
        }
        return listLocation; 
    }

    @Override
    public List<Location> getLocid(int locid) {
      List<Location> listLocation = new ArrayList<Location>();
        String query = "SELECT * FROM LOCATIONS WHERE LOCATION_ID = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, locid);
            ResultSet resultSet = preparedStatement.executeQuery();//resultSet untuk menampung data
            while (resultSet.next()) {//memeriksa apakah 
                Location l = new Location(resultSet.getInt(1), resultSet.getString(2), resultSet.getInt(3), resultSet.getString(4), resultSet.getString(5), resultSet.getString(6));
                //r.setId(resultSet.getInt(1));
                //r.setName(resultSet.getString(2));
                listLocation.add(l);
            }
        } catch (Exception e) {
            e.getStackTrace();
        }
        return listLocation;
    }

    @Override
    public List<Location> search(String key) {
       List<Location> listLocation = new ArrayList<Location>();
        String query = "SELECT * FROM LOCATIONS WHERE LOCATION_ID LIKE(?) OR STREET_ADDRESS (?) ORDER BY LOCATION_ID ASC";
        try {
            PreparedStatement preparedStatement = connection.prepareCall(query);
            preparedStatement.setString(1,"%" + key + "%");
            preparedStatement.setString(2,"%" + key + "%");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Location l = new Location(resultSet.getInt(1), resultSet.getString(2), resultSet.getInt(3), resultSet.getString(4), resultSet.getString(5), resultSet.getString(6));
                listLocation.add(l);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return listLocation;
    }

    @Override
    public boolean insert(Location l) {
     boolean result = false;
        String query = "INSERT INTO LOCATIONS(LOCATION_ID, STREET_ADDRESS, POSTAL_CODE, CITY, STATE_PROVINCE, COUNTRY_ID) VALUES (?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, l.getLocid());
            preparedStatement.setString(2, l.getStradd() );
            preparedStatement.setInt(3, l.getPoscode());
            preparedStatement.setString(4, l.getCity() );
            preparedStatement.setString(5, l.getStaprov() ); 
            preparedStatement.setString(6, l.getCounid() ); 
    
            preparedStatement.executeQuery();
            result = true;
 
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public boolean update(Location l) {
        boolean result = false;
        String query = "UPDATE LOCATIONS SET STREET_ADDRESS = ?, POSTAL_CODE = ?, CITY = ?, STATE_PROVINCE = ?, COUNTRY_ID = ? WHERE LOCATION_ID = ? ";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, l.getStradd() );
            preparedStatement.setInt(2, l.getPoscode());
            preparedStatement.setString(3, l.getCity() );
            preparedStatement.setString(4, l.getStaprov() ); 
            preparedStatement.setString(5, l.getCounid() ); 
            preparedStatement.setInt(6, l.getLocid());
    
            preparedStatement.executeQuery();
            result = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public boolean delete(int locid) {
     boolean result = false;
        String query = "DELETE FROM LOCATIONS WHERE LOCATION_ID = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, locid);
            preparedStatement.execute();
            result = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
       
}
